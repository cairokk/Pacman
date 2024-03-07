public class VerticeBusca {
    private Vertice vertice;
    private Vertice pai;
    private int distanciaOrigem;
    private String estado;

    public VerticeBusca(Vertice vertice){
        this.vertice = vertice;
        pai = null;
        distanciaOrigem = -1;
        estado = "branco";
    }

}
