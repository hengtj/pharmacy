package heng.pharmacy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class City extends GenericDomain {
	@Column(length = 50, nullable = false)
	private String name;

	@ManyToOne
	@JoinColumn(nullable = false)
	private State state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}



}
