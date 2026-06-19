# n=int(input("Enter a number: "))

# for i in range(n):
#     for j in range(i+1):
#         print("* ", end="")
#     print()

# n=int(input("Enter a number: "))

# for i in range(n):
#     for j in range(n):
#         print("* ", end="")
#     print()


# n = int(input("Enter number of rows: "))

# for i in range(1, n+1):
#     for j in range(i):
#         print(chr(65+j), end="")
#     print()


# n = int(input("Enter number of rows: "))

# for i in range(n):
#     print(' ' * (n - i - 1) + '* ' * (i + 1))

# for i in range(n - 2, -1, -1):
#     print(' ' * (n - i - 1) + '* ' * (i + 1))


# rows = int(input("Enter the number of rows: "))

# for i in range(rows):  
#     for j in range(rows): 
#         if i == 0 or i == rows - 1 or j == 0 or j == rows - 1:  
#             print("*", end=" ")  
#         else:  
#             print(" ", end=" ")  
#     print()


a=int(input("Enter a range: "))
for i in range(1,a+1):
    if i%2==0:
        print(i, "is even")
    else:
        print(i, "is odd")






