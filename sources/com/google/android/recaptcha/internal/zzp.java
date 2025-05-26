package com.google.android.recaptcha.internal;

import bl2.c;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.y0;
import org.jetbrains.annotations.NotNull;
import xk2.k;
import xk2.m;

/* loaded from: classes3.dex */
public final class zzp implements zzy {

    @NotNull
    private final zzek zza;

    @NotNull
    private final k zzb;
    private boolean zzc;

    public zzp(@NotNull zzek zzekVar) {
        this.zza = zzekVar;
        int i13 = zzav.zza;
        this.zzb = m.b(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) this.zzb.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @NotNull
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(@NotNull String str, @NotNull c cVar) {
        zzen zzb = zzz.zzb(this, str);
        String zza = zzg().zza();
        zzb.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(zza);
        zzf.zze(e0.b(zzf2.zzk()));
        return zzz.zza(this, (zzti) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(@NotNull zzse zzseVar, @NotNull c cVar) {
        zzen zzc = zzz.zzc(this);
        if (zzseVar.zzl().length() == 0) {
            this.zzc = false;
            zzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return Unit.f80348a;
        }
        zzg().zzb(y0.b(new Pair("_GRECAPTCHA_KC", zzseVar.zzl())));
        zzc.zza();
        return Unit.f80348a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(@NotNull zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzc;
    }
}
