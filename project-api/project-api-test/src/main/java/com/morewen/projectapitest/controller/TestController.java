package com.morewen.projectapitest.controller;



import com.morewen.projectcommoncore.anno.Log;
import com.morewen.projectcommoncore.enums.BusinessType;
import com.morewen.projectcommoncore.utils.AjaxResult;
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
