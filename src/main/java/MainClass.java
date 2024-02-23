public class MainClass {
    public static void main(String[] args) {

        Club c = new Club();
        c.setNome("Flamengo");
        c.setCores("Rubro-negro");
        c.setTorcida(46000000);
        c.setRenda(5000000);

        System.out.println("Nome:" + c.getNome());
        System.out.println("Cores:" + c.getCores());
        System.out.println("Quantidade de torcedores:" + c.getTorcida());
        System.out.println("Renda mensal:" + c.getRenda());
        System.out.println("Renda anual:" + c.rendaAnual());
    }
}