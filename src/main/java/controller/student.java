package controller;


public class student {
	private String id;
	private String hoten;
	private String nganhhoc;
	private String ngaysinh;
	private String gioitinh;
	private String diachi;
	private String sdt;
	public student(String id, String hoten, String nganhhoc, String ngaysinh, String gioitinh, String diachi,
			String sdt) {
		super();
		this.id = id;
		this.hoten = hoten;
		this.nganhhoc = nganhhoc;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.sdt = sdt;
	}
	public String getId() {
		return id;
	}
	public String getHoten() {
		return hoten;
	}
	public String getNganhhoc() {
		return nganhhoc;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public void setNganhhoc(String nganhhoc) {
		this.nganhhoc = nganhhoc;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	  
	
	

}