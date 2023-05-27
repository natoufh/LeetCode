public class problem58 {

    public static int lengthOfLastWord(String s) {

        String[] spliString = s.split(" ");
        String lastWord = "";

        for (int i = spliString.length - 1; i >= 0; i--) {
            if (spliString[i] == " ") {
                continue;
            } else {
                lastWord = spliString[i];
                break;
            }
        }
        return lastWord.length();
    }

    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = " fly me to the moon ";
        String s3 = "luffy is still joyboy";

        lengthOfLastWord(s1);
        lengthOfLastWord(s2);
        lengthOfLastWord(s3);
    }

}
