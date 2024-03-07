from flask import Flask, render_template, redirect, session, request

app = Flask(__name__)

app.secret_key = 'shhhhhhh'


@app.route('/')
def index():

    return render_template('index.html')


@app.route('/submit', methods=['POST'])
def submit_form():
    
    session['name'] = request.form.get('name', '').title()
    session['dojo_location'] = request.form.get('dojo_locations', '').title()
    session['favorite_language'] = request.form.get('favorite_language', '').title()
    session['comments'] = request.form.get('comments', '')

    return redirect('/results')


@app.route('/results')
def results():
    name = session['name']
    dojo_location = session['dojo_location']
    favorite_language = session['favorite_language']
    comments = session['comments']

    return render_template('results.html', name=name, dojo_location=dojo_location, favorite_language=favorite_language, comments=comments)


@app.route('/reset', methods=['POST'])
def reset():

    session.clear()
    return redirect('/')


if __name__ == "__main__":
    app.run(debug=True)