package io.generator.template.input;


import io.generator.template.constants.PageConstants;
import io.generator.template.interfaces.Pageable;
import io.generator.template.interfaces.Sortable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.commons.lang.StringUtils;

/**
 * class
 *
 * @author xuyanjun
 * @date 2019-07-01
 */
@Getter
@Setter
@Accessors(chain = true)
public class PagedAndSortedInput extends BaseInput implements Pageable, Sortable {

    /**
     * 页码
     */
    private Integer pageIndex;

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 排序字段名
     */
    private String sortField;

    /**
     * 排序方向
     */
    private String sortDirection;

    @Override
    public Integer getPageIndex() {
        if (pageIndex == null || pageIndex <= 0) {
            pageIndex = 1;
        }
        return pageIndex;
    }

    @Override
    public Integer getPageSize() {
        if (pageSize == null) {
            pageSize = PageConstants.DEFAULT_PAGE_SIZE;
        }

        if (pageSize <= 0 || pageSize > PageConstants.MAX_PAGE_SIZE) {
            pageSize = PageConstants.DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }

    @Override
    public String getSortDirection() {
        if (StringUtils.isBlank(sortDirection)) {
            return PageConstants.DEFAULT_SORT_DIRECTION;
        }
        if (PageConstants.ASC_SORT_DIRECTION.equalsIgnoreCase(sortDirection)) {
            return PageConstants.ASC_SORT_DIRECTION;
        }
        return PageConstants.DESC_SORT_DIRECTION;
    }

    public boolean isAsc() {
        return PageConstants.ASC_SORT_DIRECTION.equalsIgnoreCase(getSortDirection());
    }
}
