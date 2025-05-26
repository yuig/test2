package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public final class q0 extends r0 {
    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void a(long j13, Object obj) {
        c cVar = (c) ((k0) d2.f33602c.i(j13, obj));
        if (cVar.f33594a) {
            cVar.f33594a = false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void b(long j13, Object obj, Object obj2) {
        c2 c2Var = d2.f33602c;
        k0 k0Var = (k0) c2Var.i(j13, obj);
        k0 k0Var2 = (k0) c2Var.i(j13, obj2);
        int size = k0Var.size();
        int size2 = k0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((c) k0Var).f33594a) {
                k0Var = k0Var.g(size2 + size);
            }
            k0Var.addAll(k0Var2);
        }
        if (size > 0) {
            k0Var2 = k0Var;
        }
        d2.s(j13, obj, k0Var2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final List c(long j13, Object obj) {
        k0 k0Var = (k0) d2.f33602c.i(j13, obj);
        if (((c) k0Var).f33594a) {
            return k0Var;
        }
        int size = k0Var.size();
        k0 g13 = k0Var.g(size == 0 ? 10 : size * 2);
        d2.s(j13, obj, g13);
        return g13;
    }
}
