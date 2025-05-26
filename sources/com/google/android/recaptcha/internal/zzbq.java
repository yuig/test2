package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbq {

    @NotNull
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[PHI: r0
      0x0083: PHI (r0v4 java.lang.Object) = (r0v6 java.lang.Object), (r0v1 java.lang.Object) binds: [B:14:0x0080, B:31:0x005c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b0 -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r19, long r20, long r22, double r24, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r26, @org.jetbrains.annotations.NotNull bl2.c r27) {
        /*
            r18 = this;
            r0 = r27
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzbp
            if (r1 == 0) goto L17
            r1 = r0
            com.google.android.recaptcha.internal.zzbp r1 = (com.google.android.recaptcha.internal.zzbp) r1
            int r2 = r1.zzh
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.zzh = r2
            r2 = r18
            goto L1e
        L17:
            com.google.android.recaptcha.internal.zzbp r1 = new com.google.android.recaptcha.internal.zzbp
            r2 = r18
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.zzf
            cl2.a r3 = cl2.a.COROUTINE_SUSPENDED
            int r4 = r1.zzh
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L62
            if (r4 == r6) goto L4e
            if (r4 != r5) goto L46
            long r7 = r1.zzd
            double r9 = r1.zze
            long r11 = r1.zzc
            java.lang.Object r4 = r1.zzb
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r13 = r1.zza
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            ue.c.H(r0)
        L3d:
            r15 = r13
            r13 = r1
            r1 = r15
            r16 = r9
            r9 = r11
            r11 = r16
            goto L70
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4e:
            long r7 = r1.zzd
            double r9 = r1.zze
            long r11 = r1.zzc
            java.lang.Object r4 = r1.zzb
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r13 = r1.zza
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            ue.c.H(r0)     // Catch: java.lang.Exception -> L60
            goto L83
        L60:
            r0 = move-exception
            goto L8d
        L62:
            ue.c.H(r0)
            r7 = r20
            r9 = r22
            r11 = r24
            r4 = r26
            r13 = r1
            r1 = r19
        L70:
            r13.zza = r1     // Catch: java.lang.Exception -> L84
            r13.zzb = r4     // Catch: java.lang.Exception -> L84
            r13.zzc = r9     // Catch: java.lang.Exception -> L84
            r13.zze = r11     // Catch: java.lang.Exception -> L84
            r13.zzd = r7     // Catch: java.lang.Exception -> L84
            r13.zzh = r6     // Catch: java.lang.Exception -> L84
            java.lang.Object r0 = r4.invoke(r13)     // Catch: java.lang.Exception -> L84
            if (r0 != r3) goto L83
            return r3
        L83:
            return r0
        L84:
            r0 = move-exception
            r15 = r13
            r13 = r1
            r1 = r15
            r16 = r9
            r9 = r11
            r11 = r16
        L8d:
            java.lang.Object r14 = r13.invoke(r0)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Lb4
            double r7 = (double) r7
            double r7 = r7 * r9
            long r7 = (long) r7
            long r7 = ql2.s.d(r7, r11)
            r1.zza = r13
            r1.zzb = r4
            r1.zzc = r11
            r1.zze = r9
            r1.zzd = r7
            r1.zzh = r5
            java.lang.Object r0 = lb.l0.S(r7, r1)
            if (r0 == r3) goto Lb3
            goto L3d
        Lb3:
            return r3
        Lb4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbq.zza(kotlin.jvm.functions.Function1, long, long, double, kotlin.jvm.functions.Function1, bl2.c):java.lang.Object");
    }
}
