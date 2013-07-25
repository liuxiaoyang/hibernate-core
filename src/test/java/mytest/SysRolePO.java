package mytest;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "sys_role")
public class SysRolePO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String role_name;
	private String role_code;
	private Date last_update;
	private Integer sys_user_id;
	private Integer application_id;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private Set<SysRoleResourcesPO> sysRoleResourcesPO;

	public Integer getSys_user_id() {
		return sys_user_id;
	}

	public void setSys_user_id(Integer sys_user_id) {
		this.sys_user_id = sys_user_id;
	}

	public Set<SysRoleResourcesPO> getSysRoleResourcesPO() {
		return sysRoleResourcesPO;
	}

	public void setSysRoleResourcesPO(Set<SysRoleResourcesPO> sysRoleResourcesPO) {
		this.sysRoleResourcesPO = sysRoleResourcesPO;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public Integer getApplication_id() {
		return application_id;
	}

	public void setApplication_id(Integer application_id) {
		this.application_id = application_id;
	}

}
