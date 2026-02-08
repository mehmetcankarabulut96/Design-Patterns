package Proxy.FileSystemApplication;

public class FileSystemFactory {
    private final FileSystem fileSystem;

    public FileSystemFactory(FileSystem fileSystem){
        this.fileSystem = new FileSystemProxy(fileSystem);
    }

    public FileSystem getFileSystem(){
        return fileSystem;
    }
}