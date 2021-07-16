package VendingMachine;

public interface Calculator {
	
	int calculatetotal(CoinBundle enterdCoins);
	CoinBundle calculatechange(int amountMoneyToReturn);
	

}
