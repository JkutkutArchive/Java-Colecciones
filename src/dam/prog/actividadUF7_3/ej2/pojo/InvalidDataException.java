package dam.prog.actividadUF7_3.ej2.pojo;

public class InvalidDataException extends RuntimeException {
	/**
	 * ??
	 */
	private static final long serialVersionUID = 1L;

	public InvalidDataException(String s) {
		super(s);
	}
	
	public InvalidDataException(String s, int min, int max) {
		super(String.format("%s [%d, %d]", s, min, max));
	}
}
