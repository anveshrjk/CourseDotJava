public class PrinterApp {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        
    }
}
class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel < 100 && tonerLevel > 0) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerLevel > 100 || tonerLevel > 0) {
            tonerLevel = -1;
        }
        tonerLevel += tonerAmount;   
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages; 
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
    
}
