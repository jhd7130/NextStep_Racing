package carRacing;

/** Role :자동차의 이름과 현 위치를 저장한다
/* Responsibility : 길이를 제한하고 위치와 이름을 저장하면서 불변하게 유지한다. 변경의 경우 새로운 객체를 만들어서 할당해준다
/* Cooperation with : Name과 협력
  **/
public class Car {
    private final CarName name;
    private final String position;

    private Car(CarBuilder carBuilder){
        this.name = carBuilder.name;
        this.position = carBuilder.position;

    }
    public static CarBuilder builder(String name, String position) {
        return new CarBuilder(name, position);
    }

    static class CarBuilder {
        private final CarName name;
        private final String position;
        public CarBuilder(String name, String position){
            this.name = new CarName(name);
            this.position = position;
        }

        public Car build(){
            return new Car(this);
        }
    }

    public String getName() {
        return this.name.getName();
    }

    public String getPosition() {
        return position;
    }
}