package Week_04;
import java.util.Arrays;

/**
 * @author djcd
 * @version V1.0
 * @ClassName：AssignCookies
 * @Description：TODO
 * @date 2020/10/12 0:10
 */
public class BestTimeStockII {

	public int maxProfit(int[] prices) {

		if (prices.length == 1) {
			return 0;
		}

		int profit = 0;

		int previous = prices[0];

		int stock = -1;

		for (int i=1; i< prices.length; i++) {

			if (previous < prices[i]) {
				if (stock == -1) {
					stock = previous;
				}
			} else if (stock != -1 ){
				profit = profit + (previous - stock);
				stock = -1;
			}
			previous = prices[i];
		}

		if (stock < previous && stock != -1 ) {
			profit = profit + (previous - stock);
		}

		return profit;
	}
}
