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
        double ipk =(nRata_Rata/ 100)*4;
        String predikat;

        if (ipk >3.75) {
            predikat = ("A (sangat baik)");
        }else if (ipk >=3.50 && ipk <= 3.74) {
            predikat = ("AB (Baik sekali)");
        }else if (ipk >= 3.00 && ipk <= 3.49) {
            predikat = ("B (baik)");
        }else if (ipk >= 2.50 && ipk <= 2.99) {
            predikat = ("BC (cukup)");
        }else {
            predikat = ("C (kurang)");
        }

        System.out.println("\nhasil nilai\n");
        System.out.println("ipk" +ipk);
        System.out.println("prediket" + predikat);

        if (predikat.equalsIgnoreCase("A (sangat baik)") || predikat.equalsIgnoreCase("AB (Baik sekali)") ) {
            System.out.println("1.struktur data");
            System.out.println("2.Pemrogaman berorientasi objek ");
            System.out.println("3.Basis data");
            System.out.println("4.Algoritma pemrogaman");
            System.out.println("5.Rekayasa perangkat lunak");

            System.out.println("\npilih matah kuliah");
            int pilihan = ns.nextInt();

            switch (pilihan) {
                case 1:
                if ( struktur_data >= 75) {
                    System.out.println("Selamat mahasiswa diterima menjadi dosen");
                }else{
                    System.out.println("maaf anda belom lolos");
                }
                    break;
                case 2:    
                if ( pbObjek >= 75) {
                    System.out.println("Selamat mahasiswa diterima menjadi dosen");
                }else{
                    System.out.println("maaf anda belom lolos");
                }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:

                    break;
            }
        }
        
    }
}