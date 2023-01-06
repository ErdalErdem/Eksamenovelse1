import java.util.ArrayList;

public class Tekst {
    private ArrayList<String> tekstlinjer = new ArrayList<String>();

    public void tilføj(String tekst) {
        tekstlinjer.add(tekst);

    }

    public int findAntalUnikke() {
        ArrayList<String> unikListe = new ArrayList<>();
        for (String s : tekstlinjer) {
            if (!unikListe.contains(s))
            unikListe.add(s);
        }
return unikListe.size();

    }

    @Override
    public String toString() {
        return "" + tekstlinjer;
    }
}


