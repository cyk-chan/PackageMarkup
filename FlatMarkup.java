public class FlatMarkup extends Markup {

   public FlatMarkup(double markupRate) {
      super(markupRate);
   }

   //This function is necessary to override the parent class
   //so that visitor knows it has to invoke this instead of the parent
 
   public void accept (MarkupVisitor visitor) {
     visitor.visit(this);
   }

}
