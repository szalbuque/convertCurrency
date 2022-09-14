package convertCurrency;
import javax.swing.JOptionPane;

public class convertCurrency {
    public static void main(String[] args) {
        while(true) {
            // https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
            String option = JOptionPane.showInputDialog(null, "Escolha uma opção","Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda"},"Escolha").toString();
            switch(option){
                case "Conversor de Moeda":
                    String input = JOptionPane.showInputDialog("Insira um valor em Reais");
                    input.replaceAll( "," , "." );
                    double inputNum = Double.parseDouble( input );
                    JOptionPane.showMessageDialog(null,"Valor convertido: "+currencyConverter.getConverted(inputNum));
            }
        }
    }
}
