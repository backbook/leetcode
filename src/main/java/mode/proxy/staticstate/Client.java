package mode.proxy.staticstate;

public class Client {

    public static void main(String[] args) {

        //创建对象
        SellTickets proxyPoint = new ProxyPoint();
        proxyPoint.sell();



    }

}
