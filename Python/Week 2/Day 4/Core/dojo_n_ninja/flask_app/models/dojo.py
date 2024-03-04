from flask_app.config.mysqlconnection import connectToMySQL
db="dojoo"
class Dojo:
    def __init__( self , data ):
        self.id = data['id']
        self.name = data['name']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
    @classmethod
    def insert(cls,data):
        query = """
                INSERT INTO dojos (name)  VALUES(%(name)s);
                """
        result=connectToMySQL(db).query_db(query,data)
        return result 
    
    @classmethod
    def select(cls):
        query = """SELECT * FROM dojoo.dojos; """
        result = connectToMySQL(db).query_db(query)
        dojos=[]
        for i in result:
            dojos.append(cls(i))
        return dojos
    
    @classmethod
    def select_one(cls,data):
        query = """ select * from dojos where id=%(id)s """
        result=connectToMySQL(db).query_db(query,data)
        return cls(result[0])

    