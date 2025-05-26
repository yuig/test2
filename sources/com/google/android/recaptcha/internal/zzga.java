package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.q0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzga extends zzfx {

    @NotNull
    private final zzfz zza;

    @NotNull
    private final String zzb;

    public zzga(@NotNull zzfz zzfzVar, @NotNull String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(@NotNull Object obj, @NotNull Method method, Object[] objArr) {
        List list;
        if (!Intrinsics.d(method.getName(), this.zzb)) {
            return false;
        }
        zzfz zzfzVar = this.zza;
        if (objArr == null || (list = z.d(objArr)) == null) {
            list = q0.f80391a;
        }
        zzfzVar.zzb(list);
        return true;
    }
}
