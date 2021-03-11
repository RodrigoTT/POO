import javax.swing.JOptionPane;

public class Exercicio1038{
    public static void main(String[]args){
        int ID, CONTADOR;

        ID = Integer.parseInt(JOptionPane.showInputDialog("Qual o Produto?"));

        if(ID == 1){
            JOptionPane.showMessageDialog(null, "Total: R$ %.2f\n",CONTADOR*4.00);
        }
        if(ID == 2){
            JOptionPane.showMessageDialog(null, "Total: R$ %.2f\n",CONTADOR*4.50);
        }
        if(ID == 3){
            JOptionPane.showMessageDialog(null, "Total: R$ %.2f\n",CONTADOR*5.00);
        }
        if(ID == 4){
            JOptionPane.showMessageDialog(null, "Total: R$ %.2f\n",CONTADOR*2.00);
        }
        if(ID == 4){
            JOptionPane.showMessageDialog(null, "Total: R$ %.2f\n",CONTADOR*1.50);
        }

    }
}