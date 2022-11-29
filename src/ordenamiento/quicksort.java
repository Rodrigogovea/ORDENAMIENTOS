package ordenamiento;
public class quicksort 
{
    private int[] array = {5,2,10,3,4,45,23,67,12,56};
    
    private int primero;
    private int ultimo;
    private int pivote;
    private int i,j;
    private int aux;
    private int particion;
    
    public void ordenar()
    {
        primero = 0;
        ultimo = array.length - 1;
        System.out.println("Arreglo inicial");
        mostrar(array);
        quickOrder(array,primero,ultimo);
        System.out.println("Arreglo Ordenado");
        mostrar(array);
    }
    private void quickOrder(int[] a, int l,int h)
    {
        if(l<h)
        {
            particion = partir(a,l,h);
            quickOrder(a,l,particion-1);
            quickOrder(a,particion+1,h);
        }
    }
    private int partir(int[] theArray, int p, int u)
    {
        pivote = theArray[u];
        i = (p-1);
        for(j = p; j<=u-1; j++)
        {
            if(theArray[j] < pivote)
            {
                i++;
                aux = theArray[i];
                theArray[i] = theArray[j];
                theArray[j] = aux;
            }
        }
        aux = theArray[i+1];
        theArray[i+1] = theArray[u];
        theArray[u] = aux;
        return(i+1);
        
    }
    
    private void mostrar(int[] elArreglo)
    {
        for (int i=0; i<elArreglo.length; i++)
        {
            System.out.print(elArreglo[i] + " ");
        }
        System.out.println("");
    }
}
