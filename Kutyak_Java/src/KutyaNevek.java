
public class KutyaNevek {
	int nev_id;
	String nev_nev;
	public KutyaNevek(int nev_id, String nev_nev) {
		super();
		this.nev_id = nev_id;
		this.nev_nev = nev_nev;
	}
	public int getNev_id() {
		return nev_id;
	}
	public void setNev_id(int nev_id) {
		this.nev_id = nev_id;
	}
	public String getNev_nev() {
		return nev_nev;
	}
	public void setNev_nev(String nev_nev) {
		this.nev_nev = nev_nev;
	}
	@Override
	public String toString() {
		return "KutyaNevek [nev_id=" + nev_id + ", nev_nev=" + nev_nev + "]";
	}
	
}

	