public class Hufflepuff extends Hogwarts {

    private int integrity;
    private int loyality;
    private int hardwork;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int integrity, int loyality, int hardwork) {
        super(name, magicPower, transgressionDistance);
        this.integrity = integrity;
        this.loyality = loyality;
        this.hardwork = hardwork;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getHardwork() {
        return hardwork;
    }

    public void setHardwork(int hardwork) {
        this.hardwork = hardwork;
    }

    public void compare (Hufflepuff second){
        int firstSum=this.getIntegrity()+
                this.getLoyality()+
                this.getHardwork();
        int secondSum= second.getIntegrity()+
                second.getLoyality()+
                second.getHardwork();

        if (firstSum>secondSum){
            System.out.println(this.getName()+ " Более лучший в факультете Гриффиндор, чем "+ second.getName());
        }else if (secondSum>firstSum){
            System.out.println(second.getName()+ " Более лучший в факультете Гриффиндор, чем "+ this.getName());
        }else {
            System.out.println(this.getName()+" и "+ second.getName()+" Равны ");
        }

    }

    @Override
    public String toString() {
        return getName()
                + " Магическая сила = " + getMagicPower() +
                " Расстояние трансгресии = " + getTransgressionDistance() +
                " Трудолюбивость = " + integrity +
                " Верность = " + loyality +
                " Честность = " + hardwork;
    }

}

