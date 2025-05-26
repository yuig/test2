package com.google.android.recaptcha.internal;

import android.content.Context;
import ao2.j0;
import ao2.v;
import bl2.c;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import kotlin.Unit;
import mo2.a;
import mo2.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzan {
    public v zza;

    @NotNull
    private final j0 zzb;

    @NotNull
    private final zzek zzc;

    @NotNull
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;

    @NotNull
    private zzao zze = zzao.zza;

    @NotNull
    private final a zzg = d.a();

    public zzan(@NotNull Context context, @NotNull j0 j0Var, @NotNull zzek zzekVar, @NotNull StandardIntegrityManager standardIntegrityManager, long j13) {
        this.zzb = j0Var;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzag
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzag r0 = (com.google.android.recaptcha.internal.zzag) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzag r0 = new com.google.android.recaptcha.internal.zzag
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            ue.c.H(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r2 = r6.zzd
            com.google.android.gms.tasks.Task r7 = r2.prepareIntegrityToken(r7)
            ao2.p0 r7 = com.google.android.recaptcha.internal.zzbx.zza(r7)
            r0.zzc = r3
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzi(bl2.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r7)
            goto L6b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.zzd
            ue.c.H(r7)
            goto L49
        L38:
            ue.c.H(r7)
            ao2.v r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 == r1) goto L72
        L49:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            ao2.p0 r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6b
            goto L72
        L6b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            ue.c.H(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            ue.c.H(r8)
            goto L67
        L3d:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            ue.c.H(r8)     // Catch: java.lang.Exception -> L5a
            goto L56
        L45:
            ue.c.H(r8)
            r0.zzd = r6     // Catch: java.lang.Exception -> L59
            r0.zze = r7     // Catch: java.lang.Exception -> L59
            r0.zzc = r5     // Catch: java.lang.Exception -> L59
            java.lang.Object r8 = r6.zzj(r7, r0)     // Catch: java.lang.Exception -> L59
            if (r8 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L5a
            goto L76
        L59:
            r2 = r6
        L5a:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r8 = r2.zzj(r7, r0)
            if (r8 == r1) goto L77
        L74:
            java.lang.String r8 = (java.lang.String) r8
        L76:
            return r8
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, bl2.c):java.lang.Object");
    }

    public final Object zzd(long j13, @NotNull c cVar) {
        this.zzf = j13;
        return Unit.f80348a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (kotlin.Unit.f80348a == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:18:0x0053, B:20:0x005d, B:23:0x0067), top: B:17:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:18:0x0053, B:20:0x005d, B:23:0x0067), top: B:17:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(@org.jetbrains.annotations.NotNull bl2.c r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzak
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzak r0 = (com.google.android.recaptcha.internal.zzak) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzak r0 = new com.google.android.recaptcha.internal.zzak
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            ue.c.H(r14)
            goto Lb7
        L2c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L34:
            java.lang.Object r2 = r0.zza
            mo2.a r2 = (mo2.a) r2
            com.google.android.recaptcha.internal.zzan r6 = r0.zze
            ue.c.H(r14)
            goto L53
        L3e:
            ue.c.H(r14)
            mo2.a r14 = r13.zzg
            r0.zze = r13
            r0.zza = r14
            r0.zzd = r5
            r2 = r14
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r14 = r2.f(r3, r0)
            if (r14 == r1) goto Lc0
            r6 = r13
        L53:
            com.google.android.recaptcha.internal.zzao r14 = r6.zze     // Catch: java.lang.Throwable -> L65
            com.google.android.recaptcha.internal.zzao r7 = com.google.android.recaptcha.internal.zzao.zza     // Catch: java.lang.Throwable -> L65
            boolean r14 = kotlin.jvm.internal.Intrinsics.d(r14, r7)     // Catch: java.lang.Throwable -> L65
            if (r14 != 0) goto L67
            kotlin.Unit r14 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L65
            mo2.c r2 = (mo2.c) r2
            r2.i(r3)
            return r14
        L65:
            r14 = move-exception
            goto Lba
        L67:
            com.google.android.recaptcha.internal.zzao r14 = com.google.android.recaptcha.internal.zzao.zzb     // Catch: java.lang.Throwable -> L65
            r6.zze = r14     // Catch: java.lang.Throwable -> L65
            kotlin.Unit r14 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L65
            mo2.c r2 = (mo2.c) r2
            r2.i(r3)
            com.google.android.recaptcha.internal.zzek r14 = r6.zzc
            java.lang.String r2 = r14.zzd()
            r14.zzc(r2)
            r14.zzb(r4)
            r2 = 38
            com.google.android.recaptcha.internal.zzen r14 = r14.zzf(r2)
            ao2.w r2 = ue.c.a()
            r6.zza = r2
            ao2.j0 r2 = r6.zzb
            com.google.android.recaptcha.internal.zzam r7 = new com.google.android.recaptcha.internal.zzam
            r7.<init>(r6, r14, r3)
            r14 = 3
            kotlin.jvm.internal.j.z(r2, r3, r3, r7, r14)
            r0.zze = r3
            r0.zza = r3
            r0.zzd = r4
            boolean r14 = r6.zzh
            if (r14 != 0) goto Lb2
            java.util.Timer r7 = new java.util.Timer
            r7.<init>()
            com.google.android.recaptcha.internal.zzai r8 = new com.google.android.recaptcha.internal.zzai
            r8.<init>(r6)
            r11 = 28800000(0x1b77400, double:1.42290906E-316)
            r9 = r11
            r7.schedule(r8, r9, r11)
            r6.zzh = r5
        Lb2:
            kotlin.Unit r14 = kotlin.Unit.f80348a
            if (r14 != r1) goto Lb7
            goto Lc0
        Lb7:
            kotlin.Unit r14 = kotlin.Unit.f80348a
            return r14
        Lba:
            mo2.c r2 = (mo2.c) r2
            r2.i(r3)
            throw r14
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zze(bl2.c):java.lang.Object");
    }

    @NotNull
    public final v zzf() {
        v vVar = this.zza;
        if (vVar != null) {
            return vVar;
        }
        return null;
    }
}
