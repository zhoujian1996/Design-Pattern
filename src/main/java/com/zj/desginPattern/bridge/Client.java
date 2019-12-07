package com.zj.desginPattern.bridge;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/7 0007  12:12
 */
public class Client {
    public static void main(String[] args) {
        FolderPhone folderPhone = new FolderPhone(new XiaoMi());
        folderPhone.open();
    }
}
