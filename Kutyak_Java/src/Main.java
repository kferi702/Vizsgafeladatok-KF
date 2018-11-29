import java.nio.file.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

	static List<KutyaNevek> nev=nev("Kutyanevek.csv");
	static List<Fajtak> fajta=fajta("Kutyafajtak.csv");
	static List<Kutyak> kutya=kutya("Kutyak.csv");
	
	public static List<KutyaNevek> nev(String f_neve) {
		List<KutyaNevek> program = new ArrayList<>();
		try {
			List<String> beolv = Files.readAllLines(Paths.get(f_neve));
			for (String sor : beolv.subList(1,beolv.size())) {
				String[] t = sor.split(";");
				KutyaNevek o= new KutyaNevek(Integer.parseInt(t[0]),t[1]);	
				program.add(o);
			}
		} catch (Exception e) {
			System.err.println("Hiba a "+f_neve+" nevü fájl beolvasásánal!");
		}
		return program;
	}
	public static List<Fajtak> fajta(String f_neve) {
		List<Fajtak> program = new ArrayList<>();
		try {
			List<String> beolv = Files.readAllLines(Paths.get(f_neve));
			for (String sor : beolv.subList(1,beolv.size())) {
				String[] t = sor.split(";");
				Fajtak o = new Fajtak(Integer.parseInt(t[0]),
						t[1],t[2]);
				program.add(o);
			}
		} catch (Exception e) {
			System.err.println("Hiba a "+f_neve+" nevü fájl beolvasásánal!");
		}
		return program;
	}
	public static List<Kutyak> kutya(String f_neve) {
		List<Kutyak> program = new ArrayList<>();
		try {
			List<String> beolv = Files.readAllLines(Paths.get(f_neve));
			for (String sor : beolv.subList(1,beolv.size())) {
				String[] t = sor.split(";");

				Kutyak o = new Kutyak(Integer.parseInt(t[0]),
						Integer.parseInt(t[1]),
						Integer.parseInt(t[2]),
						Integer.parseInt(t[3]),
						Integer.parseInt(t[4])
						);
				program.add(o);
				

			}
		} catch (Exception e) {
			System.err.println("Hiba a "+f_neve+" nevü fájl beolvasásánal!");
		}
		return program;
	}
	
	public static void f3() {
		System.out.print("3. feladat:\t");
		System.out.println("Kutyanevek száma: "+nev.size());
	}
	public static void f6() {
		System.out.print("4. feladat:\t");
		int ossz=0;	
		for (Kutyak k : kutya) {
			ossz+=k.kutya_eletkor;
			System.out.println(ossz);
		}
		double avg=0;
		System.out.println(kutya.size());
		System.out.println("Kutyák átéagéletkora: "+new DecimalFormat("0.00").format(avg));
	}
	public static void main(String[] args) {
		
		f3();
		f6();

		

	}

}
