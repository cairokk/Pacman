public class App {

    public static void main(String[] args) {

        Grafo mapa = new Grafo();

        // int[][] matrizConfigMapa = {
        //         { 1, 1, 1, 1, 1 },
        //         { 1, 0, 1, 0, 1 },
        //         { 0, 0, 1, 0, 1 },
        //         { 1, 1, 1, 1, 1 }
        // };

        // for (int i = 0; i < matrizConfigMapa.length; i++) {
        //     for (int j = 0; j < matrizConfigMapa[0].length; j++) {
        //         Vertice novoVertice = new Vertice(i + "-" + j);
        //         mapa.adicionar_vertice(novoVertice);
        //     }
        // }

        // for (int i = 0; i < matrizConfigMapa.length; i++) {
        //     for (int j = 0; j < matrizConfigMapa[0].length; j++) {
        //         if (matrizConfigMapa[i][j] == 1) {
        //             Vertice vertice = mapa.obterVerticePorId(i + "-" + j);
        //             // verificando vizinho de cima
        //             if (i > 0 && matrizConfigMapa[i - 1][j] == 1) {
        //                 mapa.conectar_vertices(vertice, mapa.obterVerticePorId(i - 1 + "-" + j));
        //             }

        //             // verificando vizinho de baixo
        //             if (i < matrizConfigMapa.length - 1 && matrizConfigMapa[i + 1][j] == 1) {
        //                 mapa.conectar_vertices(vertice, mapa.obterVerticePorId(i + 1 + "-" + j));
        //             }

        //             // verificando vizinho da esquerda
        //             if (j > 0 && matrizConfigMapa[i][j - 1] == 1) {
        //                 mapa.conectar_vertices(vertice, mapa.obterVerticePorId(i + "-" + (j - 1)));
        //             }

        //             // verificando vizinho da direita
        //             if (j < matrizConfigMapa[0].length - 1 && matrizConfigMapa[i][j + 1] == 1) {
        //                 mapa.conectar_vertices(vertice, mapa.obterVerticePorId(i + "-" + (j + 1)));
        //             }
        //         }
        //     }
        // }

        // Vertice pacman = mapa.obterVerticePorId("0-1");
        // Vertice fantasminha = mapa.obterVerticePorId("3-0");

        // Imprimir imprimir = new Imprimir();

        // imprimir.printPacMan();

        // imprimir.printMatrixWitchPacAndGhost(matrizConfigMapa, pacman.getId(), fantasminha.getId());

        // BFS.menorDistanciaEntreVertices(mapa, pacman, fantasminha, matrizConfigMapa);

        Vertice Ana = new Vertice("Ana");
        Vertice Daniel = new Vertice("Daniel");
        Vertice Georgia = new Vertice("Goergia");
        Vertice Flavia = new Vertice("Flavia");
        Vertice Elias = new Vertice("Elias");
        Vertice Celio = new Vertice("Celio");
        Vertice Hugo = new Vertice("Hugo");

        mapa.adicionar_vertice(Ana);
        mapa.adicionar_vertice(Daniel);
        mapa.adicionar_vertice(Georgia);
        mapa.adicionar_vertice(Flavia);
        mapa.adicionar_vertice(Elias);
        mapa.adicionar_vertice(Celio);
        mapa.adicionar_vertice(Hugo);

        mapa.conectar_vertices(Ana, Daniel);
        mapa.conectar_vertices(Ana, Georgia);
        mapa.conectar_vertices(Ana, Flavia);
        mapa.conectar_vertices(Daniel, Elias);
        mapa.conectar_vertices(Daniel, Flavia);
        mapa.conectar_vertices(Flavia, Celio);
        mapa.conectar_vertices(Flavia, Elias);
        mapa.conectar_vertices(Georgia, Flavia);
        mapa.conectar_vertices(Georgia, Hugo);
        mapa.conectar_vertices(Elias, Celio);
        mapa.conectar_vertices(Celio, Hugo);
        
        BFS buscaLargura = new BFS();
        buscaLargura.breadthFirstSearch(mapa,Ana);

     
    }
}
