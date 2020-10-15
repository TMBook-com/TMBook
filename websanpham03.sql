-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 10, 2020 at 04:35 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `websanpham03`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbcategory`
--

CREATE TABLE `tbcategory` (
  `id` int(11) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 NOT NULL,
  `pid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbcategory`
--

INSERT INTO `tbcategory` (`id`, `name`, `pid`) VALUES
(1, 'NAM', 0),
(2, 'NỮ', 0),
(3, 'PHỤ KIỆN', 0),
(5, 'Áo phông', 1),
(6, 'Quần Jean', 1),
(7, 'Váy công sở', 2),
(8, 'Đồ dạ hội', 2),
(9, 'Khăn quàng', 3),
(10, 'Vòng đeo', 3),
(11, 'Sơ mi', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbchitiethoadon`
--

CREATE TABLE `tbchitiethoadon` (
  `id` int(11) NOT NULL,
  `mahd` int(11) NOT NULL,
  `idsp` int(11) NOT NULL,
  `soluong` int(11) NOT NULL,
  `giamua` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbchitiethoadon`
--

INSERT INTO `tbchitiethoadon` (`id`, `mahd`, `idsp`, `soluong`, `giamua`) VALUES
(5, 3, 1, 1, 5000000),
(6, 3, 2, 2, 20000),
(7, 4, 1, 1, 5000000),
(8, 4, 2, 2, 20000),
(9, 5, 2, 1, 2000000),
(10, 5, 4, 1, 12000000),
(11, 5, 6, 1, 10000000),
(14, 7, 2, 1, 2000000),
(15, 7, 6, 2, 10000000),
(18, 9, 1, 2, 5000000),
(19, 9, 2, 1, 2000000),
(27, 13, 1, 1, 5000000),
(28, 13, 2, 2, 2000000),
(29, 14, 1, 1, 5000000),
(30, 14, 2, 1, 2000000),
(31, 15, 1, 1, 5000000),
(32, 15, 2, 1, 2000000),
(33, 16, 1, 2, 5000000),
(34, 16, 2, 3, 2000000),
(35, 17, 1, 1, 5000000),
(36, 17, 2, 1, 2000000),
(37, 17, 3, 1, 5000000),
(38, 18, 1, 2, 5000000),
(39, 18, 2, 1, 2000000),
(40, 19, 6, 1, 10000000),
(41, 19, 7, 1, 10000000),
(42, 20, 7, 1, 10000000),
(43, 20, 8, 1, 100000),
(44, 21, 2, 1, 2000000),
(45, 21, 8, 1, 100000),
(46, 23, 1, 2, 5000000),
(47, 23, 2, 3, 2000000),
(48, 24, 3, 1, 5000000),
(49, 24, 4, 1, 12000000),
(50, 25, 1, 1, 5000000),
(51, 26, 3, 2, 5000000),
(52, 26, 6, 3, 10000000);

-- --------------------------------------------------------

--
-- Table structure for table `tbhoadon`
--

CREATE TABLE `tbhoadon` (
  `mahd` int(11) NOT NULL,
  `tennguoimua` varchar(30) CHARACTER SET utf8 NOT NULL,
  `dienthoai` varchar(15) NOT NULL,
  `ngaydat` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ngaynhan` datetime NOT NULL,
  `trangthai` tinyint(4) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbhoadon`
--

INSERT INTO `tbhoadon` (`mahd`, `tennguoimua`, `dienthoai`, `ngaydat`, `ngaynhan`, `trangthai`) VALUES
(3, 'abc19', '123456789', '2018-09-19 21:17:17', '2018-09-20 21:16:00', 1),
(4, 'abc20', '0912356004', '2018-09-19 21:17:47', '2018-09-20 21:17:00', 2),
(5, 'Ngọc Anh', '0123456789', '2019-09-03 10:13:06', '2019-09-05 10:12:00', 3),
(7, 'Nguyễn Đức Anh', '0123456789', '2019-09-05 10:09:15', '2019-09-06 11:41:00', 2),
(9, 'Đặng Văn Lâm', '0123456789', '2019-09-05 11:22:56', '2019-09-06 11:41:00', 1),
(13, 'Nguyễn Hoàng Chung', '0123456789', '2019-10-08 16:32:39', '2019-09-06 11:41:00', 2),
(14, 'Nguyễn Hoàng Chung2', '0123456789', '2019-10-08 16:45:23', '2019-10-09 15:00:00', 0),
(15, 'Lan Anh', '123456778', '2019-10-16 17:28:12', '2019-10-19 17:28:00', 2),
(16, 'Phạm Hoàng Hải', '0123456789', '2019-10-29 20:15:39', '2019-10-30 21:00:00', 2),
(17, 'Hoang Anh Tuan', '1244555', '2019-12-07 08:23:07', '2019-12-05 10:12:00', 2),
(18, 'Hồng Nhung', '12345678', '2020-06-12 21:15:21', '2020-06-15 00:00:00', 0),
(19, 'Nguyễn Đức Anh 2', '08345678', '2020-06-26 21:09:33', '2019-10-09 15:00:00', 0),
(20, 'Nguyễn Đức Anh 3', '1244555', '2020-06-26 21:10:53', '2019-10-19 17:28:00', 0),
(21, 'Nguyễn Đức Anh3', '08345678', '2020-06-29 19:29:02', '2019-10-19 17:28:00', 0),
(22, 'abc1', '1244555', '2020-06-29 20:09:54', '2019-09-05 00:00:00', 0),
(23, 'Trá»nh VÄn Chung', '09123456789', '2020-06-29 20:47:21', '2020-06-30 00:00:00', 0),
(24, 'Trá»nh VÄn Chung', '09123456789', '2020-06-29 20:58:07', '2020-06-30 00:00:00', 0),
(25, 'Trịnh Văn Chung', '09123456789', '2020-06-29 21:22:30', '2020-06-30 00:00:00', 2),
(26, 'Bùi Thiện Minh', '0123456789', '2020-07-07 15:30:22', '2020-07-08 00:00:00', 2);

-- --------------------------------------------------------

--
-- Table structure for table `tbloaitin`
--

CREATE TABLE `tbloaitin` (
  `LoaiTin` int(11) NOT NULL,
  `TenLoaiTin` varchar(2000) CHARACTER SET utf8 NOT NULL,
  `Sothutu` int(11) DEFAULT NULL,
  `TrangThai` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbloaitin`
--

INSERT INTO `tbloaitin` (`LoaiTin`, `TenLoaiTin`, `Sothutu`, `TrangThai`) VALUES
(1, 'Thể Thao', NULL, NULL),
(2, 'Kinh tế', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tbnhanvien`
--

CREATE TABLE `tbnhanvien` (
  `id` int(11) NOT NULL,
  `hoten` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `dienthoai` varchar(20) DEFAULT NULL,
  `hinhanh` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbnhanvien`
--

INSERT INTO `tbnhanvien` (`id`, `hoten`, `dienthoai`, `hinhanh`) VALUES
(3, 'Đặng Văn Lâm', '12345678', '1810_32_1.jpg'),
(4, 'Nguyễn Ngọc Anh', '012242343434', 'hoa-hop-bx-093.jpg'),
(5, 'Đặng Văn Lâm 3', '4737474', 'aoseminam01.jpg'),
(6, 'Nguyễn VĂn Dũng', '1234', 'cdyduoc.jpg'),
(7, 'Messi234', '123456789', ''),
(8, 'Ronaldo', '123456789', 'logo.png');

-- --------------------------------------------------------

--
-- Table structure for table `tbnhomsp`
--

CREATE TABLE `tbnhomsp` (
  `manhom` int(11) NOT NULL,
  `tennhom` varchar(200) CHARACTER SET utf8 NOT NULL,
  `sothutu` int(11) DEFAULT NULL,
  `trangthai` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbnhomsp`
--

INSERT INTO `tbnhomsp` (`manhom`, `tennhom`, `sothutu`, `trangthai`) VALUES
(1, 'Máy tính', 3, 1),
(2, 'Điện thoại', 2, 1),
(5, 'Đồng hồ', 1, 1),
(6, 'Tủ lạnh', 4, 1),
(9, 'Bàn ghế', 5, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbquantri`
--

CREATE TABLE `tbquantri` (
  `id` int(11) NOT NULL,
  `taikhoan` varchar(50) NOT NULL,
  `matkhau` varchar(32) NOT NULL,
  `loai` tinyint(4) DEFAULT NULL,
  `trangthai` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbquantri`
--

INSERT INTO `tbquantri` (`id`, `taikhoan`, `matkhau`, `loai`, `trangthai`) VALUES
(1, 'admin', 'e10adc3949ba59abbe56e057f20f883e', 1, 1),
(2, 'nhanvien', '202cb962ac59075b964b07152d234b70', 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbsanpham`
--

CREATE TABLE `tbsanpham` (
  `id` int(11) NOT NULL,
  `masp` varchar(30) NOT NULL,
  `tensp` varchar(100) CHARACTER SET utf8 NOT NULL,
  `giasp` int(11) NOT NULL,
  `manhom` int(11) DEFAULT NULL,
  `hinhanh` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `tomtat` text CHARACTER SET utf8,
  `noidung` text CHARACTER SET utf8,
  `trangthai` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbsanpham`
--

INSERT INTO `tbsanpham` (`id`, `masp`, `tensp`, `giasp`, `manhom`, `hinhanh`, `tomtat`, `noidung`, `trangthai`) VALUES
(1, 'sp01', 'Áo phông 1', 5000000, 5, 'iphone-8-plus-hh-600x600.jpg', '<p>t&oacute;m tắt sản phẩm 1</p>\r\n\r\n<p>t&oacute;m tắt sản phẩm 1</p>\r\n\r\n<p>t&oacute;m tắt sản phẩm 1</p>\r\n', '<p>chi tiết sản phẩm 1</p>\r\n\r\n<p>chi tiết sản phẩm 1</p>\r\n\r\n<p>chi tiết sản phẩm 1</p>\r\n\r\n<p>chi tiết sản phẩm 1</p>\r\n\r\n<p>chi tiết sản phẩm 1</p>\r\n\r\n<p>chi tiết sản phẩm 1</p>\r\n\r\n<p>chi tiết sản phẩm 1</p>\r\n\r\n<p>chi tiết sản phẩm 1</p>\r\n', 1),
(2, 'sp02', 'Áo phông  22', 2000000, 5, 'apple-macbook-pro-touch-mr9q2sa-a-2018-thumb-1-600x600.jpg', '', '', 1),
(3, 'SP04', 'Máy tính 1', 5000000, 6, 'apple-macbook-air-mqd32sa-a-i5-5350u-400-1-450x300-600x600.jpg', '', '', 1),
(4, 'SP05', 'Điện thoại 5', 12000000, 6, 'oppo-a3s-red-600x600.jpg', '', '', 1),
(6, 'SP053', 'Điện thoại 6', 10000000, 2, 'samsung-galaxy-s9-plus-64gb-xanh-san-ho-2-1-600x600.jpg', '', '', 1),
(7, 'banghe01', 'Bộ bàn ăn 01', 10000000, 9, 'Ban-ghe-an-ma-32.1.jpg', '<p><strong>Bộ B&agrave;n Ăn Xoan Ta 6 ghế BT06 được sử dụng nguy&ecirc;n liệu l&agrave; gỗ xoan ta đ&atilde; qua tẩm sấy chống mối mọt. Đảm bảo độ bền, mẫu m&atilde; thể hiện sự ấm c&uacute;ng, th&acirc;n thuộc. Thiết kế đa dạng với m&agrave;u sắc ch&iacute;nh v&agrave;ng gỗ sồi. </strong><br />\r\nBộ B&agrave;n Ăn Xoan Ta 6 ghế BT06 c&oacute; b&agrave;n k&iacute;nh d&agrave;y 8mm bo tr&ograve;n cạnh v&agrave; 6 ghế đi c&ugrave;ng. Tại chợ nội thất Ph&aacute;t Ph&aacute;t lu&ocirc;n l&agrave; đơn vị đi đầu trọng việc sản xuất nội thất gi&aacute; rẻ, chất lượng. C&aacute;c sản phẩm nội thất gia đ&igrave;nh được kh&aacute;ch h&agrave;ng tin d&ugrave;ng với nhiều kiểu d&aacute;ng th&iacute;ch hợp bởi kiểu d&aacute;ng hiện đại, chất lượng tương đương với gi&aacute; th&agrave;nh qu&yacute; kh&aacute;ch bỏ ra.</p>\r\n', '<p>ại nội thất PH&Aacute;T PH&Aacute;T, qu&yacute; kh&aacute;ch sẽ được: Mua C&agrave;ng Nhiều Gi&aacute; C&agrave;ng Tốt &ndash; Ở Đ&acirc;u Rẻ Ph&aacute;t Ph&aacute;t Rẻ Hơn! &ldquo;Ph&aacute;t Ph&aacute;t c&oacute; Kho h&agrave;ng lớn v&igrave; vậy số lượng v&agrave; chủng loại c&aacute;c sản phẩm nội thất Ph&aacute;t Ph&aacute;t qu&aacute; nhiều, h&igrave;nh ảnh tr&ecirc;n website kh&ocirc;ng thể cập nhật hết.</p>\r\n\r\n<p>Qu&yacute; kh&aacute;ch c&oacute; thể trực tiếp qua kho để xem h&agrave;ng, hoặc li&ecirc;n hệ 0969 882 500 hoặc page Ph&aacute;t Ph&aacute;t. ( Đặc biệt &Ocirc; t&ocirc; con, Xe tải, Container 1,25 tấn &ndash; 3,5 tấn v&agrave;o 24/24h, Đường L&ecirc; Quang Đạo xe Container 40 feet ra v&agrave;o thoải m&aacute;i kh&ocirc;ng bị cấm).</p>\r\n\r\n<p>C&aacute;c sản phẩm b&agrave;n ghế l&agrave;m việc của Nội thất Ph&aacute;t Ph&aacute;t đều được lựa chọn theo xu hướng theo thiết kế hiện h&agrave;nh. V&igrave; thế kh&ocirc;ng chỉ c&oacute; c&aacute;c loại Nội thất văn ph&ograve;ng chất lượng m&agrave; gi&aacute; rẻ hơn so với thị trường.</p>\r\n', 1),
(8, 'sp01abc123', 'sản phẩm 123', 100000, 2, 'aoseminam01.jpg', '<p>Th&ocirc;ng b&aacute;o khai giảng lớp lập tr&igrave;nh PHP mới, dạy theo nhu cầu v&agrave; chương tr&igrave;nh ph&ugrave; hợp với khả năng v&agrave; tr&igrave;nh độ của sinh vi&ecirc;n.</p>\r\n\r\n<p>Lớp học bắt đầu tối nay, học từ 6h-9h tối Thứ 2, 3, 5. (C&Oacute; THỂ SẮP XẾP GIỜ HỌC KH&Aacute;C THEO NHU CẦU CỦA LỚP)</p>\r\n\r\n<p>C&aacute;c em c&oacute; thể tham gia học thử v&agrave; giới thiệu c&aacute;c bạn c&oacute; nhu cầu học lập tr&igrave;nh ứng dụng web.</p>\r\n\r\n<p>????&nbsp;Địa điểm:<br />\r\nPh&ograve;ng học tr&ecirc;n tầng 3.<br />\r\nTrung t&acirc;m kỹ năng thực h&agrave;nh cơ giới đường bộ - Cao đẳng giao th&ocirc;ng vận tải TW<br />\r\nSố 6 ng&otilde; 29 đường Gi&aacute;p B&aacute;t<br />\r\nĐối diện si&ecirc;u thị điện m&aacute;y HC đường Giải Ph&oacute;ng.<br />\r\nĐi từ đầu phố Gi&aacute;p B&aacute;t (649 Giải Ph&oacute;ng) đi v&agrave;o tầm 50m v&agrave;o ng&otilde; 29 l&agrave; thấy Trung t&acirc;m.</p>\r\n\r\n<p>Li&ecirc;n hệ thầy Trường số 0912356004</p>\r\n', '<p>Th&ocirc;ng b&aacute;o khai giảng lớp lập tr&igrave;nh PHP mới, dạy theo nhu cầu v&agrave; chương tr&igrave;nh ph&ugrave; hợp với khả năng v&agrave; tr&igrave;nh độ của sinh vi&ecirc;n.</p>\r\n\r\n<p>Lớp học bắt đầu tối nay, học từ 6h-9h tối Thứ 2, 3, 5. (C&Oacute; THỂ SẮP XẾP GIỜ HỌC KH&Aacute;C THEO NHU CẦU CỦA LỚP)</p>\r\n\r\n<p>C&aacute;c em c&oacute; thể tham gia học thử v&agrave; giới thiệu c&aacute;c bạn c&oacute; nhu cầu học lập tr&igrave;nh ứng dụng web.</p>\r\n\r\n<p>????&nbsp;Địa điểm:<br />\r\nPh&ograve;ng học tr&ecirc;n tầng 3.<br />\r\nTrung t&acirc;m kỹ năng thực h&agrave;nh cơ giới đường bộ - Cao đẳng giao th&ocirc;ng vận tải TW<br />\r\nSố 6 ng&otilde; 29 đường Gi&aacute;p B&aacute;t<br />\r\nĐối diện si&ecirc;u thị điện m&aacute;y HC đường Giải Ph&oacute;ng.<br />\r\nĐi từ đầu phố Gi&aacute;p B&aacute;t (649 Giải Ph&oacute;ng) đi v&agrave;o tầm 50m v&agrave;o ng&otilde; 29 l&agrave; thấy Trung t&acirc;m.</p>\r\n\r\n<p>Li&ecirc;n hệ thầy Trường số 0912356004</p>\r\n', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbtintuc`
--

CREATE TABLE `tbtintuc` (
  `id` int(11) NOT NULL,
  `Tieude` varchar(200) CHARACTER SET utf8 NOT NULL,
  `TomTat` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `Noidung` text CHARACTER SET utf8,
  `Hinhanh` varchar(100) CHARACTER SET utf16 DEFAULT NULL,
  `TinNoiBat` tinyint(1) DEFAULT NULL,
  `LoaiTin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbtintuc`
--

INSERT INTO `tbtintuc` (`id`, `Tieude`, `TomTat`, `Noidung`, `Hinhanh`, `TinNoiBat`, `LoaiTin`) VALUES
(2, 'tiêu đề tin 1', 'Tóm tắt tin 1', 'Nội dung tin 1', 'ha_giang.PNG', 1, 1),
(3, 'tiêu đề tin 2', 'Tóm tắt tin 2', 'Nội dung tin 2', 'moc_chau.PNG', 1, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbcategory`
--
ALTER TABLE `tbcategory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbchitiethoadon`
--
ALTER TABLE `tbchitiethoadon`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `uni_hd_sp` (`mahd`,`idsp`),
  ADD KEY `idsp` (`idsp`);

--
-- Indexes for table `tbhoadon`
--
ALTER TABLE `tbhoadon`
  ADD PRIMARY KEY (`mahd`);

--
-- Indexes for table `tbloaitin`
--
ALTER TABLE `tbloaitin`
  ADD PRIMARY KEY (`LoaiTin`);

--
-- Indexes for table `tbnhanvien`
--
ALTER TABLE `tbnhanvien`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbnhomsp`
--
ALTER TABLE `tbnhomsp`
  ADD PRIMARY KEY (`manhom`);

--
-- Indexes for table `tbquantri`
--
ALTER TABLE `tbquantri`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `taikhoan` (`taikhoan`);

--
-- Indexes for table `tbsanpham`
--
ALTER TABLE `tbsanpham`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `masp_unique` (`masp`),
  ADD KEY `manhom` (`manhom`);

--
-- Indexes for table `tbtintuc`
--
ALTER TABLE `tbtintuc`
  ADD PRIMARY KEY (`id`),
  ADD KEY `LoaiTin` (`LoaiTin`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbcategory`
--
ALTER TABLE `tbcategory`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `tbchitiethoadon`
--
ALTER TABLE `tbchitiethoadon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT for table `tbhoadon`
--
ALTER TABLE `tbhoadon`
  MODIFY `mahd` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `tbloaitin`
--
ALTER TABLE `tbloaitin`
  MODIFY `LoaiTin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbnhanvien`
--
ALTER TABLE `tbnhanvien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbnhomsp`
--
ALTER TABLE `tbnhomsp`
  MODIFY `manhom` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tbquantri`
--
ALTER TABLE `tbquantri`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbsanpham`
--
ALTER TABLE `tbsanpham`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbtintuc`
--
ALTER TABLE `tbtintuc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbchitiethoadon`
--
ALTER TABLE `tbchitiethoadon`
  ADD CONSTRAINT `tbchitiethoadon_ibfk_1` FOREIGN KEY (`mahd`) REFERENCES `tbhoadon` (`mahd`),
  ADD CONSTRAINT `tbchitiethoadon_ibfk_2` FOREIGN KEY (`idsp`) REFERENCES `tbsanpham` (`id`);

--
-- Constraints for table `tbsanpham`
--
ALTER TABLE `tbsanpham`
  ADD CONSTRAINT `tbsanpham_ibfk_1` FOREIGN KEY (`manhom`) REFERENCES `tbnhomsp` (`manhom`);

--
-- Constraints for table `tbtintuc`
--
ALTER TABLE `tbtintuc`
  ADD CONSTRAINT `tbtintuc_ibfk_1` FOREIGN KEY (`LoaiTin`) REFERENCES `tbloaitin` (`LoaiTin`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
