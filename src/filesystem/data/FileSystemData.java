package filesystem.data;

import java.io.IOException;

public interface FileSystemData {

  public String[] list() throws IOException;

  public byte[] read(String name) throws IOException;

  public void write(String name, byte[] bytes) throws IOException;

}
