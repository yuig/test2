package f00;

import ck2.i;
import fk2.d0;
import gk2.f1;
import gk2.n2;
import gk2.p2;
import gk2.u1;
import hk2.h;
import hk2.y;
import hk2.z;
import ir.j;
import java.lang.reflect.Type;
import jk2.a0;
import jk2.j1;
import jk2.n0;
import jk2.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.w;
import okhttp3.Request;
import pq2.g0;
import pq2.k;
import t00.m;
import uj2.b0;
import uj2.l;
import uj2.q;
import x02.a2;

/* loaded from: classes.dex */
public final class g extends rz.b {

    /* renamed from: e, reason: collision with root package name */
    public final k f60758e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qq2.d wrapped, m failureRouter, w eventManager, boolean z13) {
        super(failureRouter, eventManager, z13);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(failureRouter, "failureRouter");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f60758e = wrapped;
    }

    @Override // pq2.k
    public final Object a(g0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Request request = call.d();
        Object adapted = this.f60758e.a(call);
        Intrinsics.f(request);
        Intrinsics.f(adapted);
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(adapted, "adapted");
        int i13 = 0;
        androidx.fragment.app.c cVar = new androidx.fragment.app.c(i13, this, request);
        a aVar = new a(0, this, request);
        b bVar = new b(this, 0);
        boolean z13 = adapted instanceof b0;
        int i14 = 2;
        int i15 = 1;
        boolean z14 = this.f110220c;
        if (z13) {
            kk2.m k13 = ((b0) adapted).k(cVar);
            Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
            kk2.g gVar = new kk2.g(new kk2.m(k13, new j(9, new e(this, call, i14)), 2), aVar, 1);
            Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
            kk2.g gVar2 = new kk2.g(gVar, bVar, 0);
            Intrinsics.checkNotNullExpressionValue(gVar2, "doAfterSuccess(...)");
            adapted = z14 ? new p2(new f1(gVar2.s(), new ne2.b(0, null, 30), i15)) : gVar2;
        } else {
            if (adapted instanceof uj2.b) {
                String str = request.f95700a.f95639i;
                int i16 = StringsKt.E(str, "/v3/callback/ping", false) ? 3 : 1;
                uj2.f e13 = new fk2.c(2, (uj2.b) adapted, new j(8, new e(this, call, i13))).f(aVar).e(new c(bVar, i13));
                if (z14) {
                    return new fk2.g(new f1(e13 instanceof dk2.b ? ((dk2.b) e13).c() : new d0(e13, 0), new ne2.b(i16, str, 24), i15), 2);
                }
                return e13;
            }
            if (adapted instanceof l) {
                h hVar = new h((l) adapted, cVar, i15);
                Intrinsics.checkNotNullExpressionValue(hVar, "map(...)");
                y yVar = new y(hVar, new j(10, new e(this, call, i15)));
                a2 a2Var = i.f27924d;
                z zVar = new z(yVar, a2Var, a2Var, aVar, i.f27923c);
                Intrinsics.checkNotNullExpressionValue(zVar, "doOnError(...)");
                h hVar2 = new h(zVar, bVar, i13);
                Intrinsics.checkNotNullExpressionValue(hVar2, "doAfterSuccess(...)");
                adapted = k(hVar2);
            } else if (adapted instanceof q) {
                j1 j1Var = new j1((q) adapted, cVar, 0);
                Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
                adapted = l(i(call, j1Var, aVar, bVar));
            } else if (adapted instanceof uj2.h) {
                f1 f1Var = new f1((uj2.h) adapted, cVar, i13);
                Intrinsics.checkNotNullExpressionValue(f1Var, "map(...)");
                adapted = j(h(call, f1Var, aVar, bVar));
            }
        }
        return adapted;
    }

    @Override // pq2.k
    public final Type b() {
        k kVar = this.f60758e;
        Type b13 = kVar.b();
        if (b13 != null) {
            return b13;
        }
        throw new IllegalStateException(a.a.h("Cannot create a valid Type from the wrapped CallAdapter: ", kVar.getClass()));
    }

    public final gk2.b0 h(g0 g0Var, f1 f1Var, a aVar, b bVar) {
        u1 u1Var = new u1(f1Var, new ep.a(23, new f(this, g0Var, 0)), false, 0);
        a2 a2Var = i.f27924d;
        return new gk2.b0(new gk2.b0(u1Var, a2Var, aVar, i.f27923c), a2Var, a2Var, new d(bVar, 1));
    }

    public final a0 i(g0 g0Var, j1 j1Var, a aVar, b bVar) {
        a0 q13 = new n0(j1Var, new ep.a(22, new f(this, g0Var, 1)), false, 3).q(aVar);
        d dVar = new d(bVar, 0);
        a2 a2Var = i.f27924d;
        return new a0(q13, a2Var, a2Var, dVar);
    }

    public final uj2.h j(gk2.b0 b0Var) {
        return this.f110220c ? new f1(b0Var, new ne2.b(0, null, 30), 1) : b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l k(h hVar) {
        if (!this.f110220c) {
            return hVar;
        }
        return new n2(new f1(hVar instanceof dk2.b ? ((dk2.b) hVar).c() : new d0(hVar, 3), new ne2.b(0, null, 30), 1));
    }

    public final q l(a0 a0Var) {
        return this.f110220c ? new u0(a0Var, new ne2.a(), 3) : a0Var;
    }
}
