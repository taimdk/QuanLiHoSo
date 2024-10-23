create database quanlihoso2;

use quanlihoso2;

CREATE TABLE Account (
  fullName VARCHAR(50),
  userName VARCHAR(50) NOT NULL,
  password VARCHAR(60),
  role VARCHAR(50),
  status INT DEFAULT NULL,
  email VARCHAR(50),
  PRIMARY KEY (userName)
);

CREATE TABLE HoSo (
  maHoSo VARCHAR(50) NOT NULL,
  tenNguoi VARCHAR(100) DEFAULT NULL,
  tuoi INT NOT NULL DEFAULT 0,
  diaChi VARCHAR(50) NOT NULL DEFAULT '0',
  sdt VARCHAR(50) NOT NULL DEFAULT '0',
  email VARCHAR(50),
  CMND DOUBLE NOT NULL DEFAULT 0,
  lichSuBenhLi VARCHAR(50),
  lieuLuongThuocDaDung INT DEFAULT NULL,
  loaiHoSo VARCHAR(50),
  kinhNghiemLamViec VARCHAR(50),
  thuNhap DOUBLE DEFAULT NULL,
  taiSanHienCo VARCHAR(50),
  soThich VARCHAR(50),
  trangThai INT DEFAULT NULL,
  PRIMARY KEY (maHoSo)
);

CREATE TABLE NhanVien (
  maNhanVien VARCHAR(50) NOT NULL,
  tenNhanVien VARCHAR(50),
  Sdt VARCHAR(50),
  congViec VARCHAR(150),
  PRIMARY KEY (maNhanVien)
);

CREATE TABLE PhieuNhapHoSo (
  maPhieu VARCHAR(50) NOT NULL,
  thoiGianTao TIMESTAMP DEFAULT NULL,
  nguoiTao VARCHAR(50),
  maNhanVien VARCHAR(50),
  tongThoiGianLamViec DOUBLE NOT NULL,
  PRIMARY KEY (maPhieu),
  FOREIGN KEY (maNhanVien) REFERENCES NhanVien(maNhanVien) ON DELETE NO ACTION ON UPDATE NO ACTION,
  FOREIGN KEY (nguoiTao) REFERENCES Account(userName) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE PhieuXuatHoSo (
  maPhieu VARCHAR(50) NOT NULL,
  thoiGianTao TIMESTAMP DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP(),
  nguoiTao VARCHAR(50),
  tongThoiGianLamViec DOUBLE NOT NULL,
  PRIMARY KEY (maPhieu),
  FOREIGN KEY (nguoiTao) REFERENCES Account(userName) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE ChiTietPhieuNhapHoSo (
  maPhieu VARCHAR(50) NOT NULL,
  maHoSo VARCHAR(50) NOT NULL,
  soLuong INT DEFAULT NULL,
  donGia DOUBLE DEFAULT NULL,
  PRIMARY KEY (maPhieu, maHoSo),
  FOREIGN KEY (maPhieu) REFERENCES PhieuNhapHoSo(maPhieu) ON DELETE NO ACTION ON UPDATE NO ACTION,
  FOREIGN KEY (maHoSo) REFERENCES HoSo(maHoSo) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE ChiTietPhieuXuatHoSo (
  maPhieu VARCHAR(50) NOT NULL,
  maHoSo VARCHAR(50) NOT NULL,
  soLuong INT DEFAULT NULL,
  donGia DOUBLE DEFAULT NULL,
  PRIMARY KEY (maPhieu, maHoSo),
  FOREIGN KEY (maPhieu) REFERENCES PhieuXuatHoSo(maPhieu) ON DELETE NO ACTION ON UPDATE NO ACTION,
  FOREIGN KEY (maHoSo) REFERENCES HoSo(maHoSo) ON DELETE NO ACTION ON UPDATE NO ACTION
);

INSERT INTO Account (fullName, userName, password, role, status, email) VALUES 
('Admin', 'admin', '123456', 'Admin', 1, 'nhatbach@gmail.com'),
('Trương Đan Huy', 'danhuy', '123456', 'Nhân viên nhập', 1, 'danhuy@gmail.com'),
('Nguyễn Nhật Bách', 'nhatbach', '123456', 'Nhân viên nhập', 1, 'bachnguyen@gmail.com'),
('Lô Minh Hiếu', 'minhhieu', '123456', 'Quản lý kho', 1, 'minhhieu@gmail.com'),
('Đinh Minh Tài', 'minhtai', '123456', 'Quản lý kho', 1, 'minhtai@gmail.com'),
('Nguyễn Thiên Ân', 'thienan', '123456', 'Nhân viên nhập', 1, 'thienan@gmail.com');
       

INSERT INTO HoSo (maHoSo, tenNguoi, tuoi, diaChi, sdt, email, CMND, lichSuBenhLi, lieuLuongThuocDaDung, loaiHoSo, kinhNghiemLamViec, thuNhap, taiSanHienCo, soThich , trangThai) VALUES 

('HS1','Robert',40,'456 Park Avenue, City','0987 123 456','robert@example.com',987654321,NULL,NULL,'Tài chính','15 năm',60000,'120000 USD','Chơi guitar, đọc sách',1),
('HS2','Alice',35,'123 Main Street, City','0123 456 789','alice@example.com',123456789,NULL,NULL,'Tài chính','10 năm',50000,'100000 USD','Đọc sách, nấu ăn',1),
('HS3','Emily',28,'789 Broadway, City','0123 789 456','emily@example.com',654987321,'Asthma',1,'Y tế','5 năm',NULL,NULL,'Chạy bộ, xem phim',1),
('HS4','Wilson',35,'123 Main Street, City','0123 456 789','nguyenvana@example.com',123456789,NULL,NULL,'Tài chính','10 năm',50000,'100000 USD','Đọc sách, nấu ăn',1),
('HS5','Smith',28,'789 Broadway, City','0123 789 456','tranthib@example.com',654987321,'Asthma',1,'Y tế','5 năm',NULL,NULL,'Chạy bộ, xem phim',1),
('HS6','Johnson',35,'123 Main Street, City','0123 456 789','phamvanc@example.com',123456789,NULL,NULL,'Tài chính','10 năm',50000,'100000 USD','Đọc sách, nấu ăn',1),
('HS7','Brown',28,'789 Broadway, City','0123 789 456','lethid@example.com',654987321,'Asthma',1,'Y tế','5 năm',NULL,NULL,'Chạy bộ, xem phim',1),
('HS8','Miller',35,'123 Main Street, City','0123 456 789','hoangve@example.com',123456789,NULL,NULL,'Tài chính','10 năm',50000,'100000 USD','Đọc sách, nấu ăn',1),
('HS9','Jhon',28,'789 Broadway, City','0123 789 456','nguyenthif@example.com',654987321,'Asthma',1,'Y tế','5 năm',NULL,NULL,'Chạy bộ, xem phim',1),
('HS10','Nayson',28,'789 Broadway, City','0123 789 456','emily@example.com',654987321,'Asthma',1,'Y tế','5 năm',NULL,NULL,'Chạy bộ, xem phim',1);


INSERT INTO NhanVien (maNhanVien, tenNhanVien, Sdt, congViec) VALUES 
('NV1', 'David', '0123 456 789', 'Quản lý nhân sự'),
('NV2', 'Alice', '0987 321 654', 'Quản lý sản xuất'),
('NV3', 'Miller', '0123 456 789', 'Quản lý hồ sơ'),
('NV4', 'Nayson', '0987 321 654', 'Nhân viên sản xuất'),
('NV5', 'Emily', '0123 456 789', 'Quản lý hồ sơ'),
('NV6', 'Jessica', '0987 321 654', 'Quản lý sản xuất'),
('NV7', 'Jhon', '0123 456 789', 'Nhân viên sản xuất'),
('NV8', 'Miller', '0987 321 654', 'Quản lý sản xuất'),
('NV9', 'David', '0123 456 789', 'Nhân viên sản xuất'),
('NV10', 'Brown', '0987 321 654', 'Quản lý hồ sơ');

INSERT INTO PhieuNhapHoSo (maPhieu, thoiGianTao, nguoiTao, maNhanVien, tongThoiGianLamViec)
VALUES ('PN1', '2024-03-27 10:00:00', 'thienan', 'NV4', 6.75),
       ('PN2', '2024-03-26 09:30:00', 'thienan', 'NV3', 7.0);

INSERT INTO PhieuXuatHoSo (maPhieu, thoiGianTao, nguoiTao, tongThoiGianLamViec)
VALUES ('PX1', '2024-03-25 12:45:00', 'thienan', 8.25),
       ('PX2', '2024-03-24 14:15:00', 'thienan', 9.5);
       
INSERT INTO ChiTietPhieuNhapHoSo (maPhieu, maHoSo, soLuong, donGia) VALUES 
('PN1', 'HS1', 1, 23490000),
('PN2', 'HS1', 1, 16490000);
       
INSERT INTO ChiTietPhieuXuatHoSo (maPhieu, maHoSo, soLuong, donGia) VALUES 
('PX1', 'HS2', 1, 23490000),
('PX2', 'HS2', 1, 20790000);



