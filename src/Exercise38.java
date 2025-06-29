public class Exercise38 {
    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        
        Ceiling ceiling = new Ceiling(12, 55);
        
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        
        Lamp lamp = new Lamp("Classic", false, 75);
        
        Bedroom bedRoom = new Bedroom("inte", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();
        
        bedRoom.getLamp().turnOn();
    }
}
class Lamp {
 
    private String style;
    private boolean battery;
    private int globalRating;
    
    public Lamp(String style, boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globalRating = globalRating;
    }
    
    public void turnOn() {
        System.out.print("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }
}
class Bed{
    
    private String style;
    private int pillows, height, sheets, quilt;
    
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    
    public void make() {
        System.out.print("Bed -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
class Ceiling {

    private int height, paintedColour;

    public Ceiling(int height, int paintedColour) {
        this.height = height;
        this.paintedColour = paintedColour;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColour() {
        return paintedColour;
    }
}
class Wall {

    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
class Bedroom {

    private String name;
    private Wall  wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    
    public Bedroom(String name, Wall wall1,
                     Wall wall2, Wall wall3,
                    Wall wall4, Ceiling ceiling,
                     Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }
}