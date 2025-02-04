package com.ktdsuniversity.edu.fruitseller;

public class FruitSeller {

	/**
	 * 과일 단가
	 */
	private final int FRUIT_PRICE = 500;

	/**
	 * 과일 판매자의 소지금 (영업 준비금)
	 */
	private int money;

	/**
	 * 과일 판매자의 재고
	 */
	private int fruitStock;

	public FruitSeller(int money, int fruitStock) {
		this.money = money;
		this.fruitStock = fruitStock;
	}

	public FruitSeller() {
	}

	public int getMoney() {
		return this.money;
	}

	public int getFruitStock() {
		return this.fruitStock;
	}

	/**
	 * 과일을 판매한다. 과일을 판매하면 판매개수만큼 재고가 줄어야 하며, 판매 개수만큼 소지금이 증가해야 한다.
	 * 
	 * @param quantity 판매개수
	 */
	public void sell(int quantity) {
		if (this.fruitStock >= quantity) {
			this.fruitStock -= quantity;
			this.money += quantity * this.FRUIT_PRICE;
		}
	}

	public void sell() {
		if (this.fruitStock >= 1) {
			this.fruitStock -= 1;
			this.money += 1 * this.FRUIT_PRICE;
		}

		// this.sell(1);
	}

}