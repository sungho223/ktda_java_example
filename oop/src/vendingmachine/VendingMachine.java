
package vendingmachine;

/**
 * 자판기 자판기가 상품을 판매한다. 자판기 has a 상품 (VendingMachine has a Items)
 */
public class VendingMachine {

	/**
	 * 자판기가 판매할 상품1 어떤 상품을 판매할 것인지 구체적인 데이터는 없다.
	 */
	Item item1;

	/**
	 * 자판기가 판매할 상품2 어떤 상품을 판매할 것인지 구체적인 데이터는 없다.
	 */
	Item item2;

	/**
	 * 자판기가 판매할 상품3 어떤 상품을 판매할 것인지 구체적인 데이터는 없다.
	 */
	Item item3;

	/**
	 * 자판기가 판매할 상품4 어떤 상품을 판매할 것인지 구체적인 데이터는 없다.
	 */
	Item item4;

	/**
	 * 자판기 인스턴스를 만들어줄 생성자.
	 * 
	 * @param item1 자판기가 판매할 구체적인 상품 정보를 가지고 있는 Item 타입의 인스턴스.
	 * @param item2 자판기가 판매할 구체적인 상품 정보를 가지고 있는 Item 타입의 인스턴스.
	 * @param item3 자판기가 판매할 구체적인 상품 정보를 가지고 있는 Item 타입의 인스턴스.
	 * @param item4 자판기가 판매할 구체적인 상품 정보를 가지고 있는 Item 타입의 인스턴스.
	 */
	public VendingMachine(Item item1, Item item2, Item item3, Item item4) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
	}

	/**
	 * 자판기 상품 버튼을 눌러 구매한다.
	 * 
	 * @param itemName   자판기에서 구매할 상품의 이름
	 * @param orderCount 버튼을 누른 횟수.
	 * @return 구매한 상품의 정보(Item 타입) - Item(구매한 상품의 이름, 구매한 상품의 단가, 구매한 상품의 수량)
	 */
	public Item pressItemButton(String itemName, int orderCount) {
		// 구매자가 구매하려는 상품의 이름과 item1 의 이름이 같은지 비교한다.
		// 같다면 item1은 구매자가 구매하려는 상품이다.
		if (itemName == this.item1.name) {
			// item1 의 재고수량이 버튼을 누른횟수보다 크거나 같은지 비교한다.
			// 크거나 같다면 구매하려는 수량이 충분하다. ==> 구매 가능하다.
			if (this.item1.stock >= orderCount) {
				// 버튼을 누른 횟수 만큼 item1의 재고 수량을 감소시킨다.
				this.item1.stock -= orderCount;

				// 구매자가 구매한 이름과 단가 그리고 버튼을 누른 횟수를 저장해 놓은 상품 인스턴스를 반환시킨다.
				return new Item(this.item1.name, this.item1.price, orderCount);
			} else {
				System.out.println("상품이 품절되었습니다.");
				// null의 의미
				// 메모리에 어떠한 정보도 등록되어 있지 않은 상태
				// == 메모리에 정보가 쓰여져 있지 않다. == 메모리 주소도 없다.
				return null; // 아무것도 반환시키지 마라!
			}
		} else if (itemName == this.item2.name) {
			if (this.item2.stock >= orderCount) {
				this.item2.stock -= orderCount;
				return new Item(this.item2.name, this.item2.price, orderCount);
			} else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
		} else if (itemName == this.item3.name) {
			if (this.item3.stock >= orderCount) {
				this.item3.stock -= orderCount;
				return new Item(this.item3.name, this.item3.price, orderCount);
			} else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
		} else if (itemName == this.item4.name) {
			if (this.item4.stock >= orderCount) {
				this.item4.stock -= orderCount;
				return new Item(this.item4.name, this.item4.price, orderCount);
			} else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
		}
		System.out.println("존재하지 않는 상품입니다.");
		return null;
	}

	/**
	 * 자판기에 재고를 입고시킨다. 단, 판매중인 상품에 대해서만 입고처리된다.
	 * 
	 * @param itemName 입고시키려는 상품의 이름
	 * @param addCount 입고시키려는 상품의 수량
	 */
	public void addItem(String itemName, int addCount) {
		// 입고시키려는 상품의 이름이 item1의 이름과 같다면
		// item1은 자판기가 판매중인 상품이다.
		if (itemName == this.item1.name) {
			// item1 의 재고 수량을 입고수량만큼 증가시킨다.
			this.item1.stock += addCount;
		} else if (itemName == this.item2.name) {
			this.item2.stock += addCount;
		} else if (itemName == this.item3.name) {
			this.item3.stock += addCount;
		} else if (itemName == this.item4.name) {
			this.item4.stock += addCount;
		} else {
			System.out.println("존재하지 않는 상품입니다.");
		}
	}

	/**
	 * 자판기가 판매중인 상품들의 이름과 재고수량을 출력한다.
	 */
	public void printItems() {
		System.out.println("======== Stock ========");
		System.out.println(this.item1.name + " / " + this.item1.stock);
		System.out.println(this.item2.name + " / " + this.item2.stock);
		System.out.println(this.item3.name + " / " + this.item3.stock);
		System.out.println(this.item4.name + " / " + this.item4.stock);
	}
}
