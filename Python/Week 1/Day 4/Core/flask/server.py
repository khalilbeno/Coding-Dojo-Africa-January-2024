from flask import Flask ,render_template
app = Flask(__name__)
@app.route('/play')
def play():
    return render_template("index.html")
@app.route('/play/<int:num>')
def play_num(num):

    return render_template("index1.html",num=num)
@app.route('/play/<int:num>/<string:color>')
def play_(num,color):

    return render_template("index1.html",num=num,color=color)

if __name__=="__main__":
    app.run(debug=True)

