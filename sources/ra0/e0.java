package ra0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f106918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106919b;

    public e0(long j13, String str) {
        this.f106918a = j13;
        this.f106919b = str;
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        Long.hashCode(j13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return b3.w.c(this.f106918a, e0Var.f106918a) && Intrinsics.d(this.f106919b, e0Var.f106919b);
    }

    public final int hashCode() {
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        int hashCode = Long.hashCode(this.f106918a) * 31;
        String str = this.f106919b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.a.p(cb.o("SelectableColor(color=", b3.w.i(this.f106918a), ", contentDescription="), this.f106919b, ")");
    }

    public e0(long j13) {
        this(j13, (String) h0.f106942n.get(new b3.w(j13)));
    }
}
