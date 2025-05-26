package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import bl2.c;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;
import xk2.k;
import xk2.m;

/* loaded from: classes3.dex */
public final class zzdt {

    @NotNull
    private final String zza;

    @NotNull
    private final zzek zzb;

    @NotNull
    private final zzl zzc;

    @NotNull
    private final k zzd;

    @NotNull
    private final k zze;

    @NotNull
    private final k zzf;

    @NotNull
    private final k zzg;

    @NotNull
    private final k zzh;

    @NotNull
    private final zzbi zzi;

    public zzdt(@NotNull String str, @NotNull zzbi zzbiVar, @NotNull zzek zzekVar, @NotNull zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i13 = zzav.zza;
        this.zzd = m.b(zzdm.zza);
        this.zze = m.b(zzdn.zza);
        this.zzf = m.b(zzdo.zza);
        this.zzg = m.b(zzdp.zza);
        this.zzh = m.b(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zza = this.zzb.zza();
        zza.zzc(str);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzv(com.google.android.recaptcha.internal.zzsc r10, long r11, bl2.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzdj
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzdj r0 = (com.google.android.recaptcha.internal.zzdj) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdj r0 = new com.google.android.recaptcha.internal.zzdj
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            cl2.a r7 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r0.zzd
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 == r2) goto L37
            if (r1 == r8) goto L2e
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2e:
            java.lang.Object r10 = r0.zza
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            ue.c.H(r13)
            goto Lb8
        L37:
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zzdt r10 = (com.google.android.recaptcha.internal.zzdt) r10
            ue.c.H(r13)
            xk2.s r13 = (xk2.s) r13
            java.lang.Object r11 = r13.f135226a
            goto L7e
        L43:
            ue.c.H(r13)
            java.lang.String r13 = r10.zzO()
            zzy(r13)
            java.util.List r13 = r9.zzw()
            java.util.Iterator r13 = r13.iterator()
        L55:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r13.next()
            com.google.android.recaptcha.internal.zze r1 = (com.google.android.recaptcha.internal.zze) r1
            com.google.android.recaptcha.internal.zzl r3 = r9.zzc
            com.google.android.recaptcha.internal.zze[] r1 = new com.google.android.recaptcha.internal.zze[]{r1}
            r3.zzf(r1)
            goto L55
        L6b:
            com.google.android.recaptcha.internal.zzl r1 = r9.zzc
            com.google.android.recaptcha.internal.zzek r5 = r9.zzb
            r0.zza = r9
            r0.zzd = r2
            r2 = r11
            r4 = r10
            r6 = r0
            java.lang.Object r11 = r1.zzc(r2, r4, r5, r6)
            if (r11 != r7) goto L7d
            goto Lb6
        L7d:
            r10 = r9
        L7e:
            java.lang.Throwable r11 = xk2.s.a(r11)
            if (r11 != 0) goto L87
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        L87:
            com.google.android.recaptcha.internal.zzbi r12 = r10.zzi
            ao2.j0 r12 = r12.zzd()
            kotlin.coroutines.CoroutineContext r12 = r12.getCoroutineContext()
            ao2.m0.l(r12)
            com.google.android.recaptcha.internal.zzbi r10 = r10.zzi
            ao2.j0 r10 = r10.zzd()
            kotlin.coroutines.CoroutineContext r10 = r10.getCoroutineContext()
            ao2.o1 r10 = ao2.m0.z(r10)
            kotlin.sequences.Sequence r10 = r10.getChildren()
            java.util.List r10 = yn2.c0.t(r10)
            java.util.Collection r10 = (java.util.Collection) r10
            r0.zza = r11
            r0.zzd = r8
            java.lang.Object r10 = com.bumptech.glide.c.E0(r10, r0)
            if (r10 != r7) goto Lb7
        Lb6:
            return r7
        Lb7:
            r10 = r11
        Lb8:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzv(com.google.android.recaptcha.internal.zzsc, long, bl2.c):java.lang.Object");
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return CollectionsKt.F0(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i13 = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) {
        try {
            zzrv zzj = zzrv.zzj(zzbt.zza(str));
            int i13 = zzav.zza;
            ((zzfu) m.b(zzde.zza).getValue()).zza(zzj);
        } catch (Exception e13) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e13.getMessage());
        }
    }

    @NotNull
    public final zzsp zzi(@NotNull RecaptchaAction recaptchaAction, @NotNull zzsi zzsiVar, @NotNull zzsc zzscVar) {
        zzso zzf = zzsp.zzf();
        zzf.zzs(this.zza);
        zzf.zze(recaptchaAction.getAction());
        zzf.zzf(zzscVar.zzN());
        zzf.zzq(zzscVar.zzM());
        zzf.zzr(zzsiVar);
        return (zzsp) zzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(@org.jetbrains.annotations.NotNull java.lang.String r6, long r7, @org.jetbrains.annotations.NotNull bl2.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdd
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdd r0 = (com.google.android.recaptcha.internal.zzdd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdd r0 = new com.google.android.recaptcha.internal.zzdd
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            ue.c.H(r9)     // Catch: java.lang.Exception -> L29 kotlinx.coroutines.TimeoutCancellationException -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            goto L53
        L29:
            r7 = move-exception
            goto L64
        L2b:
            r7 = move-exception
            goto L76
        L2d:
            r7 = move-exception
            goto L88
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            ue.c.H(r9)
            com.google.android.recaptcha.internal.zzek r9 = r5.zzu(r6)
            r2 = 27
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzl r2 = r5.zzc     // Catch: java.lang.Exception -> L5a kotlinx.coroutines.TimeoutCancellationException -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            r0.zzd = r9     // Catch: java.lang.Exception -> L5a kotlinx.coroutines.TimeoutCancellationException -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            r0.zzc = r3     // Catch: java.lang.Exception -> L5a kotlinx.coroutines.TimeoutCancellationException -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            java.lang.Object r6 = r2.zzb(r6, r7, r0)     // Catch: java.lang.Exception -> L5a kotlinx.coroutines.TimeoutCancellationException -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            if (r6 == r1) goto L59
            r4 = r9
            r9 = r6
            r6 = r4
        L53:
            com.google.android.recaptcha.internal.zzsi r9 = (com.google.android.recaptcha.internal.zzsi) r9     // Catch: java.lang.Exception -> L29 kotlinx.coroutines.TimeoutCancellationException -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            r6.zza()     // Catch: java.lang.Exception -> L29 kotlinx.coroutines.TimeoutCancellationException -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            return r9
        L59:
            return r1
        L5a:
            r6 = move-exception
            r7 = r6
            goto L63
        L5d:
            r6 = move-exception
            r7 = r6
            goto L75
        L60:
            r6 = move-exception
            r7 = r6
            goto L87
        L63:
            r6 = r9
        L64:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L75:
            r6 = r9
        L76:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L87:
            r6 = r9
        L88:
            r6.zzb(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzl(java.lang.String, long, bl2.c):java.lang.Object");
    }

    public final Object zzm(@NotNull zzsp zzspVar, @NotNull String str, long j13, @NotNull c cVar) {
        return j.M(cVar, this.zzi.zza().getCoroutineContext(), new zzdg(this, str, j13, zzspVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzn(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzsc r11, long r12, @org.jetbrains.annotations.NotNull bl2.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzdk
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzdk r0 = (com.google.android.recaptcha.internal.zzdk) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdk r0 = new com.google.android.recaptcha.internal.zzdk
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ue.c.H(r14)     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            goto L4b
        L27:
            r11 = move-exception
            goto L4e
        L29:
            r11 = move-exception
            goto L5c
        L2b:
            r11 = move-exception
            goto L6a
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            ue.c.H(r14)
            com.google.android.recaptcha.internal.zzdl r14 = new com.google.android.recaptcha.internal.zzdl     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            r0.zzc = r3     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            java.lang.Object r11 = bs1.c.w2(r12, r14, r0)     // Catch: java.lang.Exception -> L27 kotlinx.coroutines.TimeoutCancellationException -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            if (r11 != r1) goto L4b
            return r1
        L4b:
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        L4e:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzap
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L5c:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L6a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzn(com.google.android.recaptcha.internal.zzsc, long, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzo(long r7, @org.jetbrains.annotations.NotNull bl2.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdr
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdr r0 = (com.google.android.recaptcha.internal.zzdr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdr r0 = new com.google.android.recaptcha.internal.zzdr
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            com.google.android.recaptcha.internal.zzen r7 = r0.zze
            com.google.android.recaptcha.internal.zzdt r8 = r0.zzd
            ue.c.H(r9)     // Catch: java.lang.Exception -> L2b kotlinx.coroutines.TimeoutCancellationException -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            goto L5b
        L2b:
            r9 = move-exception
            goto L69
        L2d:
            r9 = move-exception
            goto L82
        L2f:
            r9 = move-exception
            goto L9b
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            ue.c.H(r9)
            com.google.android.recaptcha.internal.zzek r9 = r6.zzb
            r2 = 22
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzds r2 = new com.google.android.recaptcha.internal.zzds     // Catch: java.lang.Exception -> L5f kotlinx.coroutines.TimeoutCancellationException -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            r4 = 0
            r2.<init>(r6, r9, r4)     // Catch: java.lang.Exception -> L5f kotlinx.coroutines.TimeoutCancellationException -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            r0.zzd = r6     // Catch: java.lang.Exception -> L5f kotlinx.coroutines.TimeoutCancellationException -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            r0.zze = r9     // Catch: java.lang.Exception -> L5f kotlinx.coroutines.TimeoutCancellationException -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            r0.zzc = r3     // Catch: java.lang.Exception -> L5f kotlinx.coroutines.TimeoutCancellationException -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            java.lang.Object r7 = bs1.c.w2(r7, r2, r0)     // Catch: java.lang.Exception -> L5f kotlinx.coroutines.TimeoutCancellationException -> L61 com.google.android.recaptcha.internal.zzbd -> L63
            if (r7 == r1) goto L5e
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L5b:
            com.google.android.recaptcha.internal.zzsc r9 = (com.google.android.recaptcha.internal.zzsc) r9     // Catch: java.lang.Exception -> L2b kotlinx.coroutines.TimeoutCancellationException -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            return r9
        L5e:
            return r1
        L5f:
            r7 = move-exception
            goto L65
        L61:
            r7 = move-exception
            goto L7e
        L63:
            r7 = move-exception
            goto L97
        L65:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L69:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzaw
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L7e:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L82:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L97:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L9b:
            com.google.android.recaptcha.internal.zzbb r0 = r9.zzb()
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 == 0) goto Lab
            com.google.android.recaptcha.internal.zzbd r9 = r8.zzs(r9, r9)
        Lab:
            r7.zzb(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzo(long, bl2.c):java.lang.Object");
    }

    public final void zzq(@NotNull String str, @NotNull zzsr zzsrVar) {
        zzen zzf = zzu(str).zzf(29);
        try {
            List<zzst> zzk = zzsrVar.zzk();
            int a13 = y0.a(g0.q(zzk, 10));
            if (a13 < 16) {
                a13 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
            for (zzst zzstVar : zzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzf.zza();
        } catch (zzbd e13) {
            zzf.zzb(e13);
        } catch (Exception e14) {
            zzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e14.getMessage()));
        }
    }
}
