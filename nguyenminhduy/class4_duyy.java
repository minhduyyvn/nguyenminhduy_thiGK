package nguyenminhduy;

import java.util.Scanner;

public class class4_duyy {
    public static void main(String[] args) {

            while (true) {
            System.out.println();
            System.out.println("Chương trình quản lí công nhân sơ khai: ");
            System.out.println("Mời nhập thông tin đầu vào : ");
            Scanner ss = new Scanner(System.in);

            System.out.println("Tên Công ti & Nhà máy : ");
            String Inamecty = ss.nextLine();
            System.out.println("Thành tích Công ti & Nhà máy : ");
            String Ithanhtich = ss.nextLine();
            System.out.println("--------------Về Công nhân--------------");
            System.out.println("Mã Công nhân : ");
            int IidCn = ss.nextInt();
            ss.nextLine(); // Tiêu diệt ký tự xuống dòng
            System.out.println("Tên Công nhân : ");
            String ItenCn = ss.nextLine();
            System.out.println("Tuổi Công nhân : ");
            int ItuoiCn = ss.nextInt();
            ss.nextLine(); // Tiêu diệt ký tự xuống dòng
            System.out.println("Quê quán Công nhân : ");
            String IqueCn = ss.nextLine();
            System.out.println("Ngày việc đã làm của Công nhân : ");
            int Ingaylam = ss.nextInt();

            class3_duyy s1 = new class3_duyy(Inamecty, Ithanhtich, ItenCn, ItuoiCn, IidCn, IqueCn, Ingaylam);
        while (true) {
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("----- MENU LỰA CHỌN -----");
            System.out.println("1. Thông tin về Công ty & Nhà máy");
            System.out.println("2. Thông tin của Công nhân");
            System.out.println("3. Ngày làm việc của công nhân");
            System.out.println("4. Lương của Công nhân");
            System.out.println("5. Phụ cấp của công nhân");
            System.out.println("6. Thông tin của bản thân sinh viên");
            System.out.println("7. Nhập lại đầu vào");
            System.out.println("0. Thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            System.out.println();
            int choice = ss.nextInt();

            switch (choice) {
                case 7:
                    System.out.println("Lựa chọn thay đổi dữ liệu vào, hoàn tất.");
                    break;
                case 1:
                    s1.bm1();
                    s1.bm2();
                    break;
                case 2:
                    s1.TTcn();
                    break;
                case 3:
                    s1.ngaylamviec();
                    break;
                case 4:
                    s1.tinhluong();
                    break;
                case 5:
                    s1.phucap();
                    break;
                case 6:
                    s1.inFor();
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ mời chọn lại");
                    break;

            }
            if (choice == 0) return;
        }


        }
    }
}
