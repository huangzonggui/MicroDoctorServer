package com.zhuolang.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tab")
public class User {
	@Id
	//自增
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    @Column(name="nickname", length=225)
	private String nickname;//昵称
    @Column(name="password", length=225)
	private String password;
    @Column(name="name", length=225) 
	private String name;
    @Column(name="age", length=11) 
	private int age;
    @Column(name="gender", length=4)
	private int gender;//性别:男（0）女（1）
    @Column(name="phone", length=225) 
	private String phone;
    @Column(name="address", length=225) 
	private String address;
    @Column(name="signature") 
    private String signature;//个性签名
    @Column(name="introduction") 
    private String introduction;
	@Column(name="type", length=11) 
	private int type;//用户类型:病人（0）医师（1）
	
	 public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getGender() {
			return gender;
		}
		public void setGender(int gender) {
			this.gender = gender;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getSignature() {
			return signature;
		}
		public void setSignature(String signature) {
			this.signature = signature;
		}
		public String getIntroduction() {
			return introduction;
		}
		public void setIntroduction(String introduction) {
			this.introduction = introduction;
		}
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}
		
		@Override
		public String toString() {
			return "User [id=" + id + ", nickname=" + nickname + ", password="
					+ password + ", name=" + name + ", age=" + age + ", gender="
					+ gender + ", phone=" + phone + ", address=" + address
					+ ", signature=" + signature + ", introduction="
					+ introduction + ", type=" + type + "]";
		}
		
}
