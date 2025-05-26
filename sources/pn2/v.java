package pn2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class v extends v1 implements sn2.e {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f100850b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f100851c;

    public v(h0 lowerBound, h0 upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        this.f100850b = lowerBound;
        this.f100851c = upperBound;
    }

    public abstract h0 D0();

    public abstract String E0(an2.y yVar, an2.b0 b0Var);

    public String toString() {
        return an2.y.f15820e.d0(this);
    }

    @Override // pn2.b0
    public final List u0() {
        return D0().u0();
    }

    @Override // pn2.b0
    public final u0 v0() {
        return D0().v0();
    }

    @Override // pn2.b0
    public in2.n w() {
        return D0().w();
    }

    @Override // pn2.b0
    public final b1 w0() {
        return D0().w0();
    }

    @Override // pn2.b0
    public final boolean x0() {
        return D0().x0();
    }
}
