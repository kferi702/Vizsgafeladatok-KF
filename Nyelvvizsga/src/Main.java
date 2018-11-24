import java.nio.file.*;

import java.util.*;

public class Main {

	static List<Eredmenyek> sikeres= lista("sikeres.csv");
	static List<Eredmenyek> sikertelen= lista("sikertelen.csv");

	public static List<Eredmenyek> lista(String f_neve) {

		List<Eredmenyek> program = new ArrayList<>();
		try {
			List<String> beolvas = Files.readAllLines(Paths.get(f_neve));
			for (String sor : beolvas.subList(1, beolvas.size())) {
				Eredmenyek o = new Eredmenyek(sor);
				program.add(o);
				/*String[] split = sor.split(";");
				int[] evek= new int[9];
				for (int i = 0; i < split.length-1; i++) {
					evek[i]=Integer.parseInt(split[i+1]);
				}
				Eredmenyek o = new Eredmenyek(
						split[0],
						Arrays.toString(evek)
						);
						program.add(o);
						*/
			}
		} catch (Exception e) {
			System.err.println("Hiba a " + f_neve + " nevû fájl  beolvasásnál!"+ e);
		}
		return program;
	}
	
	

	public static void f2() {
		for (int i = 0; i < sikeres.size(); i++) {
			System.out.println(sikeres.get(i).toString());
		}
	}


	public static void main(String[] args) {
//		f2();
	}

}
