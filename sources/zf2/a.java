package zf2;

import android.app.Activity;
import android.os.Bundle;
import e2.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements bi2.a {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f141936a;

    public a(g0 lifecycleEventEmitter) {
        Intrinsics.checkNotNullParameter(lifecycleEventEmitter, "lifecycleEventEmitter");
        this.f141936a = lifecycleEventEmitter;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f141936a.c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g0 g0Var = this.f141936a;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (g0Var.k(activity)) {
            long f13 = g0Var.f();
            e eVar = (e) g0Var.f56857b;
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            i iVar = (i) eVar;
            iVar.getClass();
            iVar.a(hashCode, f13, d.RESUME);
            if (iVar.e(hashCode) == f.RESUME) {
                iVar.b(hashCode, f13, null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f141936a.j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f141936a.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f141936a.g(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f141936a.h(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f141936a.i(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
