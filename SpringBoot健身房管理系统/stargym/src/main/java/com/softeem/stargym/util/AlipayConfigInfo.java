package com.softeem.stargym.util;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfigInfo {
    //↓↓↓↓↓↓↓↓ 请在这里配置您的基本信息 ↓↓↓↓↓↓↓↓

    //应用ID，您的APPID，收款账号既是您的APPID对应的支付宝账号
    public static String app_id = "2016102100733931";
    //商户私钥，您的PKCS8格式RSA2私钥
    public static String  merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCt89oqm/Rd870r9pepQUQZ+ck5WeWCnDvcn0PdDhUwGBO8xaLz1jO1c2NTAF1yctt9baKjpMaCbgIO6anljzz52f/GeBaJXPBiyuNSccq5ZXuskWYGxHckosUqPYL8SsfwAr08BQJJMBUVeT5mAeqfIw01xMYGFrYNO1cTze7ZApxP7HJ6Ezra28me8VDGKupwG4ZGiMWA00kzVfAS9T6hzOQSt69QuxgkWqwiS39Ybel4dK4xmx1BCg7YV9FKlEu0Li7gkRTFENCBlzZGMnJYzf4gxCtjG6KyGGDjonDZdYEot4BfYM/gNzpyQq+LAlM2cOG+LfSP6FdRSR3RggE5AgMBAAECggEBAKXZXSRK1M3O2YnU7fw9ccSiVqwLfbrtYlWSs41LJABatFbCx/5bN6nEfepg6rd3srT/lpUXQPySDfxR494ulyBQLID5deM5bSeD8QBl5balfyik5/WD02RmnD0NsJkCY2X99pYG4IsPAMsccdWn9h4LuUiOd47OkHxFG1ySdysGsg/AAAdCuOy00gUNBxwCVWm7YajX80HUvZV3k0GQK0Kp68lS3KEdy74f0Jj5Dx/FYsEz9JLg+PBb8THvn7UEn5nqq/3zgafPGcmqDyfYPIAj3B/tHyGURbaTOxhPl+Mekmhb30KfjMROcABT0BrP3v2ump5X4wsO+3F6WksbTdECgYEA5113PnA3ZvJoaq02aCKXc4i2A2/bzQV7Rm0MAUz8V+p3+8OHJMRCcvK8CJGJcrpDkm/F6vOO+ZCP+0qoNsGJYDC7NNs2tK1Gs5u/WSdmFCXohXAQznr7cGRbQSqjwohZUmZL8jSwRmsSy3+TplqQizYatd1FqSlforMpgKWDkRsCgYEAwHlwXqJr6Xoq14mN48R2Exl5wMTF7e/Y9J9csbj+w8w0lHQ7g2dPLfyGFAjPpq4LIGKTw5dfhfbDIOsk/E3+oFSWAby4/Gw36EF8lAE4WS63RaRSi5oe0qJUrNOuIdN8B+x+5Ry/hKw+IPpe3PJdtve1utAAO2TBevp/E30XsDsCgYEAma5P4r2PT2Z9TT65APrZNvj8TdQjYE/fzqvoaYTFqXApOqZqQlXK/aeWlup1LivjboWoJaSat9L6kKTKj3SG18oGz9k8wU7Hw84UkBfHimKTzO7fewfdtI40v1ifZjxDeKRSlhPBc0T0OxAG91z43j+WBm9wMik1SVFQpA9NETkCgYAPpc/M4ceEI7p362btrXsr8lZDpbuxrF4nBQ20JSYRJPjhWNG9zRhS1MTRvCWll2CwMVNyA0xwx671biiDmpOo1TeczIr9eo7RAwHtxmueVH3x23oaf10iIrBfnJX7igX7Xu6yEbRARQCIDdLIg6u6xEix91cNfRN9u/+4xeK3IQKBgQCN6i9n8PvfGyUnWJmoA5hTPNeEkup5smLr32YIKRxxnyo2t70+HC3DGgcoaW2k2LMr3zMfSpOTBICeqv3WuIx9h9bRfjTpxPDtUvFpLKgo+SzNatOAv1uRUbhN4fUm6iCChyL8gA0tnKoj1K+eZc5hSRLrSe5Ur1JuvXi4SZnrzQ==";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
    // 对应APPID下的支付宝公钥。
    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjyPC01/63vYst01iDGpzn0q9igdBeMoHZSh3QNMyyvshCdBpR7EAYJMV6eLcXePsyd46QVHMFxMJtMr8utRWSXJ57C/+LimW3ClgDZ6S6b+4DPy9+KDOQfV5QJ4+dspTByUkCBEawxNwM/5s+W6kYYivopDPVL+f42viDW/zTz9RkB9wHixY0aFqz5RGS3Hrgs0Yn4+R4FzbQGJJ1jMfwOPhSualNoMBEOOmcSMF7QQAKnbnPU4628UMjKRxykXGWrOBQOSobGzmjuoIpA9xDjKZcXNmUOsDcUigToC84VWL1/ck8X91e37Pql4wGP5EJyLQJdZxTx4R3VbLX38TGwIDAQAB";

    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /**
     * 返回的时候此页面不会返回到用户页面，只会执行你写到控制器里的地址
     */
    public static String notify_url="http://localhost:8080/client/notify_url.html";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /**
     * 此页面是同步返回用户页面，也就是用户支付后看到的页面，上面的notify_url是异步返回商家操作，谢谢
     * 要是看不懂就找度娘，或者多读几遍，或者去看支付宝第三方接口API，不看API直接拿去就用，遇坑不怪别人,
     * 要使用外网能访问的ip,建议使用花生壳,内网穿透
     */
    public static String return_url = "http://localhost:8080/clinet/return_url.html";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl="https://openapi.alipaydev.com/gateway.do";
    // 日志地址,这里在d盘下要创建这个文件,不然会报错
    public static String log_path = "D:/logs/";
    // ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     *      要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_"
                    + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
