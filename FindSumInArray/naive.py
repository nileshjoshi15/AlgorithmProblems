def findSumInArr(array,value):
    for i in range(len(array)):
        for j in range(i+1,len(array)):
            if array[i]+array[j]==value:
                return True;
    return False;

arr=[4,2,3,5,7,6,8,9];
#Sum value doest not exist, should print false
print findSumInArr(arr,99);

#Sum value does exist, should print true
print findSumInArr(arr,9);



