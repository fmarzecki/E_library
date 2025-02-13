
package com.mikolaj.e_library.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Getter
@Setter
@Table(name="EmployeeManager", indexes={ @Index(name="FKEmployeeMa917923", columnList="UserId") })
public class EmployeeManager implements Serializable {
	public EmployeeManager() {
	}
	
	@Column(name="empManId", nullable=false, unique=true, length=10)	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@org.hibernate.annotations.GenericGenerator(name="COM_MIKOLAJ_EMPLOYEEMANAGER_EMPMANID_GENERATOR", strategy="identity")
	private int empManId;
	
	@Column(name="monthlyPay", length=10)
	private Integer monthlyPay;
	
	@Column(name="UserId", nullable=false, length=10)	
	private int userId;

	
	public String toString() {
		return String.valueOf(getEmpManId());
	}
	
}
