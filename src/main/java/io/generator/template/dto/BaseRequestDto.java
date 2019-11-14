package io.generator.template.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.Valid;

/**
 * 基础请求Dto
 *
 * @author xuyanjun
 * @date 2019-06-28
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
@Valid
public class BaseRequestDto {

    /**
     * 客户端ip
     */
    private String clientIp;
}
