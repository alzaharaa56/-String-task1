public class sumDigits {

    public  static void main (String[] args){

        System.out.println(sumDigits("a1b2"));

    }


    public static int sumDigits(String str) {

        int x = str.length();
        int sum = 0;

        for (int i = 0; i < x; i++) {
            if (Character.isDigit(str.charAt(i))) {

                    String tmp = str.substring(i, i + 1);
                    sum += Integer.parseInt(tmp);

            }

        }
        return sum;
    }
}

