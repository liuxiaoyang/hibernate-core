package mytest;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_resources")
public class SysResourcesPO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String resource_name;
	private String resource_type;
	private Integer default_page;
	private String resource_path;
	private String resource_desc;
	private Integer enabled;
	private Date last_update;
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

	public String getResource_name() {
		return resource_name;
	}

	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}

	public String getResource_type() {
		return resource_type;
	}

	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
	}

	public Integer getDefault_page() {
		return default_page;
	}

	public void setDefault_page(Integer default_page) {
		this.default_page = default_page;
	}

	public String getResource_path() {
		return resource_path;
	}

	public void setResource_path(String resource_path) {
		this.resource_path = resource_path;
	}

	public String getResource_desc() {
		return resource_desc;
	}

	public void setResource_desc(String resource_desc) {
		this.resource_desc = resource_desc;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

}
