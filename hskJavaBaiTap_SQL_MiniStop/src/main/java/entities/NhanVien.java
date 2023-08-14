package entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "NhanVien")
@NamedQuery(name = "NhanVien.findAll", query = "FROM NhanVien")
public class NhanVien 
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((soDienThoai == null) ? 0 : soDienThoai.hashCode());
		result = prime * result + ((tenDangNhap == null) ? 0 : tenDangNhap.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (soDienThoai == null) {
			if (other.soDienThoai != null)
				return false;
		} else if (!soDienThoai.equals(other.soDienThoai))
			return false;
		if (tenDangNhap == null) {
			if (other.tenDangNhap != null)
				return false;
		} else if (!tenDangNhap.equals(other.tenDangNhap))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "NhanVien [tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", hoVaTen=" + hoVaTen + ", gioiTinh="
				+ gioiTinh + ", email=" + email + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", tuoi="
				+ tuoi + "]";
	}
	/**
	 * @return the tenDangNhap
	 */
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	/**
	 * @param tenDangNhap the tenDangNhap to set
	 */
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	/**
	 * @return the matKhau
	 */
	public String getMatKhau() {
		return matKhau;
	}
	/**
	 * @param matKhau the matKhau to set
	 */
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	/**
	 * @return the hoVaTen
	 */
	public String getHoVaTen() {
		return hoVaTen;
	}
	/**
	 * @param hoVaTen the hoVaTen to set
	 */
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}
	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}
	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}
	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	/**
	 * @return the tuoi
	 */
	public int getTuoi() {
		return tuoi;
	}
	/**
	 * @param tuoi the tuoi to set
	 */
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	/**
	 * @return the listHoaDon
	 */
	public List<HoaDon> getListHoaDon() {
		return listHoaDon;
	}
	/**
	 * @param listHoaDon the listHoaDon to set
	 */
	public void setListHoaDon(List<HoaDon> listHoaDon) {
		this.listHoaDon = listHoaDon;
	}
	/**
	 * @return the listHangHoa
	 */
	public List<HangHoa> getListHangHoa() {
		return listHangHoa;
	}
	/**
	 * @param listHangHoa the listHangHoa to set
	 */
	public void setListHangHoa(List<HangHoa> listHangHoa) {
		this.listHangHoa = listHangHoa;
	}
	@Id
	@Column(name="tenDangNhap",length=100,nullable=false)
	private String tenDangNhap;
	@Column(name="matKhau",length=100,nullable=false)
	private String matKhau;
	@Column(name="hoVaTen",length=100,nullable=false)
	private String hoVaTen;
	@Column(name="gioiTinh",length=100,nullable=false)
	private String gioiTinh;
	@Column(name="email",length=100,nullable=false)
	private String email;
	@Column(name="soDienThoai",length=100,nullable=false)
	private String soDienThoai;
	@Column(name="diaChi",length=100,nullable=false)
	private String diaChi;
	@Column(name="tuoi",length=100,nullable=false)
	private int tuoi;
	//Nối bảng
	@OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL)
	private List<HoaDon> listHoaDon = new ArrayList<>();
	@OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL)
	private List<HangHoa> listHangHoa = new ArrayList<>();
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String tenDangNhap, String matKhau, String hoVaTen, String gioiTinh, String email,
			String soDienThoai, String diaChi, int tuoi) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.hoVaTen = hoVaTen;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
	}
	
	
}
