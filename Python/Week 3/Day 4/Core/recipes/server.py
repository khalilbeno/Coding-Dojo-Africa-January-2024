from flask_app import app

#! ALWAYS REMEMBER TO IMPORT CONTROLLERS
from flask_app.controllers import user_controller
from flask_app.controllers import recipe_controller

if __name__ == "__main__":
    app.run(debug=True)