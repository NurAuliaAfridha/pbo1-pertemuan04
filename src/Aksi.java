import model.Mahasiswa;
import model.MahasiswaTransfer;

import java.util.Scanner;

public class Aksi{
    public static void main(String[] args) {

        //instance/pembuatan object dari sebuah class
        //NamaClass namaObject = new Constructor();
        //constructor merupakan method tapi tdk memiliki return value dan void
        //constructor = class
        //constructor berjalan ketika objek dbuat

        Mahasiswa ridha = new Mahasiswa();
        ridha.npm = "19630410";
        ridha.nama = "Nur Aulia Afridha";
        ridha.jumlahSKS = 100;
        ridha.ipk = 3.55;
        ridha.setKota("Rantau");
        ridha.tampilkanInfo();
        // if (ridha.create()){
        // System.out.println("Data Berhasil di Simpan");
        //}else {
        //  System.out.println("Data Gagal di Simpan");
        //}

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630400";
        mahasiswa.nama = "Fulanah";
        mahasiswa.tampilkanInfo();


        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.tampilkanInfo();

        MahasiswaTransfer mahasiswaTransfer = new MahasiswaTransfer();
        mahasiswaTransfer.npm = "19630400";
        mahasiswaTransfer.nama = "Transfer";
        mahasiswaTransfer.tampilkanInfo();
        mahasiswaTransfer.getKota();
        mahasiswaTransfer.setKota("Banjarbaru");
        mahasiswaTransfer.setKampusSebelumnya("Univ dimana saja");
        mahasiswaTransfer.setSksSebeumnya(80);

        FormSederhana formSederhana = new FormSederhana();
        formSederhana.setVisible(true);
    }
}
