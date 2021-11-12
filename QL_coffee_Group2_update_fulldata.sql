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
delete NhanVien;
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'NV01_Hue',N'Bùi Thị A Huệ',0,N'Bình Định',N'0327705273','huebui01@gmail.com','2020-11-20',0,N'ahue123',N'hue.jpg');
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'NV02_Khanh',N'Nguyễn Phương Khanh',0,N'Tiền Giang',N'0834461707','khanhnguyen02@gmail.com','2020-10-20',0,N'pkhanh123',N'khanh.jpg');
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'NV03_Minh',N'Hồ Lê Minh',1,N'TP Hồ Chí Minh',N'0333861969','leminh03@gmail.com','2020-09-20',0,N'lminh123',N'minh.jpg');
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'NV04_Nhat',N'Nguyễn Minh Nhật',1,N'Cần Thơ',N'0336256986','nhatnguyen04@gmail.com','2020-08-20',0,N'mnhat123',N'nhat.jpg');
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'NV05_Kha',N'Phạm Trần Nam Kha',1,N'TP Bảo Lộc',N'0230598612','khapham05@gmail.com','2020-07-20',0,N'nkha123',N'kha.jpg');
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'TP_Thuong',N'Nguyễn Thị Mai Thương',0,N'TP Đà Lạt',N'0911257233','thuongnguyentp@gmail.com','2019-11-20',1,N'mthuong123',N'thuong.jpg');

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
insert into LoaiSanPham(MaLoaiSP,TenLoaiSP,MoTa) values ('CAFFE',N'Cà phê',N'...');
insert into LoaiSanPham(MaLoaiSP,TenLoaiSP,MoTa) values ('DOUONG',N'Đồ uống',N'Nước giải khát, Soda,...');
insert into LoaiSanPham(MaLoaiSP,TenLoaiSP,MoTa) values ('DONGOT',N'Đồ ngọt',N'Bánh kem các loại,..');
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
insert into SanPham(MaSP,TenSP,MaLoaiSP,HinhAnh,Gia) values('TS01',N'Trà Sữa Yummy','DOUONG',N'trasua1.jpg',40000);
insert into SanPham(MaSP,TenSP,MaLoaiSP,HinhAnh,Gia) values('TS02',N'Trà Sữa trân châu Yummy','DOUONG',N'trasua2.jpg',45000);
insert into SanPham(MaSP,TenSP,MaLoaiSP,HinhAnh,Gia) values('BN01',N'Bánh kem sữa','DONGOT',N'banhngot1.jpg',100000);
insert into SanPham(MaSP,TenSP,MaLoaiSP,HinhAnh,Gia) values('BN02',N'Bánh kem Socola','DONGOT',N'banhngot3.jpg',120000);
insert into SanPham(MaSP,TenSP,MaLoaiSP,HinhAnh,Gia) values('BN03',N'Bánh kem','DONGOT',N'banhngot2.jpg',110000);
insert into SanPham(MaSP,TenSP,MaLoaiSP,HinhAnh,Gia) values('CF01',N'Caffee Đen','CAFFE',N'cafe2.jpg',45000);
insert into SanPham(MaSP,TenSP,MaLoaiSP,HinhAnh,Gia) values('CF02',N'Caffee Bọt Biển','CAFFE',N'cafe1.jpg',50000);
insert into SanPham(MaSP,TenSP,MaLoaiSP,HinhAnh,Gia) values('NGK01',N'Mirinda Soda Kem','DOUONG',N'ngk1.jpg',20000);
insert into SanPham(MaSP,TenSP,MaLoaiSP,HinhAnh,Gia) values('NGK02',N'CoCa CoLa','DOUONG',N'ngk2.jpg',20000);

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
delete from NhanVien;
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'NV01_Hue',N'Bùi Thị A Huệ',0,N'Bình Định',N'0327705273','huebui01@gmail.com','2020-11-20',0,N'ahue123',N'hue.jpg');
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'NV02_Khanh',N'Nguyễn Phương Khanh',0,N'Tiền Giang',N'0834461707','khanhnguyen02@gmail.com','2020-10-20',0,N'pkhanh123',N'khanh.jpg');
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'NV03_Minh',N'Hồ Lê Minh',1,N'TP Hồ Chí Minh',N'0333861969','leminh03@gmail.com','2020-09-20',0,N'lminh123',N'minh.jpg');
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'NV04_Nhat',N'Nguyễn Minh Nhật',1,N'Cần Thơ',N'0336256986','nhatnguyen04@gmail.com','2020-08-20',0,N'mnhat123',N'nhat.jpg');
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'NV05_Kha',N'Phạm Trần Nam Kha',1,N'TP Bảo Lộc',N'0230598612','khapham05@gmail.com','2020-07-20',0,N'nkha123',N'kha.jpg');
insert into NhanVien(MaNV,TenNV,GioiTinh,DiaChi,SDT,Email,NgayVaoLam,VaiTro,MatKhau,Hinh) values(N'TP_Thuong',N'Nguyễn Thị Mai Thương',0,N'TP Đà Lạt',N'0911257233','thuongnguyentp@gmail.com','2019-11-20',1,N'mthuong123',N'thuong.jpg');

insert KhuyenMai values ('01','11.11',0.2,'2021-11-11','2021-11-13','khuyen mai 11.11'),
('02','The Sinh Vien',0.2,'2021-01-01','2022-01-01','khuyen mai the sinh vien'),
('03','20.11',0.2,'2021-11-11','2021-11-13','khuyen mai 20.11');

insert LoaiKhachHang values('VIP',N'Khách hàng VIP', 1000),
('DIAMOND',N'Khách hàng Kim Cương', 800),
('GOLD',N'Khách hàng Vàng', 600),
('SILVER',N'Khách hàng Bạc', 400);

insert KhachHang values('VIP', N'Lý Thường Kiệt', 'q9, tp.HCM','kiet@gmail.com','0123456789',2000);
insert KhachHang values('VIP', N'Lê Đại Hành', 'q1, tp.HCM','hanh@gmail.com','0123456788',3000),
('VIP', N'Trần Nhân Tông', 'q.Bình Thạnh, tp.HCM','tong@gmail.com','012345677',1000),
('DIAMOND', N'Lê Đại Hành', 'q2, tp.HCM','hanh@gmail.com','0123456788',2400),
('DIAMOND', N'Phan Đình Giót', 'q.Gò Vấp, tp.HCM','giot@gmail.com','012345676',800),
('DIAMOND', N'Hoàng Diệu', 'q3, tp.HCM','dieu@gmail.com','0123456785',3200),
('GOLD', N'Võ Thị Sáu', 'q.4, tp.HCM','sau@gmail.com','012345674',1200),
('GOLD', N'Hồ Xuân Mai', 'q5, tp.HCM','mai@gmail.com','0123456783',600),
('GOLD', N'Tưởng Giới Thạch', 'h.Hóc Môn, tp.HCM','thach@gmail.com','012345672',1200),
('SILVER', N'Nguyễn Du', 'q6, tp.HCM','du@gmail.com','0123456781',400),
('SILVER', N'Hồ Xuân Hương', 'h.Củ Chi, tp.HCM','huong@gmail.com','012345670',800),
('SILVER', N'Cù Thiện Ân', 'q1, tp.HCM','an@gmail.com','0123456710',1600),
('SILVER', N'Vũ Thị Giáng Hương', 'q.2, tp.HCM','huongg@gmail.com','012345611',2400);

insert HoaDon values('NV01_Hue', 1,'2021-10-01',500000,2000,null,1000000,500000,null);
insert HoaDon values('NV02_Khanh', 4,'2021-10-02',20000,2400,null,100000,80000,null),
('NV03_Minh', 7,'2021-10-03',100000,1200,null,100000,0,null);

insert ChiTietBanHang values (2,'CF02',10),
(5,'NGK01',1),
(6,'BN01',1);

insert CaLamViec values('CS1',N'Ca sáng 1',6,10,80000),
('CS2',N'Ca sáng 2',10,14,80000),
('CC1',N'Ca chiều 1',14,18,80000),
('CC2',N'Ca chiều 2',18,22,80000),
('CT1',N'Ca tối 1',22,2,100000),
('CT2',N'Ca tối 2',2,6,100000);

insert ChiTietLuongNhanVien values('CS1','NV01_Hue',30,2400000,N'Tháng 10/2021'),
('CS1','NV02_Khanh',20,1600000,N'Tháng 10/2021'),
('CS2','NV03_Minh',28,2240000,N'Tháng 10/2021'),
('CC1','NV04_Nhat',25,2000000,N'Tháng 10/2021'),
('CC2','NV05_Kha',10,800000,N'Tháng 10/2021'),
('CT1','TP_Thuong',10,1000000,N'Tháng 10/2021');