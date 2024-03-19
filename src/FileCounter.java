import java.io.File;

public class FileCounter {
    public static int countFiles(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("The provided path is not a directory.");
        }

        File[] files = folder.listFiles();
        if (files == null) {
            throw new IllegalArgumentException("Error reading directory contents.");
        }

        int count = 0;
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(count++ + file.getName());

            }
        }
        return count;
    }

    public static void main(String[] args) {
        String folderPath = "/home/jp/Downloads/DataStructureAndAlgorithm/src/dsa/array"; // Replace this with the path to your folder
        try {
            int fileCount = countFiles(folderPath);
            System.out.println("Number of files in folder: " + fileCount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
