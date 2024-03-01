from flask import Flask,render_template,redirect,request
from users import User
app = Flask(__name__)

@app.route('/myusers')
def display_users():
    return render_template("index.html",users=User.select())

@app.route('/myusers/new')
def new_user():

    return render_template("index1.html",)

@app.route('/myusers/showuser/<int:id>')
def showone(id):
    data ={ 
        "id":id
    }
    return render_template("index2.html",user=User.select_one(data))
@app.route('/myusers/edit/<int:id>')
def edit(id):
    data ={ 
        "id":id
    }
    return render_template("index3.html",user=User.select_one(data))

@app.route('/myusers/update', methods=['post'])
def editone():
    User.update(request.form)
    return redirect('/myusers')

@app.route("/create" ,methods=['post'])
def create():
    User.insert(request.form)
    return redirect('/myusers')


@app.route("/myusers/delete_user/<int:id>")
def delete_user(id):
    data={
            "id":id
        }
    User.delete(data)
    return redirect("/myusers")



if __name__ == "__main__":
    app.run(debug=True)

