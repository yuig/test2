package com.google.android.recaptcha.internal;

import android.content.Context;
import ao2.j0;
import bl2.c;
import dl2.b;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzae implements zzy {

    @NotNull
    private final zzek zza;

    @NotNull
    private final Context zzb;

    @NotNull
    private final zzan zzc;
    private boolean zzd = true;

    @NotNull
    private String zze = "";

    @NotNull
    private final zzbs zzf;

    public zzae(@NotNull zzek zzekVar, @NotNull Context context, @NotNull j0 j0Var, @NotNull zzan zzanVar, @NotNull zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzg = zzkh.zzg();
        byte[] zzl = zzleVar.zzl();
        byte[] zzd = zzjz.zza().zza(zzg.zzi(zzl, 0, zzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzk = zzle.zzk(zzd, 0, zzd.length);
        zzkh zzh = zzkh.zzh();
        byte[] zzl2 = zzk.zzl();
        return zzh.zzi(zzl2, 0, zzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @NotNull
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(@NotNull String str, @NotNull c cVar) {
        return b.O(new zzac(this, str, null), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r12.zze(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.internal.zzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzd(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzse r11, @org.jetbrains.annotations.NotNull bl2.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzad
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzad r0 = (com.google.android.recaptcha.internal.zzad) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzad r0 = new com.google.android.recaptcha.internal.zzad
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zzen r11 = (com.google.android.recaptcha.internal.zzen) r11
            ue.c.H(r12)
            goto L8b
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            com.google.android.recaptcha.internal.zzen r11 = r0.zze
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzae r2 = (com.google.android.recaptcha.internal.zzae) r2
            ue.c.H(r12)
            goto L7c
        L41:
            ue.c.H(r12)
            com.google.android.recaptcha.internal.zzen r12 = com.google.android.recaptcha.internal.zzz.zzc(r10)
            com.google.android.recaptcha.internal.zzbs r2 = r10.zzf
            android.content.Context r6 = r10.zzb
            int r2 = r2.zza(r6)
            r6 = 3
            if (r2 != r6) goto L92
            long r6 = r11.zzf()
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L5e
            goto L92
        L5e:
            com.google.android.recaptcha.internal.zzle r2 = r11.zzg()
            java.lang.String r2 = zzi(r2)
            r10.zze = r2
            com.google.android.recaptcha.internal.zzan r2 = r10.zzc
            long r6 = r11.zzf()
            r0.zza = r10
            r0.zze = r12
            r0.zzd = r5
            java.lang.Object r11 = r2.zzd(r6, r0)
            if (r11 == r1) goto L91
            r2 = r10
            r11 = r12
        L7c:
            com.google.android.recaptcha.internal.zzan r12 = r2.zzc
            r0.zza = r11
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r12 = r12.zze(r0)
            if (r12 != r1) goto L8b
            goto L91
        L8b:
            r11.zza()
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        L91:
            return r1
        L92:
            r11 = 0
            r10.zzd = r11
            com.google.android.recaptcha.internal.zzbd r11 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzab
            r11.<init>(r0, r1, r3)
            r12.zzb(r11)
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzae.zzd(com.google.android.recaptcha.internal.zzse, bl2.c):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(@NotNull zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
