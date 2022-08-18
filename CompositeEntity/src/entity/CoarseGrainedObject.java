package entity;

public class CoarseGrainedObject {
	Employee employee=new Employee();
	Manager manager=new Manager();
	public void setData(String jobState,String satisfaction)
	{
		employee.setJabState(jobState);
		manager.setSatisfaction(satisfaction);
		
		
	}
	public String[] getData()
	{
		return new String[] {"Employee : "+employee.getJabState()+ " , Maneger: "+manager.getSatisfaction()};
		
	}

}
