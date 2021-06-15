package model;

//subclass/child-class
public class MahasiswaTransfer extends Mahasiswa{
    int sksSebeumnya;
    String kampusSebelumnya;

    public int getSksSebeumnya() {
        return sksSebeumnya;
    }

    public void setSksSebeumnya(int sksSebeumnya) {
        this.sksSebeumnya = sksSebeumnya;
    }

    public String getKampusSebelumnya() {
        return kampusSebelumnya;
    }

    public void setKampusSebelumnya(String kampusSebelumnya) {
        this.kampusSebelumnya = kampusSebelumnya;
    }

    public void konversiNilai(){

    }
}
