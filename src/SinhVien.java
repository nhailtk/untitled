
import java.util.Scanner;

public class SinhVien {
    private int id;
    private String name;
    private int age;
    private float diemToan, diemVan, diemAnh, diemTB;

    public void InputInformation() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Id của sinh viên: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập họ tên của sinh viên: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập tuổi của sinh viên: ");
        this.age = scanner.nextInt();
        System.out.print("Nhập điểm Toán của sinh viên: ");
        this.diemToan = scanner.nextFloat();
        System.out.print("Nhập điểm  Văn của sinh viên: ");
        this.diemVan = scanner.nextFloat();
        System.out.print("Nhập điểm tiếng Anh của sinh viên: ");
        this.diemAnh = scanner.nextFloat();
    }

    public void ShowInformation() {
        System.out.println("Id của sinh viên: " + id);
        System.out.println("Họ tên của sinh viên: " + name);
        System.out.println("Tuổi của sinh viên: " + age);
        System.out.println("Điểm Toán của sinh viên: " + diemToan);
        System.out.println("Điểm Văn của sinh viên: " + diemVan);
        System.out.println("Điểm Tiếng Anh của sinh viên: " + diemAnh);
        // tính điểm trung bình 3 môn học của sinh viên
        this.diemTB = (this.diemToan + this.diemVan + this.diemAnh) / 3;
        System.out.println("Điểm trung bình của sinh viên: " + diemTB);
        //Xếp loại sinh viên
        if (diemToan == 0 || diemVan == 0 || diemAnh == 0 || diemTB < 5) {
            System.out.println("Xếp loại sinh viên: Yếu");
        } else if (diemTB >= 5 && diemTB < 7) {
            System.out.println("Xếp loại sinh viên: Trung bình");
        } else if (diemTB >= 7 && diemTB < 9) {
            System.out.println("Xếp loại sinh viên: Khá");
        } else if (diemTB >= 9) {
            System.out.println("Xếp loại sinh viên: Giỏi");
        }
    }

}
