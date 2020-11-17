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
public class KisameHoshigaki extends Akatsuki{
    
    private String elemen;
    private String karakter;
    
    public KisameHoshigaki(String nama, String asal, String pangkat, String namaCincin, String posisiCincin){
        super(nama,asal,pangkat,namaCincin,posisiCincin);
    }
    
    public String getElemen(){
        return elemen;
    }
    
    public void setElemen(String elemen){
        this.elemen = elemen;
    }
    
    public String getKarakter(){
        return karakter;
    }
    
    public void setKarakter(String karakter){
        this.karakter = karakter;
    }
    
    
    @Override
    public void tampilCiriKhas(String ciriKhas){
        System.out.println("Ciri khas\t: " + ciriKhas);
    }
    
    @Override
    public void tampilKekuatan(String kekuatan){
        System.out.println("Kekuatan\t: " + kekuatan);
    }
    
    @Override
    public void tampilDeskripsi(String deskripsi){
        System.out.println("Deskripsi\t: " + deskripsi);
    }
}
