public class Operators
{
    public static void main(String[] args) 
    {
        int i = 10;
        int f = 5;
        f += i;
        boolean flag = true;
        flag = !flag;
        i++;
        System.out.print(i);
        System.out.print(f);
        System.out.print(flag);
        String string1 = "I am a string";
        String string2;
        string1.equals(string2);
        String string3 = "I am also a string";
        boolean stringsEquals = string1.compareTo(string3);
        String[] strArray = new String[5];
        String[] strArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        for (String a = 0; i < myArray.length; a++) {
            System.out.println(myArray[a]);
        }
        for (String value : myArray) {
            System.out.print(value);
        }
        
}