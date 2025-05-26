package ads_mobile_sdk;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes2.dex */
public abstract class hr1 {

    /* renamed from: a, reason: collision with root package name */
    public static UiModeManager f6058a;

    public static void a(Context context) {
        f6058a = (UiModeManager) context.getSystemService("uimode");
    }

    public static int a() {
        UiModeManager uiModeManager = f6058a;
        if (uiModeManager == null) {
            return 3;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? 3 : 1;
        }
        return 2;
    }
}
