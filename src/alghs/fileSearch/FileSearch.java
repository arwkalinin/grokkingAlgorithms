package alghs.fileSearch;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {

    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();

        searchFiles(new File("D:\\"), fileList);

        for (File file : fileList) {
            System.out.println(file.getAbsoluteFile());
        }
    }

    private static void searchFiles(File root, List<File> fileList) {
        if (root.isDirectory()) {
            System.out.println("Searching in: " + root.getAbsoluteFile());
            File[] directoryFiles = root.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }

}
