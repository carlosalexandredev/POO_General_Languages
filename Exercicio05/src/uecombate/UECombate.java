package Exercicio05.src.uecombate;

public class UECombate {
    public static void main(String[] args) {
    Lutador lutadores[] = new Lutador[6];
    lutadores[0] = new Lutador("Pretty Boy","França",31,1.75,68.9,11,2,1);
    lutadores[1] = new Lutador("Putscript","Brasil",29,1.68,57.8,12,2,1);
    lutadores[2] = new Lutador("Snapshadow", "EUA", 35,1.65,80.9,12,2,1);
    lutadores[3] = new Lutador("Dead Code", "Australia", 28,1.93,81.6,13,0,2);
    lutadores[4] = new Lutador("UFOCobol", "Brasil", 28,1.93,119.3,5,4,3);
    lutadores[5] = new Lutador("Nerdaart","EUA",30,1.81,105.7,12,2,4);



    Lutas UEC01 = new Lutas();

    UEC01.marcarLuta(lutadores[0], lutadores[1]);
    UEC01.luta();

    lutadores[0].status();
    lutadores[1].status();
    }
}
