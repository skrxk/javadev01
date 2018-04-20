package dev.kdh.ani;




public class AndroidVersonInfo {
private String alphaBet;
private String versionNameeng;
private String versionNamekor;
private double version;
private int year;


	public AndroidVersonInfo() {
	super();
}


	public AndroidVersonInfo(String alphaBet, String versionNameeng, String versionNamekor, double version, int year) {
		super();
		this.alphaBet = alphaBet;
		this.versionNameeng = versionNameeng;
		this.versionNamekor = versionNamekor;
		this.version = version;
		this.year = year;
	}


	public String getAlphaBet() {
		return alphaBet;
	}


	public void setAlphaBet(String alphaBet) {
		this.alphaBet = alphaBet;
	}


	public String getVersionNameeng() {
		return versionNameeng;
	}


	public void setVersionNameeng(String versionNameeng) {
		this.versionNameeng = versionNameeng;
	}


	public String getVersionNamekor() {
		return versionNamekor;
	}


	public void setVersionNamekor(String versionNamekor) {
		this.versionNamekor = versionNamekor;
	}


	public double getVersion() {
		return version;
	}


	public void setVersion(double version) {
		this.version = version;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
}

}
