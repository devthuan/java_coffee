-- --------------------------------------------------------
-- Máy chủ:                      127.0.0.1
-- Server version:               8.0.39-0ubuntu0.22.04.1 - (Ubuntu)
-- Server OS:                    Linux
-- HeidiSQL Phiên bản:           12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for java_coffee
CREATE DATABASE IF NOT EXISTS `java_coffee` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `java_coffee`;

-- Dumping structure for table java_coffee.ChiTietHoaDon
CREATE TABLE IF NOT EXISTS `ChiTietHoaDon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `so_luong` int NOT NULL,
  `SanPham_id` int NOT NULL,
  `HoaDon_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_OrderDetail_Products1_idx` (`SanPham_id`),
  KEY `fk_OrderDetail_Order1_idx` (`HoaDon_id`),
  CONSTRAINT `fk_OrderDetail_Order1` FOREIGN KEY (`HoaDon_id`) REFERENCES `HoaDon` (`id`),
  CONSTRAINT `fk_OrderDetail_Products1` FOREIGN KEY (`SanPham_id`) REFERENCES `SanPham` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=111 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.ChiTietPhieuNhap
CREATE TABLE IF NOT EXISTS `ChiTietPhieuNhap` (
  `id` int NOT NULL AUTO_INCREMENT,
  `PhieuNhap_id` int NOT NULL,
  `NguyenLieu_id` int NOT NULL,
  `so_luong` float NOT NULL,
  `don_vi` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL DEFAULT 'KG',
  `don_gia` float NOT NULL,
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ChiTietPhieuNhap_PhieuNhap1_idx` (`PhieuNhap_id`),
  KEY `fk_ChiTietPhieuNhap_NguyenLieu1_idx` (`NguyenLieu_id`),
  CONSTRAINT `fk_ChiTietPhieuNhap_NguyenLieu1` FOREIGN KEY (`NguyenLieu_id`) REFERENCES `NguyenLieu` (`id`),
  CONSTRAINT `fk_ChiTietPhieuNhap_PhieuNhap1` FOREIGN KEY (`PhieuNhap_id`) REFERENCES `PhieuNhap` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=122 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.ChiTietPhieuXuat
CREATE TABLE IF NOT EXISTS `ChiTietPhieuXuat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `NguyenLieu_id` int NOT NULL,
  `so_luong` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `don_vi` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL DEFAULT 'KG',
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` datetime DEFAULT NULL,
  `PhieuXuat_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ChiTietPhieuXuat_NguyenLieu1_idx` (`NguyenLieu_id`),
  KEY `fk_ChiTietPhieuXuat_PhieuXuat1_idx` (`PhieuXuat_id`),
  CONSTRAINT `fk_ChiTietPhieuXuat_NguyenLieu1` FOREIGN KEY (`NguyenLieu_id`) REFERENCES `NguyenLieu` (`id`),
  CONSTRAINT `fk_ChiTietPhieuXuat_PhieuXuat1` FOREIGN KEY (`PhieuXuat_id`) REFERENCES `PhieuXuat` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.ChucNang
CREATE TABLE IF NOT EXISTS `ChucNang` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_cn` varchar(45) NOT NULL,
  `mo_ta` varchar(45) DEFAULT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.CongThuc
CREATE TABLE IF NOT EXISTS `CongThuc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_cong_thuc` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `mo_ta` varchar(255) COLLATE utf8mb4_general_ci DEFAULT '',
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  `is_active` int DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `ten_cong_thuc` (`ten_cong_thuc`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.CongThucSanPham
CREATE TABLE IF NOT EXISTS `CongThucSanPham` (
  `id` int NOT NULL AUTO_INCREMENT,
  `SanPham_id` int NOT NULL DEFAULT '0',
  `CongThuc_id` int NOT NULL DEFAULT '0',
  `NguyenLieu_id` int NOT NULL DEFAULT '0',
  `don_vi` varchar(50) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '0',
  `so_luong` int NOT NULL DEFAULT '0',
  `is_active` int NOT NULL DEFAULT '1',
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_CongThucSanPham_SanPham` (`SanPham_id`),
  KEY `FK_CongThucSanPham_CongThuc` (`CongThuc_id`),
  KEY `FK_CongThucSanPham_NguyenLieu` (`NguyenLieu_id`),
  CONSTRAINT `FK_CongThucSanPham_CongThuc` FOREIGN KEY (`CongThuc_id`) REFERENCES `CongThuc` (`id`),
  CONSTRAINT `FK_CongThucSanPham_NguyenLieu` FOREIGN KEY (`NguyenLieu_id`) REFERENCES `NguyenLieu` (`id`),
  CONSTRAINT `FK_CongThucSanPham_SanPham` FOREIGN KEY (`SanPham_id`) REFERENCES `SanPham` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.GioHang
CREATE TABLE IF NOT EXISTS `GioHang` (
  `id` int NOT NULL AUTO_INCREMENT,
  `so_luong` varchar(45) DEFAULT NULL,
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  `SanPham_id` int NOT NULL,
  `TaiKhoan_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Cart_Products1_idx` (`SanPham_id`),
  KEY `fk_Cart_Account1_idx` (`TaiKhoan_id`),
  CONSTRAINT `fk_Cart_Account1` FOREIGN KEY (`TaiKhoan_id`) REFERENCES `TaiKhoan` (`id`),
  CONSTRAINT `fk_Cart_Products1` FOREIGN KEY (`SanPham_id`) REFERENCES `SanPham` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.HoaDon
CREATE TABLE IF NOT EXISTS `HoaDon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `trang_thai` varchar(45) NOT NULL,
  `PTThanhToan_id` int NOT NULL,
  `TaiKhoan_id` int NOT NULL,
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_Order_ PaymentMethod1_idx` (`PTThanhToan_id`),
  KEY `fk_Order_Account1_idx` (`TaiKhoan_id`),
  CONSTRAINT `fk_Order_ PaymentMethod1` FOREIGN KEY (`PTThanhToan_id`) REFERENCES `PTThanhToan` (`id`),
  CONSTRAINT `fk_Order_Account1` FOREIGN KEY (`TaiKhoan_id`) REFERENCES `TaiKhoan` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.LoaiSanPham
CREATE TABLE IF NOT EXISTS `LoaiSanPham` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_loai` varchar(45) NOT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.NguyenLieu
CREATE TABLE IF NOT EXISTS `NguyenLieu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_NL` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `don_vi` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL DEFAULT 'KG',
  `so_luong` int NOT NULL,
  `is_active` int DEFAULT '1',
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ten_NL` (`ten_NL`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.NhaCungCap
CREATE TABLE IF NOT EXISTS `NhaCungCap` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_ncc` varchar(100) NOT NULL,
  `dia_chi` varchar(45) NOT NULL,
  `dien_thoai` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `is_active` int DEFAULT '1',
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ten_ncc` (`ten_ncc`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.NhanVien
CREATE TABLE IF NOT EXISTS `NhanVien` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ho_va_ten` varchar(45) NOT NULL,
  `ngay_sinh` date NOT NULL,
  `dia_chi` varchar(254) NOT NULL DEFAULT 'null',
  `chuc_vu` varchar(100) NOT NULL DEFAULT 'null',
  `sdt` varchar(45) NOT NULL DEFAULT 'null',
  `luong` float NOT NULL DEFAULT '0',
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `TaiKhoan_id` int NOT NULL,
  `is_active` int DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `TaiKhoan_id` (`TaiKhoan_id`),
  KEY `fk_Employees_Account1_idx` (`TaiKhoan_id`),
  CONSTRAINT `fk_Employees_Account1` FOREIGN KEY (`TaiKhoan_id`) REFERENCES `TaiKhoan` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=233 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.PhieuNhap
CREATE TABLE IF NOT EXISTS `PhieuNhap` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_phieu_nhap` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `TaiKhoan_id` int NOT NULL,
  `NhaCungCap_id` int NOT NULL,
  `is_active` int DEFAULT '1',
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `fk_PhieuNhap_TaiKhoan1_idx` (`TaiKhoan_id`),
  KEY `fk_PhieuNhap_NhaCungCap1_idx` (`NhaCungCap_id`),
  CONSTRAINT `fk_PhieuNhap_NhaCungCap1` FOREIGN KEY (`NhaCungCap_id`) REFERENCES `NhaCungCap` (`id`),
  CONSTRAINT `fk_PhieuNhap_TaiKhoan1` FOREIGN KEY (`TaiKhoan_id`) REFERENCES `TaiKhoan` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=135 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.PhieuXuat
CREATE TABLE IF NOT EXISTS `PhieuXuat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_phieu_xuat` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `TaiKhoan_id` int NOT NULL,
  `is_active` int DEFAULT '1',
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_PhieuXuat_TaiKhoan1_idx` (`TaiKhoan_id`),
  CONSTRAINT `fk_PhieuXuat_TaiKhoan1` FOREIGN KEY (`TaiKhoan_id`) REFERENCES `TaiKhoan` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.PTThanhToan
CREATE TABLE IF NOT EXISTS `PTThanhToan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_PT` varchar(45) NOT NULL,
  `mo_ta` varchar(45) NOT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.Quyen
CREATE TABLE IF NOT EXISTS `Quyen` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_quyen` varchar(45) NOT NULL,
  `mo_ta` varchar(45) DEFAULT NULL,
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.QuyenChucNang
CREATE TABLE IF NOT EXISTS `QuyenChucNang` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Quyen_id` int NOT NULL,
  `ChucNang_id` int NOT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_RoleFunction_Functions1_idx` (`ChucNang_id`),
  KEY `fk_RoleFunction_Roles1_idx` (`Quyen_id`),
  CONSTRAINT `fk_RoleFunction_Functions1` FOREIGN KEY (`ChucNang_id`) REFERENCES `ChucNang` (`id`),
  CONSTRAINT `fk_RoleFunction_Roles1` FOREIGN KEY (`Quyen_id`) REFERENCES `Quyen` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.SanPham
CREATE TABLE IF NOT EXISTS `SanPham` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_SP` varchar(45) NOT NULL,
  `url_anh` varchar(255) DEFAULT NULL,
  `gia` float NOT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  `so_luong` int NOT NULL DEFAULT '0',
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LoaiSanPham_id` int NOT NULL,
  `updatedAt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ten_SP` (`ten_SP`),
  KEY `fk_Products_Categories1_idx` (`LoaiSanPham_id`),
  CONSTRAINT `fk_Products_Categories1` FOREIGN KEY (`LoaiSanPham_id`) REFERENCES `LoaiSanPham` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

-- Dumping structure for table java_coffee.TaiKhoan
CREATE TABLE IF NOT EXISTS `TaiKhoan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `password` varchar(255) NOT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  `Quyen_id` int NOT NULL,
  `updatedAt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `fk_Account_Roles_idx` (`Quyen_id`),
  CONSTRAINT `fk_Account_Roles` FOREIGN KEY (`Quyen_id`) REFERENCES `Quyen` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8mb3;

-- Data exporting was unselected.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
