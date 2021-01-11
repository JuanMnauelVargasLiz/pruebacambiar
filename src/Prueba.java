import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import dto.Persona;

public class Prueba {

	public static void main(String[] args) {
		Map<Integer,Persona> lista= new HashMap<Integer,Persona>();
		Map<Integer,Persona>lista2= new HashMap<Integer,Persona>();
		Persona p= new Persona(1081407291,"juan manuel","juanvargas9010@gmail.com");
		lista.put(2, p);
		Persona p1= new Persona(1081407281,"andres lopez","macha@gmail.com");
		lista.put(4, p1);
		Persona p2= new Persona(1081407271,"mayerly guañarita","maye19@gmail.com");
		lista.put(1,p2);
		
		System.out.println("ingreso la llave "+lista.keySet());//mostrar toda la lista de Map
		System.out.println("valor "+lista.get(1));// leeer un objeto de la lista por su llave
		System.out.println("personas en el mapa:\n"+lista.toString().replace(",","\n"));
		lista.clear();
		lista.equals(lista2);
		
		Map<String,Integer> lista3= new HashMap<>();
		lista3.put("USA", 100);
		lista3.put("jobs", 200);
		lista3.put("software", 50);
		lista3.put("technology", 70);
		lista3.put("opportunity", 200);
		
//		ordenamiento de un HashMap
		Map<String ,Integer>lista4=lista3.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
System.out.println("funciono "+lista4.get("USA"));


//HACER UNA ITERACION CON un Map
Map<String,String> hm= new HashMap<String,String>();
hm.put("1","juan");
hm.put("2", "maye");
hm.put("3", "diana");

Iterator<Entry<String,String>> it=hm.entrySet().iterator();
while(it.hasNext()){
	Entry<String,String> e=it.next();
	System.out.println(e.getKey()+"--"+e.getValue());
}
	}

}
