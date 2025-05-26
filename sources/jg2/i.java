package jg2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import gf2.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final a f76130a;

    /* renamed from: b, reason: collision with root package name */
    public final bi2.a f76131b;

    /* renamed from: c, reason: collision with root package name */
    public final hi2.f f76132c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f76133d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f76134e;

    public i(a appStartupDataCollector, bi2.a aVar, hi2.f fVar) {
        Intrinsics.checkNotNullParameter(appStartupDataCollector, "appStartupDataCollector");
        this.f76130a = appStartupDataCollector;
        this.f76131b = aVar;
        this.f76132c = fVar;
    }

    public final boolean a(Activity activity) {
        if (!w.c(activity)) {
            return false;
        }
        Integer num = this.f76133d;
        Intrinsics.checkNotNullParameter(activity, "activity");
        return num != null && num.intValue() == activity.hashCode();
    }

    public final boolean b(Activity activity) {
        if (a(activity)) {
            return true;
        }
        if (w.c(activity)) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f76133d = Integer.valueOf(activity.hashCode());
        }
        return a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (b(activity)) {
            c cVar = (c) this.f76130a;
            long c13 = cVar.c();
            Long valueOf = Long.valueOf(c13);
            if (cVar.f76104m == null) {
                cVar.f76104m = Long.valueOf(c13);
            }
            cVar.f76106o = valueOf;
            h hVar = new h(this, activity, activity.getApplication(), 0);
            hi2.f fVar = this.f76132c;
            if (fVar != null) {
                fVar.a(activity, f.f76122i, hVar);
            }
        }
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
        if (b(activity)) {
            c cVar = (c) this.f76130a;
            cVar.f76107p = Long.valueOf(cVar.c());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (b(activity)) {
            c cVar = (c) this.f76130a;
            cVar.f76105n = Long.valueOf(cVar.c());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (w.c(activity)) {
            Application application = activity.getApplication();
            a aVar = this.f76130a;
            String activityName = activity.getLocalClassName();
            Intrinsics.checkNotNullExpressionValue(activityName, "activity.localClassName");
            g gVar = new g(this, application, 1);
            c cVar = (c) aVar;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            cVar.f76103l = activityName;
            cVar.f76109r = Long.valueOf(cVar.c());
            if (cVar.f76115x) {
                return;
            }
            cVar.b(gVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (a(activity)) {
            c cVar = (c) this.f76130a;
            cVar.f76108q = Long.valueOf(cVar.c());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
