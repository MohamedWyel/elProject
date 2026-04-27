import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.StringTemplate;
import java.io.*;
import java.awt.Desktop;

public class Main {
    //test

    public static void main(String[] args) throws Exception {
        String input = "print x;";

        ANTLRStringStream in = new ANTLRStringStream(input);
        reLexer lexer = new reLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        reParser parser = new reParser(tokens);

        reParser.prog_return result = parser.prog();
        CommonTree tree = (CommonTree) result.getTree();

        System.out.println("AST = " + tree.toStringTree());

        writeDotFile(tree, "tree.dot");
        runGraphviz("tree.dot", "tree.png");

        System.out.println("Done.");
    }

    public static void writeDotFile(CommonTree tree, String dotFile) throws Exception {
        DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);

        try (FileWriter fw = new FileWriter(dotFile)) {
            fw.write(st.toString());
        }
        System.out.println("DOT file written to " + dotFile);
    }

    public static void runGraphviz(String dotFile, String pngFile) throws Exception {
        ProcessBuilder pb = new ProcessBuilder(
                "C:\\Program Files\\Graphviz\\bin\\dot.exe",
                "-Tpng",
                dotFile,
                "-o",
                pngFile
        );

        pb.redirectErrorStream(true);
        Process process = pb.start();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }

        int exitCode = process.waitFor();

        if (exitCode == 0) {
            System.out.println("PNG file written to " + pngFile);
            Desktop.getDesktop().open(new File(pngFile));
        } else {
            System.out.println("Graphviz failed with exit code " + exitCode);
        }
    }
}