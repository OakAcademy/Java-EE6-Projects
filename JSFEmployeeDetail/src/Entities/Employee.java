package Entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class Employee {
	private String Name;
	private String Surname;
	private String Username;
	private String Country;
	private String[] Hobbies;
	private String Passwrod;
	private boolean isAdmin;
	private String Position;
	private int Age;
	private String Gender;
	public List<Employee> Employeelist=new ArrayList<Employee>();

	public void Save()
	{
		Employee employee=new Employee();
		employee.Age=this.Age;
		employee.Country=this.Country;
		employee.Gender=this.Gender;
		employee.Hobbies=this.Hobbies;
		employee.isAdmin=this.isAdmin;
		employee.Name=this.Name;
		employee.Passwrod=this.Passwrod;
		employee.Position=this.Position;
		employee.Surname=this.Surname;
		employee.Username=this.Username;
		Employeelist.add(employee);
		
	}
	
	public List<Employee> getEmployeelist() {
		return Employeelist;
	}

	public void setEmployeelist(List<Employee> employeelist) {
		Employeelist = employeelist;
	}

	public Map<String, Object> AllCountiries = new LinkedHashMap<String, Object>();
	public Map<String, Object> AllHobbies = new LinkedHashMap<String, Object>();

	public Map<String, Object> getAllHobbies() {
		return AllHobbies;
	}

	public void setAllHobbies(Map<String, Object> allHobbies) {
		AllHobbies = allHobbies;
	}

	public Map<String, Object> getAllCountiries() {
		return AllCountiries;
	}

	public void setAllCountiries(Map<String, Object> allCountiries) {
		AllCountiries = allCountiries;
	}

	{

		AllCountiries.put("France", "france");
		AllCountiries.put("England", "england");
		AllCountiries.put("Russia", "russia");
		AllCountiries.put("USA", "usa");
		AllCountiries.put("Italy", "italy");
		AllHobbies.put("Swimming", "swimming");
		AllHobbies.put("Reading", "reading");
		AllHobbies.put("Tracking", "tracking");

	}

public String Convertarraytostring()
{
	return Arrays.toString(Hobbies);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String[] getHobbies() {
		return Hobbies;
	}

	public void setHobbies(String[] hobbies) {
		Hobbies = hobbies;
	}

	public String getPasswrod() {
		return Passwrod;
	}

	public void setPasswrod(String passwrod) {
		Passwrod = passwrod;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

}
