package challenges.java.currencyFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String usOutput = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        // Gambiarra necessária pois a questão NÃO permitía o uso do símbolo da Rúpia, mas sim
        // queria a impressão do "Rs." na moeda.
        Locale indiaLocale = new Locale("en", "IN");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(indiaLocale);
        decimalFormatSymbols.setCurrencySymbol("Rs.");
        DecimalFormat indiaFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(indiaLocale);
        indiaFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String indiaOutput = indiaFormat.format(payment);

        // Outra gambiarra necessária devido à comparação de outputs do hackerRank.
        // o NumberFormat com o locale da china adicionava um símbolo diferente
        // ao solicitado no site. Para funcionar, usei a gambiarra abaixo.
        Locale chinaLocale = Locale.CHINA;
        DecimalFormatSymbols chinaSymbols = new DecimalFormatSymbols(chinaLocale);
        chinaSymbols.setCurrencySymbol("\uFFE5");
        DecimalFormat chinaFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(chinaLocale);
        chinaFormat.setDecimalFormatSymbols(chinaSymbols);
        String chinaOutput = chinaFormat.format(payment);

        // Mais um bug do hackerRank.
        // estava ocorrendo um erro relacionado espaço utilizado na formatação da moeda para a França.
        // O caractere de espaço que está sendo utilizado pelo NumberFormat do java é  espaço não quebrável (\u202F),
        // enquanto o hackerRank espera um espaço comum (\u0020).
        String franceOutput = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        franceOutput = franceOutput.replace('\u202F', ' '); // Substituindo espaço não quebrável pelo espaço comum

        System.out.println("US: " + usOutput);
        System.out.println("India: " + indiaOutput);
        System.out.println("China: " + chinaOutput);
        System.out.println("France: " + franceOutput);

    }
}