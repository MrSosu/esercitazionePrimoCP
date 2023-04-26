import java.util.HashSet;
import java.util.Set;

public class Team {

    private int id;
    private String nome;
    private Set<FootballPlayer> rosa;

    public Team(int id, String nome, Set<FootballPlayer> rosa) {
        this.id = id;
        this.nome = nome;
        this.rosa = rosa;
    }

    public Team(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.rosa = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<FootballPlayer> getRosa() {
        return rosa;
    }

    public void setRosa(Set<FootballPlayer> rosa) {
        this.rosa = rosa;
    }

    /*
        - printTeam() : stampa riga per riga nome e cognome di ogni giocatore.
         */
    public void printTeam() {
        for (FootballPlayer fp : rosa) {
            System.out.println(fp.getNome() + " " + fp.getCognome());
        }
    }

    public void addPlayer(FootballPlayer fp) {
        rosa.add(fp);
    }

}
