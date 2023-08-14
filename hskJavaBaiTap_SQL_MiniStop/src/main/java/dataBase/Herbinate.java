package dataBase;

import java.time.LocalDate;

import entities.HangHoa;
import entities.HangHoaKho;
import entities.HoaDon;
import entities.NhanVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Herbinate 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ministop");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try 
		{
			
			System.out.println("Thành công");
			//HangHoaKho hh1 = new HangHoaKho("A01", "Kem danh rang", LocalDate.of(2022, 9, 10), LocalDate.of(2024, 9, 10),10000, 20);
			//HangHoaKho(String maHangHoa, String tenHangHoa, LocalDate ngaySanXuat, LocalDate ngayHetHan, double giaCa,int soLuong)	
			//em.merge(hh1);
			System.out.println("Thành công");
			em.getTransaction().commit();
			em.close();
			emf.close();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Lỗi kết nối: " + e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

}
//HangHoa(String maHangHoa, String tenHangHoa, LocalDate ngaySanXuat, LocalDate
			// ngayHetHan, double giaCa, int soLuong)
			// HoaDon(String maHoaDon, String tenHoaDon, LocalDate ngayLap, double giamGia)
			// NhanVien(String tenDangNhap, String matKhau, String hoVaTen, String gioiTinh,
			// String email, String soDienThoai, String diaChi, int tuoi)
			
			