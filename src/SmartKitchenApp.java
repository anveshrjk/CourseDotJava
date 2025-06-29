public class SmartKitchenApp {
    public static void main(String[] args) {
        
        SmartKitchen kitchen = new SmartKitchen();

        // // by classic method
        // kitchen.getDishWasher().setHasWorkToDo(true);
        // kitchen.getIceBox().setHasWorkToDo(true);
        // kitchen.getBrewMaster().setHasWorkToDo(true);

        // kitchen.getDishWasher().doDishes();
        // kitchen.getBrewMaster().brewCoffee();
        // kitchen.getIceBox().orderFood();

        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();
    }
}

class SmartKitchen {

    private Refrigirator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigirator();
        dishWasher = new DishWasher();
    }


    public SmartKitchen(Refrigirator iceBox, DishWasher dishWasher,
                         CoffeeMaker coffeeMaster) {
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
        this.brewMaster = coffeeMaster;
    }

    public Refrigirator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, 
                            boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}


class Refrigirator {

    private boolean hasWorkToDo;  
    
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    
    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("ordering food~");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("starting the dish washer...");
            hasWorkToDo = false;
        }
    }
}
class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

	public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("brewing some coffee~");
            hasWorkToDo = false;
        }    
    }
}
// class Appliance {

//     private boolean hasWorkToDo;

//     public Appliance(boolean hasWorkToDo) {
//         this.hasWorkToDo = hasWorkToDo;
//     }

//     // public boolean getFlag() {
//     //     return hasWorkToDo;
//     // }
// }