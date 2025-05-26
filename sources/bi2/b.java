package bi2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Application f22888a;

    /* renamed from: b, reason: collision with root package name */
    public final lh2.b f22889b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f22890c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f22891d;

    public b(Application application, lh2.b logger) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f22888a = application;
        this.f22889b = logger;
        application.registerActivityLifecycleCallbacks(this);
        this.f22890c = new CopyOnWriteArrayList();
        this.f22891d = new CopyOnWriteArrayList();
        new WeakReference(null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            q qVar = s.f135225b;
            this.f22888a.unregisterActivityLifecycleCallbacks(this);
            this.f22890c.clear();
            this.f22891d.clear();
            Unit unit = Unit.f80348a;
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            ue.c.m(th3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        synchronized (this) {
            new WeakReference(activity);
        }
        Iterator it = CollectionsKt.F0(this.f22890c).iterator();
        while (it.hasNext()) {
            try {
                ((a) it.next()).onActivityCreated(activity, bundle);
            } catch (Exception e13) {
                ((lh2.e) this.f22889b).b(lh2.g.ACTIVITY_LISTENER_FAIL, e13);
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
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.getClass().isAnnotationPresent(mf2.d.class)) {
            return;
        }
        Iterator it = CollectionsKt.F0(this.f22891d).iterator();
        while (it.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            try {
                throw null;
            } catch (Exception e13) {
                ((lh2.e) this.f22889b).b(lh2.g.ACTIVITY_LISTENER_FAIL, e13);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        synchronized (this) {
            new WeakReference(activity);
        }
        Iterator it = CollectionsKt.F0(this.f22890c).iterator();
        while (it.hasNext()) {
            try {
                ((a) it.next()).onActivityStarted(activity);
            } catch (Exception e13) {
                ((lh2.e) this.f22889b).b(lh2.g.ACTIVITY_LISTENER_FAIL, e13);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator it = CollectionsKt.F0(this.f22890c).iterator();
        while (it.hasNext()) {
            try {
                ((a) it.next()).onActivityStopped(activity);
            } catch (Exception e13) {
                ((lh2.e) this.f22889b).b(lh2.g.ACTIVITY_LISTENER_FAIL, e13);
            }
        }
    }
}
