abstract class MobileRechargePlan{
	protected String planName;
	protected double planAmount;
	protected int validityDays;
	public MobileRechargePlan(String planName, double planAmount, int validityDays){
		this.planName = planName;
		this.planAmount = planAmount;
		this.validityDays = validityDays;
	}
	abstract void displayPlanDetails();
	abstract double calculateRechargeAmount(double talkTime);
	public void basicInfo(){
	System.out.println("Plan Name: " + planName);
	System.out.println("Plan Amount:  " + planAmount);
	System.out.println("Validity: " + validityDays);
	}
}
class PrepaidRecharge extends MobileRechargePlan{
	private double ratePerMinute;
	public PrepaidRecharge(String planName, double planAmount, int validityDays, double ratePerMinute){
	super(planName,planAmount,validityDays); // super keyword is used to access super class constructor.
	this.ratePerMinute = ratePerMinute;
	}
	@Override
	void displayPlanDetails(){
	System.out.println("Prepaid Plan Details");
	basicInfo();
	System.out.println("Rate per Minute:  Rs" + ratePerMinute);
	}
	@Override
	double calculateRechargeAmount(double talkTime){
		return planAmount + (talkTime * ratePerMinute);
	}
}
class PostpaidRecharge extends MobileRechargePlan{
	private double monthlyRental;
	public PostpaidRecharge(String planName, double planAmount, int validityDays, double monthlyRental){
	super(planName, planAmount, validityDays);
	this.monthlyRental = monthlyRental;
}
@Override
void displayPlanDetails(){
	System.out.print("Postpaid plan Details");
	basicInfo();
	System.out.println("Monthly Rental: Rs" + monthlyRental);
}
@Override
double calculateRechargeAmount(double talkTime){
	return monthlyRental + (talkTime * 0.5);
}
}
class plan{
	public static void main(String[] args){
	PrepaidRecharge prepaid = new PrepaidRecharge("Super Saver", 199, 28,1.0);
	prepaid.displayPlanDetails();
	System.out.println("Recharge Amount: " + prepaid.calculateRechargeAmount(100));
	PostpaidRecharge postpaid = new PostpaidRecharge("Premium Plus", 399, 30, 399);
	postpaid.displayPlanDetails();
	System.out.println("Bill Amount: " + postpaid.calculateRechargeAmount(100));
	}
}