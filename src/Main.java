import javax.print.PrintService;

class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter= new Gryffindor(
                "Гарри Поттер",
                70,
                80,
                80,
                85,
                90
        );

        Gryffindor hermioneGranger= new Gryffindor(
                "Гермиона Грейнджер",
                65,
                70,
                70,
                75,
                80
        );

        Slytherin dracoMalfoy=new Slytherin(
             "Драсо Малфой",
                77,
                79,
                50,
                65,
                78,
                77,
                80
        );

        Slytherin gragoryGoyl=new Slytherin(
                "Грегори Гойл",
                69,
                30,
                40,
                55,
                48,
                17,
                30
        );
        System.out.println(harryPotter);
        System.out.println(harryPotter);
        System.out.println(dracoMalfoy);
        System.out.println(gragoryGoyl);

        harryPotter.compareAnyStydent(hermioneGranger);
        dracoMalfoy.compareAnyStydent(gragoryGoyl);

        harryPotter.compareAnyStydent(dracoMalfoy);
        hermioneGranger.compareAnyStydent(gragoryGoyl);
    }
}
