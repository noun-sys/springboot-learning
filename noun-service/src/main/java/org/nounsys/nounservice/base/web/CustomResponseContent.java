package org.nounsys.nounservice.base.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:gaoxu
 * @create:2020-03-17 16:59
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomResponseContent {
    private Integer code;

    private String status;

    private Object data;

    private String message;
}
