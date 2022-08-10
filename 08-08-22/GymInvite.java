class GymInvite
{
 public static void main(String[] gm)
 {
	
	String[] eqp={"dum bell","plates","threadwheel"};
	Trainer trainer=new Trainer("sunder",966565645,2,Gender.MALE);
	trainer.setAge(30);
	Gym gym=new Gym("GOLD",2500d,eqp,trainer);
    gym.printData();
 }
}