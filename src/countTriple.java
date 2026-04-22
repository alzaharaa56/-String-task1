public class countTriple {
    public  static void main (String[] args){

        System.out.println(countTriple ("abcXXXabc"));

    }


    public static int countTriple (String str){
        int x= str.length();
        int count =0;

        for (int i= 0; i< x-2 ; i++){
            char tmp = str.charAt(i);
        if (tmp ==str.charAt(i+1) && tmp == str.charAt(i+2))
            count++;
        }

        return count;

    }
}
