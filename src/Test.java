public class Test extends Printer{
    public static void main(String[] args){
        System.out.println("For number 1 requirement.......");
        Override override = new Override();
        override.print();
        testOverload("Christian i am not overload");
        testOverload("Christian", "i am overload");

        System.out.println("For number 2 requirement.......");
        Printer printer = new Printer();
        printer.print();
        printer = new ColorPrinter();
        printer.print();
        printer = new BlacknWhitePrint();
        printer.print();
    }

    public static void testOverload(String name){
        System.out.println(name);
    }

    public static void testOverload(String name, String overload){
        System.out.println(name + " " + overload);
    }
}
