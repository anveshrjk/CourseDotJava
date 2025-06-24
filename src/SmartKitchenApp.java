public class SmartKitchenApp {
    public static void main(String[] args) {
        

        SmartKitchen remote = new SmartKitchen(
            new Refrigirator(true), 
            new DishWasher(true), 
            new CoffeeMaker(false)
        );
        remote.pourMilk();
        remote.addWater();
        remote.loadDishWasher();
    }
}

class SmartKitchen {

    private Refrigirator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaster;

    
    public SmartKitchen(Refrigirator iceBox, DishWasher dishWasher, CoffeeMaker coffeeMaster) {
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
        this.coffeeMaster = coffeeMaster;
    }

    public void addWater() {
        coffeeMaster.brewCoffee(true);
    }

    public void pourMilk() {
        iceBox.orderFood(true);
    }

    public void loadDishWasher() {
        dishWasher.doDishes(true);
    }
}
class Appliance {

    private boolean hasWorkToDo;

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    // public boolean getFlag() {
    //     return hasWorkToDo;
    // }
}

class Refrigirator extends Appliance {

    public Refrigirator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void orderFood(boolean hasWorkToDo) {
        if(hasWorkToDo == true) {
            System.out.println("pouring milk~");
        }
    }
}

class DishWasher extends Appliance {

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes(boolean hasWorkToDo) {
        if (hasWorkToDo == true) {
            System.out.println("Starting the dish washer...");
        }
    }
}
class CoffeeMaker extends Appliance {

    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee(boolean hasWorkToDo) {
        if(hasWorkToDo == true) {
            System.out.println("brewing some coffee~");
        }    
    }
}