import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {

    public static void breadthFirstSearch(Grafo grafo, Vertice verticeFonte) {
        Queue<Vertice> fila = new LinkedList<>();

        grafo.obterVerticePorId(verticeFonte.getId()).setEstado("cinza");
        fila.add(verticeFonte);

        while (!fila.isEmpty()) {
            Vertice v = fila.poll();
            System.out.println(v.getId() + "visitado");

            for (Vertice vizinho : v.getVizinhos()) {
                if (vizinho.getEstado().equals("branco")) {
                    grafo.obterVerticePorId(vizinho.getId()).setEstado("cinza");
                    fila.add(vizinho);
                }
            }
        }

    }
}
