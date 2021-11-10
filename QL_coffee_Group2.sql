create database QL_coffee_Group2;
use QL_coffee_Group2;

create table NhanVien 
(
	MaNV nvarchar(50) not null,
	TenNV nvarchar(50) not null,
	GioiTinh bit not null,
	ChucVu nvarchar(50) not null,
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
	NgayLV date null,
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