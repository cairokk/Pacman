public class App {

    public static void main(String[] args) {

        Grafo mapa = new Grafo();

        int[][] matrizConfigMapa = {
                { 1, 1, 1, 1 },
                { 1, 0, 0, 1 },
                { 1, 1, 1, 1 }
        };

        for (int i = 0; i < matrizConfigMapa.length; i++) {
            for (int j = 0; j < matrizConfigMapa[0].length; j++) {
                Vertice novoVertice = new Vertice(i + "-" + j);
                mapa.adicionar_vertice(novoVertice);
            }
        }

        for (int i = 0; i < matrizConfigMapa.length; i++) {
            for (int j = 0; j < matrizConfigMapa[0].length; j++) {
                if (matrizConfigMapa[i][j] == 1) {
                    Vertice vertice = mapa.obterVerticePorId(i + "-" + j);
                    // verificando vizinho de cima
                    if (i > 0 && matrizConfigMapa[i - 1][j] == 1) {
                        mapa.conectar_vertices(vertice, mapa.obterVerticePorId(i - 1 + "-" + j));
                    }

                    // verificando vizinho de baixo
                    if (i < matrizConfigMapa.length - 1 && matrizConfigMapa[i + 1][j] == 1) {
                        mapa.conectar_vertices(vertice, mapa.obterVerticePorId(i + 1 + "-" + j));
                    }

                    // verificando vizinho da esquerda
                    if (j > 0 && matrizConfigMapa[i][j - 1] == 1) {
                        mapa.conectar_vertices(vertice, mapa.obterVerticePorId(i + "-" + (j - 1)));
                    }

                    // verificando vizinho da direita
                    if (j < matrizConfigMapa[0].length - 1 && matrizConfigMapa[i][j + 1] == 1) {
                        mapa.conectar_vertices(vertice, mapa.obterVerticePorId(i + "-" + (j + 1)));
                    }
                }
            }
        }

        Vertice verticeFonte = mapa.obterVerticePorId("2-0");
        Vertice verticeDestino = mapa.obterVerticePorId("2-3");

        Imprimir imprimir = new Imprimir();
        
        imprimir.printPacMan();

        imprimir.printMatrixWitchPacAndGhost(matrizConfigMapa, verticeFonte.getId(), verticeDestino.getId());

        BFS.menorDistanciaEntreVertices(mapa, verticeFonte, verticeDestino);
    }
}
