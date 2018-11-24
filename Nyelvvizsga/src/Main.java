import java.nio.file.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {

	static List<Eredmenyek> sikeres= lista("sikeres.csv");
	static List<Eredmenyek> sikertelen= lista("sikertelen.csv");
	static Scanner sc = new Scanner(System.in);
	static int keresettEv=0;

	public static List<Eredmenyek> lista(String f_neve) {
		List<Eredmenyek> program = new ArrayList<>();
		try {
			List<String> beolvas = Files.readAllLines(Paths.get(f_neve));
			for (String sor : beolvas.subList(1, beolvas.size())) {
				Eredmenyek o = new Eredmenyek(sor);
				program.add(o);
				}			
		} catch (Exception e) {
			System.err.println("Hiba a " + f_neve + " nevû fájl  beolvasásnál!"+ e);
		}

		return program;
	}
	
	public static void f2() {
		System.out.println("2. feladat");

		//Létrehoz egy HashMap-et és a put metódussal feltölti a kulcs érték párokat
		Map<String, Integer> ossz= new HashMap<>();
		for (int i=0; i<sikeres.size();i++) {
			ossz.put(sikeres.get(i).getNyelv(),(sikeres.get(i).getOssz()+sikertelen.get(i).getOssz()));
		}
		//Map sorba rendezése value szerint  *Comptaror.reverseOrder()* csökkenõ sorrendbe állítja
		Map<String, Integer> osszCsokkeno = 
			     ossz.entrySet().stream()
			    .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
			    .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
			                              (e1, e2) -> e1, LinkedHashMap::new));
		//kiírás ellenörzésre
//		for (String s : osszCsokkeno.keySet()) {
//			System.out.println(s +"- "+osszCsokkeno.get(s));
//		}
		//keySet() lekérdezi a hashmap tartalmát és a toArray-al leszûkítem
		System.out.print("\tA legnépszerübb nyelvek: ");
		for (int i = 0; i <3; i++) {
			System.out.print(osszCsokkeno.keySet().toArray()[i]+", ");
		}

	}
	public static void f3() {
		System.out.println("\n3. Feladat");
		System.out.print("\tvizsgálandó év: ");
		keresettEv= sc.nextInt();
			if (keresettEv>2017 || keresettEv<2009) {
				System.out.println("Érvénytelen év!");
				System.exit(0);	
		}else {
			keresettEv-=2009;
		}
			
	}
	public static void f4() {
		System.out.println("4. feladat");
		Map<String, Double> sikertelenV= new HashMap<>();
		for (int i = 0; i < sikeres.size(); i++) {
			
			double arany;
			double ossz=sikeres.get(i).getEv()[keresettEv]+sikertelen.get(i).getEv()[keresettEv];
			if (ossz!=0) {
				arany =(sikertelen.get(i).getEv()[keresettEv])/ossz*100;
			}else {
				arany=0;
			}		
			sikertelenV.put(sikeres.get(i).getNyelv(),arany);
			
		}
			Map<String, Double> sikertelenVCs = 
				sikertelenV.entrySet().stream()
			    .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
			    .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
			                              (e1, e2) -> e1, LinkedHashMap::new));
			
			System.out.println(
					"\t"+(keresettEv+2009)+"-ben/ban "
					+sikertelenVCs.keySet().toArray()[0]
					+" nyelvbõl a sikertelen vizsgák aránya "
					+new DecimalFormat("00.00").format(sikertelenVCs.values().toArray()[0])+"%");
			}
		
	
	public static void f5() {
		System.out.println("5. feladat");
	}


	public static void main(String[] args) {
	f2();
	f3();
	f4();
	f5();
	
	}

}
