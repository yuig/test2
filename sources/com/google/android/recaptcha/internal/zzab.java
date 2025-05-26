package com.google.android.recaptcha.internal;

import android.os.Build;
import bl2.c;
import kotlin.Unit;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzab implements zzy {

    @NotNull
    private final zzek zza;

    public zzab(@NotNull zzek zzekVar) {
        this.zza = zzekVar;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @NotNull
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(@NotNull String str, @NotNull c cVar) {
        zzen zzb = zzz.zzb(this, str);
        int i13 = Build.VERSION.SDK_INT;
        zzb.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(String.valueOf(i13));
        zzf.zze(e0.b(zzf2.zzk()));
        return zzz.zza(this, (zzti) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(@NotNull zzse zzseVar, @NotNull c cVar) {
        zzz.zzc(this).zza();
        return Unit.f80348a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(@NotNull zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return true;
    }
}
