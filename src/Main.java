public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota Camry");
        Car lada =new Car("lada Kalina");

        Bicycle forward = new Bicycle("Forward");
        Bicycle aist =new Bicycle("Аист");

        Truck Kamaz= new Truck("Камаз");

        TransportService[] transports = {
                toyota,
                lada,
                forward,
                aist,
                Kamaz
        };
        toyota.service();

        ServiceStation serviceStation= new ServiceStation();

        for (TransportService transport:transports) {
            serviceStation.check(transport);
        }
    }
}