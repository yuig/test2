package qm;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class l1 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        return new AtomicBoolean(aVar.R0());
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        cVar.O(((AtomicBoolean) obj).get());
    }
}
