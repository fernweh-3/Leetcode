public class M151ReverseWordsinaString {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].isEmpty()) {
                System.out.println(arr[i]);
                result = result + " " + arr[i];
            }
        }
        return result.trim();
    }

}
