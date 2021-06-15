package string;

public class OperasiString {
    public static void main(String[] args) {
        System.out.println("Hai");

        String kota = "Rantau";
        int jumlah;
        double ipk;
        char nilaiAbjad = 'A';

        char[] kotaChar = {'R','A','N','T','A','U'};
        String kotaString = new String(kotaChar);

        System.out.println(kota);
        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(6));
        System.out.println(kota.substring(1,6));
        System.out.println(kota.length());
        System.out.println(kota.substring(1,6).length());
    }
}
