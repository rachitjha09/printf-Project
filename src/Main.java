//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //printf():
        //          an optinal method to control, format and display text to the console window
        //          two arguments=format string+(object/variable/value)
        //          %[flags][precision][width][conversion-charactr]

        boolean myBoolean=true;
        char myChar='@';
        String myString="RJ";
        int myInt=50;
        double myDouble=1000;

        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

    }
}