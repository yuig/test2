package zf2;

import android.app.Activity;
import android.os.Bundle;
import e2.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements bi2.a {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f141937a;

    public b(g0 lifecycleEventEmitter) {
        Intrinsics.checkNotNullParameter(lifecycleEventEmitter, "lifecycleEventEmitter");
        this.f141937a = lifecycleEventEmitter;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f141937a.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f141937a.g(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g0 g0Var = this.f141937a;
        g0Var.j(activity);
        g0Var.h(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g0 g0Var = this.f141937a;
        g0Var.c(activity);
        g0Var.i(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
