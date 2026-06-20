a=[63,32,23,54,23,54]
# print(a[0],a[-1],a[-3]) 
# a.append(100)
# a.insert(3,56)
# b=[3,4,6,9]
# a.extend(b)
# a[3]=54
# a.remove(23)
# a.pop()
# #a.clear()
# for i in a:
#     print(i)

# largest = float('-inf')
# second_largest = float('-inf')
# for num in a:
#     if num > largest:
#         second_largest = largest
#         largest = num
#     elif largest > num > second_largest:
#         second_largest = num

# if second_largest == float('-inf'):
#     print("No second largest element")
# else:
#     print("Second largest element:", second_largest)    


# values = sorted(set(a))
# missing = []
# for num in range(values[0], values[-1] + 1):
#     if num not in values:
#         missing.append(num)

# print("Missing numbers:", missing if missing else "None")

# counts = {}
# for num in a:
#     if num in counts:
#         counts[num] += 1
#     else:   
#         counts[num] = 1
# print(counts)

#take a 3x4 matrix from user and find axb and a.b , a^-1 and b^-1