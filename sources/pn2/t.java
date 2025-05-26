package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class t extends s {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f100839b;

    public t(h0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f100839b = delegate;
    }

    @Override // pn2.h0
    /* renamed from: D0 */
    public final h0 A0(boolean z13) {
        return z13 == x0() ? this : this.f100839b.A0(z13).C0(v0());
    }

    @Override // pn2.h0
    /* renamed from: E0 */
    public final h0 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes != v0() ? new j0(this, newAttributes) : this;
    }

    @Override // pn2.s
    public final h0 F0() {
        return this.f100839b;
    }
}
