/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import static jdk.nashorn.internal.objects.ArrayBufferView.buffer;
import org.apache.commons.io.FileUtils;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.store.SimpleFSDirectory;
import static org.apache.lucene.util.Version.LUCENE_41;
import twitter4j.TwitterException;

/**
 *
 * @author marti
 */
public class loadDoc {
    
    public static void main(String [ ] args) throws FileNotFoundException, IOException
        {
   

        Directory dir; 
        dir = new SimpleFSDirectory(new File("D:/lucene_index"));
        Analyzer analyzer = new StandardAnalyzer(LUCENE_41);
        IndexWriterConfig cfg= new IndexWriterConfig(LUCENE_41,analyzer);
        IndexWriter writer = new IndexWriter(dir, cfg); 

        
        File file = new File("C:\\Users\\marti\\Desktop\\Social\\stream");
        String[] directories = file.list(new FilenameFilter() {
        @Override
        public boolean accept(File current, String name) {
           return new File(current, name).isDirectory();
         }
        });
        
        
        
    for (String directory : directories) {

     Iterator it = FileUtils.iterateFiles(new File("C:\\Users\\marti\\Desktop\\Social\\stream\\" + directory), null, false);
     while(it.hasNext()){
           
        String file_path = "C:\\Users\\marti\\Desktop\\Social\\stream\\" + directory + "\\" + ((File) it.next()).getName(); 

        FileInputStream fs = new FileInputStream(file_path); 
        InputStream gzStream = new GZIPInputStream(fs); ///  FileInputStream fs = new FileInputStream(file_path);
        InputStreamReader isr = new InputStreamReader(gzStream); 
        BufferedReader br = new BufferedReader( isr ); 

        // read file lines 
        String line;

        line = br.readLine(); 
        
        while(line!=null) {
        StatusWrapper sw; 
        sw = new StatusWrapper();
            try {
                sw.load(line);
                // add doc to index 
            } catch (TwitterException ex) {
                Logger.getLogger(loadDoc.class.getName()).log(Level.SEVERE, null, ex);
            }

        
        index_creator.addDoc(writer, sw.getStatus().getUser().getScreenName().toLowerCase(), sw.getStatus().getUser().getId(), sw.getStatus().getText().toLowerCase(), sw.getTime());     
                  
        
        line = br.readLine();

        }
     
     }
     
    }
        
        writer.commit();
        writer.close(); 
        
        
     }

 
}
