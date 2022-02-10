import java.util.List;

public class Filtrar {
	public static void main(String[] args) {
		List<Integer>listNum= List.of(11,6,7,5);
		
		System.out.println(listNum.stream().filter(x -> x >10).count());
		
		
	}
}
