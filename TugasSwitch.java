import java.util.Scanner;

public class TugasSwitch {

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("=====PROGAM ASISTEN DOSAN=====");
        double struktur_data, pbObjek, Basis_Data, algoritma_pemrogaman, rpLunak, nRata_Rata;
        
        System.out.print("Masukkan nilai struktur data :");
        struktur_data = ns.nextDouble();
        System.out.print("Pemrogaman berorientasi objek :");
        pbObjek= ns.nextDouble();
        System.out.print("Basis data :");
        Basis_Data= ns.nextDouble();
        System.out.print("Algoritma pemrogaman :");
        algoritma_pemrogaman= ns.nextDouble();
        System.out.print("Rekayasa perangkat lunak :");
        rpLunak= ns.nextDouble();

        nRata_Rata = (struktur_data + pbObjek + Basis_Data + algoritma_pemrogaman + rpLunak ) / 5;
        System.out.println("nilai rata-rata:" + nRata_Rata);
    }
}