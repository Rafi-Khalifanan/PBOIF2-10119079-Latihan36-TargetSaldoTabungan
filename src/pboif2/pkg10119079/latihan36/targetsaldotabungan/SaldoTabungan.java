package pboif2.pkg10119079.latihan36.targetsaldotabungan;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class SaldoTabungan {
    public int saldoAwal = 3500000;
    public int saldoTarget = 6000000;
    public double bunga = 8;
    
    public void saldo(){
        int i =1;
        while(saldoAwal<=saldoTarget){
            int akhir = (int) (saldoAwal+((bunga/100)*saldoAwal));
            saldoAwal=akhir;
            
            System.out.println("Saldo di bulan ke-"+i+" Rp." +akhir);
            i = i+1;
        }  
    }
}