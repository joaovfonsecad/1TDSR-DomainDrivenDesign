public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[10];

        Produto a = new Produto();
        produtos[0] = a;
        Produto b = new Produto();
        produtos[1] = b;
        Produto c = new Produto();
        produtos[2] = c;
        Produto d = new Produto();
        produtos[3] = d;
        Produto e = new Produto();
        produtos[4] = e;
        Produto f = new Produto();
        produtos[5] = f;
        Produto g = new Produto();
        produtos[6] = g;
        Produto h = new Produto();
        produtos[7] = h;
        Produto i = new Produto();
        produtos[8] = i;
        Produto j = new Produto();
        produtos[9] = j;

        for (int x = 0; x < 10; x++) {
            produtos[x].id = x;
            produtos[x].quantidade = Math.random() * 10;
            produtos[x].valor = Math.random() * 300;
            produtos[x].descricao = x + "º produto maravilhoso.";
        }

        for (int x = 0; x < 10; x++) {
            if (produtos[x].valor < 100) {
                System.out.println((x + 1) + "º produto custa menos de 100 reais.");
            }
        }
    }
}
