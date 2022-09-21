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
        String string2 = string1;
        string1.equals(string2);
        String string3 = "I am also a string";
        boolean stringsEquals = string1.equals(string3);
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int a = 0; a < strArray.length; a++) {
            System.out.println(strArray[a]);
        }
        for (String value : strArray) {
            System.out.print(value);
        }
        System.out.println();
        for (int a = 0; a < strArray.length; ++a) {
            System.out.print(strArray[a]);
            if (a < strArray.length-1) {
                System.out.print("-");
            }
        }

}
}