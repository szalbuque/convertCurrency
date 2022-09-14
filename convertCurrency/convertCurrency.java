package convertCurrency;
import javax.swing.JOptionPane;

public class convertCurrency {
    public static void main(String[] args) {
        double taxaDolar = 0.1931;
        double taxaEuro = 0.1932;
        while(true) {
            // https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
            Object op = JOptionPane.showInputDialog(null, "Converter de Reais para:","Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Dólar","Euro"},"Escolha");
            if (op == null) {
                break;
            } else {
                String option = op.toString();
                String input = JOptionPane.showInputDialog("Insira um valor em Reais");
                input.replaceAll(",", ".");
                try {
                    double inputNum = Double.parseDouble(input);
                    switch (option) {
                        case "Dólar":
                            JOptionPane.showMessageDialog(null, "Valor em dólares: " + currencyConverter.getConverted(inputNum, taxaDolar));
                            break;
                        case "Euro":
                            JOptionPane.showMessageDialog(null, "Valor em euros: " + currencyConverter.getConverted(inputNum, taxaEuro));
                            break;
                    }
                }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                }
                }
            }
        }
    }

