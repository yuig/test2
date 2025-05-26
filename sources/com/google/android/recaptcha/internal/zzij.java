package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import ao2.v;
import ao2.w;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzij {
    final /* synthetic */ zzja zza;
    private Long zzb;

    @NotNull
    private final zzjh zzc = zzjh.zzb();

    public zzij(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(@NotNull String str) {
        zzek zzekVar;
        zzen zzenVar;
        zzja zzjaVar = this.zza;
        if (zzjaVar.zzq().zzb == null) {
            zzenVar = zzjaVar.zzp;
            if (zzenVar != null) {
                zzenVar.zza();
            }
            this.zza.zzp = null;
        }
        zzb();
        zzrc zzl = zzrc.zzl(zzbt.zza(str));
        zztw zzi = zztx.zzi();
        zzi.zzf(zzl);
        zztx zztxVar = (zztx) zzi.zzk();
        zzekVar = this.zza.zzj;
        zzekVar.zze(zztxVar);
    }

    @JavascriptInterface
    public final void zzlsm(@NotNull String str) {
        zzek zzekVar;
        zzb();
        zztw zzi = zztx.zzi();
        zzi.zzq(zzrr.zzi(zzbt.zza(str)));
        zztx zztxVar = (zztx) zzi.zzk();
        zzekVar = this.zza.zzj;
        zzekVar.zze(zztxVar);
    }

    @JavascriptInterface
    public final void zzoid(@NotNull String str) {
        zzb();
        zzts zzg = zzts.zzg(zzbt.zza(str));
        zzg.zzi().name();
        if (zzg.zzi() != zztv.JS_CODE_SUCCESS) {
            zzg.zzi().name();
            int i13 = zzbd.zza;
            zzbd zza = zzbc.zza(zzg.zzi());
            this.zza.zzA().hashCode();
            ((w) this.zza.zzA()).e0(zza);
            return;
        }
        this.zza.zzA().hashCode();
        if (((w) this.zza.zzA()).Q(Unit.f80348a)) {
            return;
        }
        this.zza.zzA().hashCode();
    }

    @JavascriptInterface
    public final void zzrp(@NotNull String str) {
        zzb();
        zzfo zzfoVar = this.zza.zzb;
        if (zzfoVar == null) {
            zzfoVar = null;
        }
        zzfoVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(@NotNull String str) {
        Map map;
        zzb();
        zzsi zzi = zzsi.zzi(zzbt.zza(str));
        zzi.toString();
        map = this.zza.zze;
        v vVar = (v) map.remove(zzi.zzk());
        if (vVar != null) {
            ((w) vVar).Q(zzi);
        }
    }
}
