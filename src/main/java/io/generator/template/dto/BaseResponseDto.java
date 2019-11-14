package io.generator.template.dto;

import io.generator.template.dto.enums.ResponseCodeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 基础响应Dto
 *
 * @author xuyanjun
 * @date 2019-06-28
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class BaseResponseDto<T> {

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 响应码
     */
    private int code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    /**
     * 响应成功
     *
     * @return dto
     */
    public static BaseResponseDto ok() {
        BaseResponseDto responseDto = new BaseResponseDto();
        responseDto.setSuccess(true)
                .setCode(ResponseCodeEnum.SUCCESS.getValue())
                .setMessage(ResponseCodeEnum.SUCCESS.getDescription());
        return responseDto;
    }

    /**
     * 响应成功
     *
     * @param data 数据
     * @param <E>  E
     * @return dto
     */
    public static <E> BaseResponseDto<E> ok(E data) {
        BaseResponseDto<E> responseDto = new BaseResponseDto<>();
        responseDto.setSuccess(true)
                .setCode(ResponseCodeEnum.SUCCESS.getValue())
                .setMessage(ResponseCodeEnum.SUCCESS.getDescription())
                .setData(data);
        return responseDto;
    }

    /**
     * 响应失败
     *
     * @param responseCodeEnum 响应码枚举
     * @return dto
     */
    public static BaseResponseDto error(ResponseCodeEnum responseCodeEnum) {
        BaseResponseDto responseDto = new BaseResponseDto();
        responseDto.setSuccess(false);
        responseDto.setCode(responseCodeEnum.getValue());
        responseDto.setMessage(responseCodeEnum.getDescription());
        return responseDto;
    }

    /**
     * 响应失败
     *
     * @param code    错误码
     * @param message 错误消息
     * @return dto
     */
    public static BaseResponseDto error(int code, String message) {
        BaseResponseDto responseDto = new BaseResponseDto();
        responseDto.setSuccess(false);
        responseDto.setCode(code);
        responseDto.setMessage(message);
        return responseDto;
    }


}
