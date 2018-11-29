import java.util.Arrays;

public class Eredmenyek {
 private String nyelv;
 private int ev[]= new int[9];
 private int ossz;

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
	return nyelv + " - " + Arrays.toString(ev) + "= " + ossz;
}
}







