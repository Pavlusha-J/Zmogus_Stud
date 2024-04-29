//Užduotis: Sukurkite bazinę klasę Zmogus su laukais vardas ir pavarde.
// Sukurkite išvestinę klasę Studentas, kuri paveldi Zmogus klasę ir prideda papildomą
// lauką studentoNr.
// Abi klasės turėtų turėti konstruktorius ir metodus duomenų gavimui.
// Papildykite trečią užduotį taip, kad Studentas klasėje būtų metodas atspausdintiInfo(),
// kuris atspausdina visą studento informaciją, įskaitant vardą, pavardę ir studento numerį.
// Zmogus klasė taip pat turėtų turėti savo versiją šio metodo, kuri atspausdina tik vardą ir pavardę.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Main {
    public static void main(String[] args) {

//Zmogus obj = new Zmogus( "Peter", "Jonaitis", "12345");
        Studentas ob1 = new Studentas ("Petras", "Vaisvila",13234);

//obj.spausdintiInfo();
        ob1.spausdintiInfo();

        //       System.out.println("Studento Vardas: "+ obj.getVardas()+", " +"Pavarde: " + obj.getPavarde() +
//                ", studentoNr.: "+ob1.StudentoNr());

    }
}