package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzjb {
    @NotNull
    public static final Map zza() {
        LinkedHashMap h10 = z0.h(new Pair(-4, zzba.zzo), new Pair(-12, zzba.zzp), new Pair(-6, zzba.zzk), new Pair(-11, zzba.zzm), new Pair(-13, zzba.zzq), new Pair(-14, zzba.zzr), new Pair(-2, zzba.zzl), new Pair(-7, zzba.zzs), new Pair(-5, zzba.zzt), new Pair(-9, zzba.zzu), new Pair(-8, zzba.zzE), new Pair(-15, zzba.zzn), new Pair(-1, zzba.zzv), new Pair(-3, zzba.zzx), new Pair(-10, zzba.zzy));
        int i13 = Build.VERSION.SDK_INT;
        h10.put(-16, zzba.zzw);
        if (i13 >= 27) {
            h10.put(1, zzba.zzA);
            h10.put(2, zzba.zzB);
            h10.put(0, zzba.zzC);
            h10.put(3, zzba.zzD);
        }
        if (i13 >= 29) {
            h10.put(4, zzba.zzz);
        }
        return h10;
    }
}
