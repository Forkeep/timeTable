package team.timeTable;

public class time_table {
	private String teacher_id;
	private String course_id;
	private String class_name;
	private String section1;
	private String section2;
	private String section3;
	private String section4;
	private String section5;
	private String Monday;
	private String Tuesday;
	private String Wednesday;
	private String Thurday;
	private String Friday;
	private String frequency;
	public time_table(String teacher_id, String course_id, String class_name, String section1, String section2,
			String section3, String section4, String section5, String monday, String tuesday, String wednesday,
			String thurday, String friday, String frequency) {
		super();
		this.teacher_id = teacher_id;
		this.course_id = course_id;
		this.class_name = class_name;
		this.section1 = section1;
		this.section2 = section2;
		this.section3 = section3;
		this.section4 = section4;
		this.section5 = section5;
		Monday = monday;
		Tuesday = tuesday;
		Wednesday = wednesday;
		Thurday = thurday;
		Friday = friday;
		this.frequency = frequency;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getSection1() {
		return section1;
	}
	public void setSection1(String section1) {
		this.section1 = section1;
	}
	public String getSection2() {
		return section2;
	}
	public void setSection2(String section2) {
		this.section2 = section2;
	}
	public String getSection3() {
		return section3;
	}
	public void setSection3(String section3) {
		this.section3 = section3;
	}
	public String getSection4() {
		return section4;
	}
	public void setSection4(String section4) {
		this.section4 = section4;
	}
	public String getSection5() {
		return section5;
	}
	public void setSection5(String section5) {
		this.section5 = section5;
	}
	public String getMonday() {
		return Monday;
	}
	public void setMonday(String monday) {
		Monday = monday;
	}
	public String getTuesday() {
		return Tuesday;
	}
	public void setTuesday(String tuesday) {
		Tuesday = tuesday;
	}
	public String getWednesday() {
		return Wednesday;
	}
	public void setWednesday(String wednesday) {
		Wednesday = wednesday;
	}
	public String getThurday() {
		return Thurday;
	}
	public void setThurday(String thurday) {
		Thurday = thurday;
	}
	public String getFriday() {
		return Friday;
	}
	public void setFriday(String friday) {
		Friday = friday;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	
	
	

}