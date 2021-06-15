package model;

//subclass/child-class
public class MahasiswaTransfer extends Mahasiswa{
    int sksSebeumnya;
    String kampusSebelumnya;

    public boolean delete(){
        String sql = "DELETE FROM mahasiswa " +
                "WHERE npm = " +npm + " - ini overriding";
        System.out.println(sql);
        return false;
    }

    @Override
    public boolean delete(int id) {
        return super.delete(id);
    }

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
