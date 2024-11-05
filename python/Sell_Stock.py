from typing import List


def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        buyprice = prices[0]
        for price in prices:
            if price < buyprice:
                buyprice = price
            profit = max(profit, price - buyprice)
        return profit