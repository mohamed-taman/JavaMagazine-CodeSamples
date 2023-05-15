public class ExternalSnippetWithRegions {
    /**
     * The ubiquitous "Hello, Snippets World!" program.
     */
    public static void main(String... args) {
        // @start region=main
        /*
          Print Hello world
         */
        System.out.println("Inside region Main"); // @highlight regex='".*"'

        // Join a series of strings // @start region=join
        var delimiter = " "; // @replace regex='".*"' replacement='"..."'
        var result = String.join(delimiter, args); // @link substring="String.join" target="String#join"
        // @end region=join
        // @end region=main
    }
}
