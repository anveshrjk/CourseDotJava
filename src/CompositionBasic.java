public class CompositionBasic {
    public static void main(String[] args) {
        
        ComputerCase theCase = new ComputerCase("Dell", "3895", "240");
        Monitor theMonitor = new Monitor("Acer", "27inch Beast", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BK-2000", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("Dell", "3895", theCase, theMonitor, theMotherboard);

        // instead of calling like this... we can call it as a whole by powerUp() method~
        // thePC.getMonitor().drawPixelAt(10, 10, "red");
        // thePC.getMotherboard().loadProgram("Windows OS");
        // thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }
}

class Product {

    private String manufacturer, model;
    private int width, height, depth;

    public Product() {}

    public Product(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
 }

class Monitor extends Product {

    private int size;
    private String resolution;

	public Monitor(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public Monitor(int size, String resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public Monitor(String manufacturer, String model, int size, String resolution) {
        super(manufacturer, model);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String colour) {
        System.out.println(String.format
        ("drawing pixel at %d, %d in colour %s ", x, y, colour));
    }
 }

class Motherboard extends Product {

    private int ramSlots, cardSlots;
    private String bios;

	public Motherboard(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public Motherboard(int ramSlots, int cardSlots, String bios) {
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public Motherboard(String manufacturer, String model, int ramSlots, int cardSlots, String bios) {
        super(manufacturer, model);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    
    public void loadProgram(String programName) {
        System.out.println("program " + programName + " is now loading...");
    }
 }

class ComputerCase extends Product {

    private String powerSupply;

	public ComputerCase(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public ComputerCase(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public ComputerCase(String manufacturer, String model, String powerSupply) {
        super(manufacturer, model);
        this.powerSupply = powerSupply;
    }
    
    public void pressPowerButton() {
        System.out.println("power button pressed");
    }
 }

class PersonalComputer extends Product {

     private ComputerCase computerCase;
     private Monitor monitor;
     private Motherboard motherboard;
    
    public PersonalComputer(String manufacturer, String model, ComputerCase computerCase, Monitor monitor,
            Motherboard motherboard) {
        super(manufacturer, model);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

    /* 
    public ComputerCase getComputerCase() {
        return computerCase;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public Motherboard getMotherboard() {
        return motherBoard;
    }
    */
}