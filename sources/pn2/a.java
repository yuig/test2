package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends s {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f100758b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f100759c;

    public a(h0 delegate, h0 abbreviation) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(abbreviation, "abbreviation");
        this.f100758b = delegate;
        this.f100759c = abbreviation;
    }

    @Override // pn2.h0
    /* renamed from: E0 */
    public final h0 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new a(this.f100758b.C0(newAttributes), this.f100759c);
    }

    @Override // pn2.s
    public final h0 F0() {
        return this.f100758b;
    }

    @Override // pn2.s
    public final s H0(h0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new a(delegate, this.f100759c);
    }

    @Override // pn2.h0
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final a A0(boolean z13) {
        return new a(this.f100758b.A0(z13), this.f100759c.A0(z13));
    }

    @Override // pn2.s, pn2.b0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final a y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ((qn2.h) kotlinTypeRefiner).getClass();
        h0 type = this.f100758b;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.g(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        h0 type2 = this.f100759c;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.g(type2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a(type, type2);
    }
}
