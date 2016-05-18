
package logic;
import java.io.File;
import javax.swing.filechooser.*;

/**
 *
 * @author woden_000
 */
public class FileFilterTxt extends FileFilter {
    private String fileFormat ="txt";
    private char DotIndex = '.';
    
    
    public boolean accept (File F) 
    {
            if (F.isDirectory())
            {
                return true;
            }
            if (extension(F).equalsIgnoreCase(fileFormat))
            {
                return true;

            }else 
            { return false; }
    }
    
    
    
            public String getDescription()
            {
                return "(.txt) Formates Only";
            }
    
    
                public String extension (File F) //Do not use!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!For class only
            {
                                String FileName = F.getName();
                                int IndexFile = FileName.lastIndexOf(DotIndex);
                                if (IndexFile > 0 && IndexFile <FileName.length()-1)
                                {
                                    return FileName.substring(IndexFile+1);
                                }else
                                {
                                    return "";
                                }
            }
    
}
