# PackageMarkup

- To build the file, simply do 'javac *.java'
- To test the output of the applicaton, do 'java PackageProject'

- The implementation of the Package Markup uses the Vistor Design pattern where MarkupVisitor is the visitor object that calculates the Markup as it navigate through different Markups
- Different markup can be added to the project (PackageProject) in any arbitrary order, except for the FlatMarkup which must be added last.
- The main advantage of this design is that the detail of each markup calculation is isolated within each Markup object and it can be extended to add additional logic as required

- 
