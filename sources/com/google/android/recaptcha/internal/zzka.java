package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzka extends zzjr {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzka(MessageDigest messageDigest, int i13, zzkb zzkbVar) {
        this.zza = messageDigest;
        this.zzb = i13;
    }

    private final void zzc() {
        zzjf.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzjr
    public final void zza(byte[] bArr, int i13, int i14) {
        zzc();
        this.zza.update(bArr, 0, i14);
    }

    @Override // com.google.android.recaptcha.internal.zzjx
    public final zzjv zzb() {
        zzc();
        this.zzc = true;
        int i13 = this.zzb;
        if (i13 == this.zza.getDigestLength()) {
            byte[] digest = this.zza.digest();
            int i14 = zzjv.zzb;
            return new zzju(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.zza.digest(), i13);
        int i15 = zzjv.zzb;
        return new zzju(copyOf);
    }
}
