package com.google.android.recaptcha.internal;

import bl2.c;
import dl2.b;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import xk2.k;
import xk2.m;

/* loaded from: classes3.dex */
public final class zzff {

    @NotNull
    private final k zza;

    @NotNull
    private final k zzb;

    @NotNull
    private final k zzc;

    public zzff() {
        int i13 = zzav.zza;
        this.zza = m.b(zzfc.zza);
        this.zzb = m.b(zzfd.zza);
        this.zzc = m.b(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, c cVar) {
        try {
            String zzl = zzscVar.zzl();
            String zzM = zzscVar.zzM();
            zzaq zzf = zzffVar.zzf();
            String str = null;
            if (zzf != null && zzf.zzd(zzM)) {
                zzen zzf2 = zzekVar.zzf(25);
                try {
                    String zza = zzffVar.zzf().zza(zzM);
                    if (zza != null) {
                        zzf2.zza();
                        str = zza;
                    }
                } catch (Exception e13) {
                    zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzR, e13.getMessage()));
                }
                zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
            }
            if (str == null) {
                zzaq zzf3 = zzffVar.zzf();
                if (zzf3 != null) {
                    zzf3.zzb();
                }
                zzen zzf4 = zzekVar.zzf(23);
                try {
                    str = zzffVar.zzg().zzb(zzl);
                    zzf4.zza();
                    zzen zzf5 = zzekVar.zzf(24);
                    try {
                        zzaq zzf6 = zzffVar.zzf();
                        if (zzf6 != null) {
                            zzf6.zzc(zzM, str);
                        }
                        zzf5.zza();
                    } catch (Exception e14) {
                        zzf5.zzb(new zzbd(zzbb.zzk, zzba.zzT, e14.getMessage()));
                    }
                } catch (zzbd e15) {
                    zzf4.zzb(e15);
                    throw e15;
                }
            }
            return z.n(zzscVar.zzk(), "JAVASCRIPT_TAG", str);
        } catch (Exception e16) {
            if (e16 instanceof zzbd) {
                throw e16;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e16.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(@NotNull String str, @NotNull zzto zztoVar, @NotNull c cVar) {
        return b.O(new zzfb(this, str, zztoVar, null), cVar);
    }

    public final Object zzd(@NotNull zzsc zzscVar, @NotNull zzek zzekVar, @NotNull c cVar) {
        return zze(this, zzscVar, zzekVar, cVar);
    }
}
