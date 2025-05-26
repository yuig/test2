package jm2;

import java.util.Map;
import kh2.g2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import rl2.u;
import xl2.q;

/* loaded from: classes4.dex */
public final class k extends b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f77061g;

    /* renamed from: f, reason: collision with root package name */
    public final on2.l f77062f;

    static {
        l0 l0Var = k0.f80436a;
        f77061g = new u[]{l0Var.g(new d0(l0Var.b(k.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pm2.a annotation, rg.a c13) {
        super(c13, annotation, q.f135317w);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c13, "c");
        on2.u c14 = c13.c();
        g2 g2Var = new g2(this, 14);
        on2.q qVar = (on2.q) c14;
        qVar.getClass();
        this.f77062f = new on2.l(qVar, g2Var);
    }

    @Override // jm2.b, bm2.c
    public final Map a() {
        return (Map) lb.l0.B0(this.f77062f, f77061g[0]);
    }
}
