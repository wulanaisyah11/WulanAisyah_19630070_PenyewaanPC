-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 23 Des 2021 pada 13.47
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `19630070_aplikasi_penyewaan_pc`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `komputer`
--

CREATE TABLE `komputer` (
  `nama_komputer` varchar(15) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `komputer`
--

INSERT INTO `komputer` (`nama_komputer`, `keterangan`) VALUES
('PC-001', 'rusak'),
('PC-002', 'baik'),
('PC-003', 'rusak'),
('PC-004', 'baik');

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE `member` (
  `id_member` int(10) NOT NULL,
  `nama_member` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `member`
--

INSERT INTO `member` (`id_member`, `nama_member`, `alamat`, `telp`) VALUES
(1, 'wulan', 'JL Borneo 02', '081234567890'),
(2, 'bobi', 'jl teratai', '089874563210');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `no_faktur` int(15) NOT NULL,
  `tgl_transaksi` text NOT NULL,
  `nama_penyewa` varchar(20) NOT NULL,
  `id_member` text NOT NULL,
  `nama_komputer` varchar(15) NOT NULL,
  `mulai` text NOT NULL,
  `selesai` text NOT NULL,
  `lama_sewa` int(50) NOT NULL,
  `total_bayar` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`no_faktur`, `tgl_transaksi`, `nama_penyewa`, `id_member`, `nama_komputer`, `mulai`, `selesai`, `lama_sewa`, `total_bayar`) VALUES
(123, '23-12-2021 14:49', 'pw', '1', 'PC-001', '14:00', '15:00', 1, 6000),
(125, '23-12-2021 14:49', 'indra', '6', 'PC-002', '14:00', '18:00', 4, 24000),
(1236, '23-12-2021 18:17', 'lala', '-', 'PC-006', '14:00', '17:00', 3, 18000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
