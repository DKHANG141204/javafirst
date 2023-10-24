package project1;
import java.util.Scanner;


public class nvql extends nhanvien {
	Scanner sc=new Scanner(System.in);

	int hesoluong,luongcoban;
	 public nvql() {super();hesoluong=0;luongcoban=0;}
	    public nvql(int mnv,String hoten, String diachi,int hesoluong,int luongcoban)
	    {
		   super(mnv,hoten,diachi);
		   this.hesoluong=hesoluong;
		   this.luongcoban=luongcoban;
		}
	    public void nhap()
	    {
	    	super.nhap();
	    	System.out.println("nhap he so luong: ");
	    	hesoluong=sc.nextInt();
	    	System.out.println("nhap luong co ban: ");
            luongcoban=sc.nextInt();
	    	sc.nextLine();
	    }
		public void xuat()
		{
	    	System.out.println("nhan vien quan li  : ");
		   super.xuat();
		}
		@Override  public void tinhluong() {
	          System.out.println("luong: "+hesoluong*luongcoban+" vnd");
		}

}