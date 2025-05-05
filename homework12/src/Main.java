import service.FileLibraryService;

import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        FileLibraryService fileLibraryService = new FileLibraryService();
        fileLibraryService.run();
    }
}
