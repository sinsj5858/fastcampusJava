package fc.java.poly;

public class TV implements RemoCon{
    private int currch = 10;
    @Override
    public void chUp() {
        currch++;
        if(currch > RemoCon.MAXCH){
            currch = 1;
        }
        System.out.println("ch"+currch);
    }

    @Override
    public void chDown() {
        currch--;
        if(currch < RemoCon.MINCH){
            currch = 99;
        }
        System.out.println("ch"+currch);
    }

    @Override
    public void volUp() {
        System.out.println("TV 소리가 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("TV 소리가 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("TV 인터넷 작동");
    }
    // chUp(), chDown(), colUp(), colDown()
}
