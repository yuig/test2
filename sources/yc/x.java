package yc;

import do2.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import lb.l0;
import pc.c0;
import pc.o0;
import pc.t0;
import pc.u0;
import vc.b0;

/* loaded from: classes.dex */
public final class x implements ad.a {

    /* renamed from: a, reason: collision with root package name */
    public final vc.a f138692a;

    public x(u00.p store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f138692a = store;
    }

    @Override // ad.a
    public final do2.i a(pc.f request, ad.b chain) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(request, "<this>");
        b0 b0Var = (b0) request.f99543c.a(b0.f125506d);
        if (b0Var == null) {
            return chain.a(request);
        }
        o0 o0Var = request.f99541a;
        if (!(o0Var instanceof u0)) {
            throw new IllegalStateException("It's impossible to watch a mutation or subscription".toString());
        }
        c0 a13 = request.f99543c.a(pc.v.f99606d);
        Intrinsics.f(a13);
        pc.v vVar = (pc.v) a13;
        j0 j0Var = new j0();
        vc.a aVar = this.f138692a;
        t0 t0Var = b0Var.f125507b;
        j0Var.f80434a = t0Var != null ? l0.U(aVar.c(o0Var, t0Var, vVar).values()) : null;
        return new p0(new pb.k(new y(new u(new vc.k(aVar.g(), j0Var), chain, request, j0Var, this, vVar), null)), new w(b0Var, null));
    }
}
