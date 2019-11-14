package io.generator.template.interfaces;

/**
 * 可分页接口
 *
 * @author xuyanjun
 * @date 2019-07-30
 */
public interface Pageable {

    /**
     * 获取分页大小
     *
     * @return 分页大小
     */
    Integer getPageSize();

    /**
     * 设置分页大小
     *
     * @param pageSize 分页大小
     */
    Pageable setPageSize(Integer pageSize);

    /**
     * 获取当前页码
     *
     * @return 当前页码
     */
    Integer getPageIndex();

    /**
     * 设置当前页码
     *
     * @param pageIndex 当前页码
     */
    Pageable setPageIndex(Integer pageIndex);
}
