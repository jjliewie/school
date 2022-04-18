target = 5
l = [1, 2, 3, 4]

def two(target, l):

    left, right = 0, len(l)-1
    l.sort()

    cnt = 0

    while left < right:

        temp = l[left] + l[right]

        if temp == target:
            cnt += 1
            left += 1
            right -= 1
        elif temp < target:
            left += 1
        else:
            right -= 1
    
    return cnt

print(two(target, l))