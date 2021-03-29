@Override
    public void listar(ArrayList<Acao> acoes) {
        System.out.println("Lista evolução da PETROBRAS");
        for (Acao minhaAcao : acoes) {
            if(preco>atual){
              atual=preco;

            }else
          {
            for (Acao minhaAcao : acoes) {
           if(preco<atual)
           {
             preco=atual;
           }   
          }
        }   
        
    }
