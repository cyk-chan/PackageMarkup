public class Markup implements Visitable {

   public Markup (double markupRate) {
     this.markupRate = markupRate;
  }

   public void accept (MarkupVisitor visitor) {
     visitor.visit(this);
   }

   public double getMarkupRate() {
      return markupRate;
   }

  protected  double markupRate;

}
