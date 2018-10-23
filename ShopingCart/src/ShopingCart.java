/*****
 * 
 * @author include
 *
 */
class ShopingCart{
	private Commodity[] goods;
	private int foot;
	public ShopingCart(int len) {
		if(len>0) {
			this.goods=new Commodity[len];
		}else {
			this.goods=new Commodity[1];
		}
	}
	public boolean add(Commodity commodity) {
		if(this.foot<this.goods.length) {
			this.goods[this.foot]=commodity;
			this.foot++;
			return true;
		}else {
			return false;
		}
	}
	public boolean del(String name) {
		for(int i=0;i<this.foot;i++){
			if(goods[i].getName().equals(name))	{
				for(int j=i;j<this.foot-1;j++){
					if(j!=this.foot-1){	
						goods[j]=goods[j+1];
					}else{
						goods[j]=goods[j];
					}
				}
				foot--;
				return true;
			}
			
		}
		return false;
	}

	public void printCart() {
		for(int i=0;i<foot;i++) {
			System.out.println(goods[i].getName()+","
		     +goods[i].getAmount()+","+goods[i].getPrice());
			
		}
	}
	public Commodity[] getGood(){
		return goods;
	}
	public int getFoot(){
		return foot;
	}

}
