package qm2;

import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.h0;
import pn2.t1;
import pn2.u0;
import pn2.v;
import pn2.v1;

/* loaded from: classes2.dex */
public final class e extends pn2.s implements pn2.p {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f104418b;

    public e(h0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f104418b = delegate;
    }

    public static h0 I0(h0 h0Var) {
        h0 A0 = h0Var.A0(false);
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        return !t1.h(h0Var) ? A0 : new e(A0);
    }

    @Override // pn2.h0, pn2.v1
    public final v1 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new e(this.f104418b.C0(newAttributes));
    }

    @Override // pn2.h0
    /* renamed from: D0 */
    public final h0 A0(boolean z13) {
        return z13 ? this.f104418b.A0(true) : this;
    }

    @Override // pn2.h0
    /* renamed from: E0 */
    public final h0 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new e(this.f104418b.C0(newAttributes));
    }

    @Override // pn2.s
    public final h0 F0() {
        return this.f104418b;
    }

    @Override // pn2.s
    public final pn2.s H0(h0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new e(delegate);
    }

    @Override // pn2.p
    public final v1 a0(b0 replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        v1 z03 = replacement.z0();
        Intrinsics.checkNotNullParameter(z03, "<this>");
        if (!t1.h(z03) && !t1.g(z03)) {
            return z03;
        }
        if (z03 instanceof h0) {
            return I0((h0) z03);
        }
        if (z03 instanceof v) {
            v vVar = (v) z03;
            return com.bumptech.glide.c.w1(pn2.g.i(I0(vVar.f100850b), I0(vVar.f100851c)), com.bumptech.glide.c.J(z03));
        }
        throw new IllegalStateException(("Incorrect type: " + z03).toString());
    }

    @Override // pn2.p
    public final boolean o0() {
        return true;
    }

    @Override // pn2.s, pn2.b0
    public final boolean x0() {
        return false;
    }
}
