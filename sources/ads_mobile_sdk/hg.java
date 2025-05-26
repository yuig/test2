package ads_mobile_sdk;

import a.w3;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class hg implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5949a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5950b;

    /* renamed from: c, reason: collision with root package name */
    public w3 f5951c;

    public void a(boolean z13) {
    }

    public final void b() {
        boolean z13 = true;
        this.f5949a = true;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100 && !a()) {
            z13 = false;
        }
        this.f5950b = z13;
        a(z13);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f5950b) {
            this.f5950b = true;
            if (this.f5949a) {
                a(true);
                w3 w3Var = this.f5951c;
                if (w3Var != null) {
                    w3Var.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z13 = runningAppProcessInfo.importance == 100 || a();
        if (this.f5950b != z13) {
            this.f5950b = z13;
            if (this.f5949a) {
                a(z13);
                w3 w3Var = this.f5951c;
                if (w3Var != null) {
                    w3Var.a(z13);
                }
            }
        }
    }

    public boolean a() {
        return false;
    }

    public final void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }
}
