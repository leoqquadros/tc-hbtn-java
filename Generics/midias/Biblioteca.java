import java.util.*;

public class Biblioteca<T> extends Midia{

    private List<T> listaValores = new ArrayList<>();

    public void adicionarMidia (T tipo) {
        listaValores.add(tipo);
    }

    public  List<T>  obterListaMidias () {
        return listaValores;
    }
}
