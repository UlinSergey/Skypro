public class WheeledTransport implements TransportService {
    private String modeName;
    private int wheelsCount;

    public WheeledTransport(String modeName, int wheelsCount) {
        this.modeName = modeName;
        this.wheelsCount = wheelsCount;
    }

    public String getModeName() {
        return modeName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + this.modeName);
        for (int i = 0; i < wheelsCount; i++) {
            this.updateTyre();
        }
    }
}
