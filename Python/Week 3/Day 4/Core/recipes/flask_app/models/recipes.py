from flask_app.configs.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask_app.models import users
from flask import flash 


class Recipe:
    def __init__(self, data) -> None:
        self.id = data["id"]
        self.name = data["name"]
        self.description = data["description"]
        self.instructions= data["instructions"]
        self.date_made= data["date_made"]
        self.under_30_min= data["under_30_min"]
        self.created_at = data["created_at"]
        self.updated_at = data["updated_at"]
        self.user_id = data["user_id"]
    
    @classmethod
    def create(cls, data):
        query = """
                INSERT INTO recipes (name,description,instructions,date_made,under_30_min,user_id)
                VALUES(%(name)s,%(description)s, %(instructions)s, %(date_made)s,%(under_30_min)s,%(user_id)s);
                """
        return connectToMySQL(DATABASE).query_db(query, data)
    
    @classmethod
    def get_all_recipe(cls):
        query = """
                SELECT * FROM recipes
                JOIN users ON users.id = recipes.user_id
                """
        results = connectToMySQL(DATABASE).query_db(query)
        print(f"RECIPES_WITH_USERS: ----{results}")
        all_recipe =[]
        for row in results:
            recipe = cls(row)
            data = {
                **row,
                "id": row['users.id'],
                "created_at":row['users.created_at'],
                "updated_at":row['users.updated_at']
            }
            recipe.posted_by = users.User(data)
            all_recipe.append(recipe)
        return all_recipe

    @classmethod
    def show_one(cls,data):
        query = """
                select * from recipes
                join users On users.id = recipes.user_id
                where recipes.id=%(id)s;
                """
        result= connectToMySQL(DATABASE).query_db(query,data)
        recipe = cls(result[0])
        for row in result:
            data={
                **row,
                "id" : row['users.id'],
            }
            recipe.posted_by = users.User(data)
        
        return recipe
    
    @classmethod
    def get_id(cls,data):
        query="""
                SELECT * FROM recipes
                WHERE id = %(id)s;
                """
        result= connectToMySQL(DATABASE).query_db(query,data)

        display_recipe=cls(result[0])
        return display_recipe

    @classmethod
    def edit(cls,data):
        query="""
                UPDATE recipes
                SET name = %(name)s, description=%(description)s,instructions=%(instructions)s ,
                date_made=%(date_made)s,under_30_min=%(under_30_min)s
                WHERE id= %(id)s;
                """
        return connectToMySQL(DATABASE).query_db(query,data)
    
    @classmethod
    def delete(cls,data):
        query="""
                DELETE FROM recipes 
                WHERE id=%(id)s
                """
        return connectToMySQL(DATABASE).query_db(query,data)

    @staticmethod
    def validate_recipe(data):    
        is_valid = True

        if(len(data["name"]) < 1):
            is_valid=False
            flash("*Name must not be blank ", "name")
        if(len(data["description"]) < 1):
            is_valid=False
            flash("*Description must not be blank ", "description")
        if(len(data["instructions"]) < 1):
            is_valid=False
            flash("*Instructions must not be blank ", "instructions")
        if(data["date_made"]=="" ):
            is_valid=False
            flash("*Date must not be blank ", "date")
        return is_valid
        