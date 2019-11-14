package io.generator.template.dto;

import io.generator.template.dto.enums.ResponseCodeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 分页响应Dto
 *
 * @author xuyanjun
 * @date 2019-06-28
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class PagedResponseDto<T> extends BaseResponseDto<T> {

    /**
     * 总大小
     */
    private long total;

    /**
     * 每页大小
     */
    private int pageSize;

    /**
     * 当前页码
     */
    private int pageIndex;

    /**
     * 总页数
     */
    private int pageCount;

    /**
     * 响应成功
     *
     * @param data 数据
     * @param total 总数量
     * @param pageIndex 分页页码
     * @param pageSize 每页大小
     * @param <E>  E
     * @return dto
     */
    public static <E> PagedResponseDto<E> ok(E data, long total, int pageIndex, int pageSize) {
        PagedResponseDto<E> responseDto = new PagedResponseDto<>();
        responseDto.setSuccess(true)
                .setCode(ResponseCodeEnum.SUCCESS.getValue())
                .setMessage(ResponseCodeEnum.SUCCESS.getDescription())
                .setData(data);
        responseDto.setTotal(total)
                .setPageIndex(pageIndex)
                .setPageSize(pageSize);

        return responseDto;
    }

    /**
     * 获取总页数
     *
     * @return 总页数
     */
    public int getPageCount() {
        if (total == 0 || pageSize == 0) {
            return 0;
        }
        return (int)(total % pageSize == 0 ? total / pageSize : total / pageSize + 1);
    }


}
