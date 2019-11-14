package io.generator.template.dto;

import io.generator.template.interfaces.Pageable;
import io.generator.template.interfaces.Sortable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 分页并排序请求Dto
 *
 * @author xuyanjun
 * @date 2019-06-28
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class PagedAndSortedRequestDto extends BaseRequestDto implements Pageable, Sortable {

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 当前页码
     */
    private Integer pageIndex;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序方向
     */
    private String sortDirection;
}