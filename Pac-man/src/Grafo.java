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
        if (!v1.getVizinhos().contains(v2)) {
            v1.adicionar_vizinho(v2);
            v2.adicionar_vizinho(v1);
        }
    }

    public List<Vertice> getVertices() {
        return this.vertices;
    }

    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }

    public Vertice obterVerticePorId(String id) {
        for (Vertice v : this.vertices) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

}
