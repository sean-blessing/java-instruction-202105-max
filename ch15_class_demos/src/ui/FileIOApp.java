package ui;

import java.io.IOException;
import java.nio.file.*;

public class FileIOApp {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to File IO!");
		// p. 463
		// create a directory if it doesn't exist
		String dirString = "c:/temp/subfolder2";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
			System.out.println("directories created!");
		}
		
		// create a file if it doesn't exist
		String fileString = "items.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
			System.out.println("file created!");
		}
		
		// create a file using a relative path (not in book)
		fileString = "test-file.txt";
		filePath = Paths.get(fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
			System.out.println("relative path file created!");
		}
		
		// info about a file
		System.out.println("File name:        "+filePath.getFileName());
		System.out.println("Absolute Path:    "+filePath.toAbsolutePath());
		System.out.println("Is Writable:      "+Files.isWritable(filePath));
		
		
		// display files in a directory
		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println("Directory:  "+dirPath.toAbsolutePath());
			System.out.println("Files:");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for (Path p: dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println("     "+p.getFileName());
				}
			}
		}
		
		
		
		System.out.println("Bye");

	}

}
