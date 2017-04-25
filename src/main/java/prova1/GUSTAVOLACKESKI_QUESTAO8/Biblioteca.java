package prova1.GUSTAVOLACKESKI_QUESTAO8;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class Biblioteca 
{
	private  ArrayList<Usuario> _freeUsers;
	private  ArrayList<Usuario> _blockedAtrasoUsers;
	private  ArrayList<Usuario> _blockedCobrancaUsers;	
	private  ArrayList<Livro> _livros;
	private String _name;
	public Biblioteca(){
		this._freeUsers = new ArrayList<Usuario>();
		this._blockedAtrasoUsers = new ArrayList<Usuario>();
		this._livros = new ArrayList<Livro>();
		this._blockedCobrancaUsers = new ArrayList<Usuario>();
	}
	public void addLivro(Livro l){
		if(!_livros.contains(l))
			_livros.add(l);
	}
	public void addUser(Usuario user){
		if(!_freeUsers.contains(user))
			_freeUsers.add(user);
	}
	public void removeUser(Usuario user){
		if(_freeUsers.contains(user))
			_freeUsers.remove(user);
		if(_blockedAtrasoUsers.contains(user))
			_blockedAtrasoUsers.remove(user);
	}
	public void blockAtrasoUser(Usuario user){
		if(_freeUsers.contains(user)){
			_freeUsers.remove(user);
			if(!_blockedAtrasoUsers.contains(user))
				_blockedAtrasoUsers.add(user);
		}
	}
	public void blockCobrancaUser(Usuario user){
		if(_freeUsers.contains(user)){
			_freeUsers.remove(user);
			if(!_blockedCobrancaUsers.contains(user))
				_blockedCobrancaUsers.add(user);
		}
	}
	public void regEmprestimo(Usuario u, Livro l){		
		_freeUsers.get(_freeUsers.indexOf(u)).addLivro(l);
		this._livros.remove(l);
	}
	public void regDevol(Usuario u, Livro l){
		if(this._freeUsers.contains(u)){
			this._freeUsers.get(_freeUsers.indexOf(u)).removeLivro(l);
			this._livros.add(l);
		}
		else{
			this._blockedAtrasoUsers.get(_blockedAtrasoUsers.indexOf(u)).removeLivro(l);
			this._livros.add(l);
		}
			
	}
	/*public void printUsers(){
		for(Usuario u:_users)
			System.out.println(u.getName());
	}*/
	public boolean containUser(Usuario u){
		return (this._freeUsers.contains(u));
	}
	public boolean isBlockedAtraso(Usuario u){
		return this._blockedAtrasoUsers.contains(u);
	}
	public boolean isBlockedCobranca(Usuario u){
		return this._blockedCobrancaUsers.contains(u);
	}
	public boolean containBook(Livro l){
		return this._livros.contains(l);
	}
    public static void main( String[] args )
    {
        
    }
}
