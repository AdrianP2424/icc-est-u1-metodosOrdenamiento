public class MetodoSeleccion {
    public static void sort(int[]arr) {
        int tam=arr.length;
        for(int i=0;i<tam-1;i++){
            int indiceDelMenor=i;
            for(int j=0;j<arr.length;j++){
                if(arr[indiceDelMenor]>arr[j]){
                    indiceDelMenor=j;//actualizo el indice
                }


            }
            if(i !=indiceDelMenor){//Intercambio
                int aux=arr[i];
                arr[i]=arr[indiceDelMenor];
                arr[indiceDelMenor]=aux;
            }
        }
    }
    public void printArray(int[] arr) {
        for(int i : arr){
            System.out.print(i+ ", ");
        }
        System.out.println("");
    }
}