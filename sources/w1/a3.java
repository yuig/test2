package w1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a3 implements q3.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final p2 f127151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f127152c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.n0 f127153d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f127154e;

    public a3(p2 p2Var, int i13, h4.n0 n0Var, Function0 function0) {
        this.f127151b = p2Var;
        this.f127152c = i13;
        this.f127153d = n0Var;
        this.f127154e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return Intrinsics.d(this.f127151b, a3Var.f127151b) && this.f127152c == a3Var.f127152c && Intrinsics.d(this.f127153d, a3Var.f127153d) && Intrinsics.d(this.f127154e, a3Var.f127154e);
    }

    public final int hashCode() {
        return this.f127154e.hashCode() + ((this.f127153d.hashCode() + ep.b.b(this.f127152c, this.f127151b.hashCode() * 31, 31)) * 31);
    }

    @Override // q3.a0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        q3.c1 Q = o0Var.Q(n4.a.a(j13, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(Q.f102179b, n4.a.g(j13));
        s03 = r0Var.s0(Q.f102178a, min, kotlin.collections.z0.d(), new z0(r0Var, this, Q, min, 1));
        return s03;
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f127151b + ", cursorOffset=" + this.f127152c + ", transformedText=" + this.f127153d + ", textLayoutResultProvider=" + this.f127154e + ')';
    }
}
