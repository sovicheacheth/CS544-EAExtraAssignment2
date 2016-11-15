package edu.mum.cs544.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Sovichea Cheth
 * @id 985421
 * @description EA Extra Credit Assignment 2
 *
 */

@Entity
public class Project {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String desc;

	public Project(int id, String name, String desc, Date startDate, Date endDate, Date status,
			List<Beneficiaries> beneficiaries, byte[] pic, User createdBy, String location, List<Task> tasks) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.beneficiaries = beneficiaries;
		this.pic = pic;
		this.createdBy = createdBy;
		this.location = location;
		this.tasks = tasks;
	}

	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	@Enumerated(EnumType.STRING)
	private Date status;

	@Enumerated(EnumType.STRING)
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "project_Beneficiaries", joinColumns = @JoinColumn(name = "p_id"), inverseJoinColumns = @JoinColumn(name = "beneficiaries_id"))
	private List<Beneficiaries> beneficiaries;

	@Column(columnDefinition = "LONGBLOB")
	private byte[] pic;

	@ManyToOne(cascade = { CascadeType.ALL })
	private User createdBy;

	private String location;

	@OneToMany(mappedBy = "project", cascade = { CascadeType.ALL })
	private List<Task> tasks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Project(String name, String desc, Date startDate, Date endDate, Date status,
			List<Beneficiaries> beneficiaries, byte[] pic, User createdBy, String location, List<Task> tasks) {
		super();
		this.name = name;
		this.desc = desc;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.beneficiaries = beneficiaries;
		this.pic = pic;
		this.createdBy = createdBy;
		this.location = location;
		this.tasks = tasks;
	}

	public void addTask(Task t) {
		// TODO Auto-generated method stub
		this.tasks = (List<Task>) t;
		
	}

	public void addBeneficiaries(Beneficiaries b) {
		// TODO Auto-generated method stub
		this.beneficiaries = (List<Beneficiaries>) b;
	}
	
	public Project(){}

	public void setStatus(Status pending) {
		// TODO Auto-generated method stub
		
	}

}
