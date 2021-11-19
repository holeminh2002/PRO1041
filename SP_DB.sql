drop proc sp_doanhthu
Create proc sp_doanhthu(@year int)
as begin
 select 
	MaHD ,
	MaNV ,
	MaKH ,
	NgayInHD ,
	TongTien,
	DiemTichLuy ,
	GiamGia ,
	TienKhachDua ,
	TienThua ,
	MaKM 
  from hoadon  
 where year(NgayInHD) = @year    
end

drop proc sp_khachhang
create proc sp_khachhang(@thang int)
as begin
	Select CONVERT(varchar,HD.NgayInHD, 103) as NgayInHD,
	HD.MaKH as MaKH,
	KH.TenKH as TenKH,
	CT.SoLuong as SoLuong, 
	KH.DiemTichLuy as DiemTichLuy, 
	KH.MaLoaiKH as MaLoaiKH
	from HoaDon HD
	inner join KhachHang KH on HD.MaKH = KH.MaKH
	inner join ChiTietBanHang CT on CT.MaHD = HD.MaHD
	where MONTH(HD.NgayInHD) = @thang
end

create proc sp_sanpham(@thang int)
as begin
	Select CONVERT(varchar,HD.NgayInHD, 103) as NgayInHD,
	LSP.TenLoaiSP as TenLoaiSP,
	SP.MaSP as MaSP,
	SP.TenSP as TenSP,
	CT.SoLuong as SoLuong
	from HoaDon HD
	inner join ChiTietBanHang CT on HD.MaHD = CT.MaHD
	inner join SanPham SP on SP.MaSP = CT.MaSP
	inner join LoaiSanPham LSP on LSP.MaLoaiSP = SP.MaLoaiSP
	where MONTH(HD.NgayInHD) = @thang
end




