package project1;
import java.util.Scanner;
import java.util.ArrayList;

public class dsnv {
	Scanner sc=new Scanner(System.in);
	int soluongnv=0;
	ArrayList<nhanvien> a;
	public dsnv()
	{
		soluongnv=0;
		a=new ArrayList<nhanvien>();
	}
	public dsnv(int soluongnv)
	{
		this.soluongnv=soluongnv;
		a=new ArrayList<nhanvien>();
	}
	public void nhap()
	{
		System.out.println("nhap so luong nhan vien: ");
		soluongnv=sc.nextInt();
		int number=0;
		System.out.println("1. nvcn ");
		System.out.println("2. nvql ");
		System.out.println("3. nvsx ");
		int type;
		while(number<soluongnv)
		{
			System.out.println("nhap loai nhan vien ");
			type=sc.nextInt();
			sc.nextLine();
			if(type==1)
			{
				nvcn n=new nvcn();
				a.add(n);
			}
			else if(type==2)
			{
				nvql n= new nvql();
				a.add(n);
			}
			else
			{
				nvsx n=new nvsx();
				a.add(n);
			}
			number++;
		}
		for(nhanvien nv1: a)
		{
			if(nv1 instanceof nvcn )
			{
				nvcn n=(nvcn) nv1;
				n.nhap();
			}
			else if(nv1 instanceof nvql )
			{
				nvql n=(nvql) nv1;
				n.nhap();
			}
			else if(nv1 instanceof nvsx )
			{
				nvsx n=(nvsx) nv1;
				n.nhap();
			}
		}
	}
	public void xuat()
	{
		for(nhanvien nv1: a)
		{
			if(nv1 instanceof nvcn)
			{
				nvcn n= (nvcn) nv1;
				n.xuat();
				n.tinhluong();
			}
			else if(nv1 instanceof nvql)
			{
				nvql n=(nvql) nv1;
				n.xuat();
				n.tinhluong();
			}
			else
			{
				nvsx n= (nvsx) nv1;
				n.xuat();
				n.tinhluong();
			}
			
		}
	}

	
	
}
