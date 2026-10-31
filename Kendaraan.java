public class Kendaraan {
    protected String platNomor;
    protected String merk;

    public Kendaraan(String platNomor, String merk) {
        this.platNomor = platNomor;
        this.merk = merk;
    }

    public double hitungTarif(int jarak) {
        return jarak * 1000; // Default tarif
    }

    public void cetakResi(int jarak) {
        System.out.println("Plat  : " + platNomor);
        System.out.println("Merk  : " + merk);
        System.out.println("Tarif : Rp " + hitungTarif(jarak));
        System.out.println("--------------------------------");
    }
}