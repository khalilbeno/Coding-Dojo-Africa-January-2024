from mysqlconnection import connectToMySQL
db="users_cr"
class User:
    def __init__( self , data ):
        self.id = data['id']
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.email = data['email']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
    @classmethod
    def select(cls):
        query = """select * from users """
        result = connectToMySQL(db).query_db(query)
        users=[]
        for i in result:
            users.append(cls(i))
        return users

    @classmethod
    def insert(cls,data):
        query = """
                INSERT INTO users (first_name,last_name,email)  VALUES(%(first_name)s, %(last_name)s, %(email)s);
                """
        result=connectToMySQL(db).query_db(query,data)
        return result 

            
