package filepractice;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jlombardo
 */
public class TextWriter {
    public void writeFile(File file, TextFormatter formatter, List<Map<String,Object>> programData) {
        List<String> list = formatter.encode(programData);
        // code to write to file...
    }
}
