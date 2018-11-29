
public class Kutyak {
	int kutya_id;
	int kutya_fajta_id;
	int kutya_nev_id;
	int kutya_eletkor;
	int kutya_utolso_orvosi;
	
	public Kutyak(int kutya_id, int kutya_fajta_id, int kutya_nev_id, int kutya_eletkor, int kutya_utolso_orvosi) {
		super();
		this.kutya_id = kutya_id;
		this.kutya_fajta_id = kutya_fajta_id;
		this.kutya_nev_id = kutya_nev_id;
		this.kutya_eletkor = kutya_eletkor;
		this.kutya_utolso_orvosi = kutya_utolso_orvosi;
	}
	public int getKutya_id() {
		return kutya_id;
	}
	public void setKutya_id(int kutya_id) {
		this.kutya_id = kutya_id;
	}
	public int getKutya_fajta_id() {
		return kutya_fajta_id;
	}
	public void setKutya_fajta_id(int kutya_fajta_id) {
		this.kutya_fajta_id = kutya_fajta_id;
	}
	public int getKutya_nev_id() {
		return kutya_nev_id;
	}
	public void setKutya_nev_id(int kutya_nev_id) {
		this.kutya_nev_id = kutya_nev_id;
	}
	public int getKutya_eletkor() {
		return kutya_eletkor;
	}
	public void setKutya_eletkor(int kutya_eletkor) {
		this.kutya_eletkor = kutya_eletkor;
	}
	public int getKutya_utolso_orvosi() {
		return kutya_utolso_orvosi;
	}
	public void setKutya_utolso_orvosi(int kutya_utolso_orvosi) {
		this.kutya_utolso_orvosi = kutya_utolso_orvosi;
	}
	@Override
	public String toString() {
		return "Kutyak [kutya_id=" + kutya_id + ", kutya_fajta_id=" + kutya_fajta_id + ", kutya_nev_id=" + kutya_nev_id
				+ ", kutya_eletkor=" + kutya_eletkor + ", kutya_utolso_orvosi=" + kutya_utolso_orvosi + "]";
	}



}
