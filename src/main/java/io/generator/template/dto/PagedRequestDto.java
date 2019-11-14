package io.generator.template.dto;

import io.generator.template.interfaces.Pageable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 分页请求Dto
 *
 * @author xuyanjun
 * @date 2019-06-28
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class PagedRequestDto extends BaseRequestDto implements Pageable {

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 当前页码
     */
    private Integer pageIndex;
}