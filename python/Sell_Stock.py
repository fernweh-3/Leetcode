from typing import List


def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        buyprice = prices[0]
        for price in prices:
            if price < buyprice:
                buyprice = price
            profit = max(profit, price - buyprice)
        return profit

# def maxProfit(self, prices: List[int]) -> int:
#         buy , sell, profit   = 0 , 1 ,0
#         while sell < len(prices):
#             if prices[buy] > prices[sell]:
#                 buy  = sell
#             else:
#                 profit = max(profit, prices[sell] - prices[buy])
#             sell += 1
#         return profit