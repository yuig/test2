package androidx.camera.core.impl;

import a.cb;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f16940a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final Object f16941b;

    /* renamed from: c, reason: collision with root package name */
    public int f16942c;

    /* renamed from: d, reason: collision with root package name */
    public final a0.a f16943d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f16944e;

    /* renamed from: f, reason: collision with root package name */
    public int f16945f;

    public p0(a0.a aVar) {
        Object obj = new Object();
        this.f16941b = obj;
        this.f16944e = new HashMap();
        this.f16942c = 1;
        synchronized (obj) {
            this.f16943d = aVar;
            this.f16945f = this.f16942c;
        }
    }

    public static void c(c0.l lVar, i0 i0Var) {
        if (tb.f.Q()) {
            tb.f.g0(i0Var.ordinal(), "CX:State[" + lVar + "]");
        }
    }

    public final n0 a(String str) {
        HashMap hashMap = this.f16944e;
        for (c0.l lVar : hashMap.keySet()) {
            if (str.equals(((h0) lVar.a()).c())) {
                return (n0) hashMap.get(lVar);
            }
        }
        return null;
    }

    public final void b() {
        boolean G0 = kh2.m0.G0(3, "CameraStateRegistry");
        StringBuilder sb3 = this.f16940a;
        if (G0) {
            sb3.setLength(0);
            sb3.append("Recalculating open cameras:\n");
            sb3.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb3.append("-------------------------------------------------------------------\n");
        }
        int i13 = 0;
        for (Map.Entry entry : this.f16944e.entrySet()) {
            if (kh2.m0.G0(3, "CameraStateRegistry")) {
                sb3.append(String.format(Locale.US, "%-45s%-22s\n", ((c0.l) entry.getKey()).toString(), ((n0) entry.getValue()).f16917a != null ? ((n0) entry.getValue()).f16917a.toString() : "UNKNOWN"));
            }
            i0 i0Var = ((n0) entry.getValue()).f16917a;
            if (i0Var != null && i0Var.holdsCameraSlot()) {
                i13++;
            }
        }
        if (kh2.m0.G0(3, "CameraStateRegistry")) {
            sb3.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb3.append(cb.j("Open count: ", i13, " (Max allowed: ", this.f16942c, ")"));
            kh2.m0.p("CameraStateRegistry", sb3.toString());
        }
        this.f16945f = Math.max(this.f16942c - i13, 0);
    }

    public final boolean d(c0.l lVar) {
        boolean z13;
        i0 i0Var;
        synchronized (this.f16941b) {
            try {
                n0 n0Var = (n0) this.f16944e.get(lVar);
                com.bumptech.glide.d.s(n0Var, "Camera must first be registered with registerCamera()");
                z13 = false;
                if (kh2.m0.G0(3, "CameraStateRegistry")) {
                    this.f16940a.setLength(0);
                    StringBuilder sb3 = this.f16940a;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[4];
                    objArr[0] = lVar;
                    objArr[1] = Integer.valueOf(this.f16945f);
                    i0 i0Var2 = n0Var.f16917a;
                    objArr[2] = Boolean.valueOf(i0Var2 != null && i0Var2.holdsCameraSlot());
                    objArr[3] = n0Var.f16917a;
                    sb3.append(String.format(locale, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", objArr));
                }
                if (this.f16945f > 0 || ((i0Var = n0Var.f16917a) != null && i0Var.holdsCameraSlot())) {
                    i0 i0Var3 = i0.OPENING;
                    n0Var.f16917a = i0Var3;
                    c(lVar, i0Var3);
                    z13 = true;
                }
                if (kh2.m0.G0(3, "CameraStateRegistry")) {
                    StringBuilder sb4 = this.f16940a;
                    Locale locale2 = Locale.US;
                    sb4.append(" --> ".concat(z13 ? "SUCCESS" : "FAIL"));
                    kh2.m0.p("CameraStateRegistry", this.f16940a.toString());
                }
                if (z13) {
                    b();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f16941b
            monitor-enter(r0)
            a0.a r1 = r5.f16943d     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.f202a     // Catch: java.lang.Throwable -> Ld
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r6 = move-exception
            goto L55
        Lf:
            androidx.camera.core.impl.n0 r6 = r5.a(r6)     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            if (r6 == 0) goto L19
            androidx.camera.core.impl.i0 r6 = r6.f16917a     // Catch: java.lang.Throwable -> Ld
            goto L1a
        L19:
            r6 = r1
        L1a:
            if (r7 == 0) goto L21
            androidx.camera.core.impl.n0 r7 = r5.a(r7)     // Catch: java.lang.Throwable -> Ld
            goto L22
        L21:
            r7 = r1
        L22:
            if (r7 == 0) goto L26
            androidx.camera.core.impl.i0 r1 = r7.f16917a     // Catch: java.lang.Throwable -> Ld
        L26:
            androidx.camera.core.impl.i0 r7 = androidx.camera.core.impl.i0.OPEN     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r7.equals(r6)     // Catch: java.lang.Throwable -> Ld
            r4 = 0
            if (r2 != 0) goto L3a
            androidx.camera.core.impl.i0 r2 = androidx.camera.core.impl.i0.CONFIGURED     // Catch: java.lang.Throwable -> Ld
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L38
            goto L3a
        L38:
            r6 = r4
            goto L3b
        L3a:
            r6 = r3
        L3b:
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Ld
            if (r7 != 0) goto L4c
            androidx.camera.core.impl.i0 r7 = androidx.camera.core.impl.i0.CONFIGURED     // Catch: java.lang.Throwable -> Ld
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L4a
            goto L4c
        L4a:
            r7 = r4
            goto L4d
        L4c:
            r7 = r3
        L4d:
            if (r6 == 0) goto L52
            if (r7 == 0) goto L52
            goto L53
        L52:
            r3 = r4
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.p0.e(java.lang.String, java.lang.String):boolean");
    }
}
