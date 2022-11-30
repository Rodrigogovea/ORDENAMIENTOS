package ordenamiento;
public class quicksort 
{
    private int[] array = {5,2,10,3,4};
    
    private int primero;
    private int ultimo;
    private int pivote;
    private int i,j;
    private int aux;
    private int particion;
    
    public void ordenar()
    {
        primero = 0;//primer indice, inicio del arreglo
        ultimo = array.length - 1;//segundo indice, última posición del arreglo
        System.out.println("Arreglo inicial");
        mostrar(array);
        quickOrder(array,primero,ultimo);
        System.out.println("Arreglo Ordenado");
        mostrar(array);
    }
    private void quickOrder(int[] a, int l,int h)
    {
        if(l<h)//caso base de la recursividad
        {
            particion = partir(a,l,h);//primera revisión,  se obtiene el indice para seccionar el arreglo. 
            quickOrder(a,l,particion-1);//se manda llamar a la función recursiva, partiendo de la primera posición, hasta la el indice partición-1
            quickOrder(a,particion+1,h);//se manda llamar a la función recursiva, partiendo de partición+1 hasta el último elemento.
        }
    }
    private int partir(int[] theArray, int p, int u)
    {
        pivote = theArray[u];// la primera pasada toma el pivote, como el último elemento.
        i = (p-1);// este valor será el indice a la izquierda del primer elemento
        for(j = p; j<=u-1; j++)//se recorrerá el arreglo 
        {
            if(theArray[j] < pivote) //se compara el elmento en la posición j, con el elemento pivote.
            {
                i++;//se incrementa i, y en caso de que el elemento en j, sea menor que pivote, se hace un intercambio
                aux = theArray[i];
                theArray[i] = theArray[j];
                theArray[j] = aux;
            }
        }
        //se incrementa i, y se hace un intercambio de elementos.
        i++;
        aux = theArray[i];
        theArray[i] = theArray[u];
        theArray[u] = aux;
        return(i);//se regresa el valor de i
        
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
