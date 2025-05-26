package c5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f25780a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f25781b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25782c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25783d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25784e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25785f = false;

    public d(Activity activity) {
        this.f25781b = activity;
        this.f25782c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f25781b == activity) {
            this.f25781b = null;
            this.f25784e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f25784e || this.f25785f || this.f25783d) {
            return;
        }
        Object obj = this.f25780a;
        try {
            Object obj2 = e.f25793c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f25782c) {
                e.f25797g.postAtFrontOfQueue(new androidx.appcompat.widget.j(e.f25792b.get(activity), obj2, 7));
                this.f25785f = true;
                this.f25780a = null;
            }
        } catch (Throwable th3) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f25781b == activity) {
            this.f25783d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
