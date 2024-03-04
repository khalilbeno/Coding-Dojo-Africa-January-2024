from flask import render_template,redirect,request
from flask_app import app
from flask_app.models.dojo import Dojo
from flask_app.models.ninja import Ninja

@app.route('/dojos')
def display_dojos():
    return render_template("index.html",dojos=Dojo.select())

@app.route('/dojos' ,methods=['post'])
def create():
    Dojo.insert(request.form)
    return redirect('/dojos')

@app.route('/dojo/<int:id>')
def showone(id):
    data ={ 
        "id":id
    }
    return render_template("index1.html",dojo=Dojo.select_one(data),ninjas=Ninja.select(data))
@app.route('/ninjas')
def insertninjas():
    dojos= Dojo.select()
    return render_template("index2.html",dojos=dojos)

@app.route('/create', methods=["post"])
def create_ninja():
    data=request.form
    dojo_id=data['dojo_id']
    Ninja.insert(data)
    return redirect(f'/dojo/{dojo_id}')