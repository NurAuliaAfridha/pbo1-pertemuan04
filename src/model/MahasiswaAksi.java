package model;

import javax.swing.*;

public class MahasiswaAksi {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.npm = "1";

        //overloading dalam constructor
        Mahasiswa m2 = new Mahasiswa("19630044", "Namira");
        Mahasiswa m3 = new Mahasiswa("19634400", "Jali", 24, 3.40, "MTP");

        //overloading method
        m1.delete();
        m1.delete(2);
        m1.delete("bjb");
        m1.delete("19634444",24);
    }
}
