package pn2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class s extends h0 {
    public abstract h0 F0();

    @Override // pn2.b0
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public h0 y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        h0 type = F0();
        ((qn2.h) kotlinTypeRefiner).getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.g(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return H0(type);
    }

    public abstract s H0(h0 h0Var);

    @Override // pn2.b0
    public final List u0() {
        return F0().u0();
    }

    @Override // pn2.b0
    public u0 v0() {
        return F0().v0();
    }

    @Override // pn2.b0
    public final in2.n w() {
        return F0().w();
    }

    @Override // pn2.b0
    public final b1 w0() {
        return F0().w0();
    }

    @Override // pn2.b0
    public boolean x0() {
        return F0().x0();
    }
}
