package Encryptor;

public abstract class BaseInfo {
    String cryp;
    String str;

    public BaseInfo(String cryp, String str) {
        this.cryp = cryp;
        this.str = str;
    }

    public abstract String inCrypt();
    public abstract String outCrypt();


}
