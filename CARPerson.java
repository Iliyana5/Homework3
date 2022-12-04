public class CARPerson {
        public static void main(String[] args) {


                CAR a = new CAR();
                a.year = 2010;
                a.price = 50000;
                a.fuelTankCapacity = 20;
                a.isSportCar = true;
                a.engineFuelOperationSystem = "Gasoline";
                a.freeFuel=35;

                CAR b = new CAR();
                b.year = 2012;
                b.price = 70000;
                b.isSportCar = false;
                b.fuelTankCapacity = 21;
                b.freeFuel = 3.5;
                b.changengineFuelOperationSystem("Diesel");
                        System.out.println("The car1 is:" + a.year + ", "+ a.freeFuel + ", price is: " + a.price + ", " + a.fuelTankCapacity + "," + a.isSportCar + ", " + a.engineFuelOperationSystem + "");
                System.out.println("The car2 is:" + b.year + ", "+ b.freeFuel + ", price is: " + b.price + ", " + b.fuelTankCapacity + "," + b.isSportCar + ", " + b.engineFuelOperationSystem + "");

        }
}



