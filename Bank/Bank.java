package Bank;

public class Bank {
    private int saldo;

    public Bank(int saldo){
        this.saldo = saldo;
    }

    public void ambilUang(int ambil){
        if (ambil <= saldo) {
            saldo -= ambil;
            System.out.printf("Ambil Saldo nominal anda : Rp.%,d\n", ambil);
            System.out.printf("Saldo saat ini: Rp.%,d\n", saldo);
        } else {
            System.out.printf("Saldo tidak mencukupi untuk menarik uang sebesar: Rp.%,d\n", ambil);
        }
    }
    public void simpanUang(int simpan){
        if (simpan > 0) {
            saldo += simpan;
            System.out.printf("Anda mengirim uang: Rp.%,d\n", simpan);
            System.out.printf("Saldo anda saat ini: Rp.%,d\n", saldo);
        } else {
            System.out.println("Jumlah yang amda disimpan harus lebih besar dari nol.");
        }
    }
    public void getSaldo(){
        System.out.println("Selamat Datang Di Bank");
        System.out.printf("Saldo anda saat ini yaitu : Rp.%,d\n", saldo);
    }
}