public class Ravenclaw extends Hogwarts {

    private int intelligence;
    private int wisdom;
    private int  wit;
    private int creativ;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativ) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativ = creativ;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativ() {
        return creativ;
    }

    public void setCreativ(int creativ) {
        this.creativ = creativ;
    }
    @Override
    public String toString() {
        return getName()
                + " Магическая сила = "+getMagicPower()+
                " Расстояние трансгресии = "+getTransgressionDistance()+
                " Ум = "+ intelligence+
                " Мудрость = "+ wisdom+
                " Остроумие = " + wit+
                " Полны творчества = " + creativ;
    }
}
