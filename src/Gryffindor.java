public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compare (Gryffindor second){
        int firstSum=this.getBravery()+
               this.getHonor()+
                this.getNobility();
        int secondSum= second.getBravery()+
                second.getHonor()+
                second.getNobility();

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
                " Благородство = " + nobility +
                " Честь = " + honor +
                " Храбрость = " + bravery;
    }
}
