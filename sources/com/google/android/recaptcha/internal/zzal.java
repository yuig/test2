package com.google.android.recaptcha.internal;

import bl2.c;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
final class zzal extends j implements Function2 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ j0 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzan zzanVar, zzen zzenVar, j0 j0Var, c cVar) {
        super(2, cVar);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = j0Var;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzal(this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((ao2.j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #0 {Exception -> 0x001a, blocks: (B:8:0x0024, B:10:0x0030, B:39:0x0016), top: B:38:0x0016 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:7:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007d -> B:5:0x0011). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L14
            boolean r1 = r7.zzb
            long r4 = r7.zza
            ue.c.H(r8)
        L11:
            r8 = r1
            goto L80
        L14:
            long r4 = r7.zza
            ue.c.H(r8)     // Catch: java.lang.Exception -> L1a
            goto L30
        L1a:
            r8 = move-exception
            goto L4c
        L1c:
            ue.c.H(r8)
            r4 = 1000(0x3e8, double:4.94E-321)
            r8 = r3
        L22:
            if (r8 == 0) goto L84
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch: java.lang.Exception -> L1a
            r7.zza = r4     // Catch: java.lang.Exception -> L1a
            r7.zzc = r3     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = com.google.android.recaptcha.internal.zzan.zza(r8, r7)     // Catch: java.lang.Exception -> L1a
            if (r8 == r0) goto L4b
        L30:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan r1 = r7.zzd     // Catch: java.lang.Exception -> L1a
            ao2.v r1 = r1.zzf()     // Catch: java.lang.Exception -> L1a
            ao2.w r1 = (ao2.w) r1     // Catch: java.lang.Exception -> L1a
            r1.Q(r8)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzao r1 = com.google.android.recaptcha.internal.zzao.zzc     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan.zzh(r8, r1)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzen r8 = r7.zze     // Catch: java.lang.Exception -> L1a
            r8.zza()     // Catch: java.lang.Exception -> L1a
            r8 = r2
            goto L22
        L4b:
            return r0
        L4c:
            kotlin.jvm.internal.j0 r1 = r7.zzf
            r1.f80434a = r8
            boolean r1 = r8 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r1 == 0) goto L6d
            r1 = r8
            com.google.android.play.core.integrity.StandardIntegrityException r1 = (com.google.android.play.core.integrity.StandardIntegrityException) r1
            int r1 = r1.getErrorCode()
            r6 = -100
            if (r1 == r6) goto L6f
            r6 = -18
            if (r1 == r6) goto L6f
            r6 = -12
            if (r1 == r6) goto L6f
            r6 = -8
            if (r1 == r6) goto L6f
            r6 = -3
            if (r1 == r6) goto L6f
        L6d:
            r1 = r2
            goto L70
        L6f:
            r1 = r3
        L70:
            if (r1 == 0) goto L83
            r7.zza = r4
            r7.zzb = r3
            r8 = 2
            r7.zzc = r8
            java.lang.Object r8 = lb.l0.S(r4, r7)
            if (r8 == r0) goto L82
            goto L11
        L80:
            long r4 = r4 + r4
            goto L22
        L82:
            return r0
        L83:
            throw r8
        L84:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzal.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
