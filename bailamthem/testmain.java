package bailamthem;

import java.util.Scanner;

public class testmain {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        ProgramManager programManager = new ProgramManager();
        Program program = null; // Khai báo biến program ở ngoài vòng lặp while

        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("Chương trình thêm, sửa, xóa thông tin của 1 đối tượng");
            System.out.println("--------------MENU LỰA CHỌN---------------");
            System.out.println("1. Thêm Thông tin ");
            System.out.println("2. Sửa Thông tin ");
            System.out.println("3. Xóa Thông tin ");
            System.out.println("4. Thoát chương trình ");
            System.out.println("------------------------------------------");

            int choice = ss.nextInt();
            ss.nextLine(); // Đọc dòng trống sau khi đọc số nguyên

            switch (choice) {
                case 1:
                    System.out.println("Mời nhập thông tin thêm vào: ");
                    System.out.println("Tên: ");
                    String ten = ss.nextLine();
                    System.out.println("Địa chỉ: ");
                    String diaChi = ss.nextLine();
                    System.out.println("Tuổi: ");
                    int tuoi = ss.nextInt();
                    System.out.println("Lương: ");
                    double luong = ss.nextDouble();
                    ss.nextLine(); // note hay quên, xóa bỏ dấu xống dòng

                    // Thêm thông tin Program
                    program = new Program(ten, diaChi, tuoi, luong);
                    programManager.addProgram(program);
                    System.out.println(program.toString());
                    break;
                case 2:
                    if (program != null) {
                        System.out.println("Mời nhập thông tin cần sửa: ");
                        System.out.println("Tên: ");
                        String ten2 = ss.nextLine();
                        System.out.println("Địa chỉ: ");
                        String diaChi2 = ss.nextLine();
                        System.out.println("Tuổi: ");
                        int tuoi2 = ss.nextInt();
                        System.out.println("Lương: ");
                        double luong2 = ss.nextDouble();
                        ss.nextLine(); // Đọc dòng trống sau khi đọc số thực

                        // Sửa thông tin Program
                        programManager.updateProgram(program, ten2, diaChi2, tuoi2, luong2);
                        System.out.println(program.toString());
                    } else {
                        System.out.println("Chưa có thông tin để sửa. Vui lòng thêm thông tin trước.");
                    }
                    break;
                case 3:
                    if (program != null) {
                        // Xóa thông tin Program
                        programManager.removeProgram(program);
                        System.out.println(program.toString());
                        program = null; // Gán program = null để đánh dấu là không có thông tin nữa
                    } else {
                        System.out.println("Chưa có thông tin để xóa.");
                    }
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}