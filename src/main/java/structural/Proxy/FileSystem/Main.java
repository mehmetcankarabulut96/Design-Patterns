package structural.Proxy.FileSystem;

public class Main {
    static void main() {

        FileSystem fileSystem = new RealFileSystem();
        FileSystemFactory fileSystemFactory = new FileSystemFactory(fileSystem);

        GameClient gladiatus = new GameClient(fileSystemFactory);
        gladiatus.deleteGameFile("userdata.conf");
        gladiatus.deleteGameFile("dungeon_map.json");
    }
}