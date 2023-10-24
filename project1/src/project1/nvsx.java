package project1;

import java.util.Scanner;

public class nvsx extends nhanvien {
	int sosanpham;
	Scanner sc=new Scanner(System.in);

    public nvsx() {super();sosanpham=0;}
    public nvsx(int mnv,String hoten, String diachi,int sosanpham)
    {
	   super(mnv,hoten,diachi);
	   this.sosanpham=sosanpham;
	}
	public void nhap()
    {
    	super.nhap();
    	System.out.println("nhap so san pham: ");
    	sosanpham=sc.nextInt();
    	sc.nextLine();
    }
	public void xuat()
	{
    	System.out.println("nhan vien san xuat : ");

	   super.xuat();
	}
	@Override  public void tinhluong() {
          System.out.println("luong: "+this.sosanpham*20000+" vnd");
	}
}

