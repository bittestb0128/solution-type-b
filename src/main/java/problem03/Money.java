package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return this.amount;
	}
	public Money add(Money money) {
		Money returnMoney  = new Money(money.amount + this.amount);
		return returnMoney;
}

	public Money minus(Money money) {
		Money returnMoney  = new Money( this.amount - money.amount);
		return returnMoney;
	}

	public Money multiply(Money money) {
		Money returnMoney = new Money ( this.amount * money.amount );
		return returnMoney;
	}

	public Money devide(Money money) {
		Money returnMoney = new Money( this.amount / money.amount );
		return returnMoney;
	}
	@Override
	public boolean equals(Object obj) {

	        if (obj == null) {
	            return false;
	        }

	        if (this.getClass() != obj.getClass()) {
	            return false;
	        }

	        if (this == obj) {
	            return true;
	        }

	        Money that = (Money) obj;
	        
	        if (this.amount == that.amount) {
	            return true;
	        }

	        return false;
	    }
	@Override
	public int hashCode(){
		     return super.hashCode()+128;
		  }


}