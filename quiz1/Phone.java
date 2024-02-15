public class Phone {
    private String countryCode; // default +90
    private String code; // 4 digit number
    private String number; // 7 digit number
    private String type; // home, office or mobile

    // Constructor that receives all parameters
    public Phone(String countryCode, String code, String number, String type) {
        this.countryCode = countryCode;
        this.code = code;
        this.number = number;
        this.type = type;
    }

    // Constructor with default country code
    public Phone(String code, String number, String type) {
        this.countryCode = "+90";
        this.code = code;
        this.number = number;
        this.type = type;
    }

    // Get methods
    public String getCountryCode() {
        return countryCode;
    }

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    //set methods
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Display method
    public void display() {
        System.out.println("Country Code: " + countryCode);
        System.out.println("Area Code: " + code);
        System.out.println("Number: " + number);
        System.out.println("Type: " + type);
    }

}