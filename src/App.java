public class App {
    public static void main(String[] args) throws Exception {       
        //MetodoBurbuja();
        MetodoBurbujaAvanzado();
    }
    public static void MetodoBurbujaAvanzado(){
        System.out.println("Metodo Burbuja Avanzado");
        int[] arreglo= new int[]{10,50,5,20,30,0,-10,15};
        //1ro instanciar la clase
        MetodoBurbujaAvanzado metodoBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        metodoBurbujaAvanzado.imprimirArreglo();
        metodoBurbujaAvanzado.sort(true); // Orden ascendente
        metodoBurbujaAvanzado.imprimirArreglo();
        metodoBurbujaAvanzado.sort(false); // Orden descendente
        metodoBurbujaAvanzado.imprimirArreglo();
    }

    public static void MetodoBurbuja(){
        System.out.println("Metodo Burbuja");
        int[] arreglo= new int[]{10,-5,0,2,7};

        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAscendente(); 
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDescendente();
        metodoBurbuja.imprimirArreglo();
    
    
    } 
}