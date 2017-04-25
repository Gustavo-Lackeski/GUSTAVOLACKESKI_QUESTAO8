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
	private String _name;
	public Biblioteca(){
		this._freeUsers = new ArrayList<Usuario>();
		this._blockedUsers = new ArrayList<Usuario>();
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
    public static void main( String[] args )
    {
        
    }
}
