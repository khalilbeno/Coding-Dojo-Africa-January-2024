x = [ [5,2,3], [10,8,9] ] 
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]

x[1][0] = 15
print(x)
students[0]["last_name"]="Bryant"
print(students[0])
sports_directory["soccer"][0]="Andres"
print(sports_directory["soccer"])
z[0]["y"]=30
print(z)
# 2
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'},
    {'first_name' : 'Mark', 'last_name' : 'Guillen'},
    {'first_name' : 'KB', 'last_name' : 'Tonel'}
]
def iterateDictionary(some_list) :
    for x in range(len(some_list)):
        print(students[x])
iterateDictionary(students)
# 3
def iterateDictionary2(key_name,some_list):
    for x in some_list:
        print(x[key_name])
iterateDictionary2("first_name", students)
iterateDictionary2("last_name", students)
# 4
dojo = {
    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}

def printInfo(some_dict):
    print(f"{len(some_dict['locations'])} LOCATIONS")
    for location in some_dict['locations']:
        print(location)
    print(f"{len(some_dict['instructors'])} INSTRUCTORS")
    for instructor in some_dict['instructors']:
        print(instructor)

printInfo(dojo)