package dg2;

import android.app.Activity;
import android.os.Bundle;
import cd2.n;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kh2.y;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements bi2.a {

    /* renamed from: a, reason: collision with root package name */
    public final sg2.a f54944a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f54945b;

    public a(sg2.a configService, y viewDataSourceProvider) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(viewDataSourceProvider, "viewDataSourceProvider");
        this.f54944a = configService;
        this.f54945b = viewDataSourceProvider;
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
        if (((sg2.b) this.f54944a).f112878c.f117610b.isActivityBreadcrumbCaptureEnabled()) {
            String name = activity.getClass().getName();
            l lVar = (l) this.f54945b.invoke();
            if (lVar != null) {
                Set keySet = lVar.f54968e.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "viewSpans.keys");
                String str = (String) CollectionsKt.c0(keySet);
                lVar.g(new s60.a(str, 6), new k(lVar, str, 0), false);
                lVar.g(new s60.a(name, 7), new k(lVar, name, 1), true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        l lVar;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!((sg2.b) this.f54944a).f112878c.f117610b.isActivityBreadcrumbCaptureEnabled() || (lVar = (l) this.f54945b.invoke()) == null) {
            return;
        }
        Iterator it = lVar.f54968e.entrySet().iterator();
        while (it.hasNext()) {
            lVar.g(uf2.c.f122114k, new n((oi2.b) ((Map.Entry) it.next()).getValue(), 7), false);
        }
    }
}
