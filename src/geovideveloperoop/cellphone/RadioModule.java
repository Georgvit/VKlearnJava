package geovideveloperoop.cellphone;

public class RadioModule {
    public RadioModule() {
        System.out.println("Радиомодуль инициализирован");
    }

    public void call(String number) {
        int length = 10;
        class GSMModule {
            private String phoneNumber;
            private int validNumber;

            public GSMModule(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public boolean isVallid() {
                if (phoneNumber.length() != length){
                    return false;
                } else {
                    try {
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    } catch (NumberFormatException e){
                        return false;
                    }
                }
            }

            public void dialIn(){
                if(isVallid()){
                    System.out.println("Вызываю номер " + validNumber);
                } else {
                    System.out.println("Номер набран не правильно");
                }
            }
        }

        GSMModule module = new GSMModule(number);
        module.dialIn();
    }
}
