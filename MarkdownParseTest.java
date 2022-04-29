import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class MarkdownParseTest {
    // helper method to test getLinks on file
    public static ArrayList<String> getLinksResult(String filePath) throws IOException{
        Path path = Path.of(filePath);
        String contents = Files.readString(path);
        return MarkdownParse.getLinks(contents); 
    }

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinksOnOriginal() throws IOException{
        assertEquals(List.of("https://something.com", "some-thing.html"),
                 getLinksResult("test-file.md"));    
    }

    @Test
    public void testGetLinksMy2() throws IOException{
        assertEquals(List.of("https://ucsd.edu"),
                 getLinksResult("my-test-file2.md"));    
    }

    @Test
    public void testGetLinksMy3() throws IOException{
        assertEquals(List.of(),
                 getLinksResult("my-test-file3.md"));    
    }

    @Test
    public void testGetLinksMy4() throws IOException{
        assertEquals(List.of(),
                 getLinksResult("my-test-file4.md"));    
    }

    @Test
    public void testGetLinks2() throws IOException{
        assertEquals(List.of("https://something.com", "some-page.html"),
                 getLinksResult("test-file2.md"));    
    }

    @Test
    public void testGetLinks3() throws IOException{
        assertEquals(List.of(),
                 getLinksResult("test-file3.md"));    
    }

    @Test
    public void testGetLinks4() throws IOException{
        assertEquals(List.of(),
                 getLinksResult("test-file4.md"));    
    }

    @Test
    public void testGetLinks5() throws IOException{
        assertEquals(List.of(),
                 getLinksResult("test-file5.md"));    
    }

    @Test
    public void testGetLinks6() throws IOException{
        assertEquals(List.of(),
                 getLinksResult("test-file6.md"));    
    }

    @Test
    public void testGetLinks7() throws IOException{
        assertEquals(List.of(),
                 getLinksResult("test-file7.md"));    
    }

    @Test
    public void testGetLinks8() throws IOException{
        assertEquals(List.of(),
                 getLinksResult("test-file8.md"));    
    }

    @Test
    public void testGetLinks8fail() throws IOException{
        assertEquals(List.of(),
                 getLinksResult("test-file8.md"));    
    }
}