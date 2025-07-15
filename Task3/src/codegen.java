class Task3 {
    public static Codegen create () throws CodegenException {
	CgenClass cgen = new CgenClass();
        return cgen;} }

class CgenClass implements Codegen {
   
   String commands = "" ;   
   //int ifcount = 0;
   //int whilecount = 0;
   //int repreatcount = 0;
   
   //codegenProg? returns string
   @Override
   public String codegen ( Program p ) throws CodegenException {
      commands = "";
      for (Declaration dec: p.decls){
          codegenDecl(dec);
      }
      return commands;
   } 
   
   //Codegen declaration translates declarations
   public void codegenDecl(Declaration d) throws CodegenException{
       
   }
   
   //Codegen exp translates expressions
   //Using pseudo from http://users.sussex.ac.uk/~mfb21/compilers/slides/12 
   public void codegenExp (Exp e) throws CodegenException{
       if (e instanceof IntLiteral){
       commands = commands + "\n\t" + "li $ao" + ((IntLiteral)e).n;
   }
   }
   
   //stuff from lectures this doesn't work
   interface Representation{
       public void addRepresenation (AST s);
   }
   class StackMachineAssembly implements Representation{
       List<String> instrs;
       
       String emitcode() {
           
       }
       
       void addRepresenation ( AST s){
           if (s instanceof ForLoop){
               addRepresenation((ForLoop) s)
           } 
           else if (s instance of Assign)
       }
       
       void addToRepresenation(Sequence s){
           addToRepresenation(s.lhs);
           addToRepresentation(s.rhs);
       }
   }
   abstract class Statement implements asts{
       
   }
   abstract class Expression implements asts{
       
   }
   
   class Sequence inherits Statement{
    public Statement lhs; public Statement rhs;
}
   
}
