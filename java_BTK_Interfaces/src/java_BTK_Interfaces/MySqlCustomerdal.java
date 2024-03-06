package java_BTK_Interfaces;

public class MySqlCustomerdal implements ICustomerDal,IRepository{

	@Override
	public void add() {
		System.out.println("my sql eklendi");
		
	}

}
