
public class Fajtak {
	int fajta_id;
	String fajta_nev;
	String fajta_rnev;
	public Fajtak(int fajta_id, String fajta_nev, String fajta_rnev) {
		super();
		this.fajta_id = fajta_id;
		this.fajta_nev = fajta_nev;
		this.fajta_rnev = fajta_rnev;
	}
	public int getFajta_id() {
		return fajta_id;
	}
	public void setFajta_id(int fajta_id) {
		this.fajta_id = fajta_id;
	}
	public String getFajta_nev() {
		return fajta_nev;
	}
	public void setFajta_nev(String fajta_nev) {
		this.fajta_nev = fajta_nev;
	}
	public String getFajta_rnev() {
		return fajta_rnev;
	}
	public void setFajta_rnev(String fajta_rnev) {
		this.fajta_rnev = fajta_rnev;
	}
	@Override
	public String toString() {
		return "Fajtak [fajta_id=" + fajta_id + ", fajta_nev=" + fajta_nev + ", fajta_rnev=" + fajta_rnev + "]";
	}

	
}