package templateexemplo;

public abstract class ExportFiles {

    public void export(String txt){
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLine((String)linhas);
        }   
        save();
        
    }
    
    protected void printLine(String linha){}
        
    protected void save() {}

}
