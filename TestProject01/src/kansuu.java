
public class kansuu {

	 public static int totalPrice(int fruitPrice, double tax, int haiso) {
	        return (int) (fruitPrice * tax) + haiso;
	    }

	    // オーバーロードしたメソッド（デフォルト値）
	    public static int totalPrice(int fruitPrice) {
	        return totalPrice(fruitPrice, 1.08, 350);  // tax=1.08, haiso=350 のデフォルト値を設定
	    }

	    public static void main(String[] args) {
	        // オーバーロードしたメソッドを使って、デフォルト値を使用
	        System.out.println(totalPrice(300));  // 引数300に対して計算
	    }
	}