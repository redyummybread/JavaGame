import javax.swing.Timer;

public class Donjon {
    public static void main(String[] args) {
        int tempo = 200;
        Jeu jeu = new Jeu("laby2.txt");
        FenetreJeu graphic = new FenetreJeu(jeu.terrain);
        Timer timer = new Timer(tempo, e -> {
            jeu.tour();
            graphic.repaint();
            
            if (Terrain.isFinished) { graphic.ecranFinal(Personnage.saved); }
        });
        timer.setInitialDelay(0);
        timer.start();
    }
}