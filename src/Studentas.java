public class Studentas extends Zmogus {

    int studentoNr;

    public Studentas(String vardas, String pavarde, int studentoNr) {
        super(vardas, pavarde);
        this.studentoNr = studentoNr;
    }
    public int getStudentoNr() {
        return studentoNr;
    }
    @Override
    public void spausdintiInfo() {
        super.spausdintiInfo();
        {
            System.out.println("Studento rekvizitai: " + getVardas() + "" + getPavarde() +
                    ", studentoNr.: " + getStudentoNr());
        }
    }
}

