from flask_app import app
from flask import redirect, render_template, request, flash, session
from flask_app.models.recipes import Recipe
from flask_app.models.users import User





# * view route for the create form
@app.route("/recipes/new")
def create():
    return render_template("new_recipe.html")

# ! action route to create a new garden
@app.route("/recipes/create", methods=["POST"])
def new_recipe():
        data = {    
        **request.form,
        "user_id":session["user_id"]
        }
        if  not Recipe.validate_recipe(request.form):
            return redirect ("/recipes/new")
        Recipe.create(data)
        return redirect("/recipes")

@app.route("/recipes")
def display_recipes():
    if "user_id" not in session:
        return redirect("/")
    data = {"id": session["user_id"]}
    # grab the user by id from DB
    current_user = User.get_by_id(data)
    all_recipes = Recipe.get_all_recipe()
    return render_template("dashboard.html",all_recipes=all_recipes,current_user=current_user)

@app.route("/recipes/<int:id>")
def show_recipe(id):
    data = {
        "id" : session['user_id']
    }
    recipe = Recipe.show_one({'id':id})
    current_user = User.get_by_id(data)
    return render_template ("show.html", recipe = recipe , current_user = current_user)

@app.route("/recipes/edit/<int:id>")
def edit_one(id):
    data={
        "id" : id
    }
    recipe=Recipe.get_id(data)
    return render_template("edit.html",recipe=recipe)

@app.route("/edit/<int:id>", methods=["POST"])
def edit_recipes(id):
    if  not Recipe.validate_recipe(request.form):
        return redirect (f"/recipes/edit/{id}")
    data={
        **request.form,
        "id":id
    }
    Recipe.edit(data)
    return redirect("/recipes") 

@app.route("/delete/<int:id>")
def delete(id):
    data={
        "id" : id
    }
    Recipe.delete(data)
    return redirect("/recipes")