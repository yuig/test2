package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzhy {

    @NotNull
    private List zza = q0.f80391a;

    public final long zza(@NotNull long[] jArr) {
        Iterator it = CollectionsKt.l0(c0.a0(jArr), this.zza).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(@NotNull long[] jArr) {
        this.zza = c0.a0(jArr);
    }
}
