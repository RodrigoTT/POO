public class TesteAnimais {
    public static void public static void main(String[] args) {
        Cachorro c = new Cachorro("Thor", 18);
        Gato g = new Gato("Kiko", 25);
        c.patas = 4;
        g.patas = 4;
        System.out.printf("Nome: %s, Patas: %d\n", c.nome, c.patas);
    }
    
}
