package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.collections.c0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzha implements zzgx {

    @NotNull
    public static final zzha zza = new zzha();

    private zzha() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Class)) {
            zza2 = null;
        }
        Class cls = (Class) zza2;
        if (cls == null) {
            throw new zzce(4, 5, null);
        }
        Class[] zzf = zzgdVar.zzc().zzf(c0.b0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i13, cls.getConstructor((Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e13) {
            throw new zzce(6, 9, e13);
        }
    }
}
