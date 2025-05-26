package ads_mobile_sdk;

import a.zb;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import ao2.j0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x extends yr0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final Application f13318d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f13319e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f13320f;

    /* renamed from: g, reason: collision with root package name */
    public final oh0 f13321g;

    /* renamed from: h, reason: collision with root package name */
    public final zb f13322h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f13323i;

    /* renamed from: j, reason: collision with root package name */
    public r f13324j;

    /* renamed from: k, reason: collision with root package name */
    public Activity f13325k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13326l;

    /* renamed from: m, reason: collision with root package name */
    public ao2.o1 f13327m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13328n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13329o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context applicationContext, Application application, WeakReference firstContextReference, j0 backgroundScope, oh0 flags, zb clock) {
        super(il0.CUI_NAME_SDKINIT_ACTIVITY_TRACKER, false, 6);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(firstContextReference, "firstContextReference");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f13318d = application;
        this.f13319e = firstContextReference;
        this.f13320f = backgroundScope;
        this.f13321g = flags;
        this.f13322h = clock;
        this.f13323i = new LinkedHashSet();
        this.f13324j = r.f10345b;
        this.f13329o = kh2.n3.g(applicationContext);
    }

    public final void a(Activity activity, r activityState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activityState, "activityState");
        synchronized (this) {
            try {
                if (activityState.f10353a >= this.f13324j.f10353a) {
                    this.f13325k = activity;
                }
                this.f13324j = activityState;
                if (activityState == r.f10351h) {
                    this.f13326l = false;
                    if (d()) {
                        gk0.c("App is now foregrounded", null);
                        this.f13329o = false;
                        ao2.o1 o1Var = this.f13327m;
                        if (o1Var != null) {
                            o1Var.cancel((CancellationException) null);
                        }
                        this.f13327m = null;
                        this.f13328n = true;
                        zn2.a aVar = zn2.b.f142311b;
                        this.f13322h.getClass();
                        long Q2 = dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
                        for (a.ie ieVar : this.f13323i) {
                            j0 j0Var = this.f13320f;
                            t block = new t(ieVar, Q2, null);
                            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
                            Intrinsics.checkNotNullParameter(j0Var, "<this>");
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(block, "block");
                            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
                        }
                    }
                } else if (activityState == r.f10346c) {
                    this.f13326l = true;
                    j0 j0Var2 = this.f13320f;
                    v block2 = new v(this, null);
                    kotlin.coroutines.j context2 = kotlin.coroutines.j.f80412a;
                    Intrinsics.checkNotNullParameter(j0Var2, "<this>");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(block2, "block");
                    this.f13327m = kotlin.jvm.internal.j.z(j0Var2, context2, null, new et2(block2, null), 2);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Activity c() {
        Activity activity;
        synchronized (this) {
            activity = this.f13325k;
        }
        return activity;
    }

    public final boolean d() {
        boolean z13;
        synchronized (this) {
            z13 = this.f13329o;
        }
        return z13;
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        return a(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(activity, r.f10348e);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        synchronized (this) {
            try {
                if (Intrinsics.d(activity, this.f13325k)) {
                    this.f13325k = null;
                    this.f13324j = r.f10345b;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(activity, r.f10347d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(activity, r.f10351h);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(activity, r.f10350g);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a(activity, r.f10346c);
    }

    public static pk0 a(x xVar) {
        synchronized (xVar) {
            try {
                Context context = (Context) xVar.f13319e.get();
                if (context != null && (context instanceof Activity)) {
                    xVar.f13325k = (Activity) context;
                    xVar.f13324j = r.f10349f;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        xVar.f13318d.registerActivityLifecycleCallbacks(xVar);
        boolean d2 = xVar.d();
        ok.e0 e0Var = gk0.f5596a;
        gk0.c("App is initially ".concat(d2 ? "backgrounded" : "foregrounded"), null);
        zn2.a aVar = zn2.b.f142311b;
        xVar.f13322h.getClass();
        long Q2 = dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
        Iterator it = xVar.f13323i.iterator();
        while (it.hasNext()) {
            ft2.a(xVar.f13320f, new w(d2, (a.ie) it.next(), Q2, null));
        }
        return new pk0(Unit.f80348a);
    }
}
