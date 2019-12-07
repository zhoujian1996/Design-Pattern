package com.zj.desginPattern.Proxy.Model;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/10/30 0030  11:14
 * 使用者
 */
public class Client {

    private ProxyObject proxyObject;

    public Client(ProxyObject proxyObject) {
        this.proxyObject = proxyObject;
    }
}
