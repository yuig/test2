package w1;

import com.google.android.gms.internal.measurement.q4;

/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f127594a = 100000;

    /* renamed from: b, reason: collision with root package name */
    public q4 f127595b;

    /* renamed from: c, reason: collision with root package name */
    public q4 f127596c;

    /* renamed from: d, reason: collision with root package name */
    public int f127597d;

    /* renamed from: e, reason: collision with root package name */
    public Long f127598e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f127599f;

    public static void b(z2 z2Var, h4.f0 f0Var) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!z2Var.f127599f) {
            Long l13 = z2Var.f127598e;
            if (currentTimeMillis <= (l13 != null ? l13.longValue() : 0L) + 5000) {
                return;
            }
        }
        z2Var.f127598e = Long.valueOf(currentTimeMillis);
        z2Var.a(f0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[LOOP:0: B:26:0x0062->B:31:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[EDGE_INSN: B:32:0x0077->B:33:0x0077 BREAK  A[LOOP:0: B:26:0x0062->B:31:0x0072], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(h4.f0 r5) {
        /*
            r4 = this;
            r0 = 0
            r4.f127599f = r0
            com.google.android.gms.internal.measurement.q4 r0 = r4.f127595b
            r1 = 0
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.f31595c
            h4.f0 r0 = (h4.f0) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r5, r0)
            if (r0 == 0) goto L15
            return
        L15:
            b4.g r0 = r5.f67559a
            java.lang.String r0 = r0.f21571a
            com.google.android.gms.internal.measurement.q4 r2 = r4.f127595b
            if (r2 == 0) goto L28
            java.lang.Object r2 = r2.f31595c
            h4.f0 r2 = (h4.f0) r2
            if (r2 == 0) goto L28
            b4.g r2 = r2.f67559a
            java.lang.String r2 = r2.f21571a
            goto L29
        L28:
            r2 = r1
        L29:
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r2)
            if (r0 == 0) goto L37
            com.google.android.gms.internal.measurement.q4 r0 = r4.f127595b
            if (r0 != 0) goto L34
            goto L36
        L34:
            r0.f31595c = r5
        L36:
            return
        L37:
            com.google.android.gms.internal.measurement.q4 r0 = r4.f127595b
            com.google.android.gms.internal.measurement.q4 r2 = new com.google.android.gms.internal.measurement.q4
            r3 = 11
            r2.<init>(r3, r0, r5)
            r4.f127595b = r2
            r4.f127596c = r1
            int r0 = r4.f127597d
            b4.g r5 = r5.f67559a
            java.lang.String r5 = r5.f21571a
            int r5 = r5.length()
            int r5 = r5 + r0
            r4.f127597d = r5
            int r0 = r4.f127594a
            if (r5 <= r0) goto L7c
            com.google.android.gms.internal.measurement.q4 r5 = r4.f127595b
            if (r5 == 0) goto L5e
            java.lang.Object r0 = r5.f31594b
            com.google.android.gms.internal.measurement.q4 r0 = (com.google.android.gms.internal.measurement.q4) r0
            goto L5f
        L5e:
            r0 = r1
        L5f:
            if (r0 != 0) goto L62
            goto L7c
        L62:
            if (r5 == 0) goto L6f
            java.lang.Object r0 = r5.f31594b
            com.google.android.gms.internal.measurement.q4 r0 = (com.google.android.gms.internal.measurement.q4) r0
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.f31594b
            com.google.android.gms.internal.measurement.q4 r0 = (com.google.android.gms.internal.measurement.q4) r0
            goto L70
        L6f:
            r0 = r1
        L70:
            if (r0 == 0) goto L77
            java.lang.Object r5 = r5.f31594b
            com.google.android.gms.internal.measurement.q4 r5 = (com.google.android.gms.internal.measurement.q4) r5
            goto L62
        L77:
            if (r5 != 0) goto L7a
            goto L7c
        L7a:
            r5.f31594b = r1
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.z2.a(h4.f0):void");
    }
}
