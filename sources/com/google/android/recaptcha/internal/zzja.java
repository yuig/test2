package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import ao2.v;
import ao2.w;
import bl2.c;
import cl2.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;
import xk2.k;
import xk2.m;

/* loaded from: classes3.dex */
public final class zzja extends zze {
    public v zza;
    public zzfo zzb;

    @NotNull
    private final zzek zzc;
    private zzsc zzf;

    @NotNull
    private final zzek zzj;

    @NotNull
    private final k zzk;

    @NotNull
    private final k zzl;

    @NotNull
    private final k zzm;

    @NotNull
    private final k zzn;

    @NotNull
    private final k zzo;
    private zzen zzp;

    @NotNull
    private final zzbi zzq;

    @NotNull
    private final Map zzd = zzjb.zza();

    @NotNull
    private final Map zze = new LinkedHashMap();

    @NotNull
    private final zzcb zzg = new zzcb(zzje.zza);

    @NotNull
    private final zzjh zzh = zzjh.zzc();

    @NotNull
    private final zzij zzi = new zzij(this);

    public zzja(@NotNull zzek zzekVar, @NotNull zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zza = zzekVar.zza();
        zza.zzc(zzekVar.zzd());
        this.zzj = zza;
        int i13 = zzav.zza;
        this.zzk = m.b(zzis.zza);
        this.zzl = m.b(zzit.zza);
        this.zzm = m.b(zziu.zza);
        this.zzn = m.b(zziv.zza);
        this.zzo = m.b(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzE(com.google.android.recaptcha.internal.zzsc r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzim
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzim r0 = (com.google.android.recaptcha.internal.zzim) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzim r0 = new com.google.android.recaptcha.internal.zzim
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.google.android.recaptcha.internal.zzja r5 = r0.zzd
            ue.c.H(r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L62
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ue.c.H(r6)
            xk2.k r6 = r4.zzn     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            java.lang.Object r6 = r6.getValue()     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            com.google.android.recaptcha.internal.zzff r6 = (com.google.android.recaptcha.internal.zzff) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            com.google.android.recaptcha.internal.zzek r2 = r4.zzj     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            java.lang.Object r6 = r6.zzd(r5, r2, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            java.lang.String r6 = (java.lang.String) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzbi r0 = r5.zzq     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            ao2.j0 r0 = r0.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzin r1 = new com.google.android.recaptcha.internal.zzin     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r2 = 0
            r1.<init>(r5, r6, r2)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r6 = 3
            kotlin.jvm.internal.j.z(r0, r2, r2, r1, r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L6b
        L5f:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L62:
            ao2.v r5 = r5.zzA()
            ao2.w r5 = (ao2.w) r5
            r5.e0(r6)
        L6b:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzE(com.google.android.recaptcha.internal.zzsc, bl2.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzF(java.lang.String r9, bl2.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.String r9 = r0.zzf
            java.lang.String r1 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            ue.c.H(r10)     // Catch: java.lang.Exception -> L2f
            r3 = r9
            r4 = r1
            goto L64
        L2f:
            r9 = move-exception
            goto L73
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            ue.c.H(r10)
            com.google.android.recaptcha.internal.zzek r10 = r8.zzj
            r2 = 26
            com.google.android.recaptcha.internal.zzen r10 = r10.zzf(r2)
            r8.zzp = r10
            xk2.k r10 = r8.zzl     // Catch: java.lang.Exception -> L71
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Exception -> L71
            com.google.android.recaptcha.internal.zzbr r10 = (com.google.android.recaptcha.internal.zzbr) r10     // Catch: java.lang.Exception -> L71
            java.lang.String r10 = r10.zza()     // Catch: java.lang.Exception -> L71
            r0.zzd = r8     // Catch: java.lang.Exception -> L71
            r0.zze = r9     // Catch: java.lang.Exception -> L71
            r0.zzf = r10     // Catch: java.lang.Exception -> L71
            r0.zzc = r3     // Catch: java.lang.Exception -> L71
            java.lang.Object r0 = r8.zzw(r0)     // Catch: java.lang.Exception -> L71
            if (r0 == r1) goto L70
            r4 = r9
            r3 = r10
            r10 = r0
            r0 = r8
        L64:
            r2 = r10
            android.webkit.WebView r2 = (android.webkit.WebView) r2     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "utf-8"
            r7 = 0
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2f
            goto L93
        L70:
            return r1
        L71:
            r9 = move-exception
            r0 = r8
        L73:
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzU
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r1, r2, r9)
            com.google.android.recaptcha.internal.zzen r9 = r0.zzp
            if (r9 == 0) goto L87
            r9.zzb(r10)
        L87:
            r9 = 0
            r0.zzp = r9
            ao2.v r9 = r0.zzA()
            ao2.w r9 = (ao2.w) r9
            r9.e0(r10)
        L93:
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzF(java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzG(java.lang.String r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzix
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzix r0 = (com.google.android.recaptcha.internal.zzix) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzix r0 = new com.google.android.recaptcha.internal.zzix
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.String r8 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            ue.c.H(r9)
            goto L77
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.String r8 = r0.zze
            com.google.android.recaptcha.internal.zzja r2 = r0.zzd
            ue.c.H(r9)
            goto L5a
        L3e:
            ue.c.H(r9)
            com.google.android.recaptcha.internal.zzcb r9 = r7.zzg
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zzd
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzc
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzb
            com.google.android.recaptcha.internal.zzje[] r2 = new com.google.android.recaptcha.internal.zzje[]{r2, r5, r6}
            r0.zzd = r7
            r0.zze = r8
            r0.zzc = r4
            java.lang.Object r9 = r9.zzb(r2, r0)
            if (r9 == r1) goto L9b
            r2 = r7
        L5a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L65
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        L65:
            com.google.android.recaptcha.internal.zzcb r9 = r2.zzg
            com.google.android.recaptcha.internal.zzje r4 = com.google.android.recaptcha.internal.zzje.zzb
            r0.zzd = r2
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r9 = r9.zzc(r4, r0)
            if (r9 != r1) goto L76
            goto L9b
        L76:
            r0 = r2
        L77:
            ao2.w r9 = ue.c.a()
            r0.zza = r9
            com.google.android.recaptcha.internal.zzek r9 = r0.zzj
            r9.zzc(r8)
            r8 = 42
            com.google.android.recaptcha.internal.zzen r8 = r9.zzf(r8)
            com.google.android.recaptcha.internal.zzbi r9 = r0.zzq
            ao2.j0 r9 = r9.zza()
            com.google.android.recaptcha.internal.zziz r1 = new com.google.android.recaptcha.internal.zziz
            r2 = 0
            r1.<init>(r0, r8, r2)
            r8 = 3
            kotlin.jvm.internal.j.z(r9, r2, r2, r1, r8)
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzG(java.lang.String, bl2.c):java.lang.Object");
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    @NotNull
    public final v zzA() {
        v vVar = this.zza;
        if (vVar != null) {
            return vVar;
        }
        return null;
    }

    @NotNull
    public final zzft zzC(@NotNull zzsc zzscVar, @NotNull zzcg zzcgVar, @NotNull WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(CollectionsKt.G0(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zza(@NotNull String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(@NotNull String str, @NotNull c cVar) {
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        if (r12.await(r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        if (r12 != r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.recaptcha.internal.zzja] */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull bl2.c r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, bl2.c):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(@NotNull zzbd zzbdVar, @NotNull c cVar) {
        if (Intrinsics.d(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzsc r6, @org.jetbrains.annotations.NotNull bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ue.c.H(r7)
            goto L6e
        L36:
            ue.c.H(r7)
            boolean r7 = r6.zzT()
            if (r7 == 0) goto L61
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L61
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L4c
            goto L61
        L4c:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r6 = r5.zzG(r6, r0)
            if (r6 == r1) goto L6d
        L5c:
            xk2.q r6 = xk2.s.f135225b
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L61:
            com.google.android.recaptcha.internal.zzcb r6 = r5.zzg
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r6 = r6.zzc(r7, r0)
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            xk2.q r6 = xk2.s.f135225b
            com.google.android.recaptcha.internal.zzbd r6 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r7 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzav
            r1 = 0
            r6.<init>(r7, r0, r1)
            xk2.r r6 = ue.c.m(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, bl2.c):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(@NotNull String str, long j13, @NotNull Exception exc, @NotNull c cVar) {
        exc.getMessage();
        v vVar = (v) this.zze.remove(str);
        if (vVar != null) {
            ((w) vVar).e0(exc);
        }
        return Unit.f80348a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(@NotNull Exception exc, @NotNull c cVar) {
        return ((exc instanceof TimeoutCancellationException) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    @NotNull
    public final zzcb zzm() {
        return this.zzg;
    }

    @NotNull
    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(@NotNull c cVar) {
        return j.M(cVar, this.zzq.zzb().getCoroutineContext(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null));
    }

    public final Object zzx(@NotNull c cVar) {
        Object M = j.M(cVar, this.zzq.zzb().getCoroutineContext(), new zzil(this, null));
        return M == a.COROUTINE_SUSPENDED ? M : Unit.f80348a;
    }
}
