package com.example.demo.repository;

import com.example.demo.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

<<<<<<< HEAD
import java.util.UUID;

public interface KhachHangDao extends JpaRepository<KhachHang, UUID> {
    @Query("select p from KhachHang p where p.email=?1")
    KhachHang getKhByEmail(String email);
=======
import java.util.List;
import java.util.UUID;

public interface KhachHangDao extends JpaRepository<KhachHang, UUID> {

    @Query("select kh from KhachHang kh where kh.id = ?1")
    KhachHang GetBykhachhang(UUID id);


    @Query("select kh from KhachHang kh where kh.ma = ?1")
    KhachHang GetKhachhangByma(String ma);
>>>>>>> origin/khachhang
}
