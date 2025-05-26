package jk;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public enum s implements o {
    INSTANCE;

    private static final AtomicReference zzb = new AtomicReference(null);

    @Override // jk.o
    public final p zza() {
        return (p) zzb.get();
    }

    public final void zzb(p pVar) {
        zzb.set(pVar);
    }
}
