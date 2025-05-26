package bm2;

import java.util.Iterator;
import kotlin.collections.p0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements i {
    @Override // bm2.i
    public final boolean Q(ym2.c cVar) {
        return kotlin.jvm.internal.j.s(this, cVar);
    }

    @Override // bm2.i
    public final c a(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // bm2.i
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        q0.f80391a.getClass();
        return p0.f80390a;
    }

    public final String toString() {
        return "EMPTY";
    }
}
