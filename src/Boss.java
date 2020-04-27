public class Boss extends Employee {
    private final static int VACATION_MAX  = 3;
    private final static int VACATION_MIN  = 1;
    private final static double SALARY_MULTIPLIER = 2.5;

    public Boss(){
        super();
    }

    public Boss(String name, double  baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary*SALARY_MULTIPLIER, yearsOfExperience, yearsAtCompany);
    }

    public int vacationTime(){
        int vacationTime=0;
        if(getYearsAtCompany() >= YEARS_AT_COMPANY_MAX_VACATION_THRESHOLD){
            vacationTime= VACATION_MAX;
        }
        else if (getYearsAtCompany() >= YEARS_AT_COMPANY_MIN_VACATION_THRESHOLD ){
            vacationTime= VACATION_MIN;
        }
        return vacationTime;
    }

    @Override
    public String motto() {
        return "I am the boss...";
    }

    @Override
    public String toString() {
        return super.toString()+ "\nVacation time: " + vacationTime() + " weeks" ;
    }


}
