package me;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.ui.z;
import com.facebook.FacebookRequestError;
import df.c0;
import df.e0;
import df.j1;
import df.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import le.a0;
import le.g0;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f86987a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f86988b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile rd.j f86989c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f86990d;

    /* renamed from: e, reason: collision with root package name */
    public static ScheduledFuture f86991e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.appsflyer.internal.p f86992f;

    static {
        String name = i.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "AppEventQueue::class.java.name");
        f86987a = name;
        f86988b = 100;
        f86989c = new rd.j(6);
        f86990d = Executors.newSingleThreadScheduledExecutor();
        f86992f = new com.appsflyer.internal.p(1);
    }

    public static final a0 a(b accessTokenAppId, u appEvents, boolean z13, ck2.a flushState) {
        if (p001if.a.b(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            String str = accessTokenAppId.f86969a;
            c0 f13 = e0.f(str, false);
            String str2 = a0.f83002j;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            a0 B = wc.b.B(null, format, null, null);
            B.f83014i = true;
            Bundle bundle = B.f83009d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", accessTokenAppId.f86970b);
            wc.b bVar = r.f87019b;
            synchronized (m.c()) {
                p001if.a.b(m.class);
            }
            wc.j jVar = m.f86996c;
            String v13 = wc.j.v();
            if (v13 != null) {
                bundle.putString("install_referrer", v13);
            }
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            B.f83009d = bundle;
            int d2 = appEvents.d(B, le.v.a(), f13 != null ? f13.f54724a : false, z13);
            if (d2 == 0) {
                return null;
            }
            flushState.f27913a += d2;
            B.k(new le.b(accessTokenAppId, B, appEvents, flushState, 1));
            return B;
        } catch (Throwable th3) {
            p001if.a.a(i.class, th3);
            return null;
        }
    }

    public static final ArrayList b(rd.j appEventCollection, ck2.a flushResults) {
        if (p001if.a.b(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            boolean g13 = le.v.g(le.v.a());
            ArrayList arrayList = new ArrayList();
            for (b bVar : appEventCollection.m()) {
                u i13 = appEventCollection.i(bVar);
                if (i13 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                a0 request = a(bVar, i13, g13, flushResults);
                if (request != null) {
                    arrayList.add(request);
                    if (oe.f.f94191a) {
                        HashSet hashSet = oe.q.f94208a;
                        Intrinsics.checkNotNullParameter(request, "request");
                        j1.x1(new com.airbnb.lottie.k(request, 7));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            p001if.a.a(i.class, th3);
            return null;
        }
    }

    public static final void c(p reason) {
        if (p001if.a.b(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f86990d.execute(new androidx.activity.d(reason, 18));
        } catch (Throwable th3) {
            p001if.a.a(i.class, th3);
        }
    }

    public static final void d(p reason) {
        if (p001if.a.b(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f86989c.a(h.a());
            try {
                ck2.a f13 = f(reason, f86989c);
                if (f13 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f13.f27913a);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (q) f13.f27914b);
                    z6.c.a(le.v.a()).c(intent);
                }
            } catch (Exception e13) {
                Log.w(f86987a, "Caught unexpected exception while flushing app events: ", e13);
            }
        } catch (Throwable th3) {
            p001if.a.a(i.class, th3);
        }
    }

    public static final void e(ck2.a flushState, a0 request, le.e0 response, b accessTokenAppId, u appEvents) {
        q qVar;
        if (p001if.a.b(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            FacebookRequestError facebookRequestError = response.f83046c;
            q qVar2 = q.SUCCESS;
            boolean z13 = true;
            if (facebookRequestError == null) {
                qVar = qVar2;
            } else if (facebookRequestError.f29906b == -1) {
                qVar = q.NO_CONNECTIVITY;
            } else {
                Intrinsics.checkNotNullExpressionValue(String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), facebookRequestError.toString()}, 2)), "java.lang.String.format(format, *args)");
                qVar = q.SERVER_ERROR;
            }
            le.v vVar = le.v.f83104a;
            le.v.i(g0.APP_EVENTS);
            if (facebookRequestError == null) {
                z13 = false;
            }
            appEvents.b(z13);
            q qVar3 = q.NO_CONNECTIVITY;
            if (qVar == qVar3) {
                le.v.d().execute(new z(10, accessTokenAppId, appEvents));
            }
            if (qVar == qVar2 || ((q) flushState.f27914b) == qVar3) {
                return;
            }
            Intrinsics.checkNotNullParameter(qVar, "<set-?>");
            flushState.f27914b = qVar;
        } catch (Throwable th3) {
            p001if.a.a(i.class, th3);
        }
    }

    public static final ck2.a f(p reason, rd.j appEventCollection) {
        if (p001if.a.b(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            ck2.a aVar = new ck2.a(4, 0);
            ArrayList b13 = b(appEventCollection, aVar);
            if (!(!b13.isEmpty())) {
                return null;
            }
            wc.b bVar = u0.f54860d;
            wc.b.y(g0.APP_EVENTS, f86987a, "Flushing %d events due to %s.", Integer.valueOf(aVar.f27913a), reason.toString());
            Iterator it = b13.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).d();
            }
            return aVar;
        } catch (Throwable th3) {
            p001if.a.a(i.class, th3);
            return null;
        }
    }
}
