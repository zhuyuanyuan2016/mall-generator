package io.generator.template.dto.enums;

/**
 * 响应码枚举
 *
 * @author xuyanjun
 * @date 2019-06-01
 */
public enum ResponseCodeEnum {

    /* ********** 全局错误 9999以下 *********** */

    /**
     * 参数错误
     */
    INVALID_ARGUMENT(1, "参数错误。"),

    /**
     * 不合法状态
     */
    INVALID_STATE(2, "参数错误。"),

    /**
     * 用户未认证
     */
    USER_UNAUTHENTICATED(10, "用户未认证,请先登录。"),

    /**
     * 用户无权限
     */
    USER_UNAUTHORIZED(11, "用户无权限。"),

    /**
     * 用户Token 不合法
     */
    USER_TOKEN_ERROR(12, "用户Token 不合法,请重新登录。"),

    /**
     * 用户Token 已过期
     */
    USER_TOKEN_EXPIRED(14, "用户Token 已过期,请重新登录。"),

    /**
     * 用户是游客
     */
    USER_IS_VISITOR(7000, "用户是游客"),

    /**
     * 用户未绑定手机号
     */
    USER_NOT_BIND_MOBILE(7001, "用户未绑定手机号"),

    /**
     * 服务器错误
     */
    SERVER_ERROR(9999, "服务器开小差了。"),

    /**
     * 数据库操作错误
     */
    DB_ACCESS_ERROR(9998, "DB_ACCESS_ERROR。"),


    /* ********** 成功 10000 *********** */

    /**
     * 成功
     */
    SUCCESS(10000, "成功");

    /* ********** 业务异常 20000以上 *********** */


    /**
     * 值
     */
    private int value;

    /**
     * 描述
     */
    private String description;


    ResponseCodeEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
