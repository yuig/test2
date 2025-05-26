package mm0;

import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.b60;
import com.pinterest.api.model.v7;
import do1.n;
import e12.d;
import ha0.i;
import ha2.b0;
import ha2.c0;
import ha2.x;
import java.util.ArrayList;
import java.util.List;
import jc0.v;
import kg.o;
import ko2.e;
import ko2.f;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import lb0.r;
import lm0.k0;
import lm0.l0;
import lm0.m0;
import lm0.n0;
import lm0.q0;
import lm0.r0;
import lm0.s0;
import lm0.t0;
import lm0.u0;
import lm0.w0;
import lp.k;
import m60.w;
import tb0.h;
import tb0.p;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final d f87577a;

    /* renamed from: b, reason: collision with root package name */
    public final r f87578b;

    /* renamed from: c, reason: collision with root package name */
    public final w f87579c;

    /* renamed from: d, reason: collision with root package name */
    public final h f87580d;

    /* renamed from: e, reason: collision with root package name */
    public final b20.c f87581e;

    /* renamed from: f, reason: collision with root package name */
    public a f87582f;

    public c(d boardService, r prefsManagerUser, w eventManager, h crashReporting, b20.c toastForSEP) {
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(toastForSEP, "toastForSEP");
        this.f87577a = boardService;
        this.f87578b = prefsManagerUser;
        this.f87579c = eventManager;
        this.f87580d = crashReporting;
        this.f87581e = toastForSEP;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        b0 I;
        w0 request = (w0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Integer num = null;
        if (request instanceof m0) {
            v7 v7Var = ((m0) request).f83882a;
            f fVar = v0.f20219a;
            j.z(scope, e.f80326c, null, new b(this, v7Var, eventIntake, null), 2);
            return;
        }
        boolean z13 = request instanceof l0;
        boolean z14 = false;
        boolean z15 = true;
        w wVar = this.f87579c;
        if (z13) {
            l0 l0Var = (l0) request;
            List list = l0Var.f83878a;
            yk2.b bVar = new yk2.b();
            if (!list.isEmpty()) {
                x xVar = new x(d70.g.filter_by_type, null, null, null, null, 30);
                List list2 = list;
                ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                int i13 = 0;
                for (Object obj : list2) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        f0.p();
                        throw null;
                    }
                    b60 b60Var = (b60) obj;
                    arrayList.add(new c0(0, i13, null, l0Var.f83879b.getValue() == b60Var.e().intValue() ? z15 : false, false, b60Var.f(), null, null, null, null, 4052));
                    i13 = i14;
                    z15 = true;
                }
                bVar.add(new b0(xVar, arrayList, new i(list, eventIntake)));
            }
            k41.f.Companion.getClass();
            I = o.I(k41.e.a(l0Var.f83880c), new p70.a(eventIntake, 11), d70.g.set_view_as, null, null, null, null);
            bVar.add(I);
            wVar.d(new v(new k(new ha2.a(e0.a(bVar), z14, num, 14)), false, 0L, 30));
            return;
        }
        if (request instanceof lm0.j0) {
            a.c.y(wVar);
            return;
        }
        boolean z16 = request instanceof r0;
        r rVar = this.f87578b;
        if (z16) {
            rVar.h("PREF_BOARD_VIEW_TYPE", ((r0) request).f83895a.ordinal());
            return;
        }
        if (request instanceof k0) {
            zo.a aVar = zo.c.Companion;
            zo.c cVar = zo.c.DEFAULT;
            int g13 = rVar.g("PREF_BOARD_VIEW_TYPE", cVar.ordinal());
            aVar.getClass();
            if (g13 == 0) {
                cVar = zo.c.SINGLE;
            } else if (g13 != 1) {
                cVar = zo.c.DENSE;
            }
            eventIntake.a(new lm0.w(cVar));
            return;
        }
        if (request instanceof t0) {
            t0 t0Var = (t0) request;
            wVar.d(new m10.c(t0Var.f83899a, t0Var.f83900b));
            return;
        }
        if (request instanceof s0) {
            int i15 = ((s0) request).f83897a;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            b20.c.B(this.f87581e, new k92.b(new k92.c(new u50.k0(i15, new ArrayList(0)), null, n.ERROR, false, 94)), null, null, 30);
            return;
        }
        if (request instanceof n0) {
            n0 n0Var = (n0) request;
            this.f87580d.q(n0Var.f83885a, n0Var.f83886b, p.BOARD_AND_SECTION_VIEW);
            return;
        }
        if (request instanceof q0) {
            a aVar2 = new a(this, eventIntake);
            wVar.h(aVar2);
            this.f87582f = aVar2;
        } else if (request instanceof u0) {
            a aVar3 = this.f87582f;
            if (aVar3 != null) {
                wVar.j(aVar3);
            }
            this.f87582f = null;
        }
    }
}
