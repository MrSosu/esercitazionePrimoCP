import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // a) Istanziare 5 variabili di tipo FootballPlayer (con parametri a scelta) e inserire 3 di loro in un insieme.
        FootballPlayer fp1 = new FootballPlayer(1, "Francesco", "Totti", 120, 80, 42 );
        FootballPlayer fp2 = new FootballPlayer(2, "Gianluigi", "Buffon", 400, 0, 0);
        FootballPlayer fp3 = new FootballPlayer(3, "Eldor", "Shomurodov", 25, 8, 3);
        FootballPlayer fp4 = new FootballPlayer(4, "Ola", "Solbakken", 6, 1, 1);
        FootballPlayer fp5 = new FootballPlayer(5, "Zinedine", "Zidane", 190, 55, 60);

        Set<FootballPlayer> players = new HashSet<>();
        players.add(fp1);
        players.add(fp2);
        players.add(fp3);

        // b) Istanziare un oggetto di tipo Team teamA passando come parametro al costruttore l'insieme appena creato.
        Team teamA = new Team(1, "Boca Juniors", players);

        // c) Istanziare un oggetto di tipo Team teamB usando il costruttore senza l'insieme in input e poi aggiungere ad esso gli altri 2 giocatori con il metodo addPlayer.
        Team teamB = new Team(2, "RIver Plate");
        teamB.addPlayer(fp4);
        teamB.addPlayer(fp5);

        // d) Stampare tutti i giocatori del teamA che hanno:
        //- almeno segnato 5 gol oppure ha almeno effettuato 7 assist e
        //- ha almeno 20 presenze.
        for (FootballPlayer fp : teamA.getRosa()) {
            if (fp.getGol() >= 5 || (fp.getAssist() >= 7 && fp.getPresenze() >= 20)) {
                System.out.println(fp.getNome() + " " + fp.getCognome());
            }
        }

        // e) Istanziare un teamC i cui giocatori sono quelli del teamA più quelli del teamB.
        players.addAll(teamB.getRosa());
        Team teamC = new Team(3, "Flamenco", players);

        // f) Creare una mappa dove le chiavi sono i giocatori del teamC e i valori sono i loro punteggi calcolati dal metodo score().
        Map<FootballPlayer, Double> mappa = new HashMap<>();
        for (FootballPlayer fp : teamC.getRosa()) {
            mappa.put(fp, fp.score());
        }

        // g) Stampare tutti i giocatori della mappa che hanno un punteggio superiore a 0.6
        for (FootballPlayer fp : mappa.keySet()) {
            if (mappa.get(fp) > 0.6) {
                System.out.println(fp.getNome() + " " + fp.getCognome());
            }
        }
    }

}
