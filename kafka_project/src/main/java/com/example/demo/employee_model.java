package com.example.demo;

public class employee_model {

		private int id;
	    private String name;
	    private String address;
	    private String phonenum;
	    public void user(int id,String name, String address, String phonenum) {
	        this.name = name;
	        this.address = address;
	        this.phonenum = phonenum;
	    }
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhonenum() {
			return phonenum;
		}
		public void setPhonenum(String phonenum) {
			this.phonenum = phonenum;
		}
	}

