package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r extends s implements p, sn2.d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f100835d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f100836b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f100837c;

    public r(h0 h0Var, boolean z13) {
        this.f100836b = h0Var;
        this.f100837c = z13;
    }

    @Override // pn2.h0
    /* renamed from: D0 */
    public final h0 A0(boolean z13) {
        return z13 ? this.f100836b.A0(z13) : this;
    }

    @Override // pn2.h0
    /* renamed from: E0 */
    public final h0 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new r(this.f100836b.C0(newAttributes), this.f100837c);
    }

    @Override // pn2.s
    public final h0 F0() {
        return this.f100836b;
    }

    @Override // pn2.s
    public final s H0(h0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new r(delegate, this.f100837c);
    }

    public final h0 I0() {
        return this.f100836b;
    }

    @Override // pn2.p
    public final v1 a0(b0 replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return lb.l0.K0(replacement.z0(), this.f100837c);
    }

    @Override // pn2.p
    public final boolean o0() {
        h0 h0Var = this.f100836b;
        h0Var.w0();
        return h0Var.w0().b() instanceof am2.c1;
    }

    @Override // pn2.h0
    public final String toString() {
        return this.f100836b + " & Any";
    }

    @Override // pn2.s, pn2.b0
    public final boolean x0() {
        return false;
    }
}
