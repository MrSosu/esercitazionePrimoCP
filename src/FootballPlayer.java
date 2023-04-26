public class FootballPlayer {

    private int id;
    private String nome;
    private String cognome;
    private int presenze;
    private int gol;
    private int assist;
    private Team team;

    public FootballPlayer(int id, String nome, String cognome, int presenze, int gol, int assist) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.presenze = presenze;
        this.gol = gol;
        this.assist = assist;
    }

    public FootballPlayer(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getPresenze() {
        return presenze;
    }

    public int getGol() {
        return gol;
    }

    public int getAssist() {
        return assist;
    }

    public void setPresenze(int presenze) {
        this.presenze = presenze;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    /*
        score() : questo metodo calcola quanto un giocatore sia incisivo in campo.
    Il punteggio è dato da (numeroGol + (0.75*numeroAssist)) / numeroPresenze.
         */
    public double score() {
        if (presenze == 0) return 0;
        return (gol + (0.75*assist)) / presenze;
    }

}
