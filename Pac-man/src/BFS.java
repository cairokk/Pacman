import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void breadthFirstSearch(Grafo grafo, Vertice verticeFonte) {
        Queue<Vertice> fila = new LinkedList<>();

        grafo.obterVerticePorId(verticeFonte.getId()).setEstado("cinza");
        grafo.obterVerticePorId(verticeFonte.getId()).setTamanho(0);
        fila.add(verticeFonte);

        while (!fila.isEmpty()) {
            Vertice v = fila.poll();
            for (Vertice vizinho : v.getVizinhos()) {
                if (vizinho.getEstado().equals("branco")) {
                    grafo.obterVerticePorId(vizinho.getId()).setEstado("cinza");
                    grafo.obterVerticePorId(vizinho.getId()).setTamanho(v.getTamanho() + 1);
                    grafo.obterVerticePorId(vizinho.getId()).setPai(v);
                    System.out.println("pai do vertice: " + vizinho.getId() + " é o vercice:  " + v.getId());

                    fila.add(vizinho);
                }
            }
            grafo.obterVerticePorId(v.getId()).setEstado("preto");
        }
    }

    public static void menorDistanciaEntreVertices(Grafo grafo, Vertice verticeFonte, Vertice verticeDestino,
            int[][] matrizConfigMapa) {
        try {
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

            if (v.getPai() == null)
                throw new Exception("Não existe caminho entre " + verticeFonte.getId() + " e " + verticeDestino.getId());

            while (v != null) {
                filaMenorCaminho.add(v);
                v = v.getPai();
            }

            System.out.println("Distância entre " + verticeFonte.getId() + " e " + verticeDestino.getId() + ": "
                    + grafo.obterVerticePorId(verticeDestino.getId()).getTamanho());

            Imprimir imprimir = new Imprimir();

            System.out.println("Menor caminho entre " + verticeFonte.getId() + " e " + verticeDestino.getId() + ":");

            for(int i = 0; i < filaMenorCaminho.size()-1; i++) {
                System.out.print(filaMenorCaminho.get(i).getId() + " -> ");
            }

            System.out.println(filaMenorCaminho.get(filaMenorCaminho.size()-1).getId());

            System.out.println();

            imprimir.printMatrixWitchPacAndGhostPath(matrizConfigMapa, verticeFonte.getId(), verticeDestino.getId(),
                    filaMenorCaminho);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
