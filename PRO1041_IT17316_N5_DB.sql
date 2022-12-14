USE [master]
GO
/****** Object:  Database [PRO1041_IT17316_N5]    Script Date: 19/11/2022 9:53:35 CH ******/
CREATE DATABASE [PRO1041_IT17316_N5]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'PRO1041_IT17316_N5', FILENAME = N'C:\Program Files\Microsoft SQL Server 2019 Express\MSSQL15.SQLEXPRESS\MSSQL\DATA\PRO1041_IT17316_N5.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'PRO1041_IT17316_N5_log', FILENAME = N'C:\Program Files\Microsoft SQL Server 2019 Express\MSSQL15.SQLEXPRESS\MSSQL\DATA\PRO1041_IT17316_N5_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [PRO1041_IT17316_N5].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET ARITHABORT OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET  DISABLE_BROKER 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET  MULTI_USER 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET DB_CHAINING OFF 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET QUERY_STORE = OFF
GO
USE [PRO1041_IT17316_N5]
GO
/****** Object:  Table [dbo].[ChatLieu]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChatLieu](
	[MaCL] [varchar](7) NOT NULL,
	[TenCL] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_ChatLieu] PRIMARY KEY CLUSTERED 
(
	[MaCL] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DonDatHang]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DonDatHang](
	[MaDDH] [varchar](7) NOT NULL,
	[NgayTao] [date] NOT NULL,
	[MaNV] [varchar](7) NOT NULL,
	[MaNCC] [varchar](7) NOT NULL,
 CONSTRAINT [PK_DonDatHang] PRIMARY KEY CLUSTERED 
(
	[MaDDH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [varchar](7) NOT NULL,
	[NgayTao] [date] NOT NULL,
	[TrangThai] [nvarchar](20) NOT NULL,
	[MaNV] [varchar](7) NOT NULL,
	[MaKH] [varchar](7) NOT NULL,
	[MaKM] [varchar](7) NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[MaHDCT] [varchar](7) NOT NULL,
	[NgayTao] [date] NOT NULL,
	[MaMH] [varchar](7) NOT NULL,
	[SoLuong] [int] NOT NULL,
	[DonGia] [int] NOT NULL,
	[MaHD] [varchar](7) NOT NULL,
 CONSTRAINT [PK_HoaDonChiTiet] PRIMARY KEY CLUSTERED 
(
	[MaHDCT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [varchar](7) NOT NULL,
	[TenKH] [nvarchar](50) NOT NULL,
	[DiaChi] [nvarchar](100) NOT NULL,
	[SDT] [varchar](11) NOT NULL,
	[MaTK] [varchar](7) NOT NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuyenMai]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuyenMai](
	[MaKM] [varchar](7) NOT NULL,
	[MucKM] [float] NOT NULL,
 CONSTRAINT [PK_KhuyenMai] PRIMARY KEY CLUSTERED 
(
	[MaKM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiHang]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiHang](
	[MaLoai] [varchar](7) NOT NULL,
	[MaNCC] [varchar](7) NOT NULL,
	[TenLoai] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_LoaiHang] PRIMARY KEY CLUSTERED 
(
	[MaLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Luong]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Luong](
	[MaLuong] [varchar](7) NOT NULL,
	[SoLuong] [int] NOT NULL,
 CONSTRAINT [PK_Luong] PRIMARY KEY CLUSTERED 
(
	[MaLuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MatHang]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MatHang](
	[MaMH] [varchar](7) NOT NULL,
	[TenMH] [nvarchar](120) NOT NULL,
	[MaLoai] [varchar](7) NOT NULL,
	[MaCL] [varchar](7) NOT NULL,
	[Size] [varchar](5) NOT NULL,
	[DonGia] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[Mota] [nvarchar](255) NULL,
	[DanhGia] [nvarchar](100) NULL,
 CONSTRAINT [PK_MatHang] PRIMARY KEY CLUSTERED 
(
	[MaMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[MaNCC] [varchar](7) NOT NULL,
	[Ten] [nvarchar](50) NOT NULL,
	[DiaChi] [nvarchar](100) NOT NULL,
	[SDT] [varchar](11) NOT NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[MaNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [varchar](7) NOT NULL,
	[TenNV] [nvarchar](50) NOT NULL,
	[SDT] [varchar](11) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[MaLuong] [varchar](7) NOT NULL,
	[MaTK] [varchar](7) NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 19/11/2022 9:53:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[MaTK] [varchar](7) NOT NULL,
	[Email] [nvarchar](25) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	[LoaiTK] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[MaTK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChatLieu] ([MaCL], [TenCL]) VALUES (N'CL1', N'ChatLieu A')
INSERT [dbo].[ChatLieu] ([MaCL], [TenCL]) VALUES (N'CL2', N'ChatLieu B')
INSERT [dbo].[ChatLieu] ([MaCL], [TenCL]) VALUES (N'CL3', N'ChatLieuC')
GO
INSERT [dbo].[HoaDon] ([MaHD], [NgayTao], [TrangThai], [MaNV], [MaKH], [MaKM]) VALUES (N'HD01', CAST(N'2020-10-19' AS Date), N'Da Thanh Toan', N'NV01', N'KH02', N'KM01')
INSERT [dbo].[HoaDon] ([MaHD], [NgayTao], [TrangThai], [MaNV], [MaKH], [MaKM]) VALUES (N'HD02', CAST(N'2020-10-23' AS Date), N'Cho Thanh Toan', N'NV02', N'KH05', N'KM50')
INSERT [dbo].[HoaDon] ([MaHD], [NgayTao], [TrangThai], [MaNV], [MaKH], [MaKM]) VALUES (N'HD03', CAST(N'2020-10-29' AS Date), N'Da Thanh Toan', N'NV03', N'KH01', N'KM100')
INSERT [dbo].[HoaDon] ([MaHD], [NgayTao], [TrangThai], [MaNV], [MaKH], [MaKM]) VALUES (N'HD04', CAST(N'2020-11-01' AS Date), N'Da Thanh Toan', N'NV02', N'KH04', N'KM10')
INSERT [dbo].[HoaDon] ([MaHD], [NgayTao], [TrangThai], [MaNV], [MaKH], [MaKM]) VALUES (N'HD05', CAST(N'2020-11-03' AS Date), N'Cho Thanh Toan', N'NV01', N'KH03', N'KM50')
INSERT [dbo].[HoaDon] ([MaHD], [NgayTao], [TrangThai], [MaNV], [MaKH], [MaKM]) VALUES (N'HD06', CAST(N'2020-11-05' AS Date), N'Da Thanh Toan', N'NV03', N'KH06', N'KM10')
GO
INSERT [dbo].[HoaDonChiTiet] ([MaHDCT], [NgayTao], [MaMH], [SoLuong], [DonGia], [MaHD]) VALUES (N'HDCT01', CAST(N'2020-10-19' AS Date), N'MH01', 1, 699000, N'HD01')
INSERT [dbo].[HoaDonChiTiet] ([MaHDCT], [NgayTao], [MaMH], [SoLuong], [DonGia], [MaHD]) VALUES (N'HDCT02', CAST(N'2020-10-23' AS Date), N'MH02', 2, 438000, N'HD02')
INSERT [dbo].[HoaDonChiTiet] ([MaHDCT], [NgayTao], [MaMH], [SoLuong], [DonGia], [MaHD]) VALUES (N'HDCT03', CAST(N'2020-10-29' AS Date), N'MH05', 1, 289000, N'HD03')
INSERT [dbo].[HoaDonChiTiet] ([MaHDCT], [NgayTao], [MaMH], [SoLuong], [DonGia], [MaHD]) VALUES (N'HDCT04', CAST(N'2020-11-01' AS Date), N'MH03', 3, 567000, N'HD04')
INSERT [dbo].[HoaDonChiTiet] ([MaHDCT], [NgayTao], [MaMH], [SoLuong], [DonGia], [MaHD]) VALUES (N'HDCT05', CAST(N'2020-11-03' AS Date), N'MH06', 3, 1317000, N'HD05')
INSERT [dbo].[HoaDonChiTiet] ([MaHDCT], [NgayTao], [MaMH], [SoLuong], [DonGia], [MaHD]) VALUES (N'HDCT06', CAST(N'2020-11-05' AS Date), N'MH04', 1, 159000, N'HD06')
GO
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [DiaChi], [SDT], [MaTK]) VALUES (N'KH01', N'Duong Toan', N'An Thi, Hung Yen', N'0372732721', N'TK1')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [DiaChi], [SDT], [MaTK]) VALUES (N'KH02', N'Thi Huong', N'Thu Duc, Ha Noi', N'0498731213', N'TK2')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [DiaChi], [SDT], [MaTK]) VALUES (N'KH03', N'Trieu Van', N'Dong Da, Ha Noi', N'0989752175', N'TK3')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [DiaChi], [SDT], [MaTK]) VALUES (N'KH04', N'Thuy Kieu', N'My Dinh', N'0739628974', N'TK4')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [DiaChi], [SDT], [MaTK]) VALUES (N'KH05', N'Thuy Van', N'Tay Ho, Ha Noi', N'0739658882', N'TK5')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [DiaChi], [SDT], [MaTK]) VALUES (N'KH06', N'Nam Cao', N'Hoang Mai, Ha Noi', N'0735228764', N'TK6')
GO
INSERT [dbo].[KhuyenMai] ([MaKM], [MucKM]) VALUES (N'KM01', 0)
INSERT [dbo].[KhuyenMai] ([MaKM], [MucKM]) VALUES (N'KM10', 10000)
INSERT [dbo].[KhuyenMai] ([MaKM], [MucKM]) VALUES (N'KM100', 100000)
INSERT [dbo].[KhuyenMai] ([MaKM], [MucKM]) VALUES (N'KM50', 50000)
GO
INSERT [dbo].[LoaiHang] ([MaLoai], [MaNCC], [TenLoai]) VALUES (N'LH01', N'NCC1', N'Set')
INSERT [dbo].[LoaiHang] ([MaLoai], [MaNCC], [TenLoai]) VALUES (N'LH02', N'NCC2', N'Ao')
INSERT [dbo].[LoaiHang] ([MaLoai], [MaNCC], [TenLoai]) VALUES (N'LH03', N'NCC3', N'Quan')
GO
INSERT [dbo].[Luong] ([MaLuong], [SoLuong]) VALUES (N'L01', 3500000)
INSERT [dbo].[Luong] ([MaLuong], [SoLuong]) VALUES (N'L02', 4200000)
INSERT [dbo].[Luong] ([MaLuong], [SoLuong]) VALUES (N'L03', 1900000)
GO
INSERT [dbo].[MatHang] ([MaMH], [TenMH], [MaLoai], [MaCL], [Size], [DonGia], [SoLuong], [Mota], [DanhGia]) VALUES (N'MH01', N'Set Vest Caro', N'LH01', N'CL2', N'M', 699000, 10, N'Set Vest Caro Hang LoaiA', N'5')
INSERT [dbo].[MatHang] ([MaMH], [TenMH], [MaLoai], [MaCL], [Size], [DonGia], [SoLuong], [Mota], [DanhGia]) VALUES (N'MH02', N'Quan Kaki Cong So', N'LH03', N'CL1', N'S', 219000, 15, N'Quan Kaki Cong So Size S', N'4,5')
INSERT [dbo].[MatHang] ([MaMH], [TenMH], [MaLoai], [MaCL], [Size], [DonGia], [SoLuong], [Mota], [DanhGia]) VALUES (N'MH03', N'Quan Thun Cong So Co Tui', N'LH03', N'CL2', N'M', 189000, 13, N'Quan Thun Cong So Co Tui size M', N'5')
INSERT [dbo].[MatHang] ([MaMH], [TenMH], [MaLoai], [MaCL], [Size], [DonGia], [SoLuong], [Mota], [DanhGia]) VALUES (N'MH04', N'Áo sơ mi công sở có cổ', N'LH02', N'CL3', N'L', 159000, 21, N'Áo sơ mi công sở có cổ size L', N'4')
INSERT [dbo].[MatHang] ([MaMH], [TenMH], [MaLoai], [MaCL], [Size], [DonGia], [SoLuong], [Mota], [DanhGia]) VALUES (N'MH05', N'Áo Polo công sở', N'LH02', N'CL1', N'M', 289000, 16, N'Áo Polo công sở', N'5')
INSERT [dbo].[MatHang] ([MaMH], [TenMH], [MaLoai], [MaCL], [Size], [DonGia], [SoLuong], [Mota], [DanhGia]) VALUES (N'MH06', N'Set Quần Áo sơ mi công sở', N'LH01', N'CL1', N'L', 439000, 12, N'Set Quần Áo sơ mi công sở', N'4,5')
GO
INSERT [dbo].[NhaCungCap] ([MaNCC], [Ten], [DiaChi], [SDT]) VALUES (N'NCC1', N'Hoang Kha', N'Trinh Van Bo, Ha Noi', N'0372572571')
INSERT [dbo].[NhaCungCap] ([MaNCC], [Ten], [DiaChi], [SDT]) VALUES (N'NCC2', N'Thuy Cam', N'Gia Lam, Ha Noi', N'0979852551')
INSERT [dbo].[NhaCungCap] ([MaNCC], [Ten], [DiaChi], [SDT]) VALUES (N'NCC3', N'Dinh Vuong', N'Xuan Thuy, Ha Noi', N'0969522321')
GO
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SDT], [NgaySinh], [MaLuong], [MaTK]) VALUES (N'NV01', N'Minh Hang', N'0372582581', CAST(N'2001-09-19' AS Date), N'L02', N'TN1')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SDT], [NgaySinh], [MaLuong], [MaTK]) VALUES (N'NV02', N'Hoang Tuan', N'0979550970', CAST(N'1999-12-18' AS Date), N'L01', N'TN2')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SDT], [NgaySinh], [MaLuong], [MaTK]) VALUES (N'NV03', N'Kha Nam', N'0873212551', CAST(N'2002-05-21' AS Date), N'L03', N'TN3')
GO
INSERT [dbo].[TaiKhoan] ([MaTK], [Email], [Password], [LoaiTK]) VALUES (N'TK1', N'k1@gmail.com', N'2234', N'khachhang')
INSERT [dbo].[TaiKhoan] ([MaTK], [Email], [Password], [LoaiTK]) VALUES (N'TK2', N'k2@gmail.com', N'2003', N'khachhang')
INSERT [dbo].[TaiKhoan] ([MaTK], [Email], [Password], [LoaiTK]) VALUES (N'TK3', N'k3@gmail.com', N'0000', N'khachhang')
INSERT [dbo].[TaiKhoan] ([MaTK], [Email], [Password], [LoaiTK]) VALUES (N'TK4', N'k4@gmail.com', N'2234', N'khachhang')
INSERT [dbo].[TaiKhoan] ([MaTK], [Email], [Password], [LoaiTK]) VALUES (N'TK5', N'k5@gmail.com', N'6668', N'khachhang')
INSERT [dbo].[TaiKhoan] ([MaTK], [Email], [Password], [LoaiTK]) VALUES (N'TK6', N'k6@gmail.com', N'2077', N'khachhang')
INSERT [dbo].[TaiKhoan] ([MaTK], [Email], [Password], [LoaiTK]) VALUES (N'TN1', N'n1@gmail.com', N'1234', N'nhanvien')
INSERT [dbo].[TaiKhoan] ([MaTK], [Email], [Password], [LoaiTK]) VALUES (N'TN2', N'n7@gmail.com', N'1234', N'nhanvien')
INSERT [dbo].[TaiKhoan] ([MaTK], [Email], [Password], [LoaiTK]) VALUES (N'TN3', N'n9@gmail.com', N'5678', N'nhanvien')
GO
ALTER TABLE [dbo].[DonDatHang]  WITH CHECK ADD  CONSTRAINT [FK_DonDatHang_NhaCungCap] FOREIGN KEY([MaNCC])
REFERENCES [dbo].[NhaCungCap] ([MaNCC])
GO
ALTER TABLE [dbo].[DonDatHang] CHECK CONSTRAINT [FK_DonDatHang_NhaCungCap]
GO
ALTER TABLE [dbo].[DonDatHang]  WITH CHECK ADD  CONSTRAINT [FK_DonDatHang_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[DonDatHang] CHECK CONSTRAINT [FK_DonDatHang_NhanVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhuyenMai] FOREIGN KEY([MaKM])
REFERENCES [dbo].[KhuyenMai] ([MaKM])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhuyenMai]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonChiTiet_HoaDon] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK_HoaDonChiTiet_HoaDon]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_TaiKhoan] FOREIGN KEY([MaTK])
REFERENCES [dbo].[TaiKhoan] ([MaTK])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_TaiKhoan]
GO
ALTER TABLE [dbo].[LoaiHang]  WITH CHECK ADD  CONSTRAINT [FK_LoaiHang_NhaCungCap] FOREIGN KEY([MaNCC])
REFERENCES [dbo].[NhaCungCap] ([MaNCC])
GO
ALTER TABLE [dbo].[LoaiHang] CHECK CONSTRAINT [FK_LoaiHang_NhaCungCap]
GO
ALTER TABLE [dbo].[MatHang]  WITH CHECK ADD  CONSTRAINT [FK_MatHang_ChatLieu] FOREIGN KEY([MaCL])
REFERENCES [dbo].[ChatLieu] ([MaCL])
GO
ALTER TABLE [dbo].[MatHang] CHECK CONSTRAINT [FK_MatHang_ChatLieu]
GO
ALTER TABLE [dbo].[MatHang]  WITH CHECK ADD  CONSTRAINT [FK_MatHang_LoaiHang] FOREIGN KEY([MaLoai])
REFERENCES [dbo].[LoaiHang] ([MaLoai])
GO
ALTER TABLE [dbo].[MatHang] CHECK CONSTRAINT [FK_MatHang_LoaiHang]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_Luong] FOREIGN KEY([MaLuong])
REFERENCES [dbo].[Luong] ([MaLuong])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_Luong]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_TaiKhoan] FOREIGN KEY([MaTK])
REFERENCES [dbo].[TaiKhoan] ([MaTK])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_TaiKhoan]
GO
USE [master]
GO
ALTER DATABASE [PRO1041_IT17316_N5] SET  READ_WRITE 
GO
