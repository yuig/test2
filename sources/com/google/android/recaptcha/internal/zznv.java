package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes3.dex */
final class zznv {
    public static final List zza(Object obj, long j13) {
        zznk zznkVar = (zznk) zzps.zzf(obj, j13);
        if (zznkVar.zzc()) {
            return zznkVar;
        }
        int size = zznkVar.size();
        zznk zzd = zznkVar.zzd(size == 0 ? 10 : size + size);
        zzps.zzs(obj, j13, zzd);
        return zzd;
    }
}
