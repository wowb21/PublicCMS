package com.publiccms.entities.log;

//Generated 2015-6-25 11:28:56 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;

import com.sanluan.common.source.entity.MyColumn;

/**
 * LogEmailCheck generated by hbm2java
 */
@Entity
@Table(name = "log_email_check", uniqueConstraints = @UniqueConstraint(columnNames = "code"))
public class LogEmailCheck implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	@MyColumn(title = "用户", condition = true)
	private int userId;
	@MyColumn(title = "邮件地址")
	private String email;
	@MyColumn(title = "验证码", like = true)
	private String code;
	@MyColumn(title = "创建日期", condition = true, order = true)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;
	@MyColumn(title = "验证通过", condition = true)
	private boolean checked;

	public LogEmailCheck() {
	}

	public LogEmailCheck(int userId, String email, String code, Date createDate, boolean checked) {
		this.userId = userId;
		this.email = email;
		this.code = code;
		this.createDate = createDate;
		this.checked = checked;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "code", unique = true, nullable = false, length = 40)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "checked", nullable = false)
	public boolean isChecked() {
		return this.checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

}