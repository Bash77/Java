package arrays;

public class backward {
    public static void main(String[] args) {
        backwardString("pots");
        addSpaces("HeyWorld!It'sMeGezey");
    }

    private static void addSpaces(String text) {
        StringBuilder modifiedText = new StringBuilder(text);
        for (int i = 0; i<modifiedText.length(); i++){
            if (i !=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

    public static void backwardString(String text){
      for (int i = text.length()-1; i >=0; i--){
          text.charAt(i);
          System.out.print(text.charAt(i));
      }

    }
}
