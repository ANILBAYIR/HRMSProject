package kodlamaio.hrms.entities.concretes;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@Table(name = "candidates")
@NoArgsConstructor
@AllArgsConstructor
public class Candidate extends User{
	
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String identificationNumber;
	
	@Column(name="date_of_birth")
	private Date birthDate;
}
