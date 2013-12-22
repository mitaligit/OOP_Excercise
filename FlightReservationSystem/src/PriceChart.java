import java.util.*;
public class PriceChart {
Map<SeatType, Double> rate = new HashMap<SeatType, Double>();
public Map<SeatType, Double> getRate() {
	return rate;
}
PriceChart(Map<SeatType, Double> rate)
{
	this.rate = rate;
}
public Double getPrice()
{
	//todo tomorrow
	
	return 5.00;
}
}
