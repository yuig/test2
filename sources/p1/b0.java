package p1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 implements r3.d {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f98484b;

    /* renamed from: c, reason: collision with root package name */
    public m1 f98485c;

    public b0(Function1 function1) {
        this.f98484b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && ((b0) obj).f98484b == this.f98484b;
    }

    @Override // r3.d
    public final void g(r3.h hVar) {
        m1 m1Var = (m1) hVar.c(o1.f98564a);
        if (Intrinsics.d(m1Var, this.f98485c)) {
            return;
        }
        this.f98485c = m1Var;
        this.f98484b.invoke(m1Var);
    }

    public final int hashCode() {
        return this.f98484b.hashCode();
    }
}
