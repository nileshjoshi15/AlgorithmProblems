def Partition(array,start,end):
    pivot=array[end];
    pindex=start;
    for i in range(start,end):
        if(array[i]<=pivot):
            temp=array[i];
            array[i]=array[pindex];
            array[pindex]=temp;
            pindex+=1;
    temp=array[end];
    array[end]=array[pindex];
    array[pindex]=temp;
    return pindex;

def findKthElement(array,start,end,kth):
    if start<=end:
        pos=Partition(array,start,end);
        if kth==pos:
            return array[kth];
        elif kth<pos :
            return findKthElement(array,start,pos-1,kth);
        else:
            return findKthElement(array,pos+1,end,kth);

inArray=[8,9,3,5,4,6,2,7,1];
kth=1   # considering 0th based index
posElement=findKthElement(inArray,0,len(inArray)-1,kth);
print str(kth)+" largest element in 0th based is : "+str(posElement);



