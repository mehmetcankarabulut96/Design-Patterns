package Proxy;

public class GameClient {
    private final FileSystem fileSystem;

    public GameClient(FileSystemFactory fileSystemFactory){
        fileSystem = fileSystemFactory.getFileSystem();
    }

    public void deleteGameFile(String mapFile){
        fileSystem.deleteFile(mapFile);
    }
}