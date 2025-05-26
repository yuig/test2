package qm;

import kh2.k3;

/* loaded from: classes.dex */
public final class q0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + k3.L("java-lang-class-unsupported"));
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + k3.L("java-lang-class-unsupported"));
    }
}
