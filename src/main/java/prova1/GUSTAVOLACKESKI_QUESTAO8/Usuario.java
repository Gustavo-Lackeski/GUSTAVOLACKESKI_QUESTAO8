package prova1.GUSTAVOLACKESKI_QUESTAO8;

import java.util.ArrayList;

public class Usuario {
	private String _name;
	private int _id;
	private static int cont = 0;
	private  ArrayList<Livro> _livros;
	public Usuario(String name){
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
	@Override
	public boolean equals(Object o){
		if (o instanceof Usuario){
			return (((Usuario) o).getID() == this.getID());
		}
		return false;
	}

}
