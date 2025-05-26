package oi;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class u4 implements d5 {
    public static volatile u4 I;
    public volatile Boolean A;
    public final Boolean B;
    public final Boolean C;
    public volatile boolean D;
    public int E;
    public int F;
    public final long H;

    /* renamed from: a */
    public final Context f95197a;

    /* renamed from: b */
    public final String f95198b;

    /* renamed from: c */
    public final String f95199c;

    /* renamed from: d */
    public final String f95200d;

    /* renamed from: e */
    public final boolean f95201e;

    /* renamed from: f */
    public final q8.m0 f95202f;

    /* renamed from: g */
    public final e f95203g;

    /* renamed from: h */
    public final g4 f95204h;

    /* renamed from: i */
    public final y3 f95205i;

    /* renamed from: j */
    public final o4 f95206j;

    /* renamed from: k */
    public final q6 f95207k;

    /* renamed from: l */
    public final f7 f95208l;

    /* renamed from: m */
    public final x3 f95209m;

    /* renamed from: n */
    public final oh.b f95210n;

    /* renamed from: o */
    public final a6 f95211o;

    /* renamed from: p */
    public final k5 f95212p;

    /* renamed from: q */
    public final o f95213q;

    /* renamed from: r */
    public final x5 f95214r;

    /* renamed from: s */
    public final String f95215s;

    /* renamed from: t */
    public w3 f95216t;

    /* renamed from: u */
    public d6 f95217u;

    /* renamed from: v */
    public p f95218v;

    /* renamed from: w */
    public u3 f95219w;

    /* renamed from: y */
    public Boolean f95221y;

    /* renamed from: z */
    public long f95222z;

    /* renamed from: x */
    public boolean f95220x = false;
    public final AtomicInteger G = new AtomicInteger(0);

    public u4(i5 i5Var) {
        Bundle bundle;
        boolean z13 = false;
        Context context = i5Var.f94844a;
        q8.m0 m0Var = new q8.m0((Object) null);
        this.f95202f = m0Var;
        kh2.n.f79624a = m0Var;
        this.f95197a = context;
        this.f95198b = i5Var.f94845b;
        this.f95199c = i5Var.f94846c;
        this.f95200d = i5Var.f94847d;
        this.f95201e = i5Var.f94851h;
        this.A = i5Var.f94848e;
        this.f95215s = i5Var.f94853j;
        this.D = true;
        zzdd zzddVar = i5Var.f94850g;
        if (zzddVar != null && (bundle = zzddVar.f31730l) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzddVar.f31730l.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        if (com.google.android.gms.internal.measurement.v4.f31664h == null && context != null) {
            Object obj3 = com.google.android.gms.internal.measurement.v4.f31663g;
            synchronized (obj3) {
                try {
                    if (com.google.android.gms.internal.measurement.v4.f31664h == null) {
                        synchronized (obj3) {
                            com.google.android.gms.internal.measurement.l4 l4Var = com.google.android.gms.internal.measurement.v4.f31664h;
                            Context applicationContext = context.getApplicationContext();
                            applicationContext = applicationContext == null ? context : applicationContext;
                            if (l4Var == null || l4Var.f31503a != applicationContext) {
                                com.google.android.gms.internal.measurement.n4.c();
                                com.google.android.gms.internal.measurement.c5.a();
                                com.google.android.gms.internal.measurement.q4.C();
                                com.google.android.gms.internal.measurement.w4 w4Var = new com.google.android.gms.internal.measurement.w4();
                                w4Var.f31683a = applicationContext;
                                com.google.android.gms.internal.measurement.v4.f31664h = new com.google.android.gms.internal.measurement.l4(applicationContext, ao2.m0.Z(w4Var));
                                com.google.android.gms.internal.measurement.v4.f31666j.incrementAndGet();
                            }
                        }
                    }
                } finally {
                }
            }
        }
        this.f95210n = oh.b.f94454a;
        Long l13 = i5Var.f94852i;
        this.H = l13 != null ? l13.longValue() : System.currentTimeMillis();
        e eVar = new e();
        eVar.f24333a = this;
        eVar.f94734c = g.f94761a;
        this.f95203g = eVar;
        g4 g4Var = new g4(this);
        g4Var.r();
        this.f95204h = g4Var;
        y3 y3Var = new y3(this);
        y3Var.r();
        this.f95205i = y3Var;
        f7 f7Var = new f7(this);
        f7Var.r();
        this.f95208l = f7Var;
        v4 v4Var = new v4();
        v4Var.f95230a = this;
        this.f95209m = new x3(v4Var);
        this.f95213q = new o(this);
        a6 a6Var = new a6(this);
        a6Var.x();
        this.f95211o = a6Var;
        k5 k5Var = new k5(this);
        k5Var.x();
        this.f95212p = k5Var;
        q6 q6Var = new q6(this);
        q6Var.x();
        this.f95207k = q6Var;
        x5 x5Var = new x5(this);
        x5Var.r();
        this.f95214r = x5Var;
        o4 o4Var = new o4(this);
        o4Var.r();
        this.f95206j = o4Var;
        zzdd zzddVar2 = i5Var.f94850g;
        if (zzddVar2 != null && zzddVar2.f31725g != 0) {
            z13 = true;
        }
        boolean z14 = !z13;
        if (context.getApplicationContext() instanceof Application) {
            b(k5Var);
            if (k5Var.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) k5Var.zza().getApplicationContext();
                if (k5Var.f94906c == null) {
                    k5Var.f94906c = new u5(k5Var);
                }
                if (z14) {
                    application.unregisterActivityLifecycleCallbacks(k5Var.f94906c);
                    application.registerActivityLifecycleCallbacks(k5Var.f94906c);
                    k5Var.zzj().f95276n.c("Registered activity lifecycle callback");
                }
            }
        } else {
            d(y3Var);
            y3Var.f95271i.c("Application context is not an Application");
        }
        o4Var.y(new androidx.appcompat.widget.j(21, this, i5Var));
    }

    public static u4 a(Context context, zzdd zzddVar, Long l13) {
        Bundle bundle;
        if (zzddVar != null && (zzddVar.f31728j == null || zzddVar.f31729k == null)) {
            zzddVar = new zzdd(zzddVar.f31724f, zzddVar.f31725g, zzddVar.f31726h, zzddVar.f31727i, null, null, zzddVar.f31730l, null);
        }
        com.bumptech.glide.d.t(context);
        com.bumptech.glide.d.t(context.getApplicationContext());
        if (I == null) {
            synchronized (u4.class) {
                try {
                    if (I == null) {
                        I = new u4(new i5(context, zzddVar, l13));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.f31730l) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.bumptech.glide.d.t(I);
            I.A = Boolean.valueOf(zzddVar.f31730l.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.bumptech.glide.d.t(I);
        return I;
    }

    public static void b(k2 k2Var) {
        if (k2Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!k2Var.f94893b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(k2Var.getClass())));
        }
    }

    public static void c(c5 c5Var) {
        if (c5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static void d(c5 c5Var) {
        if (c5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!c5Var.f94712b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(c5Var.getClass())));
        }
    }

    public final boolean e() {
        return h() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f95222z) > 1000) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r6 = this;
            boolean r0 = r6.f95220x
            if (r0 == 0) goto Lb4
            oi.o4 r0 = r6.f95206j
            d(r0)
            r0.p()
            java.lang.Boolean r0 = r6.f95221y
            oh.b r1 = r6.f95210n
            if (r0 == 0) goto L34
            long r2 = r6.f95222z
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lad
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f95222z
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lad
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f95222z = r0
            oi.f7 r0 = r6.f95208l
            c(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.q0(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.q0(r1)
            if (r1 == 0) goto L76
            android.content.Context r1 = r6.f95197a
            h6.q r4 = ph.b.a(r1)
            boolean r4 = r4.e()
            if (r4 != 0) goto L74
            oi.e r4 = r6.f95203g
            boolean r4 = r4.C()
            if (r4 != 0) goto L74
            boolean r4 = oi.f7.V(r1)
            if (r4 == 0) goto L76
            boolean r1 = oi.f7.n0(r1)
            if (r1 == 0) goto L76
        L74:
            r1 = r2
            goto L77
        L76:
            r1 = r3
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.f95221y = r4
            if (r1 == 0) goto Lad
            oi.u3 r1 = r6.k()
            java.lang.String r1 = r1.A()
            oi.u3 r4 = r6.k()
            r4.w()
            java.lang.String r4 = r4.f95193m
            boolean r0 = r0.Z(r1, r4)
            if (r0 != 0) goto La7
            oi.u3 r0 = r6.k()
            r0.w()
            java.lang.String r0 = r0.f95193m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La6
            goto La7
        La6:
            r2 = r3
        La7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.f95221y = r0
        Lad:
            java.lang.Boolean r0 = r6.f95221y
            boolean r0 = r0.booleanValue()
            return r0
        Lb4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.u4.f():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.u4.g():boolean");
    }

    public final int h() {
        o4 o4Var = this.f95206j;
        d(o4Var);
        o4Var.p();
        Boolean y13 = this.f95203g.y("firebase_analytics_collection_deactivated");
        if (y13 != null && y13.booleanValue()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        o4 o4Var2 = this.f95206j;
        d(o4Var2);
        o4Var2.p();
        if (!this.D) {
            return 8;
        }
        g4 g4Var = this.f95204h;
        c(g4Var);
        g4Var.p();
        Boolean valueOf = g4Var.w().contains("measurement_enabled") ? Boolean.valueOf(g4Var.w().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        Boolean y14 = this.f95203g.y("firebase_analytics_collection_enabled");
        if (y14 != null) {
            return y14.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    public final o i() {
        o oVar = this.f95213q;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final p j() {
        d(this.f95218v);
        return this.f95218v;
    }

    public final u3 k() {
        b(this.f95219w);
        return this.f95219w;
    }

    public final x3 l() {
        return this.f95209m;
    }

    public final d6 m() {
        b(this.f95217u);
        return this.f95217u;
    }

    public final void n() {
        c(this.f95208l);
    }

    @Override // oi.d5
    public final Context zza() {
        return this.f95197a;
    }

    @Override // oi.d5
    public final oh.a zzb() {
        return this.f95210n;
    }

    @Override // oi.d5
    public final q8.m0 zzd() {
        return this.f95202f;
    }

    @Override // oi.d5
    public final y3 zzj() {
        y3 y3Var = this.f95205i;
        d(y3Var);
        return y3Var;
    }

    @Override // oi.d5
    public final o4 zzl() {
        o4 o4Var = this.f95206j;
        d(o4Var);
        return o4Var;
    }
}
