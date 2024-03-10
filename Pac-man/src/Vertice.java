import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private String id;
    private List<Vertice> vizinhos;
    private Vertice pai;
    private String estado;
    private int distancia;

    public Vertice(String id) {
        this.id = id;
        this.vizinhos = new ArrayList<>();
        this.pai = null;
        this.estado = "branco";
        this.distancia = -1;
    };

    public void adicionar_vizinho(Vertice novoVizinho) {
        this.vizinhos.add(novoVizinho);
    }

    public String getId() {
        return id;
    }

    public List<Vertice> getVizinhos() {
        return vizinhos;
    }

    public Vertice getPai() {
        return pai;
    }

    public void setPai(Vertice pai) {
        this.pai = pai;
    }

    public int getTamanho() {
        return distancia;
    }

    public void setTamanho(int tamanho) {
        this.distancia = tamanho;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
