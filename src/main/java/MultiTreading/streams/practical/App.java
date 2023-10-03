package MultiTreading.streams.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) throws IOException {

//		IntStream.range(1, 10).skip(5)
//		.forEach((x)-> System.out.println(x));
//		System.out.println();

//		Stream.of("Hello","bottle","Africa").sorted().findFirst().ifPresent((x)-> System.out.println(x));

//		Stream<String> words=Files.lines(Paths.get("files\\wordFile.txt"));
//		words.sorted().filter(x->x.contains("th")).collect(Collectors.toList())
//		.forEach(x->System.out.println(x+ ", "));
//		words.close();

		Stream<String> rows = Files.lines(Paths.get("files\\stockDataCsv.txt"));
//		int rowCount=(int) rows .map(x-> x.split(",")).filter(x->x.length>3).count();
//		System.out.println(rowCount + " good rows");

		rows.map(x -> x.split(",")).filter(x -> x.length > 3).filter(x -> Integer.parseInt(x[1].trim()) > 5)
				.forEach((x) -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
		rows.close();

	}

}
