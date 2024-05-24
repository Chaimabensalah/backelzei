package com.example.app.javatechie.spring.auth.example.monthlydata;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.app.javatechie.spring.auth.example.CRA.CRA;
import com.example.app.javatechie.spring.auth.example.client.Client;
import com.example.app.javatechie.spring.auth.example.mission.Mission;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;


@Entity
@Table(name = "monthlyData") // Corrected placement
public class monthlyData implements Serializable {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "facture") 
    private String facture;

    @Column(name = "autre") 
    private String autre;

    @Column(name = "totalPercu") 
    private String totalPercu;

    @Column(name = "cout")
    private String cout;
    

    
    @OneToOne
    @JoinColumn(name = "salariesid")
    private Salaries salariesid;
    
    @OneToOne
    @JoinColumn(name = "missionid")
    private Mission missionid;
    
    @OneToOne
    @JoinColumn(name = "craid")
    private CRA craid;
    
    
    public monthlyData () {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFacture() {
		return facture;
	}


	public void setFacture(String facture) {
		this.facture = facture;
	}


	public String getAutre() {
		return autre;
	}


	public void setAutre(String autre) {
		this.autre = autre;
	}


	public String getTotalPercu() {
		return totalPercu;
	}


	public void setTotalPercu(String totalPercu) {
		this.totalPercu = totalPercu;
	}


	public String getCout() {
		return cout;
	}


	public void setCout(String cout) {
		this.cout = cout;
	}


	public Salaries getSalariesid() {
		return salariesid;
	}


	public void setSalariesid(Salaries salariesid) {
		this.salariesid = salariesid;
	}


	public Mission getMissionid() {
		return missionid;
	}


	public void setMissionid(Mission missionid) {
		this.missionid = missionid;
	}


	public CRA getCraid() {
		return craid;
	}


	public void setCraid(CRA craid) {
		this.craid = craid;
	}


	@Override
	public String toString() {
		return "monthlyData [id=" + id + ", facture=" + facture + ", autre=" + autre + ", totalPercu=" + totalPercu
				+ ", cout=" + cout + ", salariesid=" + salariesid + ", missionid=" + missionid + ", craid=" + craid
				+ ", getId()=" + getId() + ", getFacture()=" + getFacture() + ", getAutre()=" + getAutre()
				+ ", getTotalPercu()=" + getTotalPercu() + ", getCout()=" + getCout() + ", getSalariesid()="
				+ getSalariesid() + ", getMissionid()=" + getMissionid() + ", getCraid()=" + getCraid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public monthlyData(int id, String facture, String autre, String totalPercu, String cout, Salaries salariesid,
			Mission missionid, CRA craid) {
		super();
		this.id = id;
		this.facture = facture;
		this.autre = autre;
		this.totalPercu = totalPercu;
		this.cout = cout;
		this.salariesid = salariesid;
		this.missionid = missionid;
		this.craid = craid;
	}


    
    
    
    
    
}