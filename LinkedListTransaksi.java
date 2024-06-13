public class LinkedListTransaksi {
    TransaksiRental head;
    TransaksiRental tail;

    public LinkedListTransaksi() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addTransaksi(BarangRental barangRental, int jumlahBarang) {
        TransaksiRental newTransaksi = new TransaksiRental(barangRental, jumlahBarang);
        if (isEmpty()) {
            head = newTransaksi;
            tail = newTransaksi;
        } else {
            tail.setNext(newTransaksi);
            newTransaksi.setPrev(tail);
            tail = newTransaksi;
        }
    }
    public void displayTransaksi() {
        if (isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        Transaksi current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
    public double hitungTotal() {
        double total = 0;
        Transaksi current = head;
        while (current != null) {
            total += current.getHargaTotal();
            current = current.getNext();
        }
        return total;
    }
    public void hapusTransaksi(int kodeTransaksi) {
        TransaksiRental current = head;
        while (current != null) {
            if (current.getKodeTransaksi() == kodeTransaksi) {
                TransaksiRental prev = current.getPrev();
                TransaksiRental next = current.getNext();

                if (prev != null) {
                    prev.setNext(next);
                } else {
                    head = next;
                }

                if (next != null) {
                    next.setPrev(prev);
                } else {
                    tail = prev;
                }

                System.out.println("Transaksi dengan kode " + kodeTransaksi + " berhasil dihapus.");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Transaksi dengan kode " + kodeTransaksi + " tidak ditemukan.");
    }
}
