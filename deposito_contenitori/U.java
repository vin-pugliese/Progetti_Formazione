package deposito_contenitori;

import java.util.ArrayList;
import java.util.Iterator;

public class U{

    public U (){}

    public ArrayList<C> filtra(ArrayList<C> arr, C campione){

       for(int i=0; i< arr.size();i++)
           if (campione.getName().equals(arr.get(i).getName())){
               arr.remove(i);
               i--;
           }
    return arr;
    }



}
