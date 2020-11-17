/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */


package if1.pkg10119013.latihan60.akatsuki;

/**
 *
 * @author Fiona Avila
 */


public class Akatsuki {
    
    private String nama;
    private String asal;
    private String pangkat;
    private String namaCincin;
    private String posisiCincin;
    private String ciriKhas;
    private String kekuatan;
    private String deskripsi;
    
    public Akatsuki(String nama, String asal, String pangkat, String namaCincin, String posisiCincin){
        this.nama = nama;
        this.asal = asal;
        this.pangkat = pangkat;
        this.namaCincin = namaCincin;
        this.posisiCincin = posisiCincin;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAsal(){
        return asal;
    }
    
    public void setAsal(String asal){
        this.asal = asal;
    }
    
    public String getPangkat(){
        return pangkat;
    }
    
    public void setPangkat(String pangkat){
        this.pangkat = pangkat;
    }
    
    public String getNamaCincin(){
        return namaCincin;
    }
    
    public void setNamaCincin(String namaCincin){
        this.namaCincin = namaCincin;
    }
    
    public String getPosisiCincin(){
        return posisiCincin;
    }
    
    public void setPosisiCincin(String posisiCincin){
        this.posisiCincin = posisiCincin;
    }
    
    public String setCiriKhas(){
        return ciriKhas;
    }
    
    public void getCiriKhas(String ciriKhas){
        this.ciriKhas = ciriKhas;
    }
    
    public String getKekuatan(){
        return kekuatan;
    }
    
    public void setKekuatan(String kekuatan){
        this.kekuatan = kekuatan;
    }
    
    public String getDeskripsi(){
        return deskripsi;
    }
    
    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
    
    public void tampilAtributSuper(){
        System.out.println(this.nama);
        System.out.println("Asal\t\t: " + this.asal);
        System.out.println("Pangkat\t\t: " + this.pangkat);
        System.out.println("Nama cincin\t: " + this.namaCincin);
        System.out.println("Posisi cincin\t: " + this.posisiCincin);
    }
    
    public void tampilCiriKhas(String ciriKhas){
        System.out.println("Ciri khas\t: " + ciriKhas);
    }
    
    public void tampilKekuatan(String kekuatan){
        System.out.println("Kekuatan\t: " + kekuatan);
    }
    
    public void tampilDeskripsi(String deskripsi){
        System.out.println("Deskripsi\t: " + deskripsi);
    }
}
