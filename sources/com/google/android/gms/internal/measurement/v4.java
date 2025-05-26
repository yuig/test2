package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class v4 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f31663g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static volatile l4 f31664h;

    /* renamed from: i, reason: collision with root package name */
    public static final q8.m0 f31665i;

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicInteger f31666j;

    /* renamed from: a, reason: collision with root package name */
    public final b5 f31667a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31668b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31669c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f31670d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f31671e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31672f;

    static {
        new AtomicReference();
        f31665i = new q8.m0();
        f31666j = new AtomicInteger();
    }

    public v4(b5 b5Var, String str, Object obj) {
        String str2 = b5Var.f31297a;
        if (str2 == null && b5Var.f31298b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && b5Var.f31298b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f31667a = b5Var;
        this.f31668b = str;
        this.f31669c = obj;
        this.f31672f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r10 = this;
            boolean r0 = r10.f31672f
            r1 = 1
            if (r0 != 0) goto L28
            q8.m0 r0 = com.google.android.gms.internal.measurement.v4.f31665i
            java.lang.String r2 = r10.f31668b
            r0.getClass()
            java.lang.String r3 = "flagName must not be null"
            bf.b.p(r2, r3)
            boolean r0 = r0.f102963a
            if (r0 != 0) goto L17
            r0 = r1
            goto L23
        L17:
            ok.g0 r0 = com.google.android.gms.internal.measurement.e5.f31370a
            java.lang.Object r0 = r0.get()
            pk.l1 r0 = (pk.l1) r0
            boolean r0 = r0.c(r2)
        L23:
            java.lang.String r2 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            bf.b.u(r2, r0)
        L28:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.v4.f31666j
            int r0 = r0.get()
            int r2 = r10.f31670d
            if (r2 >= r0) goto Ld3
            monitor-enter(r10)
            int r2 = r10.f31670d     // Catch: java.lang.Throwable -> L8d
            if (r2 >= r0) goto Lcf
            com.google.android.gms.internal.measurement.l4 r2 = com.google.android.gms.internal.measurement.v4.f31664h     // Catch: java.lang.Throwable -> L8d
            ok.a r3 = ok.a.f95409a     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            if (r2 == 0) goto L8f
            ok.g0 r3 = r2.f31504b     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L8d
            ok.v r3 = (ok.v) r3     // Catch: java.lang.Throwable -> L8d
            boolean r5 = r3.c()     // Catch: java.lang.Throwable -> L8d
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r3.b()     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.measurement.p4 r5 = (com.google.android.gms.internal.measurement.p4) r5     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.measurement.b5 r6 = r10.f31667a     // Catch: java.lang.Throwable -> L8d
            android.net.Uri r7 = r6.f31298b     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = r6.f31297a     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = r6.f31300d     // Catch: java.lang.Throwable -> L8d
            java.lang.String r9 = r10.f31668b     // Catch: java.lang.Throwable -> L8d
            r5.getClass()     // Catch: java.lang.Throwable -> L8d
            if (r7 == 0) goto L66
            java.lang.String r8 = r7.toString()     // Catch: java.lang.Throwable -> L8d
            goto L68
        L66:
            if (r8 == 0) goto L71
        L68:
            g1.o0 r5 = r5.f31582a     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r5 = r5.get(r8)     // Catch: java.lang.Throwable -> L8d
            g1.o0 r5 = (g1.o0) r5     // Catch: java.lang.Throwable -> L8d
            goto L72
        L71:
            r5 = r4
        L72:
            if (r5 != 0) goto L75
            goto L8f
        L75:
            if (r6 == 0) goto L86
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r4.<init>()     // Catch: java.lang.Throwable -> L8d
            r4.append(r6)     // Catch: java.lang.Throwable -> L8d
            r4.append(r9)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r9 = r4.toString()     // Catch: java.lang.Throwable -> L8d
        L86:
            java.lang.Object r4 = r5.get(r9)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L8d
            goto L8f
        L8d:
            r0 = move-exception
            goto Ld1
        L8f:
            if (r2 == 0) goto L92
            goto L93
        L92:
            r1 = 0
        L93:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            bf.b.u(r5, r1)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.measurement.b5 r1 = r10.f31667a     // Catch: java.lang.Throwable -> L8d
            boolean r1 = r1.f31302f     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r10.b(r2)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto La5
            goto Lbc
        La5:
            java.lang.Object r1 = r10.d(r2)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto Lba
            goto Lbc
        Lac:
            java.lang.Object r1 = r10.d(r2)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto Lb3
            goto Lbc
        Lb3:
            java.lang.Object r1 = r10.b(r2)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto Lba
            goto Lbc
        Lba:
            java.lang.Object r1 = r10.f31669c     // Catch: java.lang.Throwable -> L8d
        Lbc:
            boolean r2 = r3.c()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto Lcb
            if (r4 != 0) goto Lc7
            java.lang.Object r1 = r10.f31669c     // Catch: java.lang.Throwable -> L8d
            goto Lcb
        Lc7:
            java.lang.Object r1 = r10.c(r4)     // Catch: java.lang.Throwable -> L8d
        Lcb:
            r10.f31671e = r1     // Catch: java.lang.Throwable -> L8d
            r10.f31670d = r0     // Catch: java.lang.Throwable -> L8d
        Lcf:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8d
            goto Ld3
        Ld1:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8d
            throw r0
        Ld3:
            java.lang.Object r0 = r10.f31671e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v4.a():java.lang.Object");
    }

    public final Object b(l4 l4Var) {
        ok.t tVar;
        q4 q4Var;
        String str;
        b5 b5Var = this.f31667a;
        if (!b5Var.f31301e && ((tVar = b5Var.f31304h) == null || ((Boolean) tVar.apply(l4Var.f31503a)).booleanValue())) {
            Context context = l4Var.f31503a;
            synchronized (q4.class) {
                try {
                    if (q4.f31592d == null) {
                        q4.f31592d = kh2.s0.x(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new q4(context) : new q4(0);
                    }
                    q4Var = q4.f31592d;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            b5 b5Var2 = this.f31667a;
            if (b5Var2.f31301e) {
                str = null;
            } else {
                String str2 = b5Var2.f31299c;
                str = this.f31668b;
                if (str2 == null || !str2.isEmpty()) {
                    str = a.a.C(str2, str);
                }
            }
            Object zza = q4Var.zza(str);
            if (zza != null) {
                return c(zza);
            }
        }
        return null;
    }

    public abstract Object c(Object obj);

    /* JADX WARN: Can't wrap try/catch for region: R(10:39|(1:41)(7:53|(1:55)(1:60)|56|(1:58)|48|49|50)|42|43|44|45|(1:47)|48|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008d, code lost:
    
        if ("com.google.android.gms".equals(r4.packageName) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.google.android.gms.internal.measurement.l4 r9) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v4.d(com.google.android.gms.internal.measurement.l4):java.lang.Object");
    }
}
