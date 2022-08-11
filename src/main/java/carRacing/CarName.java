package carRacing;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class CarName {
    private String name;

    public String getName() {
        return name;
    }

    public CarName(String name){
        validString(name);
        this.name = name;
    }

    private void validString(String name) {
        int size = name.length();

        if( size > 5){
            throw new IllegalArgumentException("5글자 아래의 이름을 입력해주세요.");
        }

        if ( size < 1 ) {
            throw new IllegalArgumentException("1글자는 입력해야합니다.");
        }
    }
}