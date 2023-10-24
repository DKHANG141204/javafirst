package project1;
import java.util.Scanner;
public abstract class nhanvien {
Scanner sc=new Scanner(System.in);
	 int mnv; String hoten,diachi;
	 public nhanvien() {mnv=0; hoten="";diachi="";}
	 public nhanvien(int mnv,String hoten, String diachi)
	 {
		 this.mnv=mnv;
		 this.hoten=hoten;
		 this.diachi=diachi;
	 }
	public void nhap()
	 {
		 System.out.println("nhap ten nhan vien ");
		 hoten=sc.nextLine();
		 System.out.println("nhap dia chi ");
		 diachi=sc.nextLine();
		 System.out.println("nhap mnv ");
		 mnv=sc.nextInt();
		 sc.nextLine();		
	 }
	public void xuat()
	 {
		 System.out.println("ma nhan vien : "+mnv);
		 System.out.println("ho ten: "+hoten);
		 System.out.println("dia chi : "+diachi);

	 }
	public abstract void tinhluong();
}
