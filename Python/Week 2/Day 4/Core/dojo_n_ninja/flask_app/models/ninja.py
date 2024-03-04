from flask_app.config.mysqlconnection import connectToMySQL
db="dojoo"
class Ninja:
    def __init__( self , data ):
        self.id = data['id']
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.age = data['age']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
        self.dojo_id= data['dojo_id']

    @classmethod
    def select(cls,data):
        query = """select * from ninjas where dojo_id=%(id)s"""
        result = connectToMySQL(db).query_db(query,data)
        ninjas=[]
        for i in result:
            ninjas.append(cls(i))
        return ninjas
    
    @classmethod
    def insert(cls,data):
        query = """
                INSERT INTO ninjas (first_name,last_name,age,dojo_id)  
                VALUES(%(first_name)s, %(last_name)s, %(age)s,%(dojo_id)s);
                """
        print(query)
        result=connectToMySQL(db).query_db(query,data)
        return result 