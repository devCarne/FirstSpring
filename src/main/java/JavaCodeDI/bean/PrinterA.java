package JavaCodeDI.bean;

public class PrinterA implements Printer{

    @Override
    public void Print() {
        System.out.print("Printer A : ");
    }
}
