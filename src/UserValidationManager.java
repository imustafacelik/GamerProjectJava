
public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		if(gamer.getBirthDay()==2001 && gamer.getFirstName()=="Mustafa" &&
				gamer.getLastName()=="�elik"&&gamer.getIdentityNumber()==1111111111)
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
