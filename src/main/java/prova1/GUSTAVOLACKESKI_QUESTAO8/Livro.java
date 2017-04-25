package prova1.GUSTAVOLACKESKI_QUESTAO8;

public class Livro {
	private String _nome;
//	private boolean _retirado,_disponivel,_extraviado;
	private boolean prazo;
	public Livro(String nome){
		prazo = true;
		this._nome = nome;
	//	this._retirado = false;
	//	this._disponivel = true;
	//	this._extraviado = false;
	}
	public String getName(){
		return this._nome;
	}
	public void setforaPrazo(){
		this.prazo = false;
	}
	public boolean getPrazo(){
		return this.prazo;
	}

	@Override
	public boolean equals(Object o){
		if (o instanceof Livro){
			return (((Livro) o).getName() == this._nome);
		}
		return false;
	}
	public void SPRINT3(){
		
	}
}
