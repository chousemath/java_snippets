public class SimpleEncryption {
    public static String singleEncrypt(final String text) {
        char[] textArr = text.toCharArray();
        // iterate over char[], collecting char into two separate char[]'s
        String odd = "";
        String even = "";
        for (int i = 0; i < textArr.length; i++) {
            if (i%2 == 0) odd += textArr[i];
            else even += textArr[i];
        }
        // join each char array into two strings
        // concatenate the strings
        return even + odd;
    }

    public static String singleDecrypt(final String text) {
        char[] textArr = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < textArr.length / 2; i++) {
            sb.append(textArr[textArr.length/2 + i]).append(textArr[i]);
        }
        String result = sb.toString();
        if (textArr.length % 2 != 0) result += textArr[textArr.length - 1];
        return result;
    }

    public static String encrypt(final String text, final int n) {
        String transformed = text;
        for (int i = 0; i < n; i++) transformed = singleEncrypt(transformed);
        return transformed;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String transformed = encryptedText;
        for (int i = 0; i < n; i++) transformed = singleDecrypt(transformed);
        return transformed;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("This is a test!!!", 1)); // should be "hsi  etTi sats!"
        System.out.println(decrypt("hsi  et!Ti sats!!", 1));
        System.out.println(encrypt("This is a test!!!", 2)); // should be "s eT ashi tist!"
        System.out.println(decrypt("s e!ist!hi tT as!", 2));
    }
}
