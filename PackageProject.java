import java.util.*;

public class PackageProject {

    public PackageProject(double baseCost) {
      this.baseCost = baseCost;
      this.markups = new ArrayList<Visitable>();
    }

    public double calculateProjectCost() {

      MarkupVisitor visitor = new MarkupVisitor(baseCost);

      for (Visitable markup: markups) {
         markup.accept(visitor);
      }

      double totalCost = visitor.getTotalMarkup() + baseCost;
      return totalCost;
    }

    public void addMarkup(Visitable markup) {
      markups.add(markup);
    }


   private double baseCost;
   private ArrayList<Visitable> markups;


   public static void main(String args[]) {

      //Case 1;
      PackageProject project = new PackageProject(1299.99);

      project.addMarkup(new PplMarkup(0.012,3));
      project.addMarkup(new Markup(0.13));
      project.addMarkup(new FlatMarkup(0.05));

      System.out.println("Total cost 1 = " + project.calculateProjectCost());

      project = new PackageProject(5432);

      project.addMarkup(new Markup(0.075));
      project.addMarkup(new PplMarkup(0.012,1));
      project.addMarkup(new FlatMarkup(0.05));

      System.out.println("Total cost 2 = " + project.calculateProjectCost());

      project = new PackageProject(12456.95);

      project.addMarkup(new PplMarkup(0.012,4));
      project.addMarkup(new FlatMarkup(0.05));

      System.out.println("Total cost 3 = " + project.calculateProjectCost());
   }

}
