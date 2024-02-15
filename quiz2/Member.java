public class Member extends Person {

    private double weight;

    private double height;

    public Member(int id, String name, String surname, double weight, double height) {
        super(id, name, surname);
        this.weight = weight;
        this.height = height;
    }

    private double bmi(){
        return this.weight / (this.height * this.height);
    }

    public String weightStatus() {
        double bmi = this.bmi();
        if (bmi<18.5){
            return "Thin";
        }
        if (18.5<=bmi & bmi <25 ){
            return "Normal";
        }
        if (25<=bmi & bmi <30 ){
            return "Fat";
        }
        if(bmi>=30){
            return "Obese";
        }
        return "no bmi info found";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
