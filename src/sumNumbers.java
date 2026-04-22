public class sumNumbers {

    public static void main(String[] args) {

        System.out.println(sumNumbers(
                "abc123xyz"));

    }

    public static int sumNumbers(String str) {
        int x = str.length();
        int sum = 0;
        String tmp = "";

        for (int i = 0; i < x; i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < x - 1 && Character.isDigit(str.charAt(i + 1))) {
                    tmp += str.charAt(i);

                } else {
                    tmp += str.charAt(i);
                    sum += Integer.parseInt(tmp);
                    tmp = "";
                }
            }


        }
        return sum;


    }
}
