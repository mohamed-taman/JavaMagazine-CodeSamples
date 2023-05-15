package org.siriusx;

/**
 * Hello Code Snippets App to show how to use it.
 */
public class App
{
    /**
     * Main starting point of the application
     * @param args program arguments
     */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    /**
     * A @snippet tag demo to include non-escaping special characters.

     * {@snippet id='specialChars' :
     * int age = 42;
     * <html> Here is HTML tags works </html>
     * & also works;
     * @ also works;
     * }
     */
    public void snippetsSpecialCharacters() {
        System.out.println("Code @snippets special characters Demo.");
    }


    /**
     *  Demo for code @snippets highlighting.
     * {@snippet id="highlighting" lang="java" :
     * (1) System.out.println("Code highlighting with 'regex'"); // @highlight regex='".*"'
     * (2) public record Point (int x, int y){}; // @highlight type=highlighted
     * (3) Point point = new Point(10, 30); // @highlight
     *
     * // @highlight region="output" substring="System.out" type="italic" :
     * (4 -->)
     * (5) System.out.println(point); // @highlight substring="point" type="italic"
     * (6) System.out.println(point.x()); // @highlight substring="point" :
     * (7) System.out.println(point.y()); // @highlight substring="out" type="highlighted"
     * (8) System.out.println(point.y()); // @highlight substring="y()" type="highlighted"
     * (<-- 4)
     * // @end region="output"
     * }
     */
    public void demoHighlight() {
        System.out.println("Code @snippets highlighting Demo.");
    }

    /**
     *  Demo for code @snippets Linking.
     * {@snippet id = "linking" lang = "java":
     * // @link substring="System.out" target="System#out":
     * System.out.println("Link to System.out");
     * final App app = new App();
     * // @link substring="demoLinking()" target="#demoLinking" type="link" :
     * app.demoLinking();
     *}
     */
    public void demoLinking() {
        System.out.println("Code @snippets Linking Demo.");
    }

    /**
     *  Demo for code @snippets Text Replacement.
     * {@snippet id="linking" lang="java" :
     *   public static void main(String... args) {
     *      var text = "Mohamed Taman"; // @replace regex='\".*\"' replacement=" ... "
     *      System.out.println(text); // @replace substring='System.' replacement=""
     *   }
     * }
     */
    public void demoReplacement() {
        System.out.println("Code @snippets Text Replacement Demo.");
    }


    /**
     *  Demo for code @snippets with external Java code file.
     * {@snippet class=ExternalSnippet }
     */
    public void demoExternalSnippet() {
        System.out.println("Code @snippets referencing external java file Demo.");
    }

    /**
     *  Demo for code @snippets with external html file.
     * {@snippet file='external-html-snippet.html' }
     */
    public void demoExternalSnippetHtml() {
        System.out.println("Code @snippets referencing external html file Demo.");
    }

    /**
     *  Demo for code @snippets with external properties file with highlighting.
     * {@snippet file='external-prop-Snippet.properties' region=house }
     */
    public void demoExternalSnippetProperties() {
        System.out.println(""" 
              Code @snippets referencing external
              properties file with highlighting Demo.
              """);
    }


    /**
     *  Demo for code @snippets with external Java code file with region and highlight.
     * {@snippet class=ExternalSnippetWithRegions region=main}
     */
    public void demoExternalSnippetRegions() {
        System.out.println("Code @snippets referencing external java file region Demo.");
    }

    /**
     *  Demo for code Hybrid Snippets.
     * {@snippet class=ExternalSnippetWithRegions region=join :
     * // Join a series of strings
     * var delimiter = "...";
     * var result = String.join(delimiter, args);
     * }
     */
    public void demoHybridSnippets() {
        System.out.println("Code for Hybrid Snippets Demo.");
    }

}
