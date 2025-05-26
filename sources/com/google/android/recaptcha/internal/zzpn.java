package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
final class zzpn extends zzpl {
    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* synthetic */ Object zzb() {
        return zzpm.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* synthetic */ Object zzc(Object obj) {
        zzpm zzpmVar = (zzpm) obj;
        zzpmVar.zzh();
        return zzpmVar;
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i13, int i14) {
        ((zzpm) obj).zzj((i13 << 3) | 5, Integer.valueOf(i14));
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i13, long j13) {
        ((zzpm) obj).zzj((i13 << 3) | 1, Long.valueOf(j13));
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i13, Object obj2) {
        ((zzpm) obj).zzj((i13 << 3) | 3, (zzpm) obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i13, zzle zzleVar) {
        ((zzpm) obj).zzj((i13 << 3) | 2, zzleVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i13, long j13) {
        ((zzpm) obj).zzj(i13 << 3, Long.valueOf(j13));
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final void zzi(Object obj) {
        ((zznd) obj).zzc.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zznd) obj).zzc = (zzpm) obj2;
    }
}
