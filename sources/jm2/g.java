package jm2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import rl2.u;
import xl2.q;

/* loaded from: classes2.dex */
public final class g extends b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f77058g;

    /* renamed from: f, reason: collision with root package name */
    public final on2.l f77059f;

    static {
        l0 l0Var = k0.f80436a;
        f77058g = new u[]{l0Var.g(new d0(l0Var.b(g.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pm2.a aVar, rg.a c13) {
        super(c13, aVar, q.f135307m);
        Intrinsics.checkNotNullParameter(c13, "c");
        on2.u c14 = c13.c();
        f fVar = f.f77057i;
        on2.q qVar = (on2.q) c14;
        qVar.getClass();
        this.f77059f = new on2.l(qVar, fVar);
    }

    @Override // jm2.b, bm2.c
    public final Map a() {
        return (Map) lb.l0.B0(this.f77059f, f77058g[0]);
    }
}
