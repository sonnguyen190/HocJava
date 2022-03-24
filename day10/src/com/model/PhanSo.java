package com.model;

public class PhanSo {
	public int tu;
	public int mau;
	public PhanSo() {
		
	}
	
	public PhanSo(int tu,int mau) {
	this.tu=tu;
	this.mau=mau;
	}
	
	public PhanSo tongPS(PhanSo ps) {
		int tu = this.tu + ps.tu;
		int mauSoChung = this.mau * ps.mau;
		PhanSo psKetQua = new PhanSo(tu,mauSoChung);
		return psKetQua;
	}

}
