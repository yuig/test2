package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzkx extends zzky {
    final /* synthetic */ zzle zza;
    private int zzb = 0;
    private final int zzc;

    public zzkx(zzle zzleVar) {
        this.zza = zzleVar;
        this.zzc = zzleVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzla
    public final byte zza() {
        int i13 = this.zzb;
        if (i13 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i13 + 1;
        return this.zza.zzb(i13);
    }
}
