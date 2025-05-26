package en;

import am2.d;
import java.util.Collection;
import kotlin.collections.q0;

/* loaded from: classes.dex */
public final class b implements wn2.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f59642a;

    public /* synthetic */ b(boolean z13) {
        this.f59642a = z13;
    }

    @Override // wn2.a
    public Iterable a(Object obj) {
        boolean z13 = this.f59642a;
        d dVar = (d) obj;
        int i13 = fn2.d.f62727a;
        if (z13) {
            dVar = dVar != null ? dVar.o0() : null;
        }
        Collection h10 = dVar != null ? dVar.h() : null;
        return h10 == null ? q0.f80391a : h10;
    }
}
