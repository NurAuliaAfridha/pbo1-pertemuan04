package model;

import java.util.ArrayList;

public class Mahasiswa {
    //atribut/properties
    public String npm;
    public String nama;
    public int jumlahSKS;
    public double ipk;
    private String kota;

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    //behavior/method
    public void  mengambilKRS(){}
    public void  cetakKRS(){}

    public void  tampilkanInfo(){
        System.out.println("===========================================");
        System.out.println("NPM :" + npm);
        System.out.println("Nama :" + nama);
        System.out.println("Jumlah SKS :" + jumlahSKS);
        System.out.println("IPK :" + ipk);
        System.out.println("Kota :" + kota);
    }

    public boolean create(){
        String insertSQL = "INSERT INTO mahasiswa VALUES ('"+npm+"','"+nama+"','"+jumlahSKS+"','"+ipk+"')";
        System.out.println(insertSQL);
        boolean berhasil = true;
        if (berhasil){
            return true;
        }else {
            return false;
        }
    }

    public ArrayList<Mahasiswa> read(){
        return null;
    }

    public boolean update(){
        return false;
    }

    public boolean delete(){
        return false;
    }
    //constructor
    public Mahasiswa() {
        System.out.println("Ini dari constructor");
        npm = "NPM masih kosong";
        nama = "Nama masih kosong";
    }
}
