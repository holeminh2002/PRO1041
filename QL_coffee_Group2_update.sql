create database QL_coffee_Group2_update;
use QL_coffee_Group2_update;

create table NhanVien 
(
	MaNV nvarchar(50) not null,
	TenNV nvarchar(50) not null,
	GioiTinh bit not null,
	DiaChi nvarchar(50) not null,
	SDT nvarchar(50) not null,
	Email varchar(50) not null,
	NgayVaoLam Date not null,
	VaiTro bit not null,
	MatKhau nvarchar(50) not null,
	Hinh nvarchar(50) not null,
	primary key (MaNV)
);

create table LoaiKhachHang 
(
	MaLoaiKH varchar(50) not null,
	TenLoaiKH nvarchar(50) not null,
	DiemTichLuy int not null,
	primary key (MaLoaiKH)
);

create table KhachHang 
(
	MaKH int identity(1,1) not null,
	MaLoaiKH varchar(50) not null,
	TenKH nvarchar(50) not null,
	DiaChi nvarchar(50) not null,
	Email nvarchar(50) not null,
	SDT nvarchar(50) not null,
	DiemTichLuy float not null,
	primary key (MaKH),
	foreign key(MaLoaiKH) references LoaiKhachHang(MaLoaiKH) on delete no action on update cascade
);	

create table LoaiSanPham 
(
	MaLoaiSP varchar(50) not null,
	TenLoaiSP nvarchar(150) not null,
	MoTa nvarchar(150) not null,
	primary key (MaLoaiSP)
);	

create table SanPham 
(
	MaSP varchar(50) not null,
	TenSP nvarchar(150) not null,
	MaLoaiSP varchar(50) not null,
	HinhAnh nvarchar(50) not null,
	Gia float not null,
	primary key (MaSP),
	foreign key(MaLoaiSP) references LoaiSanPham(MaLoaiSP) on delete no action on update cascade
);	

create table CaLamViec
(
	MaCaLV varchar(50) not null,
	TenCaLV nvarchar(50) not null,
	GioBD int not null,
	GioKT int not null,
	SoTien float not null,
	primary key (MaCaLV)
);	

create table ChiTietLuongNhanVien 
(
	MaCaLV varchar(50) not null,
	MaNV nvarchar(50) not null,
	TongSoCaLamTrongThang int not null,
	ThanhTien float not null,
	KyLuong nvarchar(50) null,
	foreign key(MaCaLV) references CaLamViec(MaCaLV) on delete no action on update cascade,
	foreign key(MaNV) references NhanVien(MaNV) on delete no action on update cascade
);	

create table KhuyenMai
(
	MaKM varchar(50) not null,
	TenKM nvarchar(150) not null,
	GiamGia float not null,
	NgayBatDau date not null,
	NgayKetThuc date not null,
	Mota varchar(100) not null,
	primary key (MaKM)
);	

create table HoaDon 
(
	MaHD int identity(1,1) not null,
	MaNV nvarchar(50) not null,
	MaKH int not null,
	NgayInHD Date not null,
	TongTien float null,
	DiemTichLuy float null,
	GiamGia float null,
	TienKhachDua float not null,
	TienThua float not null,
	MaKM varchar(50) null,
	primary key (MaHD),
	foreign key(MaNV) references NhanVien(MaNV) on delete no action on update cascade,
	foreign key(MaKH) references KhachHang(MaKH) on delete no action on update cascade,
	foreign key(MaKM) references KhuyenMai(MaKM) on delete no action on update cascade
);	

create table ChiTietBanHang
(
	MaHD int not null,
	MaSP varchar(50) not null,
	SoLuong float not null,
	foreign key(MaHD) references HoaDon(MaHD) on delete no action on update cascade,
	foreign key(MaSP) references SanPham(MaSP) on delete no action on update cascade
);	

insert NhanVien values ('nv01-hoa', 'Nguyen Thi Hoa', 0, N'Hà Huy Giáp, q12', '0123456789', 'hoa@gmail.com', '2021-11-10', 0, '123','hue.jpg'),
('nv02-huong', 'Nguyen Thi Huong', 0, N'Hà Huy Giáp, q2', '0123456709', 'huong@gmail.com', '2021-01-10', 0, '123','khanh.jpg'),
('tp01-phong', 'Tran Truong Phong', 0, N'Đồng Văn Cống, q2', '9123456789', 'phong@gmail.com', '2021-11-10', 1, '456','minh.jpg');

insert KhuyenMai values ('01','11.11',0.2,'2021-11-11','2021-11-13','khuyen mai 11.11'),
('02','The Sinh Vien',0.2,'2021-01-01','2022-01-01','khuyen mai the sinh vien'),
('03','20.11',0.2,'2021-11-11','2021-11-13','khuyen mai 20.11');