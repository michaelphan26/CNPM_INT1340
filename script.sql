USE [master]
GO
/****** Object:  Database [Test]    Script Date: 5/31/2020 7:42:52 PM ******/
CREATE DATABASE [Test]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Test', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\Test.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Test_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\Test_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [Test] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Test].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Test] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Test] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Test] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Test] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Test] SET ARITHABORT OFF 
GO
ALTER DATABASE [Test] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Test] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Test] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Test] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Test] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Test] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Test] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Test] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Test] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Test] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Test] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Test] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Test] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Test] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Test] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Test] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Test] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Test] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Test] SET  MULTI_USER 
GO
ALTER DATABASE [Test] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Test] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Test] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Test] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Test] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Test] SET QUERY_STORE = OFF
GO
USE [Test]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 5/31/2020 7:42:52 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[Username] [nvarchar](30) NOT NULL,
	[Password] [nvarchar](30) NOT NULL,
	[Name] [nvarchar](30) NOT NULL,
	[Birth] [date] NOT NULL,
	[Tel] [nvarchar](10) NOT NULL,
	[Position] [nvarchar](20) NOT NULL,
	[AccountStatus] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Bill]    Script Date: 5/31/2020 7:42:52 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bill](
	[BillID] [nvarchar](10) NOT NULL,
	[Username] [nvarchar](30) NOT NULL,
	[Date] [date] NOT NULL,
	[Time] [time](7) NOT NULL,
	[Status] [nvarchar](20) NOT NULL,
	[Total] [nvarchar](30) NOT NULL,
 CONSTRAINT [PK_Bill] PRIMARY KEY CLUSTERED 
(
	[BillID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[BillDetail]    Script Date: 5/31/2020 7:42:52 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BillDetail](
	[BillID] [nvarchar](10) NOT NULL,
	[DrinkID] [nvarchar](10) NOT NULL,
	[Size] [nvarchar](10) NOT NULL,
	[Quantity] [nvarchar](5) NOT NULL,
 CONSTRAINT [PK_BillDetail_1] PRIMARY KEY CLUSTERED 
(
	[BillID] ASC,
	[DrinkID] ASC,
	[Size] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Drink]    Script Date: 5/31/2020 7:42:52 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Drink](
	[DrinkID] [nvarchar](10) NOT NULL,
	[DrinkName] [nvarchar](50) NOT NULL,
	[MSizePrice] [nvarchar](30) NOT NULL,
	[LSizePrice] [nvarchar](30) NOT NULL,
	[TypeID] [nvarchar](10) NOT NULL,
	[Status] [nvarchar](10) NULL,
 CONSTRAINT [PK_Drink] PRIMARY KEY CLUSTERED 
(
	[DrinkID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Type]    Script Date: 5/31/2020 7:42:52 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Type](
	[TypeID] [nvarchar](10) NOT NULL,
	[TypeName] [nvarchar](30) NOT NULL,
 CONSTRAINT [PK_Type] PRIMARY KEY CLUSTERED 
(
	[TypeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([Username], [Password], [Name], [Birth], [Tel], [Position], [AccountStatus]) VALUES (N'an', N'12345678', N'An', CAST(N'1999-01-01' AS Date), N'0903936233', N'Quản lý', N'Active')
INSERT [dbo].[Account] ([Username], [Password], [Name], [Birth], [Tel], [Position], [AccountStatus]) VALUES (N'an3', N'12345678', N'An', CAST(N'2020-04-28' AS Date), N'0123456789', N'Nhân viên', N'Active')
INSERT [dbo].[Account] ([Username], [Password], [Name], [Birth], [Tel], [Position], [AccountStatus]) VALUES (N'hida', N'12345678', N'Hida', CAST(N'1999-10-01' AS Date), N'0123456780', N'Quản lý', N'Disable')
INSERT [dbo].[Account] ([Username], [Password], [Name], [Birth], [Tel], [Position], [AccountStatus]) VALUES (N'lodo', N'12345678', N'Lodo', CAST(N'1999-03-03' AS Date), N'0901234567', N'Quản lý', N'Disable')
INSERT [dbo].[Account] ([Username], [Password], [Name], [Birth], [Tel], [Position], [AccountStatus]) VALUES (N'nhanvien1', N'abc123456', N'Nguyễn Văn A', CAST(N'1999-12-31' AS Date), N'0900000000', N'Nhân viên', N'Active')
INSERT [dbo].[Account] ([Username], [Password], [Name], [Birth], [Tel], [Position], [AccountStatus]) VALUES (N'nhanvien2', N'01234567', N'NhanVien', CAST(N'2020-04-26' AS Date), N'0900000000', N'Nhân viên', N'Active')
GO
INSERT [dbo].[Bill] ([BillID], [Username], [Date], [Time], [Status], [Total]) VALUES (N'0', N'an', CAST(N'2020-05-27' AS Date), CAST(N'10:01:29' AS Time), N'done', N'87000')
INSERT [dbo].[Bill] ([BillID], [Username], [Date], [Time], [Status], [Total]) VALUES (N'1', N'an', CAST(N'2020-05-27' AS Date), CAST(N'05:12:59' AS Time), N'done', N'180000')
INSERT [dbo].[Bill] ([BillID], [Username], [Date], [Time], [Status], [Total]) VALUES (N'2', N'an', CAST(N'2020-05-28' AS Date), CAST(N'09:19:29' AS Time), N'done', N'229000')
INSERT [dbo].[Bill] ([BillID], [Username], [Date], [Time], [Status], [Total]) VALUES (N'3', N'an', CAST(N'2020-05-29' AS Date), CAST(N'07:12:25' AS Time), N'done', N'235000')
INSERT [dbo].[Bill] ([BillID], [Username], [Date], [Time], [Status], [Total]) VALUES (N'4', N'an', CAST(N'2020-05-31' AS Date), CAST(N'05:21:14' AS Time), N'done', N'205000')
INSERT [dbo].[Bill] ([BillID], [Username], [Date], [Time], [Status], [Total]) VALUES (N'5', N'an', CAST(N'2020-05-31' AS Date), CAST(N'05:22:20' AS Time), N'waiting', N'155000')
INSERT [dbo].[Bill] ([BillID], [Username], [Date], [Time], [Status], [Total]) VALUES (N'6', N'an', CAST(N'2020-05-31' AS Date), CAST(N'05:22:50' AS Time), N'waiting', N'225000')
INSERT [dbo].[Bill] ([BillID], [Username], [Date], [Time], [Status], [Total]) VALUES (N'7', N'an', CAST(N'2020-05-31' AS Date), CAST(N'05:23:15' AS Time), N'waiting', N'169000')
INSERT [dbo].[Bill] ([BillID], [Username], [Date], [Time], [Status], [Total]) VALUES (N'8', N'an', CAST(N'2020-05-31' AS Date), CAST(N'05:23:53' AS Time), N'waiting', N'100000')
GO
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'0', N'cf00', N'size M', N'2')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'0', N'cf01', N'size M', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'1', N'cf02', N'size M', N'2')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'1', N'ss01', N'size L', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'1', N'ss04', N'size M', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'2', N'tea01', N'size M', N'2')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'2', N'tea03', N'size L', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'2', N'tea05', N'size M', N'2')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'3', N'ice00', N'size M', N'2')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'3', N'ice01', N'size M', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'3', N'tea00', N'size M', N'2')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'4', N'ice00', N'size M', N'2')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'4', N'ice01', N'size L', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'4', N'tea00', N'size M', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'5', N'ss01', N'size L', N'2')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'5', N'ss02', N'size M', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'5', N'ss03', N'size M', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'6', N'cf01', N'size L', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'6', N'cf03', N'size M', N'2')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'6', N'ice00', N'size M', N'2')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'7', N'cf00', N'size M', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'7', N'ss00', N'size M', N'3')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'7', N'ss01', N'size M', N'1')
INSERT [dbo].[BillDetail] ([BillID], [DrinkID], [Size], [Quantity]) VALUES (N'8', N'cf04', N'size M', N'2')
GO
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'cf00', N'Cà phê truyền thống', N'29000', N'35000', N'CF', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'cf01', N'Cà phê sữa', N'29000', N'35000', N'CF', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'cf02', N'Capuchino', N'50000', N'55000', N'CF', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'cf03', N'Espresso', N'40000', N'45000', N'CF', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'cf04', N'Latte', N'50000', N'55000', N'CF', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'cf05', N'Caramel Macchiato', N'45000', N'50000', N'CF', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'ice00', N'Mocha Ice Blended', N'55000', N'60000', N'ICE', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'ice01', N'Caramel Ice Blended', N'55000', N'60000', N'ICE', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'ice02', N'Hazelnut Ice Blended', N'55000', N'60000', N'ICE', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'ice03', N'Cookie Ice Blended', N'55000', N'60000', N'ICE', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'ss00', N'Apple Juice', N'35000', N'40000', N'SS', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'ss01', N'Orange', N'35000', N'40000', N'SS', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'ss02', N'Pineapple', N'35000', N'40000', N'SS', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'ss03', N'Hangover Hero', N'40000', N'45000', N'SS', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'ss04', N'Muscle Builder', N'40000', N'45000', N'SS', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'tea00', N'Black Tea', N'35000', N'40000', N'TEA', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'tea01', N'Peach Black Tea', N'42000', N'47000', N'TEA', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'tea02', N'Lemon Black Tea', N'40000', N'45000', N'TEA', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'tea03', N'Rose Tea', N'45000', N'55000', N'TEA', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'tea04', N'Longan Tea', N'45000', N'55000', N'TEA', N'Active')
INSERT [dbo].[Drink] ([DrinkID], [DrinkName], [MSizePrice], [LSizePrice], [TypeID], [Status]) VALUES (N'tea05', N'Oolong Milk Tea', N'45000', N'55000', N'TEA', N'Active')
GO
INSERT [dbo].[Type] ([TypeID], [TypeName]) VALUES (N'CF', N'Coffee')
INSERT [dbo].[Type] ([TypeID], [TypeName]) VALUES (N'ICE', N'Ice-Blended')
INSERT [dbo].[Type] ([TypeID], [TypeName]) VALUES (N'SS', N'Smoothie')
INSERT [dbo].[Type] ([TypeID], [TypeName]) VALUES (N'TEA', N'Tea')
GO
ALTER TABLE [dbo].[Bill]  WITH CHECK ADD  CONSTRAINT [FK_Bill_Account] FOREIGN KEY([Username])
REFERENCES [dbo].[Account] ([Username])
GO
ALTER TABLE [dbo].[Bill] CHECK CONSTRAINT [FK_Bill_Account]
GO
ALTER TABLE [dbo].[BillDetail]  WITH CHECK ADD  CONSTRAINT [FK_BillDetail_Bill] FOREIGN KEY([BillID])
REFERENCES [dbo].[Bill] ([BillID])
GO
ALTER TABLE [dbo].[BillDetail] CHECK CONSTRAINT [FK_BillDetail_Bill]
GO
ALTER TABLE [dbo].[BillDetail]  WITH CHECK ADD  CONSTRAINT [FK_BillDetail_Drink] FOREIGN KEY([DrinkID])
REFERENCES [dbo].[Drink] ([DrinkID])
GO
ALTER TABLE [dbo].[BillDetail] CHECK CONSTRAINT [FK_BillDetail_Drink]
GO
ALTER TABLE [dbo].[Drink]  WITH CHECK ADD  CONSTRAINT [FK_Drink_Type] FOREIGN KEY([TypeID])
REFERENCES [dbo].[Type] ([TypeID])
GO
ALTER TABLE [dbo].[Drink] CHECK CONSTRAINT [FK_Drink_Type]
GO
USE [master]
GO
ALTER DATABASE [Test] SET  READ_WRITE 
GO
