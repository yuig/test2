package pn2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w extends v implements p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h0 lowerBound, h0 upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    @Override // pn2.v1
    public final v1 A0(boolean z13) {
        return g.i(this.f100850b.A0(z13), this.f100851c.A0(z13));
    }

    @Override // pn2.v1
    public final v1 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return g.i(this.f100850b.C0(newAttributes), this.f100851c.C0(newAttributes));
    }

    @Override // pn2.v
    public final h0 D0() {
        return this.f100850b;
    }

    @Override // pn2.v
    public final String E0(an2.y renderer, an2.b0 options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        boolean h10 = options.h();
        h0 h0Var = this.f100851c;
        h0 h0Var2 = this.f100850b;
        if (!h10) {
            return renderer.I(renderer.d0(h0Var2), renderer.d0(h0Var), kotlin.jvm.internal.j.m(this));
        }
        return "(" + renderer.d0(h0Var2) + ".." + renderer.d0(h0Var) + ')';
    }

    @Override // pn2.b0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final v y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ((qn2.h) kotlinTypeRefiner).getClass();
        h0 type = this.f100850b;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.g(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        h0 type2 = this.f100851c;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.g(type2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new w(type, type2);
    }

    @Override // pn2.p
    public final v1 a0(b0 replacement) {
        v1 i13;
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        v1 z03 = replacement.z0();
        if (z03 instanceof v) {
            i13 = z03;
        } else {
            if (!(z03 instanceof h0)) {
                throw new NoWhenBranchMatchedException();
            }
            h0 h0Var = (h0) z03;
            i13 = g.i(h0Var, h0Var.A0(true));
        }
        return com.bumptech.glide.c.h0(i13, z03);
    }

    @Override // pn2.p
    public final boolean o0() {
        h0 h0Var = this.f100850b;
        return (h0Var.w0().b() instanceof am2.c1) && Intrinsics.d(h0Var.w0(), this.f100851c.w0());
    }

    @Override // pn2.v
    public final String toString() {
        return "(" + this.f100850b + ".." + this.f100851c + ')';
    }
}
