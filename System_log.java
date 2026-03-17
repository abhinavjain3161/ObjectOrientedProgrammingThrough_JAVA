// ✅ Exercise 11 — System Log Builder

class SystemLog{
	public static void main(String[] args){
	StringBuffer log = new StringBuffer();
	log.append("Login: 10:00 AM\n");
	log.append("File Opened\n");
	log.append("Action Completed\n");
	log.insert(0, "!! PRIORITY MESSAGE !!\n");
	System.out.println(log);
	}
}
		