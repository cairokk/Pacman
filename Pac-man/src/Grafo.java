import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private List<Vertice> vertices;

    public Grafo() {
        this.vertices = new ArrayList<>();
    }

    public void adicionar_vertice(Vertice novoVertice) {
        this.vertices.add(novoVertice);
    }

    public void conectar_vertices(Vertice v1, Vertice v2) {
        if (!(v1.getVizinhos().contains(v2))) {
            v1.adicionar_vizinho(v2);
            v2.adicionar_vizinho(v1);
        }
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public Vertice obterVerticePorId(String id) {
        for (Vertice v : this.vertices) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public void mostrarGrafo() {
        for (Vertice v : this.vertices) {
            List<Vertice> vizinhos = v.getVizinhos();
            System.out.println("Vertice: " + v.getId());
            System.out.println("Vizinhos: ");
            for (Vertice vizinho : vizinhos) {
                if (vizinhos.isEmpty()) {
                    System.out.println("nao tem vizinho");
                } else {
                    System.out.println(vizinho.getId());
                }
            }
        }
    }

}
