package balancoTrimestral;

public abstract class balanco {

	public static void menu() {
		double gastosTrimestre;

		gastosTrimestre = gastos.gastosJaneiro + gastos.gastosFevereiro + gastos.gastosMarco;
		System.out.println("Gasto Trimestral: R$" + gastosTrimestre);
	}
}
