package SqlEntity;

public class programEntity {
	public int programNum;//��Ŀ��ţ��������Զ�����
	public int teamNum;//�Ŷӱ�ţ����������team��
	public String programName;//�Ŷ�����
	public String programStartTime;//��ʼʱ��
	public String programEndTime;//��ֹʱ��
	public String programRate;//��Ŀ����
	
	//get��set����
	public int getProgramNum() {
		return programNum;
	}
	public void setProgramNum(int programNum) {
		this.programNum = programNum;
	}
	public int getTeamNum() {
		return teamNum;
	}
	public void setTeamNum(int teamNum) {
		this.teamNum = teamNum;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getProgramStartTime() {
		return programStartTime;
	}
	public void setProgramStartTime(String programStartTime) {
		this.programStartTime = programStartTime;
	}
	public String getProgramEndTime() {
		return programEndTime;
	}
	public void setProgramEndTime(String programEndTime) {
		this.programEndTime = programEndTime;
	}
	public String getProgramRate() {
		return programRate;
	}
	public void setProgramRate(String programRate) {
		this.programRate = programRate;
	}
	
	//toString����
	@Override
	public String toString() {
		return "programEntity [programNum=" + programNum + ", teamNum=" + teamNum + ", programName=" + programName
				+ ", programStartTime=" + programStartTime + ", programEndTime=" + programEndTime + ", programRate="
				+ programRate + "]";
	}
	
}