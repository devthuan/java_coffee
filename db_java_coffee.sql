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
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table java_coffee.ChiTietHoaDon: ~97 rows (approximately)
INSERT INTO `ChiTietHoaDon` (`id`, `so_luong`, `SanPham_id`, `HoaDon_id`) VALUES
	(1, 1, 1, 1),
	(2, 2, 2, 1),
	(3, 1, 9, 1),
	(4, 1, 2, 2),
	(5, 3, 2, 3),
	(7, 1, 2, 13),
	(8, 2, 3, 13),
	(9, 1, 2, 14),
	(10, 3, 2, 15),
	(11, 2, 5, 15),
	(12, 1, 1, 15),
	(13, 1, 3, 15),
	(14, 2, 2, 16),
	(15, 1, 7, 16),
	(16, 2, 1, 16),
	(17, 1, 1, 17),
	(18, 1, 2, 18),
	(19, 2, 3, 18),
	(20, 1, 1, 18),
	(23, 1, 2, 21),
	(24, 1, 1, 22),
	(25, 3, 2, 22),
	(26, 3, 1, 23),
	(27, 4, 1, 24),
	(28, 4, 2, 24),
	(29, 4, 3, 24),
	(30, 1, 5, 25),
	(31, 1, 8, 25),
	(32, 1, 4, 25),
	(33, 1, 9, 25),
	(34, 1, 1, 26),
	(35, 1, 2, 26),
	(36, 1, 2, 27),
	(37, 1, 1, 27),
	(38, 1, 3, 28),
	(39, 3, 2, 28),
	(40, 1, 1, 28),
	(43, 1, 1, 30),
	(44, 2, 2, 30),
	(45, 1, 2, 31),
	(46, 1, 3, 32),
	(47, 1, 2, 33),
	(48, 1, 1, 34),
	(49, 1, 2, 34),
	(50, 3, 3, 34),
	(51, 1, 2, 35),
	(52, 91, 1, 35),
	(53, 1, 3, 35),
	(54, 1, 2, 36),
	(55, 1, 2, 37),
	(56, 1, 1, 37),
	(57, 4, 2, 38),
	(58, 1, 1, 39),
	(59, 1, 2, 40),
	(60, 1, 1, 40),
	(61, 1, 1, 41),
	(62, 1, 1, 42),
	(63, 1, 2, 42),
	(64, 3, 3, 42),
	(65, 2, 2, 43),
	(66, 1, 1, 43),
	(67, 1, 40, 44),
	(68, 1, 1, 44),
	(69, 1, 37, 44),
	(70, 1, 2, 44),
	(71, 1, 3, 44),
	(72, 1, 1, 45),
	(73, 1, 1, 46),
	(74, 1, 3, 47),
	(75, 1, 2, 47),
	(76, 1, 1, 47),
	(77, 1, 2, 48),
	(78, 1, 1, 48),
	(79, 1, 3, 48),
	(80, 5, 2, 49),
	(81, 6, 1, 49),
	(82, 1, 3, 50),
	(83, 1, 2, 50),
	(84, 1, 1, 50),
	(85, 1, 2, 51),
	(86, 1, 3, 51),
	(87, 1, 1, 51),
	(88, 1, 1, 52),
	(89, 1, 2, 52),
	(90, 3, 3, 52),
	(91, 2, 3, 53),
	(92, 4, 1, 53),
	(93, 2, 2, 53),
	(94, 100, 2, 54),
	(95, 1, 43, 55),
	(96, 1, 1, 56),
	(97, 1, 2, 56),
	(98, 1, 1, 57),
	(99, 1, 3, 58),
	(100, 1, 1, 59),
	(101, 1, 3, 59),
	(102, 1, 2, 59),
	(103, 1, 1, 60);

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
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=latin1;

-- Dumping data for table java_coffee.ChiTietPhieuNhap: ~39 rows (approximately)
INSERT INTO `ChiTietPhieuNhap` (`id`, `PhieuNhap_id`, `NguyenLieu_id`, `so_luong`, `don_vi`, `don_gia`, `createdAt`, `updatedAt`) VALUES
	(1, 1, 1, 1, 'KG', 70000, '2024-04-13 15:12:02', NULL),
	(2, 1, 2, 1, 'KG', 50000, '2024-04-13 15:13:17', NULL),
	(3, 2, 3, 1, 'KG', 1000000, '2024-04-14 23:46:28', NULL),
	(68, 83, 4, 1000, 'Kg', 232, '2024-04-21 22:39:58', '2024-04-21 22:39:58'),
	(69, 84, 4, 2000, 'Kg', 443221, '2024-04-21 22:39:59', '2024-04-21 22:39:59'),
	(70, 103, 1, 123, 'KG', 123, '2024-04-22 21:31:19', NULL),
	(71, 104, 1, 123, 'KG', 123, '2024-04-22 21:31:24', NULL),
	(72, 105, 1, 123, 'KG', 123, '2024-04-22 21:33:17', NULL),
	(73, 105, 2, 456, 'KG', 456, '2024-04-22 21:33:17', NULL),
	(74, 106, 3, 123, 'KG', 123, '2024-04-22 22:03:10', NULL),
	(75, 106, 4, 456, 'KG', 456, '2024-04-22 22:03:10', NULL),
	(76, 107, 1, 123, 'KG', 123, '2024-04-22 22:05:45', NULL),
	(77, 108, 3, 213, 'KG', 213, '2024-04-22 22:22:52', NULL),
	(78, 109, 3, 123, 'KG', 123, '2024-04-22 22:31:45', NULL),
	(79, 110, 1, 123, 'KG', 20000, '2024-04-22 22:33:04', NULL),
	(80, 110, 2, 123, 'KG', 20000, '2024-04-22 22:33:04', NULL),
	(81, 110, 3, 123, 'KG', 20000, '2024-04-22 22:33:04', NULL),
	(82, 110, 4, 123, 'KG', 20000, '2024-04-22 22:33:04', NULL),
	(83, 111, 1, 0, 'KG', 0, '2024-04-22 22:35:36', NULL),
	(84, 112, 1, 123123, 'KG', 123, '2024-04-22 22:36:59', NULL),
	(85, 113, 1, 123, 'KG', 123, '2024-04-23 12:13:27', NULL),
	(86, 113, 2, 456, 'KG', 456, '2024-04-23 12:13:27', NULL),
	(87, 113, 3, 789, 'KG', 789, '2024-04-23 12:13:27', NULL),
	(88, 114, 1, 123, 'KG', 123123, '2024-04-28 21:59:52', NULL),
	(89, 114, 2, 123, 'KG', 123123, '2024-04-28 21:59:52', NULL),
	(90, 114, 3, 123, 'KG', 123123, '2024-04-28 21:59:52', NULL),
	(91, 115, 1, 1000, 'KG', 123, '2024-04-28 22:36:51', NULL),
	(92, 116, 16, 1234, 'KG', 123, '2024-04-29 01:05:45', NULL),
	(93, 116, 27, 1234, 'KG', 123, '2024-04-29 01:05:45', NULL),
	(94, 117, 2, 100, 'KG', 200000, '2024-05-02 16:57:12', NULL),
	(95, 118, 1, 123, 'KG', 123000, '2024-05-02 17:05:53', NULL),
	(96, 119, 1, 300, 'KG', 356000, '2024-05-02 17:07:38', NULL),
	(97, 120, 1, 100, 'KG', 123000, '2024-05-04 10:53:59', NULL),
	(98, 120, 1, 200, 'KG', 345000, '2024-05-04 10:53:59', NULL),
	(99, 121, 1, 32, 'KG', 23000, '2024-05-05 14:01:41', NULL),
	(100, 122, 31, 123, 'KG', 123, '2024-05-05 23:14:37', NULL),
	(101, 122, 32, 123, 'KG', 123, '2024-05-05 23:14:37', NULL),
	(102, 123, 31, 123, 'KG', 123, '2024-05-05 23:44:05', NULL),
	(103, 124, 1, 1231210, 'KG', 123, '2024-05-14 09:16:49', NULL);

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
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=latin1;

-- Dumping data for table java_coffee.ChiTietPhieuXuat: ~24 rows (approximately)
INSERT INTO `ChiTietPhieuXuat` (`id`, `NguyenLieu_id`, `so_luong`, `don_vi`, `createdAt`, `updatedAt`, `PhieuXuat_id`) VALUES
	(1, 1, '400.0', 'Kg', '2024-04-20 17:41:32', NULL, 2),
	(2, 5, '500.0', 'Kg', '2024-04-20 17:42:25', NULL, 3),
	(3, 5, '500.0', 'Kg', '2024-04-20 17:42:25', NULL, 4),
	(20, 1, '123', 'KG', '2024-04-28 14:39:07', NULL, 21),
	(21, 2, '123', 'KG', '2024-04-28 14:39:07', NULL, 21),
	(22, 1, '28', 'KG', '2024-04-28 14:39:57', NULL, 22),
	(23, 15, '123', 'KG', '2024-04-28 22:28:40', NULL, 23),
	(25, 1, '1000', 'KG', '2024-04-28 22:31:43', NULL, 25),
	(26, 1, '123', 'KG', '2024-04-28 22:32:19', NULL, 26),
	(27, 1, '1000', 'KG', '2024-04-28 22:38:50', NULL, 27),
	(28, 1, '123', 'KG', '2024-04-28 23:13:47', NULL, 28),
	(29, 2, '123', 'KG', '2024-04-28 23:13:47', NULL, 28),
	(30, 3, '123', 'KG', '2024-04-28 23:13:47', NULL, 28),
	(31, 4, '123', 'KG', '2024-04-28 23:13:47', NULL, 28),
	(32, 1, '5000', 'KG', '2024-05-02 17:03:02', NULL, 29),
	(33, 2, '100', 'KG', '2024-05-02 17:05:34', NULL, 30),
	(34, 1, '423', 'KG', '2024-05-02 17:08:46', NULL, 31),
	(35, 2, '560', 'KG', '2024-05-02 17:08:46', NULL, 31),
	(36, 1, '282', 'KG', '2024-05-02 17:09:18', NULL, 32),
	(37, 1, '523', 'KG', '2024-05-02 17:09:19', NULL, 32),
	(38, 3, '282', 'KG', '2024-05-02 17:09:49', NULL, 33),
	(39, 4, '523', 'KG', '2024-05-02 17:09:49', NULL, 33),
	(40, 1, '227', 'KG', '2024-05-05 23:37:55', NULL, 44),
	(41, 1, '12', 'KG', '2024-05-07 09:51:27', NULL, 45);

-- Dumping structure for table java_coffee.ChucNang
CREATE TABLE IF NOT EXISTS `ChucNang` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_cn` varchar(45) NOT NULL,
  `mo_ta` varchar(45) DEFAULT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table java_coffee.ChucNang: ~51 rows (approximately)
INSERT INTO `ChucNang` (`id`, `ten_cn`, `mo_ta`, `is_active`, `createdAt`) VALUES
	(1, 'ADMIN', 'full chức năng', 1, '2024-04-29 21:13:30'),
	(2, 'READ_USER', 'xem danh sách tất cả người dùng', 1, '2024-04-29 21:13:30'),
	(3, 'CREATE_USER', 'tạo người dùng mới', 1, '2024-04-29 21:13:30'),
	(4, 'UPDATE_USER', 'chỉnh sửa người dùng', 1, '2024-04-29 21:13:30'),
	(5, 'DELETE_USER', 'khoá tài khoản người dùng', 1, '2024-04-29 21:13:30'),
	(6, 'IMPORT_USER', 'tạo người dùng bằng import file excel', 1, '2024-04-29 21:13:30'),
	(7, 'EXPORT_USER', 'xuất danh sách tất cả người dùng', 1, '2024-04-29 21:13:30'),
	(8, 'READ_PRODUCT', 'xem danh sách tất cả sản phẩm', 1, '2024-04-29 21:13:30'),
	(9, 'CREATE_PRODUCT', 'tạo sản phẩm mới', 1, '2024-04-29 21:13:30'),
	(10, 'UPDATE_PRODUCT', 'chỉnh sửa sản phẩm', 1, '2024-04-29 21:13:30'),
	(11, 'DELETE_PRODUCT', 'khoá tài khoản sản phẩm', 1, '2024-04-29 21:13:30'),
	(12, 'IMPORT_PRODUCT', 'tạo sản phẩm bằng import file excel', 1, '2024-04-29 21:13:30'),
	(13, 'EXPORT_PRODUCT', 'xuất danh sách tất cả sản phẩm', 1, '2024-04-29 21:13:30'),
	(14, 'READ_BILL', 'xem danh sách tất cả đơn hàng', 1, '2024-04-29 21:13:30'),
	(15, 'CREATE_BILL', 'tạo đơn hàng mới', 1, '2024-04-29 21:13:30'),
	(16, 'UPDATE_BILL', 'chỉnh sửa đơn hàng', 1, '2024-04-29 21:13:30'),
	(17, 'DELETE_BILL', 'khoá tài khoản đơn hàng', 1, '2024-04-29 21:13:30'),
	(18, 'IMPORT_BILL', 'tạo đơn hàng bằng import file excel', 1, '2024-04-29 21:13:30'),
	(19, 'EXPORT_BILL', 'xuất danh sách tất cả đơn hàng', 1, '2024-04-29 21:13:30'),
	(20, 'READ_WAREHOUSE', 'xem danh sách tất cả kho nguyên liệu', 1, '2024-04-29 21:13:30'),
	(21, 'CREATE_WAREHOUSE', 'tạo kho nguyên liệu mới', 1, '2024-04-29 21:13:30'),
	(22, 'UPDATE_WAREHOUSE', 'nhập kho nguyên liệu', 1, '2024-04-29 21:13:30'),
	(23, 'DELETE_WAREHOUSE', 'khoá tài khoản kho nguyên liệu', 1, '2024-04-29 21:13:30'),
	(24, 'IMPORT_WAREHOUSE', 'tạo kho nguyên liệu bằng import file excel', 1, '2024-04-29 21:13:30'),
	(25, 'EXPORT_WAREHOUSE', 'xuất danh sách tất cả kho nguyên liệu', 1, '2024-04-29 21:13:30'),
	(26, 'READ_EMPLOYEE', 'xem danh sách tất cả nhân viên', 1, '2024-04-29 21:13:30'),
	(27, 'CREATE_EMPLOYEE', 'tạo nhân viên mới', 1, '2024-04-29 21:13:30'),
	(28, 'UPDATE_EMPLOYEE', 'chỉnh sửa nhân viên', 1, '2024-04-29 21:13:30'),
	(29, 'DELETE_EMPLOYEE', 'xoá tài khoản nhân viên', 1, '2024-04-29 21:13:30'),
	(30, 'IMPORT_EMPLOYEE', 'tạo nhân viên bằng import file excel', 1, '2024-04-29 21:13:30'),
	(31, 'EXPORT_EMPLOYEE', 'xuất danh sách tất cả nhân viên', 1, '2024-04-29 21:13:30'),
	(32, 'READ_WAREHOUSE_RECEIPT', 'xem danh sách tất cả phiếu nhập', 1, '2024-04-29 21:13:30'),
	(33, 'CREATE_WAREHOUSE_RECEIPT', 'tạo phiếu nhập mới', 1, '2024-04-29 21:13:30'),
	(34, 'UPDATE_WAREHOUSE_RECEIPT', 'chỉnh sửa phiếu nhập', 1, '2024-04-29 21:13:30'),
	(35, 'DELETE_WAREHOUSE_RECEIPT', 'xoá tài khoản phiếu nhập', 1, '2024-04-29 21:13:30'),
	(36, 'IMPORT_WAREHOUSE_RECEIPT', 'tạo phiếu nhập bằng import file excel', 1, '2024-04-29 21:13:30'),
	(37, 'EXPORT_WAREHOUSE_RECEIPT', 'xuất danh sách tất cả phiếu nhập', 1, '2024-04-29 21:13:30'),
	(38, 'READ_WAREHOUSE_DISPATCH_NOTE', 'xem danh sách tất cả phiếu xuất', 1, '2024-04-29 21:13:30'),
	(39, 'CREATE_WAREHOUSE_DISPATCH_NOTE', 'tạo phiếu xuất mới', 1, '2024-04-29 21:13:30'),
	(40, 'UPDATE_WAREHOUSE_DISPATCH_NOTE', 'chỉnh sửa phiếu xuất', 1, '2024-04-29 21:13:30'),
	(41, 'DELETE_WAREHOUSE_DISPATCH_NOTE', 'xoá tài khoản phiếu xuất', 1, '2024-04-29 21:13:30'),
	(42, 'IMPORT_WAREHOUSE_DISPATCH_NOTE', 'tạo phiếu xuất bằng import file excel', 1, '2024-04-29 21:13:30'),
	(43, 'EXPORT_WAREHOUSE_DISPATCH_NOTE', 'xuất danh sách tất cả phiếu xuất', 1, '2024-04-29 21:13:30'),
	(44, 'READ_SUPPLIER', 'xem danh sách tất cả nhà cung cấp', 1, '2024-04-29 21:13:30'),
	(45, 'CREATE_SUPPLIER', 'tạo nhà cung cấp mới', 1, '2024-04-29 21:13:30'),
	(46, 'UPDATE_SUPPLIER', 'chỉnh sửa nhà cung cấp', 1, '2024-04-29 21:13:30'),
	(47, 'DELETE_SUPPLIER', 'xoá tài khoản nhà cung cấp', 1, '2024-04-29 21:13:30'),
	(48, 'IMPORT_SUPPLIER', 'tạo nhà cung cấp bằng import file excel', 1, '2024-04-29 21:13:30'),
	(49, 'EXPORT_SUPPLIER', 'xuất danh sách tất cả nhà cung cấp', 1, '2024-04-29 21:13:30'),
	(50, 'READ_STATISTICAL', 'xem thống kê', 1, '2024-04-29 21:13:30'),
	(51, 'EXPORT_STATISTICAL', 'xuất file excel thống kê', 1, '2024-04-29 21:13:30');

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

-- Dumping data for table java_coffee.GioHang: ~4 rows (approximately)
INSERT INTO `GioHang` (`id`, `so_luong`, `createdAt`, `SanPham_id`, `TaiKhoan_id`) VALUES
	(1, '8', '2024-03-30 11:41:02', 7, 1),
	(26, '57', '2024-05-05 15:33:46', 1, 1),
	(29, '8', '2024-05-05 16:25:25', 2, 1),
	(30, '7', '2024-05-05 16:25:27', 3, 1);

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
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table java_coffee.HoaDon: ~47 rows (approximately)
INSERT INTO `HoaDon` (`id`, `trang_thai`, `PTThanhToan_id`, `TaiKhoan_id`, `createdAt`) VALUES
	(1, 'successful', 1, 2, '2024-04-15 23:30:06'),
	(2, 'successful', 3, 2, '2024-04-14 23:31:50'),
	(3, 'successful', 2, 3, '2024-04-13 23:32:17'),
	(13, 'successful', 3, 3, '2024-04-21 21:53:41'),
	(14, 'successful', 1, 3, '2024-04-21 22:00:06'),
	(15, 'successful', 3, 2, '2024-04-21 22:02:14'),
	(16, 'successful', 2, 2, '2024-04-21 22:08:07'),
	(17, 'successful', 1, 3, '2024-04-21 22:26:13'),
	(18, 'successful', 1, 2, '2024-04-21 22:43:08'),
	(21, 'successful', 1, 3, '2024-04-22 00:48:07'),
	(22, 'successful', 1, 3, '2024-04-23 12:33:15'),
	(23, 'successful', 2, 3, '2024-04-23 12:33:38'),
	(24, 'successful', 1, 3, '2024-04-23 12:34:29'),
	(25, 'successful', 1, 2, '2024-04-23 12:36:17'),
	(26, 'successful', 1, 2, '2024-04-23 12:37:09'),
	(27, 'successful', 1, 3, '2024-04-23 12:37:20'),
	(28, 'successful', 3, 2, '2024-04-23 12:37:50'),
	(30, 'cancelled', 3, 2, '2024-04-27 00:25:19'),
	(31, 'cancelled', 1, 3, '2024-04-27 00:43:32'),
	(32, 'cancelled', 1, 2, '2024-04-27 00:48:54'),
	(33, 'successful', 1, 3, '2024-04-27 10:38:41'),
	(34, 'cancelled', 3, 2, '2024-04-27 15:54:16'),
	(35, 'cancelled', 1, 3, '2024-04-27 15:58:28'),
	(36, 'cancelled', 1, 2, '2024-04-27 16:38:33'),
	(37, 'cancelled', 1, 3, '2024-04-28 11:24:14'),
	(38, 'cancelled', 3, 2, '2024-04-28 11:46:33'),
	(39, 'cancelled', 1, 2, '2024-04-28 14:56:08'),
	(40, 'pending', 1, 2, '2024-04-29 20:34:08'),
	(41, 'pending', 2, 2, '2024-04-29 22:09:14'),
	(42, 'cancelled', 2, 2, '2024-04-30 11:39:23'),
	(43, 'successful', 2, 2, '2024-05-02 17:19:57'),
	(44, 'successful', 3, 2, '2024-05-02 17:32:34'),
	(45, 'pending', 1, 42, '2024-05-02 18:14:34'),
	(46, 'pending', 1, 2, '2024-05-03 15:51:48'),
	(47, 'cancelled', 2, 42, '2024-05-03 16:43:32'),
	(48, 'successful', 1, 42, '2024-05-03 16:43:44'),
	(49, 'successful', 1, 1, '2024-05-03 21:39:54'),
	(50, 'successful', 1, 1, '2024-05-04 16:52:43'),
	(51, 'successful', 1, 1, '2024-05-04 17:02:33'),
	(52, 'pending', 1, 1, '2024-05-05 14:42:33'),
	(53, 'pending', 1, 1, '2024-05-05 22:04:42'),
	(54, 'successful', 1, 1, '2024-05-05 22:08:35'),
	(55, 'pending', 1, 1, '2024-05-06 12:16:45'),
	(56, 'pending', 1, 1, '2024-05-06 21:59:30'),
	(57, 'pending', 1, 1, '2024-05-06 21:59:35'),
	(58, 'successful', 1, 1, '2024-05-13 09:30:45'),
	(59, 'successful', 1, 1, '2024-05-14 07:14:49'),
	(60, 'successful', 1, 1, '2024-09-04 22:32:28');

-- Dumping structure for table java_coffee.LoaiSanPham
CREATE TABLE IF NOT EXISTS `LoaiSanPham` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_loai` varchar(45) NOT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table java_coffee.LoaiSanPham: ~3 rows (approximately)
INSERT INTO `LoaiSanPham` (`id`, `ten_loai`, `is_active`, `createdAt`) VALUES
	(1, 'Cà phê', 1, '2024-03-27 23:50:16'),
	(2, 'Trà sữa', 1, '2024-03-27 23:50:16'),
	(3, 'Soda', 1, '2024-03-27 23:50:16');

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

-- Dumping data for table java_coffee.NguyenLieu: ~43 rows (approximately)
INSERT INTO `NguyenLieu` (`id`, `ten_NL`, `don_vi`, `so_luong`, `is_active`, `created_date`, `updatedAt`) VALUES
	(1, 'Cafe', 'KG', 1350200, 1, '2024-04-10 15:03:00', '2024-04-26 15:15:08'),
	(2, 'Sữa', 'KG', 3000, 1, '2024-04-10 15:03:20', '2024-05-04 11:53:50'),
	(3, 'Trà kho', 'KG', 1000, 1, '2024-04-10 15:06:14', '2024-05-04 11:53:29'),
	(4, 'cacao', 'kg', 3000, 1, '2024-04-19 13:35:49', '2024-05-03 15:45:26'),
	(5, 'Đá', 'Kg', 200, 0, '2024-04-19 20:29:20', '2024-04-10 15:56:02'),
	(15, 'mu', 'Kg', 0, 0, '2024-04-24 09:22:55', NULL),
	(16, 'ádfr3r', 'Kg', 1234, 1, '2024-04-28 01:47:31', '2024-05-04 23:25:44'),
	(27, 'Olala123', 'Kg', 1234, 1, '2024-04-28 23:17:39', '2024-05-02 18:10:32'),
	(29, 'v', 'Kg', 0, 0, '2024-04-28 23:17:55', NULL),
	(30, 'ab', 'Kg', 0, 0, '2024-04-29 01:07:30', '2024-04-29 01:07:42'),
	(31, 'ádfff', 'Kg', 246, 1, '2024-04-29 22:39:05', NULL),
	(32, 'hi123', 'Kg', 123, 1, '2024-04-29 22:44:22', '2024-05-02 18:12:17'),
	(33, 'grgd', 'Kg', 434, 0, '2024-05-02 17:41:56', NULL),
	(34, '123456780', 'Kg', 100, 1, '2024-05-02 18:12:41', '2024-05-05 10:55:45'),
	(35, '', 'Kg', 0, 0, '2024-05-03 15:45:14', NULL),
	(73, 'Cafe123', 'Kg', 0, 0, '2024-05-04 09:51:30', NULL),
	(74, 'gth', 'Kg', -34, 0, '2024-05-04 09:51:45', NULL),
	(78, 'teg', 'Kg', 0, 0, '2024-05-04 10:08:27', NULL),
	(79, 'fg', 'Kg', -23, 0, '2024-05-04 10:14:06', NULL),
	(80, 'gẻ', 'Kg', 43, 0, '2024-05-04 10:17:29', NULL),
	(81, 'g', 'Kg', 43, 0, '2024-05-04 10:23:54', NULL),
	(82, 'grgr', 'Kg', 434, 0, '2024-05-04 10:53:19', NULL),
	(83, 'Cafegr', 'Kg', 434, 0, '2024-05-04 10:59:35', NULL),
	(84, 'gg', 'Kg', 0, 0, '2024-05-04 11:04:37', NULL),
	(85, 'gfgfg', 'Kg', 0, 0, '2024-05-04 11:06:48', NULL),
	(86, '232', 'Kg', 23, 0, '2024-05-04 11:09:49', NULL),
	(87, 'o86i8', 'Kg', 88, 0, '2024-05-04 11:11:55', NULL),
	(88, 'gfdg', 'Kg', 0, 0, '2024-05-04 11:18:46', NULL),
	(89, 'grgreg', 'Kg', 43, 0, '2024-05-04 11:26:06', NULL),
	(90, 'Cafe123htrh', 'Kg', 43, 0, '2024-05-04 11:28:04', NULL),
	(91, 'Cafe1', 'Kg', 0, 0, '2024-05-04 11:28:20', NULL),
	(92, 'u', 'Kg', 0, 0, '2024-05-04 11:32:23', NULL),
	(93, 'fe', 'Kg', 0, 0, '2024-05-04 11:32:36', NULL),
	(94, 'Ca', 'Kg', 0, 0, '2024-05-04 11:32:44', NULL),
	(95, 'Cafe123456', 'Kg', 0, 0, '2024-05-04 11:33:09', NULL),
	(96, 'Sua2', 'Kg', 0, 0, '2024-05-04 11:33:25', NULL),
	(97, 'hi1234', 'Kg', 0, 0, '2024-05-04 11:33:37', NULL),
	(98, '123', 'Kg', 43, 0, '2024-05-04 11:58:12', NULL),
	(102, 'gr', 'Kg', 0, 0, '2024-05-05 10:33:03', NULL),
	(104, 'ád', 'Kg', 0, 0, '2024-05-05 14:40:01', NULL),
	(105, 'grg', 'Kg', 4234, 0, '2024-05-05 15:09:03', NULL),
	(106, 'ggrgas', 'Kg', 0, 0, '2024-05-05 15:21:40', NULL),
	(107, 'ge3r23r', 'Kg', 0, 0, '2024-05-05 15:22:01', NULL);

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
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table java_coffee.NhaCungCap: ~24 rows (approximately)
INSERT INTO `NhaCungCap` (`id`, `ten_ncc`, `dia_chi`, `dien_thoai`, `email`, `is_active`, `createdAt`, `updatedAt`) VALUES
	(1, 'Nhà cung cấp 1', 'HCM', '0911111111', 'supplier1@gmail.com', 1, '2024-04-01 14:09:54', '2024-05-06 21:57:30'),
	(2, 'Nhà cung cấp 2', 'compiler', '09xx', 'g@gmail', 0, '2024-04-05 14:09:54', '2024-04-13 01:31:50'),
	(3, 'Nhà cung cấp 4', 'HCM', '0986786786', 'supplier3@gmail.com', 1, '2024-04-13 00:15:15', '2024-05-06 21:57:36'),
	(4, 'Nhà cung cấp 3', 'HCM', '0931231231', 'supplier3@gmail.com', 1, '2024-04-13 00:23:44', '2024-05-06 21:57:41'),
	(5, 'sdfgsdfg', 'ádfsadf', '1231231231', 'sdf@gmail.com', 0, '2024-04-13 01:38:25', '2024-04-13 01:38:31'),
	(6, 'Nhà cung cấp 5', 'HN', '0945986666', 'supplier5@gmail.com', 1, '2024-04-13 22:26:37', '2024-05-03 15:41:14'),
	(7, 'abc', 'abc', '0931231231', '123@gmail.com', 1, '2024-04-13 23:11:21', '2024-05-06 21:57:49'),
	(8, 'ádf', 'ádf', '0931231231', 'adf@gmail.com', 1, '2024-04-14 00:30:11', '2024-05-06 21:57:54'),
	(9, 'Supplier 10', 'HCM 1', '0945986661', 'suplier10@gmail.com', 1, '2024-04-14 00:39:31', NULL),
	(10, 'Supplier 11', 'HCM 2', '0945986662', 'suplier11@gmail.com', 1, '2024-04-14 00:39:31', NULL),
	(11, 'Supplier 16', 'HCM 3', '0945986663', 'suplier12@gmail.com', 1, '2024-04-14 00:39:31', NULL),
	(12, 'Supplier 13', 'HCM 4', '0945986664', 'suplier13@gmail.com', 1, '2024-04-14 00:39:32', NULL),
	(13, 'Supplier 14', 'HCM 5', '0945986665', 'suplier14@gmail.com', 1, '2024-04-14 00:39:32', NULL),
	(14, 'Supplier 18', 'HCM 6', '0945986666', 'suplier14@gmail.com', 1, '2024-04-14 00:39:32', NULL),
	(15, 'Supplier 21', 'HCM 1', '0945986661', 'suplier10@gmail.com', 1, '2024-04-14 00:42:24', NULL),
	(16, 'Supplier 20', 'HCM 2', '0945986662', 'suplier11@gmail.com', 1, '2024-04-14 00:42:24', NULL),
	(17, 'Supplier 12', 'HCM 3', '0945986663', 'suplier12@gmail.com', 1, '2024-04-14 00:42:24', NULL),
	(18, 'Supplier 19', 'HCM 4', '0945986664', 'suplier13@gmail.com', 0, '2024-04-14 00:42:24', '2024-04-29 22:24:01'),
	(19, 'Supplier 17', 'HCM 5', '0945986665', 'suplier14@gmail.com', 0, '2024-04-14 00:42:24', '2024-04-29 22:23:08'),
	(20, 'Supplier 15', 'HCM 6', '0945986666', 'suplier14@gmail.com', 0, '2024-04-14 00:42:24', '2024-04-14 01:11:04'),
	(38, 'Nhà cung cấp 112', 'HCM', '0911111111', 'supplier1@gmail.com', 1, '2024-05-05 20:11:31', '2024-05-06 21:58:00'),
	(39, 'Nhà cung cấp 41', 'HCM', '0986786786', 'supplier3@gmail.com', 1, '2024-05-05 20:11:31', '2024-05-06 21:58:07'),
	(40, 'Nhà cung cấp 31', 'HCM', '0931231231', 'supplier3@gmail.com', 1, '2024-05-05 20:11:31', '2024-05-06 21:58:12'),
	(41, 'ádfasdf', 'ádfasdf', '0931231231', 'affs@gmail.com', 1, '2024-05-06 21:57:09', '2024-05-06 21:58:19');

-- Dumping structure for table java_coffee.NhanVien
CREATE TABLE IF NOT EXISTS `NhanVien` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ho_va_ten` varchar(45) NOT NULL,
  `ngay_sinh` date NOT NULL DEFAULT '0000-00-00',
  `dia_chi` varchar(254) NOT NULL DEFAULT 'null',
  `chuc_vu` varchar(100) NOT NULL DEFAULT 'null',
  `sdt` varchar(45) NOT NULL DEFAULT 'null',
  `luong` float NOT NULL DEFAULT '0',
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `TaiKhoan_id` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `TaiKhoan_id` (`TaiKhoan_id`),
  KEY `fk_Employees_Account1_idx` (`TaiKhoan_id`),
  CONSTRAINT `fk_Employees_Account1` FOREIGN KEY (`TaiKhoan_id`) REFERENCES `TaiKhoan` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=230 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table java_coffee.NhanVien: ~37 rows (approximately)
INSERT INTO `NhanVien` (`id`, `ho_va_ten`, `ngay_sinh`, `dia_chi`, `chuc_vu`, `sdt`, `luong`, `createdAt`, `TaiKhoan_id`) VALUES
	(1, 'Nguyễn Văn A', '1990-01-01', '123 Đường ABC, Q.1', 'Nhân viên bán hàng', '0901234567', 5000000, '2024-03-27 23:50:16', 3),
	(2, 'Trần Thị B', '1995-05-05', '456 Đường XYZ, Q.2', 'Nhân viên bán hàng', '0987654321', 8000000, '2024-03-27 23:50:16', 70),
	(45, 'thuan', '0002-11-30', '456 Đường XYZ, Q.2', 'Quản lý', '0231231231', 5500000, '2024-04-27 15:49:27', 88),
	(55, 'Nael', '2007-04-23', '273 An Dương Vương Quận 5', 'Quản lý', '0333555465', 5000000, '2024-04-28 18:30:00', 2),
	(64, 'Hồ Vinh Hoa Hồng', '1995-11-14', '123 An Dương Vương', 'Nhân viên bán hàng', '0912347567', 15000000, '2024-04-28 22:21:15', 78),
	(136, 'Nguyễn Văn A', '1990-01-01', '123 Đường ABC, Q.1', 'Nhân viên bán hàng', '0901234567', 20000, '2024-05-02 23:03:36', 56),
	(137, 'Trần Thị B', '1995-05-05', '456 Đường XYZ, Q.2', 'Nhân viên bán hàng', '0987654321', 8000000, '2024-05-02 23:03:36', 58),
	(138, 'test123', '2024-04-17', '33test2', 'Nhân viên bán hàng', '0942325413', 12341200, '2024-05-02 23:03:36', 59),
	(139, '123', '2024-04-06', '123', 'Nhân viên bán hàng', '0433345332', 123, '2024-05-02 23:03:36', 13),
	(140, '456', '2024-04-14', '456', 'Nhân viên bán hàng', '0922453334', 456, '2024-05-02 23:03:36', 39),
	(141, 'ádfasdf', '2024-05-23', 'ádfasdfasdf', 'Quản lý', '0945981231', 123, '2024-05-03 14:54:05', 92),
	(142, 'ádf', '2024-05-13', 'ádfasdf', 'Quản lý', '09123123123', 123123, '2024-05-03 15:12:47', 5),
	(144, '123456', '2024-05-02', 'gtgergttr', 'Nhân viên bán hàng', '0943245678', 234566, '2024-05-03 21:49:41', 62),
	(145, 'td', '2024-04-30', '123', 'Nhân viên bán hàng', '0987654321', 123000, '2024-05-03 22:01:18', 60),
	(155, 'Nguyễn Văn B', '2000-05-30', 'HCM', 'Nhân viên bán hàng', '0912312312', 10000000, '2024-05-04 15:32:30', 63),
	(177, 'Nguyễn Văn A', '1990-01-01', '123 Đường ABC, Q.1', 'Nhân viên bán hàng', '0901234567', 5000000, '2024-05-04 19:45:12', 61),
	(180, 'Nguyễn Văn A', '1990-01-01', '123 Đường ABC, Q.1', 'Nhân viên bán hàng', '0901234567', 20000, '2024-05-04 22:47:09', 15),
	(182, 'Nguyễn Văn A', '1990-01-01', '123 Đường ABC, Q.1', 'Nhân viên bán hàng', '0901234567', 20000, '2024-05-04 22:54:52', 64),
	(183, 'Đồng Văn E', '2002-02-01', '123đff', 'Nhân viên bán hàng', '0912342123', 23456, '2024-05-04 22:54:54', 68),
	(184, 'Nguyễn Văn A', '1990-01-01', '123 Đường ABC, Q.1', 'Nhân viên bán hàng', '0901234567', 20000, '2024-05-05 00:10:07', 85),
	(185, 'Đồng Văn E', '2002-02-01', '123đff', 'Quản lý', '0912342123', 23456, '2024-05-05 00:10:08', 40),
	(186, 'Lee Van He', '1990-01-01', '123 Đường ABC, Q.1', 'Nhân viên bán hàng', '0901234567', 20000, '2024-05-05 10:11:29', 81),
	(187, 'Kim Yo Hi', '2002-02-01', '123đff', 'Nhân viên bán hàng', '0912342123', 23456, '2024-05-05 10:11:29', 65),
	(188, 'gregeg', '2024-05-10', 'g43t4', 'Nhân viên bán hàng', '0903323456', 23000, '2024-05-05 10:35:31', 76),
	(189, 'Lee Van He', '1990-01-01', '123 Đường ABC, Q.1', 'Nhân viên bán hàng', '0901234567', 20000, '2024-05-05 11:04:02', 86),
	(190, 'g43g', '2024-05-15', 'g434g', 'Nhân viên bán hàng', '0933243212', 234000, '2024-05-05 15:20:58', 57),
	(191, 'bbb', '2024-05-15', 'bbb', 'Nhân viên bán hàng', '0999999999', 123000, '2024-05-05 15:57:43', 75),
	(195, 'Lee Van He 1', '1990-01-01', '123 Đường ABC, Q.1', 'Quản lý', '0832234567', 20000, '2024-05-05 19:49:39', 89),
	(196, 'Lee Van He 2', '1990-01-01', '123 Đường ABC, Q.1', 'Nhân viên bán hàng', '0201234567', 20000, '2024-05-05 19:49:39', 71),
	(197, 'Lee Van He 3', '1990-01-01', '123 Đường ABC, Q.1', 'Nhân viên bán hàng', '0901234567', 20000, '2024-05-05 19:49:39', 84),
	(199, 'gdfdf', '2024-05-27', '3fw3', 'Nhân viên bán hàng', '09332345676', 23434, '2024-05-05 20:58:37', 29),
	(203, 'grgerg', '2024-05-01', 'greg', 'Nhân viên bán hàng', '0944323456', 2340000, '2024-05-05 21:01:49', 55),
	(207, 'vdfdggg', '2024-05-08', 'gẻg34', 'Nhân viên bán hàng', '0999999999', 234566, '2024-05-05 21:06:20', 69),
	(210, 'gdgdgẻ', '2024-05-22', '3r3r', 'Nhân viên bán hàng', '0992332345', 23698, '2024-05-05 21:21:39', 35),
	(227, 'ểtrt', '2024-05-07', 'ểtt', 'Nhân viên bán hàng', '0933234456', 5435, '2024-05-05 23:12:03', 11),
	(228, 'gẻge', '2024-05-28', 'tểt', 'Quản lý', '0988765544', 45345, '2024-05-05 23:12:29', 94),
	(229, 'Trần phước thuận', '2024-05-06', 'hcm', 'Admin', '0912312312', 123123, '2024-05-06 11:24:15', 1);

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
) ENGINE=InnoDB AUTO_INCREMENT=125 DEFAULT CHARSET=latin1;

-- Dumping data for table java_coffee.PhieuNhap: ~27 rows (approximately)
INSERT INTO `PhieuNhap` (`id`, `ten_phieu_nhap`, `TaiKhoan_id`, `NhaCungCap_id`, `is_active`, `createdAt`) VALUES
	(1, 'Phiếu nhập 1', 1, 1, 1, '2024-04-13 15:08:32'),
	(2, 'Phiếu nhập 2', 2, 2, 1, '2024-04-14 23:45:15'),
	(6, 'Phiếu nhập 3', 3, 3, 0, '2024-04-15 23:45:39'),
	(83, 'fdsf', 2, 1, 0, '2024-04-21 22:39:58'),
	(84, 'g4e', 2, 1, 1, '2024-04-21 22:39:59'),
	(103, 'vmnvbn', 2, 1, 1, '2024-04-22 21:31:19'),
	(104, 'vmnvbn', 2, 1, 1, '2024-04-22 21:31:24'),
	(105, 'testtt', 3, 6, 1, '2024-04-22 21:33:17'),
	(106, 'test2', 2, 9, 1, '2024-04-22 22:03:10'),
	(107, 'test3', 2, 1, 1, '2024-04-22 22:05:45'),
	(108, 'test5', 2, 1, 1, '2024-04-22 22:22:52'),
	(109, 'ádfasfdasfasdf', 2, 1, 1, '2024-04-22 22:31:45'),
	(110, '', 2, 1, 0, '2024-04-22 22:33:04'),
	(111, '123213', 2, 1, 0, '2024-04-22 22:35:36'),
	(112, 'ádfasdf', 2, 1, 0, '2024-04-22 22:36:59'),
	(113, 'Test cuối', 3, 6, 0, '2024-04-23 12:13:27'),
	(114, '123123asdf', 2, 1, 0, '2024-04-28 21:59:52'),
	(115, 'ádfasd', 2, 1, 0, '2024-04-28 22:36:51'),
	(116, 'ádfasdf', 2, 1, 1, '2024-04-29 01:05:45'),
	(117, 'Phiếu nhập mk', 15, 6, 1, '2024-05-02 16:57:12'),
	(118, '123', 15, 4, 1, '2024-05-02 17:05:53'),
	(119, 'mkl', 2, 3, 1, '2024-05-02 17:07:38'),
	(120, 'Phiếu nhập td', 43, 4, 0, '2024-05-04 10:53:59'),
	(121, 'gr2332', 42, 3, 1, '2024-05-05 14:01:41'),
	(122, 'adfasdfasdf', 85, 1, 1, '2024-05-05 23:14:37'),
	(123, 'ádfasdfsd', 1, 1, 1, '2024-05-05 23:44:05'),
	(124, 'aaa', 1, 1, 1, '2024-05-14 09:16:49');

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
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=latin1;

-- Dumping data for table java_coffee.PhieuXuat: ~24 rows (approximately)
INSERT INTO `PhieuXuat` (`id`, `ten_phieu_xuat`, `TaiKhoan_id`, `is_active`, `createdAt`) VALUES
	(2, 'Phiếu xuất 1', 2, 1, '2024-04-18 13:37:28'),
	(3, 'Phiếu xuất 2', 2, 1, '2024-04-19 14:37:29'),
	(4, 'Phiếu xuất 3', 2, 1, '2024-04-20 14:37:30'),
	(21, 'Phiếu xuất 4', 2, 0, '2024-04-28 14:39:07'),
	(22, 'sdad', 2, 0, '2024-04-28 14:39:57'),
	(23, 'ádf', 2, 0, '2024-04-28 22:28:40'),
	(25, 'ấdfafsd', 2, 1, '2024-04-28 22:31:43'),
	(26, 'sdgsdg', 2, 0, '2024-04-28 22:32:19'),
	(27, 'ádfadf', 2, 0, '2024-04-28 22:38:50'),
	(28, 'ádfasdfsf', 2, 1, '2024-04-28 23:13:47'),
	(29, 'Phiếu xuất 5000', 3, 1, '2024-05-02 17:03:02'),
	(30, '123', 2, 1, '2024-05-02 17:05:34'),
	(31, 'Phiếu xuất 234', 2, 1, '2024-05-02 17:08:46'),
	(32, 'gtg', 2, 1, '2024-05-02 17:09:18'),
	(33, 'gewr', 2, 1, '2024-05-02 17:09:49'),
	(37, 'ấdfasdf', 1, 1, '2024-05-05 23:12:51'),
	(38, 'ádfasdf', 1, 1, '2024-05-05 23:26:30'),
	(39, 'ádfadfds', 1, 1, '2024-05-05 23:29:02'),
	(40, 'adsfa', 1, 1, '2024-05-05 23:31:04'),
	(41, 'ádfasdf', 1, 1, '2024-05-05 23:34:28'),
	(42, '123123', 1, 1, '2024-05-05 23:35:08'),
	(43, 'adfasdf', 1, 1, '2024-05-05 23:36:37'),
	(44, 'ádfasdf', 1, 1, '2024-05-05 23:37:55'),
	(45, 'ab', 40, 1, '2024-05-07 09:51:27');

-- Dumping structure for table java_coffee.PTThanhToan
CREATE TABLE IF NOT EXISTS `PTThanhToan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_PT` varchar(45) NOT NULL,
  `mo_ta` varchar(45) NOT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table java_coffee.PTThanhToan: ~3 rows (approximately)
INSERT INTO `PTThanhToan` (`id`, `ten_PT`, `mo_ta`, `is_active`, `createdAt`) VALUES
	(1, 'Tiền mặt', 'Thanh toán bằng tiền mặt khi nhận hàng', 1, '2024-03-27 23:52:28'),
	(2, 'Thẻ ngân hàng', 'Thanh toán bằng thẻ ngân hàng qua cổng thanh ', 1, '2024-03-27 23:52:28'),
	(3, 'Chuyển khoản', 'Thanh toán bằng chuyển khoản qua ngân hàng', 1, '2024-03-27 23:52:28');

-- Dumping structure for table java_coffee.Quyen
CREATE TABLE IF NOT EXISTS `Quyen` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_quyen` varchar(45) NOT NULL,
  `mo_ta` varchar(45) DEFAULT NULL,
  `createdAt` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table java_coffee.Quyen: ~3 rows (approximately)
INSERT INTO `Quyen` (`id`, `ten_quyen`, `mo_ta`, `createdAt`) VALUES
	(1, 'Admin', 'Quyền quản trị cao nhất', '2024-03-27 23:50:16'),
	(2, 'Manager', 'Quyền cấp quản lý', '2024-03-31 23:42:12'),
	(3, 'Staff', 'Quyền cấp nhân viên bán hàng', '2024-03-31 23:42:19');

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

-- Dumping data for table java_coffee.QuyenChucNang: ~58 rows (approximately)
INSERT INTO `QuyenChucNang` (`id`, `Quyen_id`, `ChucNang_id`, `is_active`, `createdAt`) VALUES
	(1, 1, 1, 1, '2024-05-03 13:23:28'),
	(2, 2, 2, 1, '2024-05-03 13:23:28'),
	(3, 2, 3, 1, '2024-05-03 13:23:28'),
	(4, 2, 4, 1, '2024-05-03 13:23:28'),
	(5, 2, 6, 1, '2024-05-03 13:23:28'),
	(6, 2, 7, 1, '2024-05-03 13:23:28'),
	(7, 2, 8, 1, '2024-05-03 13:23:28'),
	(8, 2, 9, 1, '2024-05-03 13:23:28'),
	(9, 2, 10, 1, '2024-05-03 13:23:28'),
	(10, 2, 12, 1, '2024-05-03 13:23:28'),
	(11, 2, 13, 1, '2024-05-03 13:23:28'),
	(12, 2, 14, 1, '2024-05-03 13:23:28'),
	(13, 2, 15, 1, '2024-05-03 13:23:28'),
	(14, 2, 16, 1, '2024-05-03 13:23:28'),
	(15, 2, 17, 1, '2024-05-03 13:23:28'),
	(16, 2, 18, 1, '2024-05-03 13:23:28'),
	(17, 2, 19, 1, '2024-05-03 13:23:28'),
	(18, 2, 20, 1, '2024-05-03 13:23:28'),
	(19, 2, 21, 1, '2024-05-03 13:23:28'),
	(20, 2, 22, 1, '2024-05-03 13:23:28'),
	(21, 2, 24, 1, '2024-05-03 13:23:28'),
	(22, 2, 25, 1, '2024-05-03 13:23:28'),
	(23, 2, 26, 1, '2024-05-03 13:23:28'),
	(24, 2, 27, 1, '2024-05-03 13:23:28'),
	(25, 2, 28, 1, '2024-05-03 13:23:28'),
	(26, 2, 30, 1, '2024-05-03 13:23:28'),
	(27, 2, 31, 1, '2024-05-03 13:23:28'),
	(28, 2, 32, 1, '2024-05-03 13:23:28'),
	(29, 2, 33, 1, '2024-05-03 13:23:28'),
	(30, 2, 34, 1, '2024-05-03 13:23:28'),
	(31, 2, 36, 1, '2024-05-03 13:23:28'),
	(32, 2, 37, 1, '2024-05-03 13:23:28'),
	(33, 2, 38, 1, '2024-05-03 13:23:28'),
	(34, 2, 39, 1, '2024-05-03 13:23:28'),
	(35, 2, 40, 1, '2024-05-03 13:23:28'),
	(36, 2, 42, 1, '2024-05-03 13:23:28'),
	(37, 2, 43, 1, '2024-05-03 13:23:28'),
	(38, 2, 44, 1, '2024-05-03 13:23:28'),
	(39, 2, 45, 1, '2024-05-03 13:23:28'),
	(40, 2, 46, 1, '2024-05-03 13:23:28'),
	(41, 2, 48, 1, '2024-05-03 13:23:28'),
	(42, 2, 49, 1, '2024-05-03 13:23:28'),
	(43, 2, 50, 1, '2024-05-03 13:23:28'),
	(44, 2, 51, 1, '2024-05-03 13:23:28'),
	(45, 3, 8, 1, '2024-05-03 13:23:28'),
	(46, 3, 13, 1, '2024-05-03 13:23:28'),
	(47, 3, 14, 1, '2024-05-03 13:23:28'),
	(48, 3, 15, 1, '2024-05-03 13:23:28'),
	(49, 3, 16, 1, '2024-05-03 13:23:28'),
	(50, 3, 19, 1, '2024-05-03 13:23:28'),
	(51, 3, 20, 1, '2024-05-03 13:23:28'),
	(52, 3, 25, 1, '2024-05-03 13:23:28'),
	(53, 3, 32, 1, '2024-05-03 13:23:28'),
	(54, 3, 37, 1, '2024-05-03 13:23:28'),
	(55, 3, 38, 1, '2024-05-03 13:23:28'),
	(56, 3, 43, 1, '2024-05-03 13:23:28'),
	(57, 3, 44, 1, '2024-05-03 13:23:28'),
	(58, 3, 49, 1, '2024-05-03 13:23:28');

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

-- Dumping data for table java_coffee.SanPham: ~16 rows (approximately)
INSERT INTO `SanPham` (`id`, `ten_SP`, `url_anh`, `gia`, `is_active`, `so_luong`, `createdAt`, `LoaiSanPham_id`, `updatedAt`) VALUES
	(1, 'Cà phê đen', './src/assets/icon/Hình 1.png', 20000, 1, 81, '2024-03-15 22:51:18', 1, '2024-05-03 14:25:09'),
	(2, 'Cà phê sữa', './src/assets/icon/Hình 2.png', 20000, 1, 88, '2024-03-15 22:51:18', 1, '2024-04-28 00:51:30'),
	(3, 'Cà phê thường', './src/assets/icon/Hình 3.png', 20000, 1, 59, '2024-03-15 22:51:18', 1, '2024-03-15 22:51:18'),
	(4, 'Trà sữa đường đen', './src/assets/icon/ts1.png', 25000, 1, 44, '2024-03-15 22:51:18', 2, '2024-03-15 22:51:18'),
	(5, 'Trà sữa match', './src/assets/icon/ts2.png', 25000, 0, 64, '2024-03-15 22:51:18', 2, '2024-04-29 22:24:29'),
	(6, 'Trà sữa khoai môn', './src/assets/icon/ts3.png', 25000, 1, 76, '2024-03-25 14:58:02', 2, '2024-03-15 22:51:18'),
	(7, 'Soda đào', './src/assets/icon/soda4.png', 30000, 1, 100, '2024-03-25 14:59:17', 3, '2024-05-05 23:45:46'),
	(8, 'Soda nho', './src/assets/icon/soda2.png', 30000, 1, 88, '2024-03-25 14:59:24', 3, '2024-03-15 22:51:18'),
	(9, 'Soda dâu', './src/assets/icon/soda3.png', 30000, 1, 133, '2024-03-25 14:59:33', 3, '2024-03-15 22:51:18'),
	(37, 'test1', './src/assets/icon/cancel.png', 213, 0, 122, '2024-04-28 01:38:22', 1, '2024-05-03 13:35:00'),
	(39, 'olong sua', './src/assets/icon/edit.png', 20, 0, 1, '2024-04-29 22:11:16', 2, '2024-04-29 22:12:28'),
	(40, '123', './src/assets/icon/Screenshot 2024-04-13 121012.png', 3000, 0, 299, '2024-04-29 22:12:12', 1, '2024-05-03 13:34:09'),
	(43, 'adasd', './src/assets/icon/database-fix.png', 40000, 0, 99, '2024-05-06 12:12:39', 1, '2024-05-06 12:22:18'),
	(44, 'ádfadf', './src/assets/icon/download.png', 123, 0, 123, '2024-05-06 12:16:24', 1, '2024-05-06 12:22:16'),
	(45, 'ádfasdf', './src/assets/icon/database-fix.png', 123, 0, 123, '2024-05-06 12:18:48', 1, '2024-05-06 12:22:13'),
	(46, 'đầ', './src/assets/icon/download.png', 123, 0, 123, '2024-05-06 12:20:20', 2, '2024-05-06 12:22:04');

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
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table java_coffee.TaiKhoan: ~76 rows (approximately)
INSERT INTO `TaiKhoan` (`id`, `email`, `password`, `is_active`, `createdAt`, `Quyen_id`, `updatedAt`) VALUES
	(1, 'admin@gmail.com', '$2a$10$ylYoqjEd74zJ.Eq0hrUOu.2Z7UDcSfjKc70woelMrzJ7D2LotKKRG', 1, '2024-03-27 23:50:16', 1, '2024-04-29 23:12:40'),
	(2, 'employee1@example.com', 'employee123', 1, '2024-03-27 23:50:16', 1, '2024-05-06 11:11:00'),
	(3, 'employee2@example.com', 'employee123', 0, '2024-03-27 23:50:16', 3, '2024-04-07 14:36:12'),
	(4, 'ạdajhdbm', 'ahbdanbdnab', 0, '2024-04-16 10:16:43', 1, '2024-04-16 10:16:43'),
	(5, 'mailan@gmail.com', 'mailan', 1, '2024-04-18 17:50:49', 2, '2024-04-28 10:47:51'),
	(6, 'lan@gmail.com', '$2a$10$/4UkNZW.UQU/flWOuRQeFeEln34pEnGSimkvWM9WH9TE/4dx51oxW', 1, '2024-04-18 17:58:01', 1, '2024-04-18 17:58:01'),
	(8, 'abc@gmail', 'ahbdanbdnab', 1, '2024-04-20 14:29:33', 1, '2024-04-20 14:29:33'),
	(11, 'abc1@gmail.com', '$2a$10$qhjBdP5UC03w2OMVcOhtHOPBV/uLfshnlHThS1jUYPpdI6G3QBAxm', 1, '2024-04-20 14:33:13', 3, '2024-05-05 22:54:03'),
	(12, 'abac1@gmail', 'ahbdanbdnab', 1, '2024-04-20 14:34:27', 1, '2024-04-20 14:34:27'),
	(13, 'abacs1@gmail', 'ahbdanbdnab', 1, '2024-04-20 14:37:13', 3, '2024-04-20 14:37:13'),
	(15, 'abddacs1@gmail', 'ahbdanbdnab', 1, '2024-04-20 14:39:58', 3, '2024-04-20 14:39:58'),
	(16, 'admin12', '.', 1, '2024-04-20 14:42:05', 1, '2024-04-20 14:42:05'),
	(18, 'admáin12', '.', 1, '2024-04-20 14:43:17', 3, '2024-04-20 14:43:17'),
	(20, 'abcd', '.', 0, '2024-04-20 14:46:13', 1, '2024-04-20 14:46:13'),
	(21, 'abcd1', '.', 1, '2024-04-20 14:47:09', 1, '2024-04-20 14:47:09'),
	(23, 'ads', '$2a$10$VNSxt/R7ZmHoSLrBTkj5/.lr07DoC7L2dWLlIDqnC9pIfKOhA7ugW', 0, '2024-04-21 15:21:04', 3, '2024-04-21 15:21:04'),
	(24, 'ads@gmail.com', '$2a$10$TxNfImFJ2jGs/Yo4X5DO7OIxNjlBEGwJ/CGVIdoRzb1BeXSHjbuOK', 1, '2024-04-21 15:21:18', 1, '2024-04-21 15:21:18'),
	(26, 'thuan@gmail.com', '$2a$10$x025FwFVpCax1GcX8mSMPeLhTj/LEd6iakSjGXrUiobB3MyZo9Q7q', 1, '2024-04-27 15:49:27', 1, '2024-04-27 15:49:27'),
	(28, 'thuan1@gmail.com', '$2a$10$NimuH2iM/y.W7/MJwQ5ko.GrOM.klYCKn2CJvj5YoeSVUcVKRnRzu', 1, '2024-04-27 15:51:08', 1, '2024-04-27 15:51:08'),
	(29, 'mb@gmail.com', '$2a$10$wtoEsdHKJ8Ss55rHOJTheu.PnKMBmF1mF82dYkyrIl2wAJz.BbkPa', 1, '2024-04-28 11:14:05', 3, '2024-04-28 11:14:05'),
	(30, 'mb1@gmail.com', '$2a$10$6kDnS0glg3CtxG2xDlKcMO5OAcMinnXKgUq1Wlq.I0RhCrM.p59z.', 1, '2024-04-28 11:15:23', 1, NULL),
	(35, 'av@gmail.com', '$2a$10$ZQMRjUJZesTjH0n1oundXOBIGuPrgwHSC3crSonsBp12CsHb5MmDi', 1, '2024-04-29 15:44:55', 3, NULL),
	(36, 'aa@gmail.com', '$2a$10$dxV0bAQ0fdtN4X0qC6wqX./gv9sb8iN6NHWWv3oF8fTfzVC8dee0S', 1, '2024-04-29 15:46:19', 3, NULL),
	(38, 'admin123@gmail.com', '$2a$10$HXEsoMr5TiqGO61n2wE8feL8ZyiP2.0eeKwLJ0uRsf/t9zAdISgge', 1, '2024-04-29 20:55:38', 1, '2024-04-29 20:57:52'),
	(39, 'client@gmail.com', '$2a$10$eaejtlT893DbKeLgEUYKme61rcmP9UAOhmNkNTQ16iiuOLlpvtgEm', 1, '2024-04-29 21:27:11', 3, NULL),
	(40, 'manager@gmail.com', '$2a$10$chDhlCBYstLSHmcdM7vI8OSJfsRHkfQjSja1Rf0lNxZFUjxPynytC', 1, '2024-04-29 21:28:52', 2, '2024-04-29 23:13:04'),
	(41, 'hm534@gmail.com', '$2a$10$oQ7MTH3dq6zHcopL80xgbuZBvTbWHLKZ3iKEcOGg1VhLnMo5CzjFS', 1, '2024-04-29 22:08:33', 1, '2024-05-03 21:29:49'),
	(42, 'nael@gmail.com', '$2a$10$clsIseV1bP1xh.RJDx9d3ORIMMU.c8cnxQH8vP0rw.hEr6FNSoJQO', 1, '2024-04-30 11:25:47', 1, '2024-05-03 14:14:39'),
	(43, 'td@gmail.com', '$2a$10$Sf07XYpb.3CV3wNrh1Oqnuv7GGmKUKKqsTqdH5fxXd/zAePIf/Qj2', 1, '2024-05-02 16:49:10', 1, '2024-05-03 21:29:16'),
	(44, 'hnjj', '$2a$10$iIWP0J.mzxsK1PxuKI7QieuFGjqvAqzE7dW4vDLFUeA4Q58XyBmGS', 1, '2024-05-04 18:17:21', 3, NULL),
	(45, 'd1@gmail.com', '$2a$10$VLUhIBciVCu1LKVzX1GpG.ge1nZWlNTOuSVUtG0DT9LFbR52Kslye', 0, '2024-05-04 18:18:31', 3, NULL),
	(46, 'd2@gmail.com', '$2a$10$0nQrS9vYBF9N3dzKvddkfuPCUF0RP9wgtYSv/jzkYO8ygDnZ9p02u', 0, '2024-05-04 18:19:07', 3, NULL),
	(47, 'd3@gmail.com', '$2a$10$CJRE21nFX4.nVbwANGe8VO3dR7hJkM5wt8PZ21m.3sQBZRJOAAaYG', 0, '2024-05-04 18:19:09', 3, NULL),
	(48, 'd4@gmail.com', '$2a$10$xPKYXbvvZEuHHhEM5PEitekgvPhVOcO3QNAV5a7w.EQBW5Z8nDMti', 0, '2024-05-04 18:19:09', 3, NULL),
	(49, 'd5@gmail.com', '$2a$10$c7HA.kK2GW1RtaXyZV5dqepqvQdocuarJN0ZObhSOCM5zD19De7E2', 0, '2024-05-04 18:19:10', 3, NULL),
	(54, 'd6@gmail.com', '$2a$10$PAnAQByVcRtxgsgbcB7Cg.8OR.ZyEhdshCkDQjT5WarBFDLITprQS', 0, '2024-05-04 18:40:08', 3, NULL),
	(55, 'd7@gmail.com', '$2a$10$7dGs5kA6nOyKTrBMS1WW7uvL/7ExoLfAl5cVn5c5AJ2KHifCkMdAu', 1, '2024-05-04 18:41:50', 3, NULL),
	(56, 'd8@gmail.com', '$2a$10$K7VUXZNKH9SQJBW890aZ/egy4HI2kzLhEv6WtazTxQptc/9iSjicW', 1, '2024-05-04 18:50:17', 3, NULL),
	(57, 'd10@gmail.com', '$2a$10$sPCqObjihdSnhVce1fHvM.k9YtO.yh0Sv0x0IW9f12B94L5KoPIim', 1, '2024-05-04 18:52:28', 3, NULL),
	(58, 'd11@gmail.com', '$2a$10$oyBwM0VpPUrHZbuxLpFz0./5RGUWT5agZsswDF618W.XDbfNMy1i.', 1, '2024-05-04 18:54:17', 3, NULL),
	(59, 'd13@gmail.com', '$2a$10$c8Wqu4q3Hf1q/w8UgaDig.IFTUFHn3JdxDADGYBSXH1AEs2vLT8i2', 1, '2024-05-04 18:57:08', 3, NULL),
	(60, 'ui1@gmail.com', '$2a$10$QdWdbNL7/VyI5/8fTOvW4uFjil7pu5KPJsoyb2u2Raq2qnYKviKTe', 1, '2024-05-04 19:22:18', 3, NULL),
	(61, 'ui2@gmail.com', '$2a$10$6TVHxGf4LxJsksC4kRPUz.f2DehO7z/nknmFOpMZ2tYrzc/gV4adG', 1, '2024-05-04 19:22:18', 3, NULL),
	(62, 'd12@gmail.com', '$2a$10$oGAfQE8BV9XcfE0dTlVjOeU.K/wdXUyajJJxjFzvMlaOO8KDm3s6C', 1, '2024-05-04 19:48:42', 3, NULL),
	(63, 'd14@gmail.com', '$2a$10$MTyM3a.iB330oOhu8Ro8DuiNdy/e8cHO3dzk/YhFe5/m.23LO9e06', 1, '2024-05-04 19:52:34', 3, NULL),
	(64, 'd15@gmail.com', '$2a$10$hP78tdcUXXj.7nd1UC4VVuBCClPRwHP9cU/6ZLPStkmsTzwGFeWZG', 1, '2024-05-04 19:54:17', 3, NULL),
	(65, 'd16@gmail.com', '$2a$10$uKSl.2I6zcQDdC34xol5GuococsarbWL4faYfQQQTJEzTKxmlIUrW', 1, '2024-05-04 19:58:14', 3, NULL),
	(66, 'd17@gmail.com', '$2a$10$YiZj76.OLT2.NDkwP6HEt.wwt7S5kR4gYt/CpJf8HVqm7GqRZQZR6', 0, '2024-05-04 19:59:52', 3, NULL),
	(67, 'd9@gmail.com', '$2a$10$dbd.ShFoAMH18j2YDj7aCu4MGgYOak4yPW7MgDdYUt0ylAohcI3Si', 0, '2024-05-04 19:59:53', 3, NULL),
	(68, 'd18@gmail.com', '$2a$10$cJu5RdNorOSTWiGceeCRd.v5zAj641kUXayBuEEzAGfQpYLRyCk6.', 1, '2024-05-04 21:11:08', 3, NULL),
	(69, 'd20@gmail.com', '$2a$10$0VHjuN5X5fnMBVfwocfG4uk4bzNDCM8HjrF78F95fjM5ywSB.tqTi', 1, '2024-05-04 21:20:06', 3, NULL),
	(70, 'd19@gmail.com', '$2a$10$UbsCizMunMEIff5OUxStC.LKdQ7eQ8ZEvKrPJZoX60CEJFnjJuvai', 1, '2024-05-04 21:20:06', 3, NULL),
	(71, 'd21@gmail.com', '$2a$10$rdUE.4b1YvD4KJRAlj.3jugcYooOwM4pYQPbvHEFjFZfl9yH0scOW', 1, '2024-05-04 22:54:52', 3, NULL),
	(72, 'd22@gmail.com', '$2a$10$dQHtaZgDe/cZksObBuLBMuE0opyTEt/NQFx013XD.tMIRoZP9Wyh6', 1, '2024-05-04 22:54:52', 3, NULL),
	(75, 'd23@gmail.com', '$2a$10$43GFzlaKStLkmBKMRd4xpugq1Ox7ILdZvZo1myAIi4nwUCCV7lLJu', 1, '2024-05-05 00:10:07', 3, NULL),
	(76, 'd24@gmail.com', '$2a$10$i72yL38txW4SyUK8dJP1xOVPEXH/Bw7kkH2i79JU5dMNVdVOGY1o6', 1, '2024-05-05 00:10:08', 3, NULL),
	(77, 'd25gmail.com', '$2a$10$BVeqnUqxzYXs4VFI7RYAYegWsm7/E/kyYIpSvYa1tDXZw199rf0gC', 1, '2024-05-05 10:11:29', 3, NULL),
	(78, 'd26@gmail.com', '$2a$10$sgEkfQpkWV4VnosMRYt2EOu.SUOn9blc/0tLLQ4W3AFMeVY0nsi9W', 1, '2024-05-05 10:11:29', 3, NULL),
	(81, 'li@gmail.com', '$2a$10$NqOEDxQJ9NSq1AWqnU7od.eTfveGgqlfFl1qwlmcMhEsmbd.pjv.q', 1, '2024-05-05 11:01:52', 3, NULL),
	(83, 'liy@gmail.com', '$2a$10$Ghq0qPJeHK6waieky7/M9.dNWJkgFxwR8.9Jt7IzdiOEyyL00D5AK', 1, '2024-05-05 11:04:02', 3, NULL),
	(84, 'i1@gmail.com', '$2a$10$GuBcV/Fc8j3XA.hWwOKiLuoHv2q8BrjSHtBFWo49P09DvcENAG9dK', 1, '2024-05-05 18:40:11', 3, NULL),
	(85, 'i2@gmail.com', '$2a$10$su6rY7V4O0XkflseBCP5BO44.9YImL2KTJSC58zrU441YZEOw5Vrq', 1, '2024-05-05 18:40:11', 3, NULL),
	(86, 'i3@gmail.com', '$2a$10$TFdVOkF3.cuVQmh/YNy1BeZ3nqyNQb5Lv3HffB.TGJEPIOYCGLAg2', 1, '2024-05-05 18:40:11', 3, NULL),
	(87, 'i5@gmail.com', '$2a$10$nLFHRgZRK7/LGahISrIRbO7.rmg4VLf0CnmY/GpNi1bm4/1PXYlH.', 1, '2024-05-05 19:49:39', 3, NULL),
	(88, 'i6@gmail.com', '$2a$10$1zrnzLPowAjX7D.dXAlse.xZ.C/i7EXJ4tAe2Z8e0OZ8AvtjaTpze', 1, '2024-05-05 19:49:39', 2, '2024-05-05 22:50:56'),
	(89, 'i7@gmail.com', '$2a$10$DvI1FHnOtmyKT/3HSD6Xp.Ye67j9pPLZGAEwBNnuMsPFwtX86FRBK', 1, '2024-05-05 19:49:39', 2, '2024-05-05 20:26:05'),
	(90, 're@gmail.com', '$2a$10$8dUbV392ayMbInihGxaEdebsNfgPPx4tUGl6HY4y.70jPd5QSrBrm', 1, '2024-05-05 20:24:34', 2, '2024-05-05 20:25:58'),
	(91, 're1@gmail.com', '$2a$10$JiutVT9DSYPOSP.snWusBePQIM.YI0YupdsMS8MpAzMeV3vRpFgYO', 1, '2024-05-05 20:24:47', 2, '2024-05-05 20:25:52'),
	(92, 're2@gmail.com', '$2a$10$Ru42AU.KI2zRzoNJoY6A6ObtQq6MVQiFmZWqE6B4BMszmTTq61Pha', 1, '2024-05-05 20:24:57', 2, '2024-05-05 20:25:46'),
	(93, 've1@gmail.com', '$2a$10$/tDuYHoB2XSwIJ.Wn5lbmumLU//t1glCeEskHLZb1q8kqzh9/tESK', 1, '2024-05-05 20:25:07', 2, '2024-05-05 20:25:40'),
	(94, 'mm@gmail.com', '$2a$10$39WgkGnmNC6bz20Vro4eCu518yo2Ww1gFKdyS/3S.kCxM3O8S2gMq', 1, '2024-05-05 22:48:38', 2, '2024-05-05 22:49:52'),
	(95, 'mm1@gmail.com', '$2a$10$mLtqSZ7veloTD2FIKCI11.JWE2blBH6OJRpVqI4/yJUEPH.uDPjL.', 1, '2024-05-05 22:48:51', 3, NULL),
	(96, 'g@gmail.com', '$2a$10$EA7H10L4QtaHQVw4bcRsOu0jTmk/Aiqbv6n8hoGka0ZsqTLUAr7hu', 1, '2024-05-05 22:50:03', 2, '2024-05-05 22:50:47'),
	(97, 'naul@gmail.com', '$2a$10$uzkYO3KWTHZJsGNZQtOiqOCfbLucPrra63Fw7lc2/0eQhcPO.4ojm', 1, '2024-05-07 08:49:46', 3, NULL),
	(98, 'aaa@gmail.com', '$2a$10$p.tj2SBkdjp6ZPU3koC2kuexKuH2fS5RqFhvfcDCSjbCjRI04/1fi', 1, '2024-05-07 09:24:30', 1, NULL),
	(100, 'thuann@gmail.com', '$2a$10$pLoRUrmV5EzP24W7VxlrXu.54DoBkZ5QdlhsfdIiX56wkERQdq0TW', 1, '2024-05-07 09:35:11', 1, '2024-05-10 22:31:44');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
