package h60;

import ao2.j0;
import com.pinterest.api.model.q30;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import h32.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import nx.d0;
import o82.u0;
import o82.y0;
import u50.o;
import u50.r;
import yk1.n;
import zy.q0;

/* loaded from: classes5.dex */
public final class c extends wt1.f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f67784a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f67785b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f67786c;

    public c(Integer num, d0 pinalytics, q0 unscopedPinalyticsSEPFactory) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        this.f67784a = num;
        this.f67785b = pinalytics;
        this.f67786c = unscopedPinalyticsSEPFactory;
    }

    @Override // wt1.f
    public final wt1.d b(j0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(5, "stateTransformer");
        y b13 = a0.b(a0Var, new g((ArrayList) null, false, false, this.f67784a, (String) null, 55), new mz.c(this, 6), 2);
        Intrinsics.checkNotNullParameter(b13, "<this>");
        return new bx0.j(b13);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        g60.g gVar;
        q30 q30Var;
        List k13;
        g model = (g) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.f67798a.isEmpty() || (gVar = (g60.g) CollectionsKt.U(i13, model.f67798a)) == null || (q30Var = gVar.f63710a) == null || (k13 = q30Var.k()) == null) {
            return null;
        }
        return (String) CollectionsKt.firstOrNull(k13);
    }

    @Override // wt1.f
    public final void h(o oVar, n nVar, r eventIntake) {
        a displayState = (a) oVar;
        k view = (k) nVar;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Integer num = this.f67784a;
        a displayState2 = a.e(displayState, num != null ? num.intValue() : displayState.f67778c, 59);
        view.getClass();
        Intrinsics.checkNotNullParameter(displayState2, "displayState");
        view.setPaddingRelative(view.getPaddingStart(), view.getResources().getDimensionPixelSize(displayState2.f67778c), view.getPaddingEnd(), view.getPaddingBottom());
        view.f67811a.i(new j(displayState2, 0));
        Integer num2 = displayState2.f67777b;
        GestaltText gestaltText = view.f67812b;
        if (num2 != null) {
            gestaltText.i(new j(displayState2, 1));
        } else {
            gestaltText.i(f.f67796k);
        }
        view.f67814d.A(new y0(displayState2.f67780e, null, false, 6)).b(view.f67813c);
        if (displayState.f67781f) {
            List list = displayState.f67780e;
            if (!list.isEmpty()) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String uid = ((g60.g) ((u0) it.next()).f93721a).f63710a.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    arrayList.add(uid);
                }
                i0 p13 = this.f67785b.p();
                if (p13 == null) {
                    p13 = new i0(d4.USER, a4.USER_SELF, null, h32.g0.BOARDS_TAB, null, null);
                }
                eventIntake.a(new b(arrayList, p13));
            }
        }
    }

    @Override // wt1.f
    public final void i(r eventIntake, n nVar) {
        k view = (k) nVar;
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
