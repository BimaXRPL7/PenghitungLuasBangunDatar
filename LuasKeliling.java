import java.util.Scanner;

public class LuasKeliling {
    public static  void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1.Persegi");
        System.out.println("2.Persegi Panjang");
        System.out.println("3.Segitiga Sama Kaki");
        System.out.println("Masukan Pilihan: ");
        int PilihanBangun = input.nextInt();

        System.out.println("1.Luas");
        System.out.println("2.Keliling");
        System.out.println("Masukan Pilihan:");
        int PilihanLuasDanKeliling = input.nextInt();

        double HasilLuas;
        switch(PilihanBangun){
            case 1:
                switch(PilihanLuasDanKeliling){
                    case 1:
                        System.out.println("Masukan Sisi: ");
                        Double sisi = input.nextDouble();
                        HasilLuas= sisi * sisi;
                        System.out.println("Luas Persegi:" +HasilLuas);
                break;
                }
            case 2:
                switch(PilihanLuasDanKeliling){
                    case 1:
                        System.out.println("Masukan Panjang: ");
                        Double PanjangPersegiPanjang = input.nextDouble();
                        System.out.println("Masukan Lebar: ");
                        Double PanjangLebarPanjang = input.nextDouble();
                        HasilLuas = PanjangPersegiPanjang * PanjangLebarPanjang;
                        System.out.println("Luas Persegi Panjang: " +HasilLuas);
                break;        
                }
            case 3:
                switch(PilihanLuasDanKeliling){
                    case 1:
                        System.out.println("Masukan Alas: ");
                        Double AlasSegiTiga = input.nextDouble();
                        System.out.println("Masukan Tinggi");
                        Double TinggiSegiTiga = input.nextDouble();
                        HasilLuas = 0.5 * AlasSegiTiga * TinggiSegiTiga;
                        System.out.println("Luas Segitiga: " +HasilLuas);
                    break;
                }
                
                
        double HasilKeliling;
        switch (PilihanBangun){
            case 1:
                switch(PilihanLuasDanKeliling){
                    case 2:
                        System.out.println("Masukan Sisi:");
                        Double SisiKeliling = input.nextDouble();
                        HasilKeliling = 4*SisiKeliling;
                        System.out.println("Keliling Persegi: " +HasilKeliling);
                    break;
                }
        switch (PilihanBangun){
            case 2:
                switch(PilihanLuasDanKeliling){
                    case 2:
                        System.out.println("Masukan Panjang: ");
                        Double PanjangKeliling = input.nextDouble();
                        System.out.println("Masukan Lebar: ");
                        Double LebarKeliling = input.nextDouble();
                        HasilKeliling = 2*LebarKeliling*2*PanjangKeliling;
                        System.out.println("Keliling Persegi Panjang: " +HasilKeliling);
                }
        switch (PilihanBangun){
            case 3:
                switch(PilihanLuasDanKeliling){
                    case 2:
                        System.out.println("Masukan Sisi Miring: ");
                        Double SisiMiring = input.nextDouble();
                        System.out.println("Masukan Alas Segitiga: ");
                        Double AlasSegiTiga1 = input.nextDouble();
                        HasilKeliling = 2*SisiMiring+AlasSegiTiga1;
                        System.out.println("Keliling Segitiga Sama Kaki: " +HasilKeliling);
                }
        }
        }
        }       
        }
    }
}