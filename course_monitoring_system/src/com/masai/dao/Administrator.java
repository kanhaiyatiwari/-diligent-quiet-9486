package com.masai.dao;

public interface Administrator {

	public boolean logindao();

	public String  CreateCourse();
	public String  UpdateCourse();
	public String  ViewCourse();
	
	public String  CreateBatch();
	public String  UpdateBatch();
	public String  ViewBatch();
	
	public String  CreateFaculty();
	public String  UpdateFaculty();
	public String  ViewFaculty();
	public String  AloatingBatchfaculty();
}
