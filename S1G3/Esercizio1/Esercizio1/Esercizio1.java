package Esercizio1;

public class Esercizio1 {

	public static void main(String[] args) {
		String stringa = "Epicode";
		int anno = 2024;

		boolean risultatoStringa = stringaParidispari(stringa);
		System.out.println("La stringa '" + stringa + "' ha un numero di caratteri pari? " + risultatoStringa);

		boolean risultatoAnno = annoBisestile(anno);
		System.out.println("L'anno " + stringa + " è bisestile? " + risultatoAnno);
	}

	public static boolean stringaParidispari(String stringa) {
		int lunghezza = stringa.length();
		if (lunghezza % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0) {
			if (anno % 100 != 0 || anno % 400 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
