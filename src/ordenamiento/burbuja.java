package ordenamiento;
public class burbuja 
{
    private int[] array = {5,2,10,3,4,45,23,67,12,56};
    private int tamanio = array.length;
    private int aux;
    private int pasadas;
    private boolean ordenado = false;
    public void ordenarBurbuja()
    {
        System.out.println("Array original: ");
        
        for(int i=0; i<tamanio; i++)
        {
            System.out.print(array[i] + ",");
        }
        System.out.println("");
        while(!ordenado)
        {
            ordenado = true;
            for(int i=0; i<((tamanio-1)-pasadas); i++)
            {
                if(array[i] > array[i+1])
                {
                    aux = array[i+1];
                    array[i+1] = array[i];
                    array[i] = aux;
                    ordenado = false;
                }
            }
            pasadas++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Array ordenado en " + pasadas + " pasadas");
        for(int i=0; i<tamanio; i++)
        {
            System.out.print(array[i] + ",");
        }
    }
}
