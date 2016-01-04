
package com.lockscreen.lib;

import com.dotools.toolbox.AddTool;
import com.lockscreen.api.ToolBoxAPI;
import com.lockscreen.api.UmengUpdateAPI;

public class LibApp {

    public static void init() {
        UmengUpdateAPI.className = UmengUpdate.class.getName();
        ToolBoxAPI.className = AddTool.class.getName();
    }
}
