package hn;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public boolean f69597a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f69598b;

    /* renamed from: c, reason: collision with root package name */
    public d f69599c;

    public void a(boolean z13) {
    }

    public boolean b() {
        return false;
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
        if (!this.f69598b) {
            this.f69598b = true;
            if (this.f69597a) {
                a(true);
                d dVar = this.f69599c;
                if (dVar != null) {
                    dVar.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z13 = runningAppProcessInfo.importance == 100 || b();
        if (this.f69598b != z13) {
            this.f69598b = z13;
            if (this.f69597a) {
                a(z13);
                d dVar = this.f69599c;
                if (dVar != null) {
                    dVar.a(z13);
                }
            }
        }
    }
}
