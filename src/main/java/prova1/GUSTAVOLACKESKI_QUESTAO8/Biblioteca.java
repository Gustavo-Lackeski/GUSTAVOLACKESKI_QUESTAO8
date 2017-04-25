package prova1.GUSTAVOLACKESKI_QUESTAO8;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class Biblioteca 
{
	private  ArrayList<Usuario> _users;
	private  ArrayList<Usuario> _Blockedusers;	
	private String _name;
	public void addUser(Usuario user){
		if(!_users.contains(user))
			_users.add(user);
	}
	public void removeUser(Usuario user){
		if(_users.contains(user))
			_users.remove(user);
	}
	public void blockUser(Usuario user){
		if(_users.contains(user)){
			_users.remove(user);
			if(!_Blockedusers.contains(user))
				_Blockedusers.add(user);
		}
	}
	/*public void printUsers(){
		for(Usuario u:_users)
			System.out.println(u.getName());
	}*/
    public static void main( String[] args )
    {
        
    }
}
