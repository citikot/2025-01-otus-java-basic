package service;

import persistence.FilesCatalog;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileLibraryService {

    private final String pathToSearch = "homework12/files";
    private final FilesCatalog persistence = new FilesCatalog();
    private final UserInteractionService UIService = new UserInteractionService();

    public void run() {
        System.out.println("File Library Processor started.");
        createFilesCatalog(pathToSearch);
        printFilesCatalog();
        UIService.processFilesCatalog(persistence.filesCatalog);
    }

    private void createFilesCatalog(String pathToSearch) {
        File directory = new File(pathToSearch);
        List<String> txtFiles = new ArrayList<>();
        readDirectory(directory, txtFiles);
        fillFilesCatalog(txtFiles);
    }

    private void printFilesCatalog() {
        persistence.filesCatalog.keySet().forEach(System.out::println);
    }

    private void readDirectory(File directory, List<String> txtFiles) {
        if (directory == null || !directory.exists()) return;

        File[] files = directory.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                readDirectory(file, txtFiles);
            } else if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                txtFiles.add(file.getAbsolutePath());
            }
        }
    }

    private void fillFilesCatalog(List<String> filesList) {
        for (String absolutePath : filesList) {
            String[] elems = absolutePath.split("\\\\");
            String path = "";
            String fileName = elems[elems.length - 1];
            for (int i = 0; i <= elems.length - 2; i++ ) {
                path = path + elems[i] + "\\";
            }
            persistence.filesCatalog.put(fileName, path);
        }
    }
}
