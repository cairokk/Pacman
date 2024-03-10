import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BFS {

    public static void breadthFirstSearch(Grafo grafo, Vertice verticeFonte) {
        Queue<Vertice> fila = new LinkedList<>();

        grafo.obterVerticePorId(verticeFonte.getId()).setEstado("cinza");
        grafo.obterVerticePorId(verticeFonte.getId()).setTamanho(0);
        fila.add(verticeFonte);

        while (!fila.isEmpty()) {
            Vertice v = fila.poll();
            System.out.println(v.getId() + " visitado");

            for (Vertice vizinho : v.getVizinhos()) {
                if (vizinho.getEstado().equals("branco")) {
                    grafo.obterVerticePorId(vizinho.getId()).setEstado("cinza");
                    grafo.obterVerticePorId(vizinho.getId()).setTamanho(v.getTamanho() + 1);
                    fila.add(vizinho);
                }
            }
        }
    }

    public static void menorDistanciaEntreVertices(Grafo grafo, Vertice verticeFonte, Vertice verticeDestino) {
        List<Vertice> fila = new LinkedList<>();
        List<Vertice> filaMenorCaminho = new LinkedList<>();

        grafo.obterVerticePorId(verticeFonte.getId()).setEstado("cinza");
        grafo.obterVerticePorId(verticeFonte.getId()).setTamanho(0);
        fila.add(verticeFonte);

        while (!fila.isEmpty()) {
            Vertice v = fila.remove(0);

            for (Vertice vizinho : v.getVizinhos()) {
                if (vizinho.getEstado().equals("branco")) {
                    grafo.obterVerticePorId(vizinho.getId()).setEstado("cinza");
                    grafo.obterVerticePorId(vizinho.getId()).setTamanho(v.getTamanho() + 1);
                    grafo.obterVerticePorId(vizinho.getId()).setPai(v);
                    fila.add(vizinho);
                }
            }
        }

        Vertice v = verticeDestino;
        while (v != null) {
            filaMenorCaminho.add(v);
            v = v.getPai();
        }

        System.out.println("Distância entre " + verticeFonte.getId() + " e " + verticeDestino.getId() + ": " + grafo.obterVerticePorId(verticeDestino.getId()).getTamanho());
        System.out.println("Menor caminho entre " + verticeFonte.getId() + " e " + verticeDestino.getId() + ":");

        for (int i = filaMenorCaminho.size() - 1; i > 0; i--){
            System.out.print(filaMenorCaminho.get(i).getId() + " -> ");
        }
        System.out.println(filaMenorCaminho.get(0).getId());
    }
}
