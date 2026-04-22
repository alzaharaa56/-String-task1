public class mirrorEnds {
    public static void main(String[] args) {

        System.out.println(mirrorEnds("abXYZba"));
    }


    public static String mirrorEnds(String string) {
        int x = string.length();
        String fin = "";
        String tmp1 = "";
        String tmp2 = "";

        for (int i = 0; i < x; i++) {
            tmp1 += string.substring(i,i+1);
            tmp2 = "";
            for (int j = tmp1.length()-1; j >= 0; j--) {

                tmp2 += tmp1.substring(j,j+1);
                if (tmp2.equals(string.substring(x-i-1,x)))
                fin = tmp1;
            }
        }
        return fin;

        }


    }
