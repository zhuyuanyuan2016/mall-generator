package io.generator.template.interfaces;

/**
 * 可排序接口
 *
 * @author xuyanjun
 * @date 2019-07-30
 */
public interface Sortable {

    /**
     * 获取排序字段
     *
     * @return 排序字段
     */
    String getSortField();

    /**
     * 设置排序字段
     *
     * @param sortField 排序字段
     */
    Sortable setSortField(String sortField);

    /**
     * 获取排序方向
     *
     * @return 排序方向
     */
    String getSortDirection();

    /**
     * 设置排序方向
     *
     * @param sortDirection 排序方向
     */
    Sortable setSortDirection(String sortDirection);
}
