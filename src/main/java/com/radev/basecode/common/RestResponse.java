package com.radev.basecode.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestResponse {
    private Boolean success = true;
    private String message = "";
    private Object data;
}
