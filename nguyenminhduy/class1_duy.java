package nguyenminhduy;

public abstract class class1_duy {
   private String namecty;
   private String thanhtich;

   public String ten = "Nguyễn Minh Duy", que = "Quảng Trị", lop = "23IT3";
   public int tuoi = 18;

    public String tenCn;
    public int tuoiCn;
    public int IdCn;
    public String queCn;
    public int ngaylam;


    public class1_duy(String namecty, String thanhtich, String tenCn, int tuoiCn, int idCn, String queCn, int ngaylam) {
        this.namecty = namecty;
        this.thanhtich = thanhtich;
        this.tenCn = tenCn;
        this.tuoiCn = tuoiCn;
        this.IdCn = idCn;
        this.queCn = queCn;
        this.ngaylam = ngaylam;
    }



    public String getNamecty() {
        return namecty;
    }

    public void setNamecty(String namecty) {
        this.namecty = namecty;
    }

    public String getThanhtich() {
        return thanhtich;
    }

    public void setThanhtich(String thanhtich) {
        this.thanhtich = thanhtich;
    }

    public abstract void bm1();
    public abstract void bm2();

    public void inFor() {
        System.out.println("Thông tin của tôi là: " +
                "\nTên: " + ten +
                "\nTuổi: " + tuoi +
                "\nQuê: " + que +
                "\nLớp: " + lop);
    }
}
