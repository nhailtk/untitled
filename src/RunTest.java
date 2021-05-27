import java.util.ArrayList;
import java.util.Scanner;

public class RunTest {

    public static void main(String[] args) {
        int n;
        SinhVien sinhVien;
        ArrayList<SinhVien> arrSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên:");
        n = scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("\nNhập thông tin của sinh viên thứ "+ (i+1) +":");
            sinhVien = new SinhVien();
            sinhVien.InputInformation();
            arrSinhVien.add(sinhVien);
        }
        for(int j=0;j<arrSinhVien.size();j++){
            System.out.println("\nThông tin của sinh viên thứ "+ (j+1) +" :");
            arrSinhVien.get(j).ShowInformation();
        }


    }
}
