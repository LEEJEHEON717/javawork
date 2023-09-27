package bufferedstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteWordTest {

	public static void main(String[] args) {
		// 파일에 문자열 쓰기 - Writer -> FileWriter
		try(Writer writer = new FileWriter("word.txt")) {
			//문자열 쓰기
			String animal = "ant bear cow eagle elephant horse monkey penguin tiger";
			writer.write(animal);
			
			writer.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
