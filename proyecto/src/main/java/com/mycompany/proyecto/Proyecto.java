package com.mycompany.proyecto;

/**
    Lucas Ortiz
 **/
public class Proyecto {

    public static void main(String[] args) {
        int e1 = 13;
        int e2 = 43;
        int e3 = 34;
        int e4 = 15;
        int e5 = 19;
        
       
        int sumamayores = 0;
        int cantidadmayores = 0;
        int sumamenores = 0;
        int cantidadmenores = 0;
  
        int[] edades={13, 43, 34, 15, 19}; 
       
        for (int x= 0; x<edades.length; x++){
            switch (edades[x] >=18 ? 1 : 0 ){
                case 1 : 
                    sumamayores += edades[x];               
                    cantidadmayores ++ ;
                break;
               case 0 : 
                    sumamenores += edades [x];
                    cantidadmenores ++ ; break;
                    
            }
        }
                float promediomay = sumamayores/cantidadmayores;
               float promediomen = sumamenores/cantidadmenores;
            System.out.println ("la suma mayores es :" + sumamayores);
            System.out.println ("la suma menores es :" + sumamenores);
            System.out.println ("El promedio mayores es :" + promediomay);
            System.out.println ("El promedio menores es :" + promediomen);
    }
}
