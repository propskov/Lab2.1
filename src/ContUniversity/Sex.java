package ContUniversity;

public enum Sex {
    F("She", "Her"),
    M("He", "His");
    // Падежи метоимений i - именительный, v - винительный;
    private String Casei;
    private String Casev;

    private Sex(String Casei, String Casev) {
        setCasei(Casei);
        setCasev(Casev);
    }

    public String getCasei() {
        return Casei;
    }

    public void setCasei(String casei) {
        Casei = casei;
    }

    public String getCasev() {
        return Casev;
    }

    public void setCasev(String casev) {
        Casev = casev;
    }
}
