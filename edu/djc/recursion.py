def factorial(n):
    """ Recursive calculation of n! or n * (n-1) * (n-2) * ... * 1 """
    
    n = abs(n) # make sure n is positive
    if n == 1: 
        return 1
    return n * factorial(n-1)


def multiply(a, b):
    """ Recursive calculation of the product of two positive integers by addition """
    
    a, b = abs(a), abs(b) # make sure a and b are positive
    if b == 0:
        return 0
    return a + multiply(a, b - 1)

def remainder(a, b):
    """ Recursive calculation of the remainder (%, modulo) from integer division """
    
    if a < b:
        return a
    return remainder(a-b, b)

def integer_division(a, b, i = 0):
    """ Recursive calculation of the whole number of times one integer can be
    divided by another """
    
    if a < b:
        return i
    i += 1 # i is the counter, set initially to 0
    return integer_division(a - b, b, i)


def count_items(ls, n = 0):
    """ Recursive count of all list items in nested lists of integers """
    
    for item in ls:
        if isinstance(item, int):
            n += 1
        else:
            n += count_items(item)
    return n


# PROGRAM SCRIPT

x, y = 10, 3
print("factorial", x, factorial(x))
print("multiply", x, y, multiply(x, y))
print("remainder", x, "by", y, remainder(x, y))
print("integer divison", x, "by", y, integer_division(x, y))

nested_list = [1, [2, 3, 4], [5, 6], 7, [8, 9, 10, [11, 12]]]
# exploded view of nested_list
for e in nested_list:
    print(e, end = " ... ")
print()

print("list items", len(nested_list)) # 5 entries... but 12 items
print("all nested items", count_items(nested_list))