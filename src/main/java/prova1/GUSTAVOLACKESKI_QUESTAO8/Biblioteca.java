package prova1.GUSTAVOLACKESKI_QUESTAO8;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class Biblioteca 
{
	private  ArrayList<Usuario> _freeUsers;
	private  ArrayList<Usuario> _blockedUsers;
	private  ArrayList<Livro> _livros;
	private String _name;
	public Biblioteca(){
		this._freeUsers = new ArrayList<Usuario>();
		this._blockedUsers = new ArrayList<Usuario>();
		this._livros = new ArrayList<Livro>();
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
		if(_blockedUsers.contains(user))
			_blockedUsers.remove(user);
	}
	public void blockUser(Usuario user){
		if(_freeUsers.contains(user)){
			_freeUsers.remove(user);
			if(!_blockedUsers.contains(user))
				_blockedUsers.add(user);
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
			this._blockedUsers.get(_blockedUsers.indexOf(u)).removeLivro(l);
			this._livros.add(l);
		}
			
	}
	/*public void printUsers(){
		for(Usuario u:_users)
			System.out.println(u.getName());
	}*/
	public boolean containUser(Usuario u){
		return (this._blockedUsers.contains(u)||this._freeUsers.contains(u));
	}
	public boolean isBlocked(Usuario u){
		return this._blockedUsers.contains(u);
	}
	public boolean containBook(Livro l){
		return this._livros.contains(l);
	}
    public static void main( String[] args )
    {
        
    }
}
