public class BackendBiglietti extends Thread {
    static final String[] biglietti = new String[10];
    static int bigliettiVenduti = 0;
    String nome;
    public BackendBiglietti(String nome) {
        this.nome = nome.toUpperCase();
    }
    public void run() {
        synchronized (biglietti) {
            if (bigliettiVenduti < 10) {
                biglietti[bigliettiVenduti] = nome + "X0" + bigliettiVenduti + 1;
                bigliettiVenduti++;
                System.out.println("Codice Biglietto: " + biglietti[bigliettiVenduti - 1]);
            } else {
                System.out.println("Biglietti esauriti! " + nome);
            }
        }
    }

}
