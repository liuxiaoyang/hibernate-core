package mytest;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "sys_user_role")
public class SysUserRolePO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer user_id;
	private Date last_update;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private SysRolePO sysRolePO;
	private Integer sys_user_id;

	public Integer getSys_user_id() {
		return sys_user_id;
	}

	public void setSys_user_id(Integer sys_user_id) {
		this.sys_user_id = sys_user_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public SysRolePO getSysRolePO() {
		return sysRolePO;
	}

	public void setSysRolePO(SysRolePO sysRolePO) {
		this.sysRolePO = sysRolePO;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

}
