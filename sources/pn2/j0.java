package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j0 extends t {

    /* renamed from: c, reason: collision with root package name */
    public final u0 f100807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h0 delegate, u0 attributes) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f100807c = attributes;
    }

    @Override // pn2.s
    public final s H0(h0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new j0(delegate, this.f100807c);
    }

    @Override // pn2.s, pn2.b0
    public final u0 v0() {
        return this.f100807c;
    }
}
