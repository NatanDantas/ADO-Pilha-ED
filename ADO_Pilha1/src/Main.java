
public class Main {
  public static void main(String[] args) {
        Pilha p = new Pilha();
        String a = "())(())";
        String linha = "";
        String[] texto = a.split(" ");
        Boolean balanceada;
    
        for (int i = 0; i < p.tamanho(); i++) {
          if (texto[i].length() == ')') {
            p.push(a);
            System.out.println("passou aqui!");
          } else {
            if (p.isVazia()) {
              balanceada = false;
            } else {
              p.pop();
            }
          }
        }
        if(p.isVazia()){
          balanceada = true;
          System.out.println("OK");
       }else{
         balanceada = false;
         System.out.println("Erro");
      }
      
      
  }
}
