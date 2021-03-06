package huxibianjie.com.lbscandroid.constant;

/**
 * 项目名:   NetTest2
 * 包名:     com.archie.nettest2.constant
 * 文件名:   HttpConstant
 * 创建者:   Jarchie
 * 创建时间: 17/12/13 下午9:49
 * 描述:     统一管理接口地址
 */

public class HttpConstant {
    //测试服务器url
    private static final String URL = "http://182.92.99.198:8081/hp/api/";

    //获取验证码
    public static String POST_SENTCODE = URL + "user/sentcode";
    //登录
    public static String POST_LOGIN = URL + "user/login";
    //提交数据
    public static String POST_SEVEDATES = URL + "daily/create";
    //首页排行榜
    //95079211322
    public static String GET_USER_RANKINGS=URL + "user/sort";
}
