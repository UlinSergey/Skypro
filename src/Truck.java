public class Truck extends MotorTransport {

    public Truck (String modelName){
        super(modelName,6);
    }

    public Truck (String modelName, int wheelsCount){
        super(modelName,wheelsCount);
    }

    public void chackTrailer(){
        System.out.println("Проверяем прицеп");
    }
}