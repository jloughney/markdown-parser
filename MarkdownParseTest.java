import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinksOnOriginal() throws IOException{
        Path filePath = Path.of("test-file.md");
        String contents = Files.readString(filePath);
        ArrayList<String> result = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com", "some-thing.html"),
                 result);    
    }
}