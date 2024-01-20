class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void compareAnyStydent(Hogwarts second) {
        if (this.getMagicPower() > second.getMagicPower()) {
            System.out.println(this.getName() + " Обладает большей силой магии, чем " + second.getName());
        } else if (this.getMagicPower() < second.getMagicPower()) {
            System.out.println(second.getName() + " Обладает большей силой магии, чем " + this.getName());
        } else {
            System.out.println(second.getName() + " и " + this.getName() + " равны ");
        }

        if (this.getTransgressionDistance() > second.getTransgressionDistance()) {
            System.out.println(this.getName() + " Обладает большим ростоянием трангресии, чем " + second.getName());
        } else if (this.getTransgressionDistance() < second.getTransgressionDistance()) {
            System.out.println(second.getName() + " Обладает большим ростоянием трангресии, чем " + this.getName());
        } else {
            System.out.println(second.getName() + " и " + this.getName() + " равны ");
        }
    }

    @Override
    public String toString() {
        return "Hogwarts" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance;
    }
}