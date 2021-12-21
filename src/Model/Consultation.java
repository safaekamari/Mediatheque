package Model;

public class Consultation {

	private static int idC=0;
	private final int Id;
	private final int IdEmprunt;
	private final int IdDocument;

	public Consultation(int ide, int idd) {
		this.IdEmprunt=ide;
		this.IdDocument=idd;
		this.Id=++idC;
	}

	public int getIdEmprunt() {
		return IdEmprunt;
	}

	public int getIdDocument() {
		return IdDocument;
	}

	public int getId() {
		return Id;
	}
	
	
}
