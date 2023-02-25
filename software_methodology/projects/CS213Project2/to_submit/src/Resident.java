public class Resident extends Student {

    private int scholarship;

    /**
     * Constructor method for Resident
     * @param profile The profile for resident
     * @param major The major for resident
     * @param creditCompleted The credits completed for resident
     */
    public Resident(Profile profile, Major major, int creditCompleted){
        super(profile, major, creditCompleted);
        this.scholarship = 0;
    }

    /**
     * Setter method for this.scholarship
     * @param scholarship New scholarship amount
     */
    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    /**
     * The tuition due for resident students
     * @param creditsEnrolled The number of credits the resident student is enrolled in
     * @return the tuition which the student is to pay
     */
    public double tuitionDue(int creditsEnrolled){
        if(isValid(creditsEnrolled)){
            int universityFee = 3268;
            int creditsPerHour = 404;
            int exceededCredits = 16;
            int fulltimeCredits = 12;
            int fulltimeTuition = 12536;
            if(creditsEnrolled < fulltimeCredits){ //Parttime students
                double parttimeFeePercentage = 0.8;
                return (parttimeFeePercentage * universityFee) + (creditsPerHour * creditsEnrolled) - this.scholarship;
            }
            if(creditsEnrolled > exceededCredits){ //Students with over 16 credits
                int extraCredits = creditsEnrolled - exceededCredits;
                return (extraCredits * creditsPerHour) + universityFee + fulltimeTuition - this.scholarship;
            } // Fulltime students who don't exceed 16 credits
            return universityFee + fulltimeTuition - this.scholarship;
        }
        return -1; //credits not valid
    }

    /**
     * Method prints this object's class name
     * @return Classname as a string
     */
    public String printClassname(){
        return "Resident";
    }

    /**
     * Determines whether object is a resident
     * @return True if object is resident, false otherwise
     */
    public boolean isResident(){
        return true;
    }

    /**
     * Determines whether object is a TriState
     * @return True if object is TriState, false otherwise
     */
    public boolean isTriState(){
        return false;
    }

    /**
     * Determines whether object is an International
     * @return True if object is International, false otherwise
     */
    public boolean isInternational(){
        return false;
    }

    /**
     * Determines whether object is study abroad
     * @return True if object is study abroad, false otherwise
     */
    public boolean isStudyAbroad(){
        return false;
    }
}

