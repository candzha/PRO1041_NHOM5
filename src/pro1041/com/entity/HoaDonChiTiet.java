/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1041.com.entity;

import java.util.Date;



public class HoaDonChiTiet {
    private Integer id_HDCT;
    private Integer maHDCT;
    private int trangThai;
    private Integer soLuong;
    private float donGia;
    private float tongTien;
    private Date ngaySua;
    private Date ngayTao;
    private Integer id_hoaDon;
    private Integer id_SPCT;
    private String tenSanPham;

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(Integer id_HDCT, Integer maHDCT, int trangThai, Integer soLuong, float donGia, float tongTien, Date ngaySua, Date ngayTao, Integer id_hoaDon, Integer id_SPCT) {
        this.id_HDCT = id_HDCT;
        this.maHDCT = maHDCT;
        this.trangThai = trangThai;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tongTien = tongTien;
        this.ngaySua = ngaySua;
        this.ngayTao = ngayTao;
        this.id_hoaDon = id_hoaDon;
        this.id_SPCT = id_SPCT;
    }

    public Integer getId_HDCT() {
        return id_HDCT;
    }

    public void setId_HDCT(Integer id_HDCT) {
        this.id_HDCT = id_HDCT;
    }

    public Integer getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(Integer maHDCT) {
        this.maHDCT = maHDCT;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Integer getId_hoaDon() {
        return id_hoaDon;
    }

    public void setId_hoaDon(Integer id_hoaDon) {
        this.id_hoaDon = id_hoaDon;
    }

    public Integer getId_SPCT() {
        return id_SPCT;
    }

    public void setId_SPCT(Integer id_SPCT) {
        this.id_SPCT = id_SPCT;
    }

}
