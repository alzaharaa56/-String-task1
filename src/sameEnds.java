public class sameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));


    }

    public static String sameEnds(String string) {
        int x =string.length();
        String fin= "";
        String tmp = "";

        for (int i= 0 ; i< x; i++){
            tmp +=string.charAt(i);
           int tmpx= tmp.length();

           if (i< x/2 && tmp.equals(string.substring(x-tmpx,x)))
           fin = tmp;
        }
        return fin;
    }


    }
