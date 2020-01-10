package models;

public class Request {
	private int reqId;
	private int userId;
	private String reqName;
	private String reqType;
	private String reqDesc;
	private String reqJustify;
	private String reqDatetime;
	private String reqPlace;
	private String reqGradeType;
	private String reqGradePass;
	private double reqAmt;
	private int stage;
	
	public Request() {
		super();
	}

	public Request(int reqId, int userId, String reqName, String reqType, String reqDesc, String reqJustify,
			String reqDatetime, String reqPlace, String reqGradeType, String reqGradePass, double reqAmt, int stage) {
		super();
		this.reqId = reqId;
		this.userId = userId;
		
		this.reqName = reqName;
		this.reqType = reqType;
		this.reqDesc = reqDesc;
		
		this.reqJustify = reqJustify;
		this.reqDatetime = reqDatetime;
		this.reqPlace = reqPlace;
		
		this.reqGradeType = reqGradeType;
		this.reqGradePass = reqGradePass;
		
		this.reqAmt = reqAmt;
		this.stage = stage;
	}

	public int getReqId() {
		return reqId;
	}

	public void setReqId(int reqId) {
		this.reqId = reqId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getReqName() {
		return reqName;
	}

	public void setReqName(String reqName) {
		this.reqName = reqName;
	}

	public String getReqType() {
		return reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	public String getReqDesc() {
		return reqDesc;
	}

	public void setReqDesc(String reqDesc) {
		this.reqDesc = reqDesc;
	}

	public String getReqJustify() {
		return reqJustify;
	}

	public void setReqJustify(String reqJustify) {
		this.reqJustify = reqJustify;
	}

	public String getReqDatetime() {
		return reqDatetime;
	}

	public void setReqDatetime(String reqDatetime) {
		this.reqDatetime = reqDatetime;
	}

	public String getReqPlace() {
		return reqPlace;
	}

	public void setReqPlace(String reqPlace) {
		this.reqPlace = reqPlace;
	}

	public String getReqGradeType() {
		return reqGradeType;
	}

	public void setReqGradeType(String reqGradeType) {
		this.reqGradeType = reqGradeType;
	}

	public String getReqGradePass() {
		return reqGradePass;
	}

	public void setReqGradePass(String reqGradePass) {
		this.reqGradePass = reqGradePass;
	}

	public double getReqAmt() {
		return reqAmt;
	}

	public void setReqAmt(double reqAmt) {
		this.reqAmt = reqAmt;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	@Override
	public String toString() {
		return "Request [reqId=" + reqId + ", userId=" + userId + ", reqName=" + reqName + ", reqType=" + reqType
				+ ", reqDesc=" + reqDesc + ", reqJustify=" + reqJustify + ", reqDatetime=" + reqDatetime + ", reqPlace="
				+ reqPlace + ", reqGradeType=" + reqGradeType + ", reqGradePass=" + reqGradePass + ", reqAmt=" + reqAmt
				+ ", stage=" + stage + "]";
	}

}
