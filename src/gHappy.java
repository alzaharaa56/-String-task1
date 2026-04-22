public class gHappy {


    public static void main(String[] args) {

        System.out.println(gHappy("xxggxx"));

    }
    public static boolean gHappy(String str) {
        if (str.length() < 1) {
            return false;
        }

        boolean result = false;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g' && str.charAt(i - 1) == 'g'
                    || str.charAt(i + 1) == 'g') {
                result = true;

            }
        }

        return result;
    }
}

