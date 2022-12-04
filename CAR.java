
    public class CAR {


        int year;
        double price;
        boolean isSportCar;
        int fuelTankCapacity;
        double freeFuel;
        String engineFuelOperationSystem;

            void changengineFuelOperationSystem(String newЕngineFuelOperationSystem) {
                engineFuelOperationSystem = newЕngineFuelOperationSystem;
                newЕngineFuelOperationSystem = "Diesel";
            }
            public static void main(String args[]) {
                CAR CCC = new CAR();
                CCC.changengineFuelOperationSystem("Diesel");
                System.out.println(CCC.engineFuelOperationSystem+"");
            }
        }
        void useFuel (double fuel) {
            if (fuel > freeFuel) {
            }
        }
        public static void main (String args[] ) {
            System.out.println("Not enough free fuel!");
        }
    }







