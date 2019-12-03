package model;

    import javax.persistence.Column;
    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    
    @Entity
    public class Persona {
    	
    	@Id
    	@GeneratedValue(strategy=GenerationType.IDENTITY)
    	private int id;
    	
    	@Column 
    	private String nome;
    	
    	@Column 
    	private String email;
    	
    	@Column 
    	private String telefone;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}	
    	
    	
    
    }
