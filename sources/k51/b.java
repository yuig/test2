package k51;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;
import w41.h0;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b22.l f78314a = b22.l.COMPACT;

    public static final b22.l a() {
        return f78314a;
    }

    public static final u41.e b(o oVar, h0 onClick) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        int i13 = a.f78313a[oVar.f78328a.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? u41.f.f120485a : c(oVar, onClick, null, false);
        }
        return c(oVar, onClick, bs1.c.j2(new String[0], oz1.e.filter_view_option_label), true);
    }

    public static final u41.e c(o oVar, h0 h0Var, k0 k0Var, boolean z13) {
        rm1.q qVar;
        bm1.o oVar2 = bm1.o.SMALL;
        b22.l lVar = oVar.f78329b;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        int i13 = t.f78334a[lVar.ordinal()];
        if (i13 == 1) {
            qVar = rm1.q.VIEW_TYPE_SPARSE;
        } else if (i13 == 2) {
            qVar = rm1.q.VIEW_TYPE_DEFAULT;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            qVar = rm1.q.VIEW_TYPE_DENSE;
        }
        bm1.b bVar = new bm1.b(k0Var, qVar, z13);
        int i14 = oz1.b.pins_tab_view_button;
        k0 k0Var2 = new k0(oz1.e.lego_profile_view_option_title);
        return new u41.e(new bm1.m(oVar2, oVar.f78330c, bVar, false, null, i14, k0Var2, 24), new u41.g(oz1.b.pins_tab_view_button, h0Var));
    }
}
