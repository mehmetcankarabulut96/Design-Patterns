package Proxy.FileSystemApplication;

public class FileSystemProxy implements FileSystem {

    private final FileSystem realFileSystem;

    public FileSystemProxy(FileSystem realFileSystem){
        this.realFileSystem = realFileSystem;
    }

    @Override
    public void deleteFile(String fileName) {
        boolean deleteAllowed = isFileCanBeDeleted(fileName);
        if(deleteAllowed){
            realFileSystem.deleteFile(fileName);
            System.out.println(fileName + " deleted permanently");
        }
        else {
            System.out.println("Error: " + fileName + " can not be deleted.");
        }
    }

    private boolean isFileCanBeDeleted(String fileName){
        return fileName.contains(".conf");
    }
}