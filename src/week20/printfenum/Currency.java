package week20.printfenum;

public enum Currency {

    IranianRial(48115),
    VietnameseDong(25977),
    IndonesianRupiah(16464),
    SierraLeoneanLeone(13007),
    LaotianKip(12993),
    UzbekSum(12422);


    public final int valueFromEUR;

    Currency(int value) {
        valueFromEUR = value;
    }
}
