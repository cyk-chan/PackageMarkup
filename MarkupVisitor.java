public class MarkupVisitor {
   public MarkupVisitor(double projectPrice) {
      this.projectPrice = projectPrice;
   }

   //Special case to calculate the Flat Markup
   public void visit(FlatMarkup markup) {
      totalMarkup += (projectPrice+totalMarkup) * markup.getMarkupRate(); 
       
   }

  public void visit (Markup markup) {
      totalMarkup += projectPrice * markup.getMarkupRate();
  }

   public double getTotalMarkup() {
     return totalMarkup;

   }

   private double totalMarkup;
   private double projectPrice;

}
