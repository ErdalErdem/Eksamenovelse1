public class Main {
    public static void main(String[] args) {

Tekst tekst = new Tekst();
System.out.println("Tekstlinjer:" + tekst);

tekst.tilføj("hej");
tekst.tilføj("hej");
tekst.tilføj("jan");
tekst.tilføj("dig");
        System.out.println("Tekstlinjer:" + tekst);

int antalUnikke = tekst.findAntalUnikke();
        System.out.println("Antal unikke:" + tekst.findAntalUnikke());




    }
}
