package ASD3;

public class Mahasiswa {
	private String nama, nim, kelas, alamat;

	public Mahasiswa(String nama, String nim, String kelas, String alamat) {
		this.nama = nama;
		this.nim = nim;
		this.kelas = kelas;
		this.alamat = alamat;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getKelas() {
		return kelas;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
}
