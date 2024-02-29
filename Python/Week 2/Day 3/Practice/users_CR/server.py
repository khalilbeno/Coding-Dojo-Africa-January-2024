from flask import Flask,render_template,redirect,request
from users import User
app = Flask(__name__)

@app.route('/myusers')
def display_users():
    return render_template("index.html",users=User.select())

@app.route('/myusers/new')
def new_user():

    return render_template("index1.html")

@app.route("/create" ,methods=['post'])
def create():
    User.insert(request.form)
    return redirect('/myusers')
if __name__ == "__main__":
    app.run(debug=True)

