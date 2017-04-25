package prova1.GUSTAVOLACKESKI_QUESTAO8;

import java.util.ArrayList;

public class Usuario {
	private String _name;
	private int _id;
	private static int cont = 0;
	private  ArrayList<Livro> _livros;
	public boolean bloqueadoAtrazo,bloqueadoCobranca,Liberado;
	public Usuario(String name){
		bloqueadoAtrazo = bloqueadoCobranca = false;
		Liberado = true;
		this._livros = new ArrayList<Livro>();
		this._name = name;
		cont++;
		_id = cont;
	}
	
	public void addLivro(Livro l){
		this._livros.add(l);
	}
	public void removeLivro(Livro l){
		if (this._livros.contains(l))
			this._livros.remove(l);		
	}
	public int getID(){
		return this._id;
	}
	public boolean containBook(Livro l){
		return this._livros.contains(l);
	}
	public String getName(){
		return this._name;
	}
	public void getStatus(Biblioteca b){
		this.bloqueadoAtrazo = b.isBlockedAtraso(this);
		this.bloqueadoCobranca = b.isBlockedCobranca(this);
		this.Liberado = b.containUser(this);
	}
	@Override
	public boolean equals(Object o){
		if (o instanceof Usuario){
			return (((Usuario) o).getID() == this.getID());
		}
		return false;
	}
	public boolean hasLivroForaPrazo(){
		for(Livro l:this._livros){
			if (!l.getPrazo());
				return false;
		}
		return true;
	}
	

}
