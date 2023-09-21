package com.example.demo.RestController;

import com.example.demo.entity.DanhMuc;
<<<<<<< HEAD
import com.example.demo.entity.PageDTO;
import com.example.demo.repository.DanhMucDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
=======
import com.example.demo.repository.DanhMucDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
>>>>>>> origin/khachhang

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/danhmuc")
public class DanhMucRestController {
    @Autowired
    DanhMucDAO danhMucDAO;

    @GetMapping()
    public List<DanhMuc> getListDanhMuc() {
        return danhMucDAO.findAll();
    }
<<<<<<< HEAD
    @GetMapping("/phantrang")
    public PageDTO<DanhMuc> getPageDanhMuc(@RequestParam("page") Optional<Integer> page) {
        Pageable pageable= PageRequest.of(page.orElse(0),5);
        return new PageDTO<>(danhMucDAO.findAll(pageable));
    }
=======

>>>>>>> origin/khachhang
    @GetMapping("/{ma}")
    public DanhMuc getDanhMucByMa(@PathVariable("ma") String ma) {
        return danhMucDAO.findDanhMucByMa(ma);
    }

    @PostMapping()
    public DanhMuc createDanhMuc(@RequestBody DanhMuc danhMuc) {
        return danhMucDAO.save(danhMuc);
    }

<<<<<<< HEAD
    @PutMapping("/{ma}")
=======
    @PostMapping("/{ma}")
>>>>>>> origin/khachhang
    public DanhMuc updateDanhMuc(@PathVariable("ma") String ma, @RequestBody DanhMuc danhMuc) {
        return danhMucDAO.save(danhMuc);
    }

    @DeleteMapping("/{ma}")
    public void delete(@PathVariable("ma") String ma) {
        danhMucDAO.deleteDanhMucByMa(ma);
    }
}
