package se;

import a.o3;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import df.c0;
import df.e0;
import df.j1;
import df.u0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import le.g0;
import le.v;
import me.m;

/* loaded from: classes3.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112321a;

    public /* synthetic */ b(int i13) {
        this.f112321a = i13;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f112321a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                wc.b bVar = u0.f54860d;
                wc.b.x(g0.APP_EVENTS, ue.b.f121938a, "onActivityCreated");
                ue.b.f121939b.execute(new v.h(12));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f112321a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                wc.b bVar = u0.f54860d;
                wc.b.x(g0.APP_EVENTS, ue.b.f121938a, "onActivityDestroyed");
                pe.d dVar = pe.d.f99893a;
                if (!p001if.a.b(pe.d.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        pe.g i13 = pe.g.f99907f.i();
                        if (!p001if.a.b(i13)) {
                            try {
                                Intrinsics.checkNotNullParameter(activity, "activity");
                                i13.f99913e.remove(Integer.valueOf(activity.hashCode()));
                                break;
                            } catch (Throwable th3) {
                                p001if.a.a(i13, th3);
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        p001if.a.a(pe.d.class, th4);
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f112321a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                wc.b bVar = u0.f54860d;
                g0 g0Var = g0.APP_EVENTS;
                String str = ue.b.f121938a;
                wc.b.x(g0Var, str, "onActivityPaused");
                AtomicInteger atomicInteger = ue.b.f121942e;
                int i13 = 0;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                    Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
                }
                ue.b.a();
                long currentTimeMillis = System.currentTimeMillis();
                String d03 = j1.d0(activity);
                pe.d dVar = pe.d.f99893a;
                if (!p001if.a.b(pe.d.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        if (pe.d.f99898f.get()) {
                            pe.g.f99907f.i().c(activity);
                            pe.k kVar = pe.d.f99896d;
                            if (kVar != null && !p001if.a.b(kVar)) {
                                try {
                                    if (((Activity) kVar.f99923b.get()) != null) {
                                        try {
                                            Timer timer = kVar.f99924c;
                                            if (timer != null) {
                                                timer.cancel();
                                            }
                                            kVar.f99924c = null;
                                        } catch (Exception e13) {
                                            Log.e(pe.k.f99921e, "Error unscheduling indexing job", e13);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    p001if.a.a(kVar, th3);
                                }
                            }
                            SensorManager sensorManager = pe.d.f99895c;
                            if (sensorManager != null) {
                                sensorManager.unregisterListener(pe.d.f99894b);
                            }
                        }
                    } catch (Throwable th4) {
                        p001if.a.a(pe.d.class, th4);
                    }
                }
                ue.b.f121939b.execute(new ue.a(i13, currentTimeMillis, d03));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f112321a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    v.d().execute(new v.h(9));
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                wc.b bVar = u0.f54860d;
                wc.b.x(g0.APP_EVENTS, ue.b.f121938a, "onActivityResumed");
                Intrinsics.checkNotNullParameter(activity, "activity");
                ue.b.f121948k = new WeakReference(activity);
                ue.b.f121942e.incrementAndGet();
                ue.b.a();
                long currentTimeMillis = System.currentTimeMillis();
                ue.b.f121946i = currentTimeMillis;
                String d03 = j1.d0(activity);
                pe.d dVar = pe.d.f99893a;
                if (!p001if.a.b(pe.d.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        if (pe.d.f99898f.get()) {
                            pe.g.f99907f.i().a(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String b13 = v.b();
                            c0 b14 = e0.b(b13);
                            boolean d2 = Intrinsics.d(b14 == null ? null : Boolean.valueOf(b14.f54733j), Boolean.TRUE);
                            pe.d dVar2 = pe.d.f99893a;
                            if (d2) {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                if (sensorManager != null) {
                                    pe.d.f99895c = sensorManager;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    pe.k kVar = new pe.k(activity);
                                    pe.d.f99896d = kVar;
                                    pe.l lVar = pe.d.f99894b;
                                    o3 o3Var = new o3(23, b14, b13);
                                    if (!p001if.a.b(lVar)) {
                                        try {
                                            lVar.f99926a = o3Var;
                                        } catch (Throwable th3) {
                                            p001if.a.a(lVar, th3);
                                        }
                                    }
                                    sensorManager.registerListener(lVar, defaultSensor, 2);
                                    if (b14 != null && b14.f54733j) {
                                        kVar.c();
                                    }
                                }
                            } else {
                                p001if.a.b(dVar2);
                            }
                            p001if.a.b(dVar2);
                        }
                    } catch (Throwable th4) {
                        p001if.a.a(pe.d.class, th4);
                    }
                }
                if (!p001if.a.b(ne.a.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        try {
                            if (ne.a.f90433b) {
                                CopyOnWriteArraySet copyOnWriteArraySet = ne.c.f90435d;
                                if (!new HashSet(ne.c.a()).isEmpty()) {
                                    ne.d.f90439e.r(activity);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th5) {
                        p001if.a.a(ne.a.class, th5);
                    }
                }
                ye.d.d(activity);
                j.a();
                ue.b.f121939b.execute(new l7.j(currentTimeMillis, d03, activity.getApplicationContext(), 2));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        switch (this.f112321a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
                wc.b bVar = u0.f54860d;
                wc.b.x(g0.APP_EVENTS, ue.b.f121938a, "onActivitySaveInstanceState");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f112321a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                ue.b.f121947j++;
                wc.b bVar = u0.f54860d;
                wc.b.x(g0.APP_EVENTS, ue.b.f121938a, "onActivityStarted");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f112321a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    if (Intrinsics.d(c.f112324c, Boolean.TRUE) && Intrinsics.d(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                        v.d().execute(new v.h(8));
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                wc.b bVar = u0.f54860d;
                wc.b.x(g0.APP_EVENTS, ue.b.f121938a, "onActivityStopped");
                wc.b bVar2 = me.l.f86994b;
                wc.j jVar = m.f86996c;
                String str = me.i.f86987a;
                if (!p001if.a.b(me.i.class)) {
                    try {
                        me.i.f86990d.execute(new v.h(7));
                    } catch (Throwable th3) {
                        p001if.a.a(me.i.class, th3);
                    }
                }
                ue.b.f121947j--;
                break;
        }
    }
}
