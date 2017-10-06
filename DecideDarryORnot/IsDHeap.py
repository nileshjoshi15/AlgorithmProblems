
def IsDarray(arr):
    for i in range(len(arr)):
        parent  = i;
        left    = 3*i+1;
        middle  = 3*i+2;
        right   = 3*i+3;
        if(left<len(arr) and arr[left]>arr[parent]):
            return False;
        if(middle<len(arr) and arr[middle]>arr[parent]):
            return False;
        elif (right<len(arr) and arr[right]>arr[parent]):
            return False;
    return True;




TestArry=[17,18,10,6,10,7]
print IsDarray(TestArry)