package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
final class zznb implements zzms {
    final int zza;
    final zzpw zzb;

    public zznb(zzng zzngVar, int i13, zzpw zzpwVar, boolean z13, boolean z14) {
        this.zza = i13;
        this.zzb = zzpwVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zznb) obj).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final zzoh zzb(zzoh zzohVar, zzoi zzoiVar) {
        zzmx zzmxVar = (zzmx) zzohVar;
        zzmxVar.zzh((zznd) zzoiVar);
        return zzmxVar;
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final zzon zzc(zzon zzonVar, zzon zzonVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final zzpw zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final zzpx zze() {
        return this.zzb.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final boolean zzg() {
        return false;
    }
}
