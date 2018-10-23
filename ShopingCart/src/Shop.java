
public class Shop {

	private Commodity[] goods;
	public static void main(String[] args) {
		
		ShopingCart shopingcart = new ShopingCart(8);
		Shop s = new Shop();
		shopingcart.add(new Phone("iphone6",4000,3));
		shopingcart.add(new Phone("iphone6s",4600,4));
		shopingcart.add(new Phone("xiaomi8",3000,3));
		shopingcart.add(new Computer("hp",6000,5));
		shopingcart.add(new Computer("dell",6000,5));
		shopingcart.printCart();
		System.out.println(shopingcart.getFoot());
		System.out.println("一共需要金额为："+s.paymen(shopingcart));
		shopingcart.del("iphone6");
		System.out.println();
		shopingcart.printCart();
		System.out.println(shopingcart.getFoot());
		System.out.println("一共需要金额为："+s.paymen(shopingcart));
	}
		public  double paymen(ShopingCart sc){
			double sum=0;
			
			goods = sc.getGood();
			for(int i=0;i<sc.getFoot();i++){
				sum+=goods[i].getAmount()*goods[i].getPrice();
			}
			return sum;
		}


}
