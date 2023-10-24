package project1;
import java.util.Scanner;

public class nvcn extends nhanvien {
	Scanner sc=new Scanner(System.in);

	int songaycong;
	 public nvcn() {super();songaycong=0;}
	    public nvcn(int mnv,String hoten, String diachi,int songaycong)
	    {
		   super(mnv,hoten,diachi);
		   this.songaycong=songaycong;
		}
	    public void nhap()
	    {
	    	super.nhap();
	    	System.out.println("nhap so ngay cong: ");
	    	songaycong=sc.nextInt();
	    	sc.nextLine();
	    }
		public void xuat()
		{
	    	System.out.println("nhan vien cong nhat : ");

		   super.xuat();
		}
		@Override public void tinhluong() {
	          System.out.println("luong: "+this.songaycong*50000+" vnd");
		}

}
