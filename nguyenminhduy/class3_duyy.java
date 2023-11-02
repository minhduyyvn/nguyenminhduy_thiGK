package nguyenminhduy;

public class class3_duyy extends class1_duy implements class21_duyy, class22_duyy {


    public class3_duyy(String namecty, String thanhtich, String tenCn, int tuoiCn, int idCn, String queCn, int ngaylam) {
        super(namecty, thanhtich, tenCn, tuoiCn, idCn, queCn, ngaylam);
    }

    @Override
    public void TTcn() {
        System.out.println("Thông tin của công nhân là: " +
                "\nMã số: " + IdCn +
                "\nTên: " + tenCn +
                "\nTuổi: " + tuoiCn +
                "\nQuê: " + queCn
        );

    }

    @Override
    public void ngaylamviec() {
        System.out.println("Số ngày mà công nhân đã làm việc là: " + ngaylam);
        if(ngaylam > 21) {
            System.out.println("Công nhân đã đạt chỉ tiêu tháng: " + ngaylam +"/21" );
        } else {
            System.out.println("Công nhân chưa đủ chỉ tiêu tháng, thiếu " +(21 -ngaylam) +" ngày");
        }
    }

    @Override
    public void tinhluong() {
        System.out.println("Tổng kết mức lương của công nhân-" + tenCn + " : " );
        System.out.println("Thông báo: Công nhân làm được " + ngaylam + " ngày và có mức lương là: " +
                (ngaylam*300));

    }

    @Override
    public void phucap() {
        System.out.println("Phụ cấp áp dụng cho nhân viên làm trên 25 ngày / tháng ");
        if(ngaylam > 25 ) {
            System.out.println("Công nhân được nhận thêm 200k cho mỗi ngày làm vượt trên 25 ngày/tháng");
        } else {
            System.out.println("Công nhân chưa đủ tiêu chí nhận phụ cấp");
        }
    }

    @Override
    public void bm1() {
        System.out.println("Đây là CTTNHH và nhà máy       " + getNamecty());
        System.out.println("Chào mừng đến với chúng tôi");
    }

    @Override
    public void bm2() {
        System.out.println("Với kinh nghiệm quản lí công nhân hiệu quả, " +
                "công ti đã có thành tích " + getThanhtich());

    }
}
