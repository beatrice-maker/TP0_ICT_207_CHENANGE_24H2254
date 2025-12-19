public class TestDivision {
    public static void main(String[] args){
        Division d = new Division();
        double resultat1 = d.diviser(10,2);
        System.out.println("Resultat (methode d'instance):" + resultat1);
        double resultat2 = Division.diviserStatic(10,2);
        System.out.println("Resultat (methode de classe) :" + resultat2);
    }
}
