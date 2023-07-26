package com.morewen.models.test.controller;



import com.morewen.common.core.anno.Log;
import com.morewen.common.core.enums.BusinessType;
import com.morewen.common.core.utils.AjaxResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * @author Wangbw
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Log(title = "测试", businessType = BusinessType.OTHER)
    @PreAuthorize("@ss.hasPermi('system:dept:list')")
    @PostMapping("/index")
    protected AjaxResult index(@RequestParam(name = "name") String name) {
        return AjaxResult.success("Hello! " + name);
    }
}
