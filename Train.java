public class Train {

    int numCars; 
    int passengerCapacity;
    int maxTrainCapacity; 

    public Train(FuelType f, int numCars, double maxfuelLevel, int passengerCapacity) {
      //Engine trainEngine = new Engine(FuelType.ELECTRIC, 5, 100.0, 100);
      //ArrayList <int> Cars = new ArrayList <>(); 

    }

    public void getEngine() {
        //System.out.println(trainEngine); 
    }

    public void getCar(int i) {
        //System.out.println(Cars.get(i))
    }

    public int getMaxCapacity(){
       // int x = 0; acts as a variable to get the maxTrainCapacity 
       // for (int i = 0; i < Cars.size(); i ++) {
       //   Cars.get(i).size() + x;
       // }
       return maxTrainCapacity; 
    }

    public int seatsRemaining(int maxtrainCapacity, int passangerCapacity){
       // int y = 0; acts a variable to get the passangerCapacity of all of the train cars
       // for (int i = 0; i < Cars.size(); i ++) {
       //  Cars.get(i).size() + y; 
       //}
       // y = int passangerCapacity; 
        return maxTrainCapacity - passangerCapacity; 
    }

    public void printManifest(){
        //for (int 1 = 0; i < Cars.size(); i ++) {
        //  System.out.println(Cars.get[i])
        //}
    }

 }
