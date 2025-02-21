package EjerciciosColecciones;

import java.util.Comparator;

public class OrdenarPorAltura implements Comparator<Integrante> {

	@Override
	public int compare(Integrante integrante1, Integrante integrante2) {
		// TODO Auto-generated method stub
		double alt1, alt2;
		alt1= integrante1.getAltura();
		alt2=integrante2.getAltura();
		
		int dif;
		if (alt1 == alt2) {
			dif = 0;
		} else if (alt1 > alt2) {
			dif = 1;
		} else {
			dif = -1;
		}

		return dif;
	}

}
