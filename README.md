# PackageMarkup

- To build the file, simply do 'javac *.java'
- To test the output of the applicaton, do 'java PackageProject'
- The implementation of the Package Markup uses the Vistor Design pattern where MarkupVisitor is the visitor object that calculates the Markup as it navigate through different Markup
- Different markup can be added to the project (PackageProject) in any arbitrary order, except for the FlatMarkup which must be added last.
- The main interfaces for using this package are Markup and PackageProject.  The user can instantiate or extend the Markup to add any new Markup calculation and add it to the PackageProject to calculate the Total Project cost
- The main advantage of this implementation is that the detail of each markup calculation is isolated within each Markup object and it can be extended to add additional logic as required

