public class Patient {
    private String name;
    private String surname;
    private int how_Angry;
    private Choroba  disase;
    public Patient(String name, String surname, Integer how_AngryInt, Choroba choroba) {
        this.name= this.name;
        this.surname= this.surname;
        this.how_Angry=how_Angry;
        this.disase=disase;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHow_Angry() {
        return how_Angry;
    }

    public Choroba getDisase() {
        return disase;
    }
}
