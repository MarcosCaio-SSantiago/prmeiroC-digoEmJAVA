package entities;

public class Client {
   
	 public String nome;
	 public String email;
     public int birthDate;
	 
	 public Client () {
	 }

	public Client(String nome, String email, int birthDate) {
		super();
		this.nome = nome;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
 
	 
	 
}
