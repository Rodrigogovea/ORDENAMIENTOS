package ordenamiento;

public class shellsort 
{
    private int[] array = {5,2,10,3,4};
    private int tamanio = array.length;
    private int espacio = tamanio/2;
    private int aux;
    public void ordenar()
    {
        mostrar(array);
        ordenarShell(array);
        mostrar(array);
    }
    private void ordenarShell(int a[])
    {
        System.out.println(espacio);
        while(espacio>0)
        {
            for(int i=espacio; i<tamanio;i++)
            {
                aux = a[i];
                int posicion = i;
                while(posicion >= espacio && a[posicion-espacio] > aux)
                {
                    a[posicion] = a[posicion-espacio];
                    posicion-=espacio;
                }
                a[posicion] = aux;
            }
            espacio = espacio/2;
        }
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
