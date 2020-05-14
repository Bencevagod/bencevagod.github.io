array = [8, 5, 2, 7, 10]
smallest_num = array[0]
for i in array:
    if i < smallest_num:
        smallest_num = i
print(smallest_num)