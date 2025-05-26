package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k0 extends s implements u1 {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f100810b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f100811c;

    public k0(h0 delegate, b0 enhancement) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f100810b = delegate;
        this.f100811c = enhancement;
    }

    @Override // pn2.h0
    /* renamed from: D0 */
    public final h0 A0(boolean z13) {
        v1 w13 = com.bumptech.glide.c.w1(this.f100810b.A0(z13), this.f100811c.z0().A0(z13));
        Intrinsics.g(w13, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (h0) w13;
    }

    @Override // pn2.h0
    /* renamed from: E0 */
    public final h0 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        v1 w13 = com.bumptech.glide.c.w1(this.f100810b.C0(newAttributes), this.f100811c);
        Intrinsics.g(w13, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (h0) w13;
    }

    @Override // pn2.s
    public final h0 F0() {
        return this.f100810b;
    }

    @Override // pn2.s
    public final s H0(h0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new k0(delegate, this.f100811c);
    }

    @Override // pn2.s, pn2.b0
    /* renamed from: I0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final k0 y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ((qn2.h) kotlinTypeRefiner).getClass();
        h0 type = this.f100810b;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.g(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        b0 type2 = this.f100811c;
        Intrinsics.checkNotNullParameter(type2, "type");
        return new k0(type, type2);
    }

    @Override // pn2.u1
    public final b0 X() {
        return this.f100811c;
    }

    @Override // pn2.u1
    public final v1 r0() {
        return this.f100810b;
    }

    @Override // pn2.h0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f100811c + ")] " + this.f100810b;
    }
}
