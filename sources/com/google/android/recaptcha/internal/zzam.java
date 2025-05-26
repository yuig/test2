package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzam extends j implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, c cVar) {
        super(2, cVar);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzam(this.zzc, this.zzd, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.zzb
            if (r1 == 0) goto L10
            java.lang.Object r0 = r6.zza
            kotlin.jvm.internal.j0 r0 = (kotlin.jvm.internal.j0) r0
            ue.c.H(r7)     // Catch: java.lang.Exception -> Le
            goto L60
        Le:
            r7 = move-exception
            goto L35
        L10:
            ue.c.H(r7)
            kotlin.jvm.internal.j0 r7 = new kotlin.jvm.internal.j0
            r7.<init>()
            com.google.android.recaptcha.internal.zzal r1 = new com.google.android.recaptcha.internal.zzal     // Catch: java.lang.Exception -> L31
            com.google.android.recaptcha.internal.zzan r2 = r6.zzc     // Catch: java.lang.Exception -> L31
            com.google.android.recaptcha.internal.zzen r3 = r6.zzd     // Catch: java.lang.Exception -> L31
            r4 = 0
            r1.<init>(r2, r3, r7, r4)     // Catch: java.lang.Exception -> L31
            r6.zza = r7     // Catch: java.lang.Exception -> L31
            r2 = 1
            r6.zzb = r2     // Catch: java.lang.Exception -> L31
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r7 = bs1.c.w2(r2, r1, r6)     // Catch: java.lang.Exception -> L31
            if (r7 != r0) goto L60
            return r0
        L31:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L35:
            com.google.android.recaptcha.internal.zzan r1 = r6.zzc
            ao2.v r1 = r1.zzf()
            java.lang.Object r0 = r0.f80434a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L42
            r0 = r7
        L42:
            ao2.w r1 = (ao2.w) r1
            r1.e0(r0)
            com.google.android.recaptcha.internal.zzan r0 = r6.zzc
            com.google.android.recaptcha.internal.zzao r1 = com.google.android.recaptcha.internal.zzao.zza
            com.google.android.recaptcha.internal.zzan.zzh(r0, r1)
            com.google.android.recaptcha.internal.zzen r0 = r6.zzd
            com.google.android.recaptcha.internal.zzbd r1 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r2 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r3 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r7 = r7.getMessage()
            r1.<init>(r2, r3, r7)
            r0.zzb(r1)
        L60:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
