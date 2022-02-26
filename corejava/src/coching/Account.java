package coching;

public class Account {
private String number;
private String accounttype;
private double balance;
public Account()
{
	System.out.print("i am defoult ");
}
public Account(String num,String acctype,double balance)
{
	number=num;
	accounttype=acctype;
	this.balance=balance;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account ac=new Account();
Account acc=new Account("1234","saving",20000000);
	}

}
