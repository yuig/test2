package qn2;

import kotlin.jvm.internal.Intrinsics;
import pn2.a1;
import pn2.b0;
import pn2.h0;
import pn2.q1;
import pn2.w1;

/* loaded from: classes4.dex */
public final class a extends pn2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f104494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f104495b;

    public a(b bVar, q1 q1Var) {
        this.f104494a = bVar;
        this.f104495b = q1Var;
    }

    @Override // pn2.c
    public final sn2.g f(a1 state, sn2.f type) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        b bVar = this.f104494a;
        b0 j13 = this.f104495b.j(bVar.i0(type), w1.INVARIANT);
        Intrinsics.checkNotNullExpressionValue(j13, "safeSubstitute(...)");
        h0 n13 = bVar.n(j13);
        Intrinsics.f(n13);
        return n13;
    }
}
