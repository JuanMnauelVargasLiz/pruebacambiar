package dto;

public class Persona {
private Integer cedula;
private String nombrePersona;
private String correo;

public Persona(Integer cedula,String nombrePersona,String correo) {	
	this.cedula=cedula;
	this.nombrePersona=nombrePersona;
	this.correo=correo;
}

public Persona() {	
}

public Integer getCedula() {
	return cedula;
}

public void setCedula(Integer cedula) {
	this.cedula = cedula;
}

public String getNombrePersona() {
	return nombrePersona;
}

public void setNombrePersona(String nombrePersona) {
	this.nombrePersona = nombrePersona;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

@Override

public String toString() {
	return "Persona-> ID: "+cedula+" Nombre: "+nombrePersona + " correo: "+correo; 
	}



}
