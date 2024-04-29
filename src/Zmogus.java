public class Zmogus {

    private String vardas;
    private String pavarde;

    public Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }
    public Zmogus() {
    }
    public String getVardas() {
        return vardas;
    }
    public String getPavarde() {
        return pavarde;
    }
    public void spausdintiInfo() {
        System.out.println("Studento rekvizitai: " + getVardas() + " " + getPavarde());
    }
}


