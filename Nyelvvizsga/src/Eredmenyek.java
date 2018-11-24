import java.util.Arrays;

public class Eredmenyek {
 private String nyelv;
 private int ev[];
 private int ossz;
/* 
public Eredmenyek(String nyelv,int evek[]) {
	super();
	this.nyelv = nyelv;
	this.ossz=0;
	for (int i = 0; i < evek.length; i++) {
		this.ev[i] = evek[i];
		this.ossz+=evek[i];
		}
	}
*/
 public Eredmenyek(String sor) {
	String[] t=sor.split(";");
	this.nyelv=t[0];
	for (int i = 0; i < t.length-1; i++) {
		this.ev[i]=Integer.parseInt(t[i+1]);
	}
	for( int i : ev) {
		    this.ossz += i;
		}
	}
public String getNyelv() {
	return nyelv;
}
public void setNyelv(String nyelv) {
	this.nyelv = nyelv;
}
public int[] getEv() {
	return ev;
}
public void setEv(int[] ev) {
	this.ev = ev;
}
public int getOssz() {
	return ossz;
}
public void setOssz(int ossz) {
	this.ossz = ossz;
}
@Override
public String toString() {
	return "Eredmenyek [nyelv=" + nyelv + ", ev=" + Arrays.toString(ev) + ", ossz=" + ossz + "]";
}
}







