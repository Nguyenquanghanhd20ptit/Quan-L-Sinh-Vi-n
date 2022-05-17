package controller;

public class diem {
	private String id;
	private String hoten;
	private double ctdlgt;
	private double trr2;
	private double lttt;
	private double ktmt;
	private double tthcm;
	private double tAnh;
	public diem(String id, String hoten, double ctdlgt, double trr2, double lttt, double ktmt, double tthcm,
			double tAnh) {
		super();
		this.id = id;
		this.hoten = hoten;
		this.ctdlgt = ctdlgt;
		this.trr2 = trr2;
		this.lttt = lttt;
		this.ktmt = ktmt;
		this.tthcm = tthcm;
		this.tAnh = tAnh;
	}
	
	
	public String getId() {
		return id;
	}
	public String getHoten() {
		return hoten;
	}
	public double getCtdlgt() {
		return ctdlgt;
	}
	public double getTrr2() {
		return trr2;
	}
	public double getLttt() {
		return lttt;
	}
	public double getKtmt() {
		return ktmt;
	}
	public double getTthcm() {
		return tthcm;
	}
	public double gettAnh() {
		return tAnh;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public void setCtdlgt(double ctdlgt) {
		this.ctdlgt = ctdlgt;
	}
	public void setTrr2(double trr2) {
		this.trr2 = trr2;
	}
	public void setLttt(double lttt) {
		this.lttt = lttt;
	}
	public void setKtmt(double ktmt) {
		this.ktmt = ktmt;
	}
	public void setTthcm(double tthcm) {
		this.tthcm = tthcm;
	}
	public void settAnh(double tAnh) {
		this.tAnh = tAnh;
	}
	
	
}
