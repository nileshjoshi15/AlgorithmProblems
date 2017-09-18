#Using HashTable.
def findMatchSumUsingHash(arr,value):
    mydict={};
    for val in arr:
        if value-val in mydict.values():
            return True;
        mydict[val]=val;
    return False;

arr=[4,2,3,5,7,6,8,9];
print findMatchSumUsingHash(arr,99);
print findMatchSumUsingHash(arr,9);