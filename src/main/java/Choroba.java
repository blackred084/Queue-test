public enum Choroba {
        GRYPA(1),
    PRZEZIEBIENIE(2),
    BIEGUNKAA(3),
    RAK(4);
        int zarazliwosc;


    Choroba(int zarazliwosc) {
this.zarazliwosc=zarazliwosc;
    }

    public int getZarazliwosc() {
        return zarazliwosc;
    }
}
