public class ReverseWords{

    public static String reverseWords(String str){
        //write your code here...
        String[] stringArr = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArr.length; i++) {
            sb.append(stringArr[stringArr.length - 1 - i]);
            if (i != stringArr.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String test1 = "Hello my world.";
        System.out.println(reverseWords(test1));
    }
}