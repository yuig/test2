package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzfy extends zzfx {

    @NotNull
    private final Function2 zza;

    @NotNull
    private final String zzb;

    public zzfy(@NotNull Function2 function2, @NotNull String str, Object obj) {
        super(obj);
        this.zza = function2;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(@NotNull Object obj, @NotNull Method method, Object[] objArr) {
        List list;
        if (!Intrinsics.d(method.getName(), this.zzb)) {
            return false;
        }
        zztf zzf = zzti.zzf();
        if (objArr != null) {
            list = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zzf2 = zzth.zzf();
                zzf2.zzw(obj2.toString());
                list.add((zzth) zzf2.zzk());
            }
        } else {
            list = q0.f80391a;
        }
        zzf.zze(list);
        zzti zztiVar = (zzti) zzf.zzk();
        Function2 function2 = this.zza;
        byte[] zzd = zztiVar.zzd();
        function2.invoke(objArr, zzkh.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
