package w1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a1 implements q3.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final p2 f127146b;

    /* renamed from: c, reason: collision with root package name */
    public final int f127147c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.n0 f127148d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f127149e;

    public a1(p2 p2Var, int i13, h4.n0 n0Var, Function0 function0) {
        this.f127146b = p2Var;
        this.f127147c = i13;
        this.f127148d = n0Var;
        this.f127149e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f127146b, a1Var.f127146b) && this.f127147c == a1Var.f127147c && Intrinsics.d(this.f127148d, a1Var.f127148d) && Intrinsics.d(this.f127149e, a1Var.f127149e);
    }

    public final int hashCode() {
        return this.f127149e.hashCode() + ((this.f127148d.hashCode() + ep.b.b(this.f127147c, this.f127146b.hashCode() * 31, 31)) * 31);
    }

    @Override // q3.a0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        q3.c1 Q = o0Var.Q(o0Var.P(n4.a.g(j13)) < n4.a.h(j13) ? j13 : n4.a.a(j13, 0, Integer.MAX_VALUE, 0, 0, 13));
        int min = Math.min(Q.f102178a, n4.a.h(j13));
        s03 = r0Var.s0(min, Q.f102179b, kotlin.collections.z0.d(), new z0(r0Var, this, Q, min, 0));
        return s03;
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f127146b + ", cursorOffset=" + this.f127147c + ", transformedText=" + this.f127148d + ", textLayoutResultProvider=" + this.f127149e + ')';
    }
}
