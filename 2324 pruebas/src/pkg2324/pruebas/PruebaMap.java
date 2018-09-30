package pkg2324.pruebas;import java.util.HashMap;import java.util.Iterator;import java.util.Map;public class PruebaMap {
    public static void main(String [] ar){
        Map<String, Integer> misReferencias = new HashMap();
        for (String termino : ar) {
            if(misReferencias.containsKey(termino))
                 misReferencias.put(termino, new
            Integer(Integer.valueOf(misReferencias.get(termino).intValue()+1)));
            else
                misReferencias.put(termino, new Integer(1));
         }
         for (Iterator itMap = misReferencias.entrySet().iterator();itMap.hasNext();){
            Map.Entry ele= (Map.Entry)itMap.next();
            System.out.println("Termino : " + ele.getKey() + " numero de veces : "
            + ele.getValue());
         }
     }
}
