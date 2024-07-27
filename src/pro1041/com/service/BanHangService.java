/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1041.com.service;

import pro1041.com.entity.HoaDonChiTiet;
import java.sql.*;
import java.util.ArrayList;
import pro1041.com.utils.DBConnect;

/**
 *
 * @author Van Can
 */
public class BanHangService {

    Connection con = null;
    ResultSet rs = null;
    String sql = null;
    PreparedStatement ps = null;
    DBConnect dBConnect;

    public int insertHoaDonCTPROC(HoaDonChiTiet hdct) {
        String sql = "{CALL ThemSanPhamVaoHoaDonChiTiet(?,?,?,?)}";
        try {
            con = dBConnect.getConnection();
            ps = con.prepareCall(sql);
            if (hdct != null) {
                ps.setObject(1, hdct.getMaHDCT());
                ps.setObject(2, hdct.getId_hoaDon());
                ps.setObject(3, hdct.getId_SPCT());
                ps.setObject(4, hdct.getSoLuong());
                // ps.setObject(5, hDCT.getGiaBan());
                //  ps.setObject(6, hDCT.getThanhTien());
                return ps.executeUpdate();
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ArrayList<HoaDonChiTiet> selectHDCT(String id) {
    ArrayList<HoaDonChiTiet> lst = new ArrayList<>();
    String SQL = "SELECT id_hoaDon, SanPhamChiTiet.id_sanPham, tenSanPham, soLuong, donGia, tongTien " +
                 "FROM dbo.HoaDonChiTiet " +
                 "JOIN dbo.SanPhamChiTiet ON SanPhamChiTiet.id_SPCT = HoaDonChiTiet.id_SPCT " +
                 "JOIN dbo.SanPham ON SanPham.id_sanPham = SanPhamChiTiet.id_sanPham " +
                 "WHERE id_hoaDon = ?";

    try (Connection conn = dBConnect.getConnection(); 
         PreparedStatement pst = conn.prepareStatement(SQL)) {
        pst.setString(1, id);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            HoaDonChiTiet hdct = new HoaDonChiTiet();
            hdct.setId_hoaDon(rs.getInt("id_hoaDon"));
            hdct.setId_SPCT(rs.getInt("id_sanPham"));
            hdct.setTenSanPham(rs.getString("tenSanPham"));
            hdct.setSoLuong(rs.getInt("soLuong"));
            hdct.setDonGia((float) rs.getDouble("donGia"));
            hdct.setTongTien((float) rs.getDouble("tongTien"));
            lst.add(hdct);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return lst;
}

}
