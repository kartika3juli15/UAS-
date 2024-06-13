public class TransaksiRental{
    int kodeTransaksi, lamaPinjam;
    String namaPeminjam;
    double totalBiaya;
    BarangRental barangRental;
    TransaksiRental prev;
    TransaksiRental next;

    TransaksiRental (int kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBiaya, BarangRental barangRental){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.barangRental = barangRental;
    }

    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public BarangRental getBarangRental() {
        return barangRental;
    }

    public Transaksi getPrev() {
        return prev;
    }

    public void setPrev(Transaksi prev) {
        this.prev = prev;
    }

    public Transaksi getNext() {
        return next;
    }

    public void setNext(Transaksi next) {
        this.next = next;
    }

    public void tampil(){
        
    }
}