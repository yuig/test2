package z80;

import ao2.j0;
import ha2.a0;
import ha2.z;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import s80.c5;
import s80.d5;
import s80.l7;
import s80.r6;
import s80.s6;

/* loaded from: classes5.dex */
public final class b implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f141044a;

    public b(m60.w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f141044a = eventManager;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        d5 request = (d5) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof c5) {
            Set options = ((c5) request).f111486a;
            t80.r actionHandler = new t80.r(5, eventIntake, this);
            Set set = s6.f111796a;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            ha2.x xVar = new ha2.x(l7.collage_options_sheet_title, null, null, null, null, 30);
            Set<r6> set2 = options;
            ArrayList arrayList = new ArrayList(g0.q(set2, 10));
            for (r6 r6Var : set2) {
                arrayList.add(new a0(r6Var.getTitleResId(), r6Var.ordinal(), null, null, null, null, null, null, null, 1020));
            }
            this.f141044a.d(new jc0.v(new lp.k(new ha2.a(e0.b(new z(xVar, arrayList, actionHandler)), true, (Integer) null, 12)), false, 0L, 30));
        }
    }
}
