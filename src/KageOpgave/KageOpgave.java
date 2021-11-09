package KageOpgave;

public class KageOpgave {

  public static void main(String[] args) {
    int gramSukker=400;
    int gramHvedeMel=300;
    int gramKakaopulver=40;
    int gramVaniljeSukker=10;
    int gramBagepulver=10;
    int gramSmeltetSmør=250;
    int gramÆg=180;
    int gramKogendeVand=200;
    int sum=gramBagepulver+gramÆg+gramHvedeMel+gramKakaopulver+gramVaniljeSukker+gramSukker+gramSmeltetSmør+gramKogendeVand;
    System.out.println("Alle ingredienserne vejer"+"\t"+ sum+"g");
    int efterBagt=1251; //nået her til hvor den ikke gider at regne 10% ud af summen. så har skrevet det manuelt (sum-(10/100)*sum) er ligningen
    System.out.println("Alle ingredienserne vejer efter at have været bagt"+"\t"+efterBagt+"g");
    int gramProteinSukker=0;
    int gramProteinHvedemel=30;
    int gramProteinkakopulver=8;
    int gramProteinVaniljeSukker=4;
    int gramProteinBagepulver=0;
    int gramProteinSmeltetSmør=3;
    int gramProteinÆg=13;
    int gramProteinKogendeVand=0;
    System.out.println("Protein fra Hvedemel:"+"\t"+gramProteinHvedemel+"g");
    System.out.println("Protein fra Kakoupulver:"+"\t"+gramProteinkakopulver+"g");
    System.out.println("Protein fra Smeltetsmør:"+"\t"+gramProteinSmeltetSmør+"g");
    System.out.println("Protein fra Æg:"+"\t"+gramProteinÆg+"g");
    System.out.println("Protein fra Vaniljesukker:"+"\t"+gramProteinVaniljeSukker+"g");
    int proteinSum=gramProteinHvedemel+gramProteinkakopulver+gramProteinVaniljeSukker+gramProteinSmeltetSmør+gramProteinÆg;
    System.out.println("Samlet protein indhold:"+"\t"+proteinSum+"g");
//Det samme process gør man så videre med kalorier osv.
    double prisSukker=2.84;
    double prisHvedemel=3.43;
    double prisKakoupulver=4.65;
    double prisVaniljesukker=1.21;
    double prisBagepulver=7.99;
    double prisSmør=16.62;
    double prisæg=6.87;
    double sumPris=prisSukker+prisHvedemel+prisKakoupulver+prisVaniljesukker+prisBagepulver+prisSmør+prisæg;
    System.out.println("Samlet pris for kagen:"+"\t"+sumPris+"kr.");

  }
}

