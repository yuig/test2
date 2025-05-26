package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import t3.s1;

/* loaded from: classes.dex */
public final class f implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f30802p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Status f30803q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: r, reason: collision with root package name */
    public static final Object f30804r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static f f30805s;

    /* renamed from: a, reason: collision with root package name */
    public long f30806a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30807b;

    /* renamed from: c, reason: collision with root package name */
    public TelemetryData f30808c;

    /* renamed from: d, reason: collision with root package name */
    public kh.b f30809d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f30810e;

    /* renamed from: f, reason: collision with root package name */
    public final ih.c f30811f;

    /* renamed from: g, reason: collision with root package name */
    public final qq2.c f30812g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f30813h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f30814i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f30815j;

    /* renamed from: k, reason: collision with root package name */
    public u f30816k;

    /* renamed from: l, reason: collision with root package name */
    public final g1.h f30817l;

    /* renamed from: m, reason: collision with root package name */
    public final g1.h f30818m;

    /* renamed from: n, reason: collision with root package name */
    public final bi.f f30819n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f30820o;

    public f(Context context, Looper looper) {
        ih.c cVar = ih.c.f72257d;
        this.f30806a = 10000L;
        this.f30807b = false;
        this.f30813h = new AtomicInteger(1);
        this.f30814i = new AtomicInteger(0);
        this.f30815j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f30816k = null;
        this.f30817l = new g1.h(0);
        this.f30818m = new g1.h(0);
        this.f30820o = true;
        this.f30810e = context;
        bi.f fVar = new bi.f(looper, this, 0);
        this.f30819n = fVar;
        this.f30811f = cVar;
        this.f30812g = new qq2.c();
        PackageManager packageManager = context.getPackageManager();
        if (b7.c.f22031e == null) {
            b7.c.f22031e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (b7.c.f22031e.booleanValue()) {
            this.f30820o = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f30804r) {
            try {
                f fVar = f30805s;
                if (fVar != null) {
                    fVar.f30814i.incrementAndGet();
                    bi.f fVar2 = fVar.f30819n;
                    fVar2.sendMessageAtFrontOfQueue(fVar2.obtainMessage(10));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static Status f(a aVar, ConnectionResult connectionResult) {
        return new Status(17, s1.c("API: ", (String) aVar.f30783b.f134367d, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), connectionResult.f30733h, connectionResult);
    }

    public static f l(Context context) {
        f fVar;
        HandlerThread handlerThread;
        synchronized (f30804r) {
            if (f30805s == null) {
                synchronized (jh.i.f76158a) {
                    try {
                        handlerThread = jh.i.f76160c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            jh.i.f76160c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = jh.i.f76160c;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = ih.c.f72256c;
                f30805s = new f(applicationContext, looper);
            }
            fVar = f30805s;
        }
        return fVar;
    }

    public final void b(u uVar) {
        synchronized (f30804r) {
            try {
                if (this.f30816k != uVar) {
                    this.f30816k = uVar;
                    this.f30817l.clear();
                }
                this.f30817l.addAll(uVar.f30881e);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean d() {
        if (this.f30807b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = jh.m.a().f76184a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f30968g) {
            return false;
        }
        int i13 = ((SparseIntArray) this.f30812g.f104883b).get(203400000, -1);
        return i13 == -1 || i13 == 0;
    }

    public final boolean e(ConnectionResult connectionResult, int i13) {
        PendingIntent pendingIntent;
        ih.c cVar = this.f30811f;
        cVar.getClass();
        Context context = this.f30810e;
        if (ph.a.z0(context)) {
            return false;
        }
        boolean k13 = connectionResult.k1();
        int i14 = connectionResult.f30732g;
        if (k13) {
            pendingIntent = connectionResult.f30733h;
        } else {
            pendingIntent = null;
            Intent a13 = cVar.a(i14, context, null);
            if (a13 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a13, 201326592);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int i15 = GoogleApiActivity.f30742b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i13);
        intent.putExtra("notify_manager", true);
        cVar.k(context, i14, PendingIntent.getActivity(context, 0, intent, bi.e.f22823a | 134217728));
        return true;
    }

    public final z g(com.google.android.gms.common.api.f fVar) {
        ConcurrentHashMap concurrentHashMap = this.f30815j;
        a aVar = fVar.f30765e;
        z zVar = (z) concurrentHashMap.get(aVar);
        if (zVar == null) {
            zVar = new z(this, fVar);
            concurrentHashMap.put(aVar, zVar);
        }
        if (zVar.f30902b.requiresSignIn()) {
            this.f30818m.add(aVar);
        }
        zVar.r();
        return zVar;
    }

    public final jh.n h() {
        if (this.f30809d == null) {
            this.f30809d = kh2.w.E(this.f30810e);
        }
        return this.f30809d;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        z zVar;
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        int i13 = message.what;
        bi.f fVar = this.f30819n;
        ConcurrentHashMap concurrentHashMap = this.f30815j;
        switch (i13) {
            case 1:
                this.f30806a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                fVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    fVar.sendMessageDelayed(fVar.obtainMessage(12, (a) it.next()), this.f30806a);
                }
                return true;
            case 2:
                ep.b.A(message.obj);
                throw null;
            case 3:
                for (z zVar2 : concurrentHashMap.values()) {
                    com.bumptech.glide.d.m(zVar2.f30913m.f30819n);
                    zVar2.f30911k = null;
                    zVar2.r();
                }
                return true;
            case 4:
            case 8:
            case 13:
                i0 i0Var = (i0) message.obj;
                z zVar3 = (z) concurrentHashMap.get(i0Var.f30833c.f30765e);
                if (zVar3 == null) {
                    zVar3 = g(i0Var.f30833c);
                }
                boolean requiresSignIn = zVar3.f30902b.requiresSignIn();
                r0 r0Var = i0Var.f30831a;
                if (!requiresSignIn || this.f30814i.get() == i0Var.f30832b) {
                    zVar3.s(r0Var);
                } else {
                    r0Var.a(f30802p);
                    zVar3.x();
                }
                return true;
            case 5:
                int i14 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zVar = (z) it2.next();
                        if (zVar.m() == i14) {
                        }
                    } else {
                        zVar = null;
                    }
                }
                if (zVar == null) {
                    Log.wtf("GoogleApiManager", a.a.e("Could not find API instance ", i14, " while trying to fail enqueued calls."), new Exception());
                } else if (connectionResult.e() == 13) {
                    zVar.c(new Status(17, s1.c("Error resolution was canceled by the user, original error message: ", this.f30811f.g(connectionResult.e()), ": ", connectionResult.f()), null, null));
                } else {
                    aVar = zVar.f30903c;
                    zVar.c(f(aVar, connectionResult));
                }
                return true;
            case 6:
                Context context = this.f30810e;
                if (context.getApplicationContext() instanceof Application) {
                    c.a((Application) context.getApplicationContext());
                    c cVar = c.f30794e;
                    w wVar = new w(this);
                    cVar.getClass();
                    synchronized (cVar) {
                        cVar.f30797c.add(wVar);
                    }
                    AtomicBoolean atomicBoolean = cVar.f30796b;
                    boolean z13 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = cVar.f30795a;
                    if (!z13) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f30806a = 300000L;
                    }
                }
                return true;
            case 7:
                g((com.google.android.gms.common.api.f) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((z) concurrentHashMap.get(message.obj)).w();
                }
                return true;
            case 10:
                g1.h hVar = this.f30818m;
                hVar.getClass();
                g1.f fVar2 = new g1.f(hVar);
                while (fVar2.hasNext()) {
                    z zVar4 = (z) concurrentHashMap.remove((a) fVar2.next());
                    if (zVar4 != null) {
                        zVar4.x();
                    }
                }
                hVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((z) concurrentHashMap.get(message.obj)).y();
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((z) concurrentHashMap.get(message.obj)).l(true);
                }
                return true;
            case 14:
                ep.b.A(message.obj);
                throw null;
            case 15:
                a0 a0Var = (a0) message.obj;
                aVar2 = a0Var.f30786a;
                if (concurrentHashMap.containsKey(aVar2)) {
                    aVar3 = a0Var.f30786a;
                    z.p((z) concurrentHashMap.get(aVar3), a0Var);
                }
                return true;
            case 16:
                a0 a0Var2 = (a0) message.obj;
                aVar4 = a0Var2.f30786a;
                if (concurrentHashMap.containsKey(aVar4)) {
                    aVar5 = a0Var2.f30786a;
                    z.q((z) concurrentHashMap.get(aVar5), a0Var2);
                }
                return true;
            case 17:
                i();
                return true;
            case 18:
                h0 h0Var = (h0) message.obj;
                long j13 = h0Var.f30829c;
                MethodInvocation methodInvocation = h0Var.f30827a;
                int i15 = h0Var.f30828b;
                if (j13 == 0) {
                    ((kh.b) h()).e(new TelemetryData(i15, Arrays.asList(methodInvocation)));
                } else {
                    TelemetryData telemetryData = this.f30808c;
                    if (telemetryData != null) {
                        List f13 = telemetryData.f();
                        if (telemetryData.e() != i15 || (f13 != null && f13.size() >= h0Var.f30830d)) {
                            fVar.removeMessages(17);
                            i();
                        } else {
                            this.f30808c.k1(methodInvocation);
                        }
                    }
                    if (this.f30808c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(methodInvocation);
                        this.f30808c = new TelemetryData(i15, arrayList);
                        fVar.sendMessageDelayed(fVar.obtainMessage(17), h0Var.f30829c);
                    }
                }
                return true;
            case 19:
                this.f30807b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i13);
                return false;
        }
    }

    public final void i() {
        TelemetryData telemetryData = this.f30808c;
        if (telemetryData != null) {
            if (telemetryData.e() > 0 || d()) {
                ((kh.b) h()).e(telemetryData);
            }
            this.f30808c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(com.google.android.gms.tasks.TaskCompletionSource r10, int r11, com.google.android.gms.common.api.f r12) {
        /*
            r9 = this;
            if (r11 == 0) goto L73
            com.google.android.gms.common.api.internal.a r3 = r12.f30765e
            boolean r12 = r9.d()
            if (r12 != 0) goto Lb
            goto L43
        Lb:
            jh.m r12 = jh.m.a()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r12 = r12.f76184a
            if (r12 == 0) goto L45
            boolean r0 = r12.f30968g
            if (r0 == 0) goto L43
            boolean r12 = r12.k1()
            com.google.android.gms.common.api.internal.z r0 = r9.k(r3)
            if (r0 == 0) goto L46
            com.google.android.gms.common.api.c r1 = r0.f30902b
            boolean r2 = r1 instanceof jh.f
            if (r2 == 0) goto L43
            jh.f r1 = (jh.f) r1
            boolean r2 = r1.hasConnectionInfo()
            if (r2 == 0) goto L46
            boolean r2 = r1.isConnecting()
            if (r2 != 0) goto L46
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r12 = com.google.android.gms.common.api.internal.g0.a(r0, r1, r11)
            if (r12 == 0) goto L43
            r0.t()
            boolean r12 = r12.l2()
            goto L46
        L43:
            r11 = 0
            goto L60
        L45:
            r12 = 1
        L46:
            com.google.android.gms.common.api.internal.g0 r8 = new com.google.android.gms.common.api.internal.g0
            r0 = 0
            if (r12 == 0) goto L51
            long r4 = java.lang.System.currentTimeMillis()
            goto L52
        L51:
            r4 = r0
        L52:
            if (r12 == 0) goto L58
            long r0 = android.os.SystemClock.elapsedRealtime()
        L58:
            r6 = r0
            r0 = r8
            r1 = r9
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            r11 = r8
        L60:
            if (r11 == 0) goto L73
            com.google.android.gms.tasks.Task r10 = r10.getTask()
            bi.f r12 = r9.f30819n
            r12.getClass()
            com.google.android.gms.common.api.internal.v r0 = new com.google.android.gms.common.api.internal.v
            r0.<init>(r12)
            r10.addOnCompleteListener(r0, r11)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.f.j(com.google.android.gms.tasks.TaskCompletionSource, int, com.google.android.gms.common.api.f):void");
    }

    public final z k(a aVar) {
        return (z) this.f30815j.get(aVar);
    }

    public final void m(MethodInvocation methodInvocation, int i13, long j13, int i14) {
        h0 h0Var = new h0(methodInvocation, i13, j13, i14);
        bi.f fVar = this.f30819n;
        fVar.sendMessage(fVar.obtainMessage(18, h0Var));
    }

    public final void n(ConnectionResult connectionResult, int i13) {
        if (e(connectionResult, i13)) {
            return;
        }
        bi.f fVar = this.f30819n;
        fVar.sendMessage(fVar.obtainMessage(5, i13, 0, connectionResult));
    }
}
