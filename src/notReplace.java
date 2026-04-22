public class notReplace {
    public static void main(String[] args) {

        System.out.println(notReplace ("is test"));


    }
    public static String notReplace(String str) {

        String result = "";
        int x = str.length();

        for (int i = 0; i < x; i++) {
            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))
                    || i + 2 < x && Character.isLetter(str.charAt(i + 2))) {
                result += str.charAt(i);

            } else if (i + 1 < x && str.substring(i, i + 2).equals("is")) {

                result += "is not";
                i++;

            } else result += str.charAt(i);

        }
        return result;

    }
}
