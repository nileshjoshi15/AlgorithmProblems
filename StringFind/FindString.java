package Algo;
import java.util.ArrayList;
import java.util.List;

public class FindString 
{

    private static int FindHash(String inStr){
        int sum=0;
        for(char s:inStr.toCharArray()){
            sum+=(int)s;
        }
        return sum;
    }


    public static void  Match(String args,String searchText )
    {
        int searchLen=searchText.length();
        int streamLen=args.length();
        int searchHash=FindHash(searchText);

        for(int i=0;i<streamLen;i++){
            int end=i+searchLen;
            if(end>streamLen)
                break;
            String temp=args.substring(i,i+searchLen);
            int tempHash=FindHash (temp);
            if(tempHash==searchHash && searchText.equals(temp)){
                System.out.println("Search string found at : "+i);
            }
            
        }
    }
}
