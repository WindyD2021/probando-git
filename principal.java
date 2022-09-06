/**
 *
 * @author Rafael
 * Para comprobar los datos de una matriz mejor usar una tabla Java o un System.out.println
 */
public class Matriz {
 
    public String [][]getMatriz(){
        return MiMatriz;
    }
 
    private String [][]MiMatriz=new String [5][5];
 
    public Matriz(){
        for(int f=0; f<MiMatriz.length; f++){
            for(int c=0; c<MiMatriz[f].length; c++){
                MiMatriz[f][c]="";
            }
        }
    }
 
    public int getSizeFila(){
        return MiMatriz.length;
    }
 
    /**
     * MiMatriz[0].length; lanza un valor de 5 que corresponde a las 5
 columnas.
     * @return
     */
    public int getSizeColumna(){
        return MiMatriz[0].length;
    }
 
    /**
     * Una matriz cuadrada tiene igual cantidad de filas que de columnas.
     * @return
     */
    public boolean EsMatrizCuadrada(){
        if(this.getSizeFila()==this.getSizeColumna()){
            return true;
        }
        return false;
    }
 
    public String ObtenerCasilla(int idDeLaFila , int idDeLaColumna){
        if(idDeLaFila<=-1 || idDeLaFila>=MiMatriz.length){
            if(idDeLaColumna<=-1 || idDeLaColumna>=MiMatriz[0].length){
                //Lanzar mensaje para el programador.
            }
        }else{
            if(idDeLaColumna<=-1 || idDeLaColumna>=MiMatriz[0].length){
                //Lanzar mensaje para el programador.
            }else{
                return MiMatriz[idDeLaFila][idDeLaColumna];
            }
        }
        return "";
    }
 
    public void Agregar(int idDeLaFila , int idDeLaColumna, String datos){
        if(idDeLaFila<=-1 || idDeLaFila>25){
            if(idDeLaColumna<=-1 || idDeLaColumna>=MiMatriz[0].length){
                //Lanzar mensaje para el programador.
            }
        }else{
            if(idDeLaColumna<=-1 || idDeLaColumna>25){
                System.out.println("\nMayor a 25");
            }else{
                MiMatriz[idDeLaFila][idDeLaColumna]=datos;
            }
        }
    }
 
    private int idFilaBacia=-1;
    private int idColumnaBacia=-1;
 
    private boolean getBacio(){
        for(int f=0; f<MiMatriz.length; f++){
            for(int c=0; c<MiMatriz[f].length; c++){
                if(MiMatriz[f][c]=="" || MiMatriz[f][c]==null){
                    idFilaBacia=f;
                    idColumnaBacia=c;
                    return true;
                }
            }
        }
        return false;
    }
 
    public boolean Agregar(String datos){
            if(getBacio()==true){
                MiMatriz[idFilaBacia][idColumnaBacia]=datos;
                return true;
            }
            return false;
    }
 
    private void AgregarVector(String []Unvector){
//        if(Unvector.length<Matriz[0].length){
//            //Mensaje de alerta
//        }else{
            for(int f=0; f<MiMatriz.length; f++){
                for(int c=0; c<MiMatriz[f].length; c++){
 
                    MiMatriz[0][c]=Unvector[c];
                    System.out.println("Encavezado " + MiMatriz[0][c]);
                }
            }
//        }
    }
 
    public void Agregar(String []Unvector, int idDeLaFila , int idDeLaColumna, String datos){
        this.AgregarVector(Unvector);
        if(idDeLaFila<=-1 || idDeLaFila>MiMatriz.length){
            if(idDeLaColumna<=-1 || idDeLaColumna>=MiMatriz[0].length){
                //Lanzar mensaje para el programador.
            }
        }else{
            if(idDeLaColumna<=-1 || idDeLaColumna>MiMatriz[0].length){
                System.out.println("\nMayor a 25");
            }else{
                MiMatriz[idDeLaFila][idDeLaColumna]=datos;
            }
        }
    }
 
    public boolean Agregar(String []Unvector, String datos){
        this.AgregarVector(Unvector);
        if(getBacio()==true){
            MiMatriz[idFilaBacia][idColumnaBacia]=datos;
            return true;
        }
        return false;
    }
 
    @Override
        public String toString(){
            String informe="Contenido la matriz:\n\n";
 
            for(int f=0; f<MiMatriz.length; f++){
                for(int c=0; c<MiMatriz[f].length; c++){
                       if(MiMatriz[f][c]!="" || MiMatriz[f][c]!=null){
                           informe+="Fila " + f + " Columna " + c + "== " + MiMatriz[f][c] + "\n\n";
                       }
                }
            }
            return informe;
        }
}
 
 
 

