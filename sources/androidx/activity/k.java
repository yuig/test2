package androidx.activity;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public abstract class k {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
