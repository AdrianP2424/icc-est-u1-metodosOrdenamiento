public class MetodoBurbuja {
    int[] arreglo;
   //Constructor vacio
   public MetodoBurbuja(int[]arreglo) {
     System.out.println("se creo la clase Met Burbuja"); 
     //PRIMERA FORMA
     // INSTANCIAR UN  VALOR CREADO EN CONSTRUCTOR
     this.arreglo = new int[]{10,5,8,0,7};  

     //SEGUNDA FORMA
     // INSTANCIAR UN  VALOR DESDE PARAMETRO
      this.arreglo = arreglo;
   }   
   public void ordenarAscendente(){
     for(int i=0;i<arreglo.length;i++){
        for(int j=i+1;j<arreglo.length;j++){
            if (arreglo[i]>arreglo[j]) {
                int aux=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
            }
        }
     }
   }
   public  void imprimirArreglo(){
     for(int num:arreglo){
        System.out.println(num + ",");
     }
     System.out.println();     
   }
    public void ordenarDescendente(){
     for(int i=0;i<arreglo.length;i++){
        for(int j=i+1;j<arreglo.length;j++){
            if (arreglo[i]<arreglo[j]) {
                int aux=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
            }
        }
     }
   }
}