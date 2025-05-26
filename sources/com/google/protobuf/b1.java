package com.google.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class b1 extends c1 {
    @Override // com.google.protobuf.c1
    public final void a(long j13, Object obj) {
        ((c) ((v0) q2.f33962c.j(j13, obj))).f33862a = false;
    }

    @Override // com.google.protobuf.c1
    public final void b(long j13, Object obj, Object obj2) {
        p2 p2Var = q2.f33962c;
        v0 v0Var = (v0) p2Var.j(j13, obj);
        v0 v0Var2 = (v0) p2Var.j(j13, obj2);
        int size = v0Var.size();
        int size2 = v0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((c) v0Var).f33862a) {
                v0Var = v0Var.g(size2 + size);
            }
            v0Var.addAll(v0Var2);
        }
        if (size > 0) {
            v0Var2 = v0Var;
        }
        q2.v(j13, obj, v0Var2);
    }

    @Override // com.google.protobuf.c1
    public final List c(long j13, Object obj) {
        v0 v0Var = (v0) q2.f33962c.j(j13, obj);
        if (((c) v0Var).f33862a) {
            return v0Var;
        }
        int size = v0Var.size();
        v0 g13 = v0Var.g(size == 0 ? 10 : size * 2);
        q2.v(j13, obj, g13);
        return g13;
    }
}
