import dto.Persona;

public interface IPersona {

	
	public Persona crearPersona( Persona persona);	
	
	public boolean updatePersona( Integer idPersona);
	
	public String deletePersona( Integer idPersona);
}
