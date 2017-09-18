#Binary Search implementation
def BinarySearch(array,start,end,value):
    if start<end:
        mid=(start+end)/2;
        if array[mid]==value:
            return True;
        else:
            if value<array[mid]:
                return BinarySearch(array, start, mid, value);
            else:
                return BinarySearch(array, mid+1, end, value);
    return False;

#Find sum logic
def findSumInSortArr(array,value):
    array=sorted(array);
    for i in array:
        compval=value-i;
        if BinarySearch(array,0,len(arr)-1,compval)==True:
            return True;
    return False;


arr=[4,2,3,5,7,6,8,9];
print findSumInSortArr(arr,99);
print findSumInSortArr(arr,9);