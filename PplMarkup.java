public class PplMarkup extends Markup {
   private int numPpl;

   public PplMarkup (double markupRate, int numPpl) {
     super(markupRate);
     this.numPpl = numPpl;
   }

   public void accept (MarkupVisitor visitor) {
     visitor.visit(this);
   }

   public double getMarkupRate() {
      return (numPpl * markupRate);
   }

}
