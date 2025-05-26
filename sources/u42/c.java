package u42;

import android.view.View;
import com.pinterest.api.model.e40;
import com.pinterest.api.model.hh0;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import com.pinterest.selectPinsLibrary.view.SelectPinsEmptyStateMessageView;
import java.util.ArrayList;
import java.util.List;
import kh2.d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.s0;
import t3.s1;
import vq0.h;
import yk1.m;
import yk1.n;
import yk1.v;

/* loaded from: classes4.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120495a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f120496b;

    public c(nu1.a inAppNavigator) {
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        this.f120496b = inAppNavigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        List U0;
        sb2.a aVar;
        rg0.n exp;
        Unit unit = null;
        switch (this.f120495a) {
            case 0:
                SelectPinsEmptyStateMessageView view = (SelectPinsEmptyStateMessageView) nVar;
                hh0 model = (hh0) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                String text = ((yk1.a) ((v) this.f120496b)).f139224a.getString(model.f38440a);
                view.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                LegoEmptyStateView legoEmptyStateView = view.f51762a;
                legoEmptyStateView.e(text);
                String str = model.f38441b;
                if (str != null) {
                    b41.c actionItem = new b41.c(1, str, model.f38442c);
                    Intrinsics.checkNotNullParameter(actionItem, "actionItem");
                    legoEmptyStateView.b(actionItem);
                    legoEmptyStateView.i();
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    legoEmptyStateView.a();
                    break;
                }
                break;
            default:
                rj0.a view2 = (rj0.a) nVar;
                vh model2 = (vh) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                List list = model2.f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof v7) {
                        arrayList.add(obj2);
                    }
                }
                v7 v7Var = (v7) CollectionsKt.firstOrNull(arrayList);
                String v13 = v7Var != null ? d.v(v7Var) : null;
                if (v13 == null || v13.length() == 0) {
                    e40 e40Var = (v7Var == null || (U0 = d.U0(v7Var)) == null) ? null : (e40) CollectionsKt.firstOrNull(U0);
                    if (e40Var != null) {
                        v13 = e40Var.c();
                    }
                }
                if (model2.N()) {
                    view2.T1(vn1.c.DARK);
                    view2.M3(s0.gold_standard_upsell_background);
                } else {
                    view2.T1(vn1.c.LIGHT);
                    view2.m0(v13);
                }
                ih ihVar = model2.f42857o;
                view2.h(ihVar != null ? ihVar.g() : null);
                kj kjVar = model2.f42855m;
                view2.p(kjVar != null ? kjVar.a() : null);
                kj kjVar2 = model2.f42856n;
                view2.c(kjVar2 != null ? kjVar2.a() : null);
                View view3 = view2 instanceof View ? (View) view2 : null;
                if (view3 != null) {
                    m j13 = s1.j(view3);
                    if (!(j13 instanceof sb2.a)) {
                        j13 = null;
                    }
                    aVar = (sb2.a) j13;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    ih ihVar2 = model2.f42857o;
                    aVar.f112276c = ihVar2 != null ? ihVar2.e() : null;
                    String str2 = model2.f42853k;
                    if (str2 != null && str2.length() != 0 && (exp = rg0.n.f(new vd0.c(model2.f42853k))) != null) {
                        Intrinsics.checkNotNullParameter(exp, "exp");
                        aVar.f112275b = exp;
                        break;
                    }
                }
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        switch (this.f120495a) {
            case 1:
                return new sb2.a((nu1.a) this.f120496b);
            default:
                return null;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f120495a) {
            case 0:
                hh0 model = (hh0) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                vh model2 = (vh) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
        }
        return null;
    }

    public c(v viewResources) {
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f120496b = viewResources;
    }
}
