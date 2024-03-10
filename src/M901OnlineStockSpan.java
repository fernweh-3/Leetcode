import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class M901OnlineStockSpan {
    class StockSpanner {
        List<Integer> list;

        public StockSpanner() {
            list = new ArrayList<>();
        }

        public int next(int price) {
            list.add(price);
            int result = 0, i = list.size();
            while (i >= 0) {
                if (list.get(i-1) <= price) {
                    result++;
                    i--;
                }else break;
            }
            return result;
        }
    }
}
