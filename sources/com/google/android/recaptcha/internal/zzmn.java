package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
final class zzmn {
    private final Object zza;
    private final int zzb;

    public zzmn(Object obj, int i13) {
        this.zza = obj;
        this.zzb = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmn)) {
            return false;
        }
        zzmn zzmnVar = (zzmn) obj;
        return this.zza == zzmnVar.zza && this.zzb == zzmnVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
