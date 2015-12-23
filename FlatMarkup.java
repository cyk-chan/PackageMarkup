public class FlatMarkup extends Markup {

   public FlatMarkup(double markupRate) {
     super(markupRate);
   }

   public void accept (MarkupVisitor visitor) {
     visitor.visit(this);
   }

   /* public double getFlatMarkupRate() {
     return markupRate;
   } */

}
