import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class CollectionMain {
	public static void main(String[] args) {
		List<Persona>listPersona = new ArrayList<Persona>();
		listPersona.add(new Persona("Pedro", 45));
		listPersona.add(new Persona("Maria", 78));
		listPersona.add(new Persona("Juan", 100));
		listPersona.add(new Persona("Antonio", 30));
		
		//mostrar las listas
		listPersona.stream().forEach(System.out::println);
		
		//Filtar por edad
		 listPersona.stream().filter(x -> x.getEdad() > 60).collect(Collectors.toList()).forEach(System.err::println);
		
		 //Si coincide
		System.out.println( listPersona.stream().anyMatch(x -> x.equals(new Persona("Jun", 78))));
	}
}
