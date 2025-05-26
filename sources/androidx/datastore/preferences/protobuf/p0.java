package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class p0 extends q0 {
    @Override // androidx.datastore.preferences.protobuf.q0
    public final void a(long j13, Object obj) {
        ((c) ((i0) h2.f18070d.i(j13, obj))).f18035a = false;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void b(long j13, Object obj, Object obj2) {
        g2 g2Var = h2.f18070d;
        i0 i0Var = (i0) g2Var.i(j13, obj);
        i0 i0Var2 = (i0) g2Var.i(j13, obj2);
        int size = i0Var.size();
        int size2 = i0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((c) i0Var).f18035a) {
                i0Var = i0Var.g(size2 + size);
            }
            i0Var.addAll(i0Var2);
        }
        if (size > 0) {
            i0Var2 = i0Var;
        }
        h2.s(j13, obj, i0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final List c(long j13, Object obj) {
        i0 i0Var = (i0) h2.f18070d.i(j13, obj);
        if (((c) i0Var).f18035a) {
            return i0Var;
        }
        int size = i0Var.size();
        i0 g13 = i0Var.g(size == 0 ? 10 : size * 2);
        h2.s(j13, obj, g13);
        return g13;
    }
}
