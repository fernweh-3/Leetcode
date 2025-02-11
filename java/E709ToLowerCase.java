public class E709ToLowerCase {
    public String toLowerCase(String string) {

        char[] array = new char[string.length()];

        int index = 0;
        for (char ch : string.toCharArray()) {

            if (ch >= 'A' & ch <= 'Z') {
                array[index++] = (char) ((ch - 'A') + 'a');
            } else {
                array[index++] = ch;
            }
        }
        return new String(array);
    }

    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                str.append((char)(s.charAt(i)+32));
            }
            else
            {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
