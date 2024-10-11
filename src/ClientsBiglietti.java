public class ClientsBiglietti {
    public static void main(String[] args) {
        BackendBiglietti[] clienti = new BackendBiglietti[100];
        String[] nomi = {"Mario", "Luigi", "Peach", "Toad", "Yoshi", "Bowser", "Wario", "Waluigi", "Daisy", "Rosalina", "Denis", "Giovanni", "Giacomo", "Gianluca", "Gianmarco"};
        for (int i = 0; i < nomi.length; i++) {
            clienti[i] = new BackendBiglietti(nomi[i]);
            clienti[i].start();
            try {
                Thread.sleep((int) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}