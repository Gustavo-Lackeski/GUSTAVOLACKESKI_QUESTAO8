package prova1.GUSTAVOLACKESKI_QUESTAO8;

public class Usuario {
	private String _name;
	private int _id;
	private static int cont = 0;
	public Usuario(String name){
		this._name = name;
		cont++;
		_id = cont;
	}
	public int getID(){
		return this._id;
	}
	public String getName(){
		return this._name;
	}
	@Override
	public boolean equals(Object o){
		if (o instanceof Usuario){
			return (((Usuario) o).getID() == this.getID());
		}
		return false;
	}

}
