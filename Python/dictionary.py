a={"x": 5, "y": 10, "z": 15}
b={"a": 20, "b": 25, "c": 30}
# a["b"] = 20
# print(a)
# a.pop("y")
# print(a)

max=max(a.values())
print(max)
min=min(a.values())
print(min)
length=len(a.values())
print(length)
a.update(b)
print(a)

reverse_dict = {v: k for k, v in a.items()}
print(reverse_dict)

sorted_dict = dict(sorted(a.items(), key=lambda item: item[1]))
print(sorted_dict)

students = {}

def add_student(roll_no, name, grade):
    students[roll_no] = {'name': name, 'grade': grade}

def display_students():
    for roll, info in students.items():
        print(f"Roll No: {roll}, Name: {info['name']}, Grade: {info['grade']}")

add_student("101", "Alice", "A")
add_student("102", "Bob", "B")
display_students()


seen = set()
duplicates = set()

for value in a.values():
    if value in seen:
        duplicates.add(value)
    else:
        seen.add(value)

print(list(duplicates))



keys = ['name', 'age', 'city']
values = ['John', 25, 'New York']
result_dict = dict(zip(keys, values))
print(result_dict) 

employees = {
    'emp001': {
        'name': 'Sarah',
        'department': 'HR',
        'salary': 50000
    },
    'emp002': {
        'name': 'David',
        'department': 'IT',
        'salary': 75000
    }
}
print(employees['emp002']['department']) 

