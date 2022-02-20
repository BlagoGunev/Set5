package week20.printfenum;

public class CurrencyTest {

    public static void main(String[] args) {

        for (Currency currency : Currency.values()) {
            switch (currency) {
                case UzbekSum -> System.out.printf("%d: 1EUR = %d The modern Sum was put into circulation with a ratio of 1 Sum equal to 1000 Sum-coupons from July 1, 1994, by Decree of the President of Uzbekistan.\n", currency.ordinal(), currency.valueFromEUR);
                case LaotianKip -> System.out.printf("%d: 1EUR = %d Since its issue in 1952, the currency did strengthen against the US Dollar and continues to improve its value.\n", currency.ordinal(), currency.valueFromEUR);
                case IranianRial -> System.out.printf("%d: 1EUR = %d Its devaluation started in 1979 after the Islamic Revolution when many businesses left the country because of the uncertain situation. Then came the Iran-Iraq War, and the economic sanctions because of the country’s nuclear program.\n", currency.ordinal(), currency.valueFromEUR);
                case VietnameseDong -> System.out.printf("%d: 1EUR = %d Vietnam is still on its hard path from a centralized economy to a market one, and consequently, this country’s currency is very devalued today.\n", currency.ordinal(), currency.valueFromEUR);
                case IndonesianRupiah -> System.out.printf("%d: 1EUR = %d Due to the low value of old-style banknotes, by presidential decree of September 5, 2016, 7 new banknotes were issued in denominations from 1 thousand to 100 thousand rupiahs.\n", currency.ordinal(), currency.valueFromEUR);
                case SierraLeoneanLeone -> System.out.printf("%d: 1EUR = %d Sierra Leone is a very poor African country, which handled out many serious tests that caused the local money to devalue. Recently, a war took place there, and the deadly Ebola virus is recurrent.\n", currency.ordinal(), currency.valueFromEUR);
            }
        }

    }

}
