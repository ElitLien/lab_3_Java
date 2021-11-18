package Task2;

import Task1.Exception;
import java.io.Closeable;
import java.io.IOException;

public class Human implements Closeable{
    String name;

    public Human(final String name) {
        this.name = name;
        validate();
    }

    public void validate() {
        if (name.matches(".*\\d+.*") || name.matches(".*\\s+.*") || !name.matches(".+")){
            throw new Exception("Exception in name");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public void close() throws IOException {

    }
}
