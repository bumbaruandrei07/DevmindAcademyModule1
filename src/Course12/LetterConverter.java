package Course12;

public class LetterConverter {
    public static void main(String [] args){
        String str = "The number 1 deadliest animal on the PLANET Earth is the ©Mosquito!®";
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length();i++){
            if((Character.isLetter(sb.charAt(i))) && (Character.isUpperCase(sb.charAt(i)))){
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));

            }
            else if((Character.isLetter(sb.charAt(i))) && (Character.isLowerCase(sb.charAt(i)))){
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        String newString = sb.toString();
        System.out.println(newString);
    }
}
