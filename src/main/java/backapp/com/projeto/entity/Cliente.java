package backapp.com.projeto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {

	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  private String nome;
	  private Long idade;
	  private String status;
	  private String endereço;
	  private String login;
	  private String senha;

	    // Construtores
	    public void cliente() {
	    }

	    public void cliente(String nome, String status, String endereço, String login, String senha) {
	        this.nome = nome;
	        this.status = status;
	        this.endereço = endereço;
	        this.login = login;
	        this.senha = senha;
	    }

	    // Getters e Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Long getIdade() {
	        return idade;
	    }

	    public void setIdade(Long idade) {
	        this.idade = idade;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public String getEndereço() {
	        return endereço;
	    }

	    public void setEndereço(String endereço) {
	        this.endereço = endereço;
	    }

	    public String getLogin() {
	        return login;
	    }

	    public void setLogin(String login) {
	        this.login = login;
	    }

	    public String getSenha() {
	        return senha;
	    }

	    public void setSenha(String senha) {
	        this.senha = senha;
	    }
	}