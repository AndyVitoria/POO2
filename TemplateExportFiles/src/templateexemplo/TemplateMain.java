package templateexemplo;

public class TemplateMain {
   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
      ExportFiles html = new ExportHTML(), word = new ExportWord();
      html.export(texto);
      word.export(texto);
    }
    
}
