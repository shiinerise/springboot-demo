package com.xiaoxi.uitl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    public static int CODE_SUCCESS = 1;
    public static int CODE_FAILED = 0;
    /**
     * 请求是否正常
     */
    private int code;

    /**
     * 返回的信息
     */
    private String msg;


    /**
     * 返回的具体数据
     */
    private Object data;

    public static Result success(String msg, Object data) {
        return new Result(CODE_SUCCESS, msg, data);
    }

    public static Result failed(String msg) {
        return new Result(CODE_FAILED, msg, null);
    }
}
