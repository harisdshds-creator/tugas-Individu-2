public class Deluxe extends Kendaraan {
    public Deluxe(String platNomor, String merk) {
        super(platNomor, merk);
    }

    @Override
    public double hitungTarif(int jarak) {
        return jarak * 10000; // Tarif khusus Deluxe
    }
}