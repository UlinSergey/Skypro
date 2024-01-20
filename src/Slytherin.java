public class Slytherin  extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void compare (Slytherin second){
        int firstSum=this.getCunning()+
                this.getDetermination()+
                this.getAmbition()+
                this.getResourcefulness()+
                this.getThirstForPower();
        int secondSum= second.getCunning()+
                second.getDetermination()+
                second.getAmbition()+
                second.getResourcefulness()+
                second.getThirstForPower();

        if (firstSum>secondSum){
            System.out.println(this.getName()+ " Более лучший в факультете Слизерин, чем "+ second.getName());
        }else if (secondSum>firstSum){
            System.out.println(second.getName()+ " Более лучший в факультете Слизерин, чем "+ this.getName());
        }else {
            System.out.println(this.getName()+" и "+ second.getName()+" Равны ");
        }

    }


    @Override
    public String toString() {
        return getName()
               + " Магическая сила = "+getMagicPower()+
                " Расстояние трансгресии = "+getTransgressionDistance()+
                " Хитрость = "+ cunning+
                " Решительность = "+ determination+
                " Амбициозность = " + ambition+
                " Находчивость = " + resourcefulness+
                " Жажда власти = " + thirstForPower;
    }
}


