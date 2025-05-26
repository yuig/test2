package com.bugsnag.android;

import android.app.Application;
import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes3.dex */
public abstract class o {
    public final h1 A;

    /* renamed from: a, reason: collision with root package name */
    public final hd.h f29367a;

    /* renamed from: b, reason: collision with root package name */
    public final y1 f29368b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f29369c;

    /* renamed from: d, reason: collision with root package name */
    public final hd.i f29370d;

    /* renamed from: e, reason: collision with root package name */
    public final v f29371e;

    /* renamed from: f, reason: collision with root package name */
    public final m f29372f;

    /* renamed from: g, reason: collision with root package name */
    public final k3 f29373g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f29374h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f29375i;

    /* renamed from: j, reason: collision with root package name */
    public final k0 f29376j;

    /* renamed from: k, reason: collision with root package name */
    public final g f29377k;

    /* renamed from: l, reason: collision with root package name */
    public final BreadcrumbState f29378l;

    /* renamed from: m, reason: collision with root package name */
    public final w1 f29379m;

    /* renamed from: n, reason: collision with root package name */
    public final g1 f29380n;

    /* renamed from: o, reason: collision with root package name */
    public final n2 f29381o;

    /* renamed from: p, reason: collision with root package name */
    public final n3 f29382p;

    /* renamed from: q, reason: collision with root package name */
    public final u1 f29383q;

    /* renamed from: r, reason: collision with root package name */
    public final u f29384r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f29385s;

    /* renamed from: t, reason: collision with root package name */
    public final q f29386t;

    /* renamed from: u, reason: collision with root package name */
    public final i2 f29387u;

    /* renamed from: v, reason: collision with root package name */
    public final c2 f29388v;

    /* renamed from: w, reason: collision with root package name */
    public final q1 f29389w;

    /* renamed from: x, reason: collision with root package name */
    public final r1 f29390x;

    /* renamed from: y, reason: collision with root package name */
    public final s1 f29391y;

    /* renamed from: z, reason: collision with root package name */
    public final hd.c f29392z;

    public o(Context context, bb.p pVar) {
        Pair pair;
        Method method;
        w1 w1Var = new w1();
        this.f29379m = w1Var;
        hd.c cVar = new hd.c();
        this.f29392z = cVar;
        id.b bVar = new id.b(context, cVar);
        Context context2 = (Context) bVar.f72118c;
        this.f29375i = context2;
        c2 c2Var = ((r) pVar.f22464b).D;
        this.f29388v = c2Var;
        g2 g2Var = (g2) this;
        u uVar = new u(context2, new n(g2Var, 0));
        this.f29384r = uVar;
        id.b bVar2 = new id.b(bVar, pVar, uVar, cVar);
        hd.h hVar = (hd.h) bVar2.f72118c;
        this.f29367a = hVar;
        u1 u1Var = hVar.f68826r;
        this.f29383q = u1Var;
        if (!(context instanceof Application)) {
            u1Var.f("You should initialize Bugsnag from the onCreate() callback of your Application subclass, as this guarantees errors are captured as early as possible. If a custom Application subclass is not possible in your app then you should suppress this warning by passing the Application context instead: Bugsnag.start(context.getApplicationContext()). For further info see: https://docs.bugsnag.com/platforms/android/#basic-configuration");
        }
        z zVar = new z(context2, hVar, cVar);
        q qVar = new q();
        m mVar = ((r) pVar.f22464b).f29429c;
        v vVar = new v();
        ((r) pVar.f22464b).getClass();
        BreadcrumbState breadcrumbState = new BreadcrumbState(hVar.f68827s, mVar, hVar.f68826r);
        y1 y1Var = new y1(((r) pVar.f22464b).f29430d.f29700a.c());
        j1 j1Var = new j1(new k1(((r) pVar.f22464b).f29431e.f29285a.f29317a));
        this.f29386t = qVar;
        this.f29372f = mVar;
        this.f29378l = breadcrumbState;
        this.f29371e = vVar;
        this.f29368b = y1Var;
        this.f29369c = j1Var;
        id.e eVar = new id.e(bVar, cVar);
        c1 c1Var = new c1(bVar2, zVar, g2Var, cVar, mVar);
        int i13 = 0;
        z zVar2 = new z(bVar, bVar2, eVar, c1Var, cVar, uVar, zVar.f29711f, w1Var);
        k3 k3Var = new k3(zVar, ((r) pVar.f22464b).f29428b, i13);
        cVar.a(zVar.f72117b, k3Var);
        this.f29373g = k3Var;
        g1 g1Var = (g1) ((id.d) new c1(bVar, bVar2, zVar2, cVar, c1Var, eVar, c2Var, mVar).f29175e).get();
        this.f29380n = g1Var;
        this.f29385s = new e0(u1Var, g1Var, hVar, mVar, c2Var, cVar);
        h1 h1Var = new h1(g2Var, u1Var);
        this.A = h1Var;
        this.f29390x = (r1) ((id.d) zVar.f29713h).a();
        this.f29389w = (q1) ((id.d) zVar.f29715j).a();
        this.f29391y = (s1) c1Var.f29175e;
        this.f29381o = (n2) c1Var.f29174d.get();
        this.f29377k = (g) zVar2.f29709d.get();
        this.f29376j = (k0) zVar2.f29711f.get();
        i2 i2Var = new i2(((r) pVar.f22464b).E, hVar, u1Var);
        this.f29387u = i2Var;
        EnumSet enumSet = ((r) pVar.f22464b).B;
        p3 p3Var = p3.USAGE;
        if (enumSet.contains(p3Var)) {
            this.f29370d = new hd.j(null);
        } else {
            this.f29370d = new g4.u();
        }
        r rVar = (r) pVar.f22464b;
        rVar.getClass();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new y1(new x1(0));
        new j1(new k1());
        v3 v3Var = v3.ALWAYS;
        w0 w0Var = new w0(true, true, true, true);
        EnumSet.of(p3.INTERNAL_ERRORS, p3Var);
        new HashSet();
        Pair[] elements = new Pair[16];
        HashSet hashSet = rVar.E;
        elements[0] = hashSet.size() > 0 ? new Pair("pluginCount", Integer.valueOf(hashSet.size())) : null;
        boolean z13 = rVar.f29441o;
        elements[1] = !z13 ? new Pair("autoDetectErrors", Boolean.valueOf(z13)) : null;
        boolean z14 = rVar.f29438l;
        elements[2] = !z14 ? new Pair("autoTrackSessions", Boolean.valueOf(z14)) : null;
        rVar.f29452z.getClass();
        elements[3] = null;
        elements[4] = !Intrinsics.d(null, null) ? new Pair("enabledBreadcrumbTypes", r.a(null)) : null;
        w0 w0Var2 = rVar.f29440n;
        if (Intrinsics.d(w0Var2, w0Var)) {
            pair = null;
        } else {
            String[] elements2 = new String[4];
            elements2[0] = w0Var2.f29672a ? "anrs" : null;
            elements2[1] = w0Var2.f29673b ? "ndkCrashes" : null;
            elements2[2] = w0Var2.f29674c ? "unhandledExceptions" : null;
            elements2[3] = w0Var2.f29675d ? "unhandledRejections" : null;
            Intrinsics.checkNotNullParameter(elements2, "elements");
            pair = new Pair("enabledErrorTypes", r.a(kotlin.collections.c0.A(elements2)));
        }
        elements[5] = pair;
        long j13 = rVar.f29437k;
        elements[6] = j13 != 0 ? new Pair("launchDurationMillis", Long.valueOf(j13)) : null;
        elements[7] = !Intrinsics.d(rVar.f29443q, b2.f29167a) ? new Pair("logger", Boolean.TRUE) : null;
        int i14 = rVar.f29446t;
        elements[8] = i14 != 100 ? new Pair("maxBreadcrumbs", Integer.valueOf(i14)) : null;
        int i15 = rVar.f29447u;
        elements[9] = i15 != 32 ? new Pair("maxPersistedEvents", Integer.valueOf(i15)) : null;
        int i16 = rVar.f29448v;
        elements[10] = i16 != 128 ? new Pair("maxPersistedSessions", Integer.valueOf(i16)) : null;
        int i17 = rVar.f29449w;
        elements[11] = i17 != 200 ? new Pair("maxReportedThreads", Integer.valueOf(i17)) : null;
        long j14 = rVar.f29450x;
        elements[12] = j14 != 5000 ? new Pair("threadCollectionTimeLimitMillis", Long.valueOf(j14)) : null;
        elements[13] = null;
        v3 v3Var2 = rVar.f29434h;
        elements[14] = v3Var2 != v3Var ? new Pair("sendThreads", v3Var2) : null;
        elements[15] = null;
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f29374h = kotlin.collections.z0.m(kotlin.collections.c0.A(elements));
        this.f29382p = new n3(g2Var, u1Var);
        if (hVar.f68811c.f29674c) {
            Thread.setDefaultUncaughtExceptionHandler(h1Var);
        }
        NativeInterface.setClient(this);
        for (h2 h2Var : i2Var.f29275c) {
            try {
                String name = h2Var.getClass().getName();
                w0 w0Var3 = i2Var.f29273a.f68811c;
                if (Intrinsics.d(name, "com.bugsnag.android.NdkPlugin")) {
                    if (w0Var3.f29673b) {
                        h2Var.load(this);
                    }
                } else if (!Intrinsics.d(name, "com.bugsnag.android.AnrPlugin")) {
                    h2Var.load(this);
                } else if (w0Var3.f29672a) {
                    h2Var.load(this);
                }
            } catch (Throwable th3) {
                i2Var.f29274b.b("Failed to load plugin " + h2Var + ", continuing with initialisation.", th3);
            }
        }
        h2 h2Var2 = this.f29387u.f29276d;
        if (h2Var2 != null) {
            kh2.p2.f79641a = h2Var2;
            kh2.p2.f79642b = kh2.p2.m0("setInternalMetricsEnabled", Boolean.TYPE);
            kh2.p2.f79643c = kh2.p2.m0("setStaticData", Map.class);
            kh2.p2.m0("getSignalUnwindStackFunction", new Class[0]);
            kh2.p2.f79644d = kh2.p2.m0("getCurrentCallbackSetCounts", new Class[0]);
            kh2.p2.f79645e = kh2.p2.m0("getCurrentNativeApiCallUsage", new Class[0]);
            kh2.p2.f79646f = kh2.p2.m0("initCallbackCounts", Map.class);
            kh2.p2.f79647g = kh2.p2.m0("notifyAddCallback", String.class);
            kh2.p2.m0("notifyRemoveCallback", String.class);
        }
        if (this.f29367a.f68817i.contains(p3.USAGE) && (method = kh2.p2.f79642b) != null) {
            method.invoke(kh2.p2.f79641a, Boolean.TRUE);
        }
        g1 g1Var2 = this.f29380n;
        u1 u1Var2 = g1Var2.f29238k;
        if (g1Var2.f29234g.f68834z) {
            try {
                hd.a b13 = g1Var2.f29236i.b(hd.n.ERROR_REQUEST, new d1(g1Var2, i13));
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - hd.g.f68804h;
                    long j15 = CameraPreview.AUTOFOCUS_INTERVAL_MILLIS;
                    long j16 = CameraPreview.AUTOFOCUS_INTERVAL_MILLIS - elapsedRealtime;
                    if (j16 > 0) {
                        j15 = j16;
                    }
                    b13.get(j15, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e13) {
                    u1Var2.d("Failed to send launch crash reports within timeout, continuing.", e13);
                } catch (ExecutionException e14) {
                    u1Var2.d("Failed to send launch crash reports within timeout, continuing.", e14);
                } catch (TimeoutException e15) {
                    u1Var2.d("Failed to send launch crash reports within timeout, continuing.", e15);
                }
            } catch (RejectedExecutionException e16) {
                u1Var2.d("Failed to flush launch crash reports, continuing.", e16);
            }
        }
        this.f29380n.k();
        this.f29381o.b();
        this.f29370d.t(this.f29374h);
        m mVar2 = this.f29372f;
        hd.i iVar = this.f29370d;
        mVar2.f29337e = iVar;
        HashMap hashMap = new HashMap();
        Collection collection = mVar2.f29334b;
        if (collection.size() > 0) {
            hashMap.put("onBreadcrumb", Integer.valueOf(collection.size()));
        }
        Collection collection2 = mVar2.f29333a;
        if (collection2.size() > 0) {
            hashMap.put("onError", Integer.valueOf(collection2.size()));
        }
        List list = mVar2.f29336d;
        if (list.size() > 0) {
            hashMap.put("onSendError", Integer.valueOf(list.size()));
        }
        Collection collection3 = mVar2.f29335c;
        if (collection3.size() > 0) {
            hashMap.put("onSession", Integer.valueOf(collection3.size()));
        }
        iVar.F(hashMap);
        Context context3 = this.f29375i;
        if (context3 instanceof Application) {
            Application application = (Application) context3;
            Application application2 = hd.g.f68800d;
            if (application != application2) {
                hd.g gVar = hd.g.f68797a;
                if (application2 != null) {
                    application2.unregisterActivityLifecycleCallbacks(gVar);
                }
                hd.g.f68800d = application;
                application.registerActivityLifecycleCallbacks(gVar);
            }
            n2 n2Var = this.f29381o;
            ArrayList arrayList = hd.g.f68798b;
            synchronized (arrayList) {
                arrayList.add(new WeakReference(n2Var));
            }
            boolean z15 = hd.g.f68806j;
            n2Var.e(z15 ? hd.g.f68808l : hd.g.f68807k, z15);
            hd.h hVar2 = this.f29367a;
            k kVar = BreadcrumbType.Companion;
            hVar2.getClass();
            application.registerActivityLifecycleCallbacks(new a(new n(g2Var, 1)));
        }
        this.f29375i.registerComponentCallbacks(new p(this.f29376j, new n(g2Var, 2), new n(g2Var, 3)));
        try {
            this.f29392z.b(hd.n.DEFAULT, new androidx.appcompat.app.z(this, 18));
        } catch (RejectedExecutionException e17) {
            this.f29383q.a("Failed to register for system events", e17);
        }
        a(BreadcrumbType.STATE, "Bugsnag loaded", new HashMap());
        this.f29383q.i("Bugsnag loaded");
    }

    public final void a(BreadcrumbType breadcrumbType, String str, Map map) {
        this.f29367a.getClass();
        this.f29378l.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.f29383q));
    }

    public final void b(BreadcrumbType breadcrumbType, String str, Map map) {
        if (str == null || breadcrumbType == null || map == null) {
            c("leaveBreadcrumb");
        } else {
            this.f29378l.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.f29383q));
        }
    }

    public final void c(String str) {
        this.f29383q.h(a.a.k("Invalid null value supplied to client.", str, ", ignoring"));
    }

    public final void d(Throwable th3, f2 f2Var) {
        if (th3 == null) {
            c("notify");
        } else {
            if (this.f29367a.d(th3)) {
                return;
            }
            f(new x0(th3, this.f29367a, p2.a(null, "handledException", null), this.f29368b.f29700a, this.f29369c.f29285a, this.f29383q), f2Var);
        }
    }

    public final void e(Throwable th3, x1 x1Var, String str, String str2) {
        hd.c cVar = this.f29392z;
        p2 a13 = p2.a(Severity.ERROR, str, str2);
        x1[] x1VarArr = {this.f29368b.f29700a, x1Var};
        ArrayList arrayList = new ArrayList(2);
        int i13 = 0;
        while (i13 < 2) {
            x1 x1Var2 = x1VarArr[i13];
            i13++;
            arrayList.add(x1Var2.d());
        }
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        while (i14 < 2) {
            x1 x1Var3 = x1VarArr[i14];
            i14++;
            kotlin.collections.k0.u(x1Var3.f29688b.f29212a, arrayList2);
        }
        x1 x1Var4 = new x1(dl2.b.u(eb.d.j(arrayList)));
        x1Var4.f29688b.f29212a = CollectionsKt.J0(arrayList2);
        f(new x0(th3, this.f29367a, a13, x1Var4, this.f29369c.f29285a, this.f29383q), null);
        q1 q1Var = this.f29389w;
        int i15 = q1Var != null ? q1Var.f29422a : 0;
        boolean z13 = this.f29391y.f29634b.get();
        if (z13) {
            i15++;
        }
        try {
            cVar.b(hd.n.IO, new androidx.appcompat.widget.j(12, this, new q1(i15, true, z13)));
        } catch (RejectedExecutionException e13) {
            this.f29383q.a("Failed to persist last run info", e13);
        }
        cVar.f68790d.shutdownNow();
        cVar.f68791e.shutdownNow();
        ExecutorService executorService = cVar.f68787a;
        executorService.shutdown();
        ExecutorService executorService2 = cVar.f68788b;
        executorService2.shutdown();
        ExecutorService executorService3 = cVar.f68789c;
        executorService3.shutdown();
        try {
            executorService.awaitTermination(BaseRecyclerCellView.AUTOSCROLL_DELAY, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        try {
            executorService2.awaitTermination(BaseRecyclerCellView.AUTOSCROLL_DELAY, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused2) {
        }
        try {
            executorService3.awaitTermination(BaseRecyclerCellView.AUTOSCROLL_DELAY, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused3) {
        }
    }

    public abstract void f(x0 x0Var, f2 f2Var);

    public final void finalize() {
        u1 u1Var = this.f29383q;
        n3 n3Var = this.f29382p;
        if (n3Var != null) {
            try {
                try {
                    try {
                        this.f29375i.unregisterReceiver(n3Var);
                    } catch (IllegalArgumentException e13) {
                        if (u1Var != null) {
                            u1Var.a("Failed to register receiver", e13);
                        }
                    } catch (SecurityException e14) {
                        if (u1Var != null) {
                            u1Var.a("Failed to register receiver", e14);
                        }
                    }
                } catch (RemoteException e15) {
                    if (u1Var != null) {
                        u1Var.a("Failed to register receiver", e15);
                    }
                }
            } catch (IllegalArgumentException unused) {
                u1Var.f("Receiver not registered");
            }
        }
        super.finalize();
    }

    public final void g(String str, String str2, String str3) {
        b4 b4Var = (b4) this.f29373g.get();
        b4Var.f29171a = new a4(str, str2, str3);
        b4Var.a();
    }
}
