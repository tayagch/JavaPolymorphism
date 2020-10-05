public class Test {
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.print();
        printer = new ColorPrinter();
        printer.print();
        printer = new BlacknWhitePrint();
        printer.print();
    }
}
