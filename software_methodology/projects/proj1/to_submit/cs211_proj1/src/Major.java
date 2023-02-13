/**
 * Enum class for the available major names, major codes, and school names;
 */
public enum Major {
    /**
     * Computer Science Major
     */
    CS ("01:198","CS","SAS"),
    /**
     * Math Major
     */
    MATH ("01:640","MATH","SAS"),
    /**
     * Electrical Engineering Major
     */
    EE ("14:332","EE","SOE"),
    /**
     * Information Technology and Informatics Major
     */
    ITI ("04:547","ITI","SC&I"),
    /**
     * Business Analytics and Information Technology Major
     */
    BAIT ("33:136","BAIT","RBS");

    private final String majorName;
    private final String majorCode;
    private final String schoolName;

    /**
     * Constructor for Major
     * @param majorName the name of the major
     * @param majorCode the code of the major
     * @param schoolName the name of the school which the major is located in
     */
    private Major(String majorName, String majorCode, String schoolName) {
        this.majorName = majorName;
        this.majorCode = majorCode;
        this.schoolName = schoolName;
    }
    /**
     * Method to print given student's major with the correct formatting for display
     * @return String to be formatted as: (majorName majorCode schoolCode)
     */
    public String getDisplayName(){
        return "(" + this.majorName + " "+  this.majorCode + " " + this.schoolName + ")";
    }
};
