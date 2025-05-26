package ly;

import ey.j3;
import ey.o1;
import ey.s0;
import ey.u1;
import h32.a4;
import h32.d4;
import java.util.Set;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;
import s92.l;
import s92.o;

/* loaded from: classes.dex */
public final class f extends s0 {

    /* renamed from: i, reason: collision with root package name */
    public l f85098i;

    /* renamed from: j, reason: collision with root package name */
    public d4 f85099j;

    /* renamed from: k, reason: collision with root package name */
    public a4 f85100k;

    public final void A(c cVar) {
        if (d()) {
            d4 d4Var = this.f85099j;
            if (d4Var == null) {
                Intrinsics.r("viewType");
                throw null;
            }
            if (d4Var == d4.FEED && this.f85100k == a4.FEED_HOME) {
                if (j3.f60517h) {
                    l lVar = l.COLD_START;
                    Intrinsics.checkNotNullParameter(lVar, "<set-?>");
                    this.f85098i = lVar;
                } else if (j3.f60516g) {
                    l lVar2 = l.WARM_START;
                    Intrinsics.checkNotNullParameter(lVar2, "<set-?>");
                    this.f85098i = lVar2;
                }
            }
            o oVar = cVar.f85096d;
            l lVar3 = this.f85098i;
            if (lVar3 == null) {
                Intrinsics.r("pwtCause");
                throw null;
            }
            d4 d4Var2 = this.f85099j;
            if (d4Var2 != null) {
                a(oVar, lVar3, d4Var2, this.f85100k, cVar.c(), false);
            } else {
                Intrinsics.r("viewType");
                throw null;
            }
        }
    }

    public final void B(h hVar) {
        q(hVar.c());
        l lVar = hVar.f85102d;
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f85098i = lVar;
        d4 d4Var = hVar.f85103e;
        Intrinsics.checkNotNullParameter(d4Var, "<set-?>");
        this.f85099j = d4Var;
        this.f85100k = hVar.f85104f;
    }

    @Override // ey.s0, ey.v1
    public final Set b() {
        Set set = g.f85101a;
        Intrinsics.checkNotNullExpressionValue(set, "access$getEVENT_TYPES$p(...)");
        return i1.i(set, super.b());
    }

    @Override // ey.s0, ey.k, ey.v1
    public final boolean o(u1 e13) {
        o1 o1Var;
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof h) {
            B((h) e13);
            return true;
        }
        if (e13 instanceof c) {
            A((c) e13);
            return true;
        }
        if (e13 instanceof a) {
            a aVar = (a) e13;
            if (aVar.l().length() > 0) {
                j("endpoint", aVar.l());
            }
            q(e13.c());
            return true;
        }
        if (e13 instanceof b) {
            r(e13.c());
            return true;
        }
        if (!(e13 instanceof e) || (o1Var = this.f60594b) == null) {
            return true;
        }
        o1Var.i((e13.d() - e13.c()) - o1Var.a().f85167f, "ttfi");
        return true;
    }

    @Override // ey.s0
    public final s92.i w() {
        return s92.i.FEED_RENDER;
    }
}
