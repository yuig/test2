package com.google.android.recaptcha.internal;

import bl2.c;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(@NotNull String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(1:(1:(3:11|12|13)(2:15|16))(5:17|18|(1:20)|12|13))(4:21|22|23|24))(4:42|43|44|(1:46)(1:47))|25|26|(1:28)|13))|51|6|(0)(0)|25|26|(0)|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        r10 = r0;
        r16 = r3;
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #2 {Exception -> 0x0093, blocks: (B:26:0x0084, B:28:0x008f), top: B:25:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(@org.jetbrains.annotations.NotNull java.lang.String r19, long r20, @org.jetbrains.annotations.NotNull bl2.c r22) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, bl2.c):java.lang.Object");
    }

    public abstract Object zzd(@NotNull String str, @NotNull c cVar);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (r12 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:27:0x004b, B:28:0x0079, B:30:0x0086), top: B:26:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(long r9, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzsc r11, @org.jetbrains.annotations.NotNull bl2.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L51
            if (r2 == r6) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbd r9 = (com.google.android.recaptcha.internal.zzbd) r9
            ue.c.H(r12)
            goto Lb2
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            ue.c.H(r12)
            goto L9d
        L45:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            ue.c.H(r12)     // Catch: java.lang.Exception -> L4f
            goto L79
        L4f:
            r11 = move-exception
            goto L8e
        L51:
            ue.c.H(r12)
            com.google.android.recaptcha.internal.zzen r12 = r8.zzb()
            boolean r2 = r8.zza
            if (r2 == 0) goto L64
            r12.zza()
            xk2.q r9 = xk2.s.f135225b
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        L64:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L8a
            r2.<init>(r8, r11, r3)     // Catch: java.lang.Exception -> L8a
            r0.zza = r8     // Catch: java.lang.Exception -> L8a
            r0.zze = r12     // Catch: java.lang.Exception -> L8a
            r0.zzd = r6     // Catch: java.lang.Exception -> L8a
            java.lang.Object r9 = bs1.c.w2(r9, r2, r0)     // Catch: java.lang.Exception -> L8a
            if (r9 == r1) goto Lb9
            r10 = r8
            r7 = r12
            r12 = r9
            r9 = r7
        L79:
            xk2.s r12 = (xk2.s) r12     // Catch: java.lang.Exception -> L4f
            java.lang.Object r11 = r12.f135226a     // Catch: java.lang.Exception -> L4f
            ue.c.H(r11)     // Catch: java.lang.Exception -> L4f
            kotlin.Unit r11 = kotlin.Unit.f80348a     // Catch: java.lang.Exception -> L4f
            r10.zza = r6     // Catch: java.lang.Exception -> L4f
            if (r9 == 0) goto L89
            r9.zza()     // Catch: java.lang.Exception -> L4f
        L89:
            return r11
        L8a:
            r9 = move-exception
            r11 = r9
            r10 = r8
            r9 = r12
        L8e:
            r12 = 0
            r10.zza = r12
            r0.zza = r10
            r0.zze = r9
            r0.zzd = r5
            java.lang.Object r12 = r10.zzj(r11, r0)
            if (r12 == r1) goto Lb9
        L9d:
            r11 = r12
            com.google.android.recaptcha.internal.zzbd r11 = (com.google.android.recaptcha.internal.zzbd) r11
            if (r9 == 0) goto La5
            r9.zzb(r11)
        La5:
            r0.zza = r11
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r1) goto Lb9
            r9 = r11
        Lb2:
            xk2.q r10 = xk2.s.f135225b
            xk2.r r9 = ue.c.m(r9)
            return r9
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, bl2.c):java.lang.Object");
    }

    public abstract Object zzf(@NotNull String str, @NotNull c cVar);

    public Object zzg(@NotNull zzbd zzbdVar, @NotNull c cVar) {
        return Unit.f80348a;
    }

    public abstract Object zzh(@NotNull zzsc zzscVar, @NotNull c cVar);

    public Object zzi(@NotNull String str, long j13, @NotNull Exception exc, @NotNull c cVar) {
        return Unit.f80348a;
    }

    public Object zzj(@NotNull Exception exc, @NotNull c cVar) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(@NotNull zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
