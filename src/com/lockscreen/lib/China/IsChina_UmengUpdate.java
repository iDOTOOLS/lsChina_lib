package com.lockscreen.lib.China;

import android.app.Activity;
import android.widget.Toast;

import com.dotools.utils.NetWorkUtils;
import com.dotools.utils.RUtils;
import com.dotools.utils.Utilities;
import com.umeng.update.UmengUpdateAgent;
import com.umeng.update.UmengUpdateListener;
import com.umeng.update.UpdateResponse;
import com.umeng.update.UpdateStatus;

public class IsChina_UmengUpdate {

    public static void umengUpdateInSettingPage(Activity act) {
        com.umeng.update.UmengUpdateAgent.update(act);
    }

    /**
     * 版本更新
     */
    private boolean isCheckUpdata;

    public void versionUpdate(Activity act) {
        // TODO 版本更新

        if (!NetWorkUtils.isNetworkAvailable(Utilities.getApplicationContext())) {
            Toast.makeText(Utilities.getApplicationContext(), RUtils.getStringIdentifier("net_unusual"), Toast.LENGTH_SHORT).show();
            return;
        }
        isCheckUpdata = true;
        UmengUpdateAgent.forceUpdate(act);
        UmengUpdateAgent.setUpdateListener(new UmengUpdateListener() {

            @Override
            public void onUpdateReturned(int arg0, UpdateResponse arg1) {

                if (!isCheckUpdata) {
                    return;
                }
                switch (arg0) {
                    case UpdateStatus.Yes:

                        break;
                    case UpdateStatus.No:
                        Toast.makeText(Utilities.getApplicationContext(), RUtils.getStringIdentifier("newest_version"), Toast.LENGTH_SHORT)
                                .show();
                        break;
                    case UpdateStatus.NoneWifi:

                        break;
                    case UpdateStatus.Timeout:
                        Toast.makeText(Utilities.getApplicationContext(), RUtils.getStringIdentifier("no_net_work"), Toast.LENGTH_SHORT)
                                .show();
                        break;
                }
                isCheckUpdata = false;
            }
        });

    }
}
