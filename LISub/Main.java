public class Main {
    private static void LIS(String s1,String s2){
        int row=s1.length();
        int col=s2.length();
        char s1CharArr[]=s1.toCharArray();
        char s2CharArr[]=s2.toCharArray();

        /*Creating initialising array*/
        int result[][]=new int[row+1][col+1];
        for(int i=0;i<=row;i++){
            result[i][0]=0;
        }
        for(int i=0;i<=col;i++){
            result[0][1]=0;
        }
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(s1CharArr[i-1]==s2CharArr[j-1]){
                    result[i][j]=result[i-1][j-1]+1;
                }
            }
        }

        int maxVal=0,maxRow=0,maxCol=0;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                /*Printing max len substring*/
                if(result[i][j]>maxVal){
                    maxVal=result[i][j];
                    maxRow=i;
                    maxCol=j;
                }
            }
        }
        System.out.println("\nPrinting Max Substring details");
        System.out.println("Max lenght of substring : "+maxVal);
        StringBuilder sb=new StringBuilder();
        while (maxVal!=0){
            sb.append(s1CharArr[maxRow-1]);
            maxRow--;
            maxVal--;
        }
        System.out.println("Longest Substring : "+sb.reverse().toString());

    }
    public static void main(String[] args) {
        String input1="abcdxyz";
        String input2="xyzabcd";
        System.out.println("Original String parameters");
        System.out.println(input1);
        System.out.println(input2);
        LIS(input1,input2);
    }
}
