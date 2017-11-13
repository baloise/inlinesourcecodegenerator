package com.baloise.github.inlinesourcecodegenerator.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Generator {
	public static void main(String[] args) throws IOException {
		Path greeter = Paths.get("src/main/java/com/baloise/github/inlinesourcecodegenerator/generated/Greeter.java");
		String content = "package com.baloise.github.inlinesourcecodegenerator.generated;\n" + 
				"\n" + 
				"public class Greeter {\n" + 
				"	public String greet() {\n" + 
				"		return \"Hello World\";\n" + 
				"	}\n" + 
				"}\n" + 
				"";
		Files.write(greeter, content.getBytes());
	}
}
