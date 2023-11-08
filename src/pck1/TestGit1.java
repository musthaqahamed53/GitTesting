package pck1;

public class TestGit1 {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
  
//line in dev eg
//line in master
	//new line in master

	@Override
	public String toString() {
		return "TestGit1 [name=" + name + ", age=" + age + "]";
	}

//added line to test pull request to master
	//line in dev 2
//line added in local
	//local line 2
	//line for master commit from local
	
//added Framework
//added Framework 2
}
