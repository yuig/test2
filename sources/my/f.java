package my;

import ey.s0;
import ey.u1;
import h32.a4;
import h32.d4;
import java.util.Set;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;
import s92.o;

/* loaded from: classes.dex */
public final class f extends s0 {

    /* renamed from: i, reason: collision with root package name */
    public s92.i f88477i;

    /* renamed from: j, reason: collision with root package name */
    public s92.l f88478j;

    /* renamed from: k, reason: collision with root package name */
    public d4 f88479k;

    /* renamed from: l, reason: collision with root package name */
    public a4 f88480l;

    /* renamed from: m, reason: collision with root package name */
    public long f88481m;

    /* renamed from: n, reason: collision with root package name */
    public long f88482n;

    /* renamed from: o, reason: collision with root package name */
    public long f88483o;

    public final void A(e eVar) {
        if (d()) {
            if (eVar.f88476e == o.COMPLETE) {
                e(this.f88482n - this.f88481m, "pre_api");
                e((eVar.f60583a - eVar.c()) - this.f88483o, "post_api");
            }
            s92.l lVar = this.f88478j;
            if (lVar == null) {
                Intrinsics.r("pwtCause");
                throw null;
            }
            d4 d4Var = this.f88479k;
            if (d4Var == null) {
                Intrinsics.r("viewType");
                throw null;
            }
            a(eVar.f88476e, lVar, d4Var, this.f88480l, eVar.c(), false);
        }
    }

    public final void B(k kVar) {
        q(kVar.c());
        this.f88477i = (s92.i) kVar.f88474d;
        s92.l lVar = kVar.f88487e;
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f88478j = lVar;
        d4 d4Var = kVar.f88488f;
        Intrinsics.checkNotNullParameter(d4Var, "<set-?>");
        this.f88479k = d4Var;
        this.f88480l = kVar.f88489g;
        this.f88481m = kVar.f60583a - kVar.c();
    }

    @Override // ey.s0, ey.v1
    public final Set b() {
        Set set = g.f88484a;
        Intrinsics.checkNotNullExpressionValue(set, "access$getEVENT_TYPES$p(...)");
        return i1.i(set, super.b());
    }

    @Override // ey.s0, ey.k, ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof k) {
            B((k) e13);
            return true;
        }
        if (e13 instanceof e) {
            A((e) e13);
            return true;
        }
        if (e13 instanceof c) {
            c cVar = (c) e13;
            if (cVar.l().length() > 0) {
                j("endpoint", cVar.l());
            }
            q(e13.c());
            this.f88482n = e13.d() - e13.c();
            return true;
        }
        if (e13 instanceof d) {
            r(e13.c());
            this.f88483o = e13.d() - e13.c();
            return true;
        }
        if (e13 instanceof i) {
            q(e13.c());
            return true;
        }
        if (e13 instanceof j) {
            r(e13.c());
            return true;
        }
        if (!(e13 instanceof h)) {
            return true;
        }
        h hVar = (h) e13;
        if (!(hVar.m() instanceof Boolean)) {
            return true;
        }
        l(hVar.l(), ((Boolean) hVar.m()).booleanValue());
        return true;
    }

    @Override // ey.s0
    public final s92.i w() {
        s92.i iVar = this.f88477i;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.r("pwtActionGeneric");
        throw null;
    }
}
