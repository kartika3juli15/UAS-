public class UASmain{

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in); 
        BarangRental barang1 = new BarangRental("S 4567 YV", "Honda Beat", "Motor", 2017, 10000);
        BarangRental barang2 = new BarangRental("N 4511 VS", "Honda Vario", "Motor", 2018, 10000);
        BarangRental barang3 = new BarangRental("N 1453 AA", "Honda Yaris", "Mobil", 2022, 30000);
        BarangRental barang4 = new BarangRental("AB 4321 A", "Honda Innova", "Mobil", 2019, 60000);
        BarangRental barang5 = new BarangRental("B 1234 AG", "Honda Avanza", "Mobil", 2021, 25000);
    
    System.out.println("Menu");
    System.out.println("1. Daftar Kendaraan");
    System.out.println("2. Peminjaman");
    System.out.println("3. Tampilkan Seluruh Transaksi");
    System.out.println("4. Urutkan Transaksi urut no TNKB");
    System.out.println("5. keluar");
    int pilih = sc17.nextInt();

    switch (pilih) {
        case 1:
        
            break;

        case 2:
    
        default:
            break;
    }
}
}