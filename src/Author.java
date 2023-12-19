public class Author {
    private String name;
    private String surname;

    Author (String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    private String getName(){
        return this.name;
    }
    private String getSurname(){
        return this.surname;
    }
}
