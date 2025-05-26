package xv1;

import android.view.View;
import c71.b0;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.o00;
import de1.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.g3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.w;
import t3.s1;
import yq1.u1;

/* loaded from: classes4.dex */
public final class e extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f136035a;

    /* renamed from: b, reason: collision with root package name */
    public final w f136036b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136037c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f136038d;

    /* renamed from: e, reason: collision with root package name */
    public de1.d f136039e;

    /* renamed from: f, reason: collision with root package name */
    public int f136040f;

    /* renamed from: g, reason: collision with root package name */
    public Function0 f136041g;

    public e(uj2.q qVar, uk1.d presenterPinalytics, w eventManager, r0 unifiedProductFilterHostScreenType) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(unifiedProductFilterHostScreenType, "unifiedProductFilterHostScreenType");
        this.f136035a = presenterPinalytics;
        this.f136036b = eventManager;
        this.f136037c = false;
        this.f136038d = unifiedProductFilterHostScreenType;
        this.f136041g = d.f136029i;
        if (qVar != null) {
            nl.b.m(qVar, "SearchOneBarViewBinder:productFilterAppliedCountObservable", new u1(this, 18));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        b bVar;
        Unit unit;
        Boolean bool;
        Boolean bool2;
        vv1.i view = (vv1.i) nVar;
        g00 model = (g00) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        View view2 = view instanceof View ? (View) view : null;
        if (view2 != null) {
            yk1.m j13 = s1.j(view2);
            if (!(j13 instanceof b)) {
                j13 = null;
            }
            bVar = (b) j13;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.u3(model);
            bVar.v3(i13);
            bVar.f136027k = this.f136039e;
            Function0 function0 = this.f136041g;
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            bVar.f136084f = function0;
            o00 v13 = model.v();
            boolean z13 = false;
            if (v13 != null) {
                boolean z14 = model.w().intValue() == q42.f.FILTER.getValue();
                q42.a aVar = q42.c.Companion;
                Integer r13 = v13.r();
                Intrinsics.checkNotNullExpressionValue(r13, "getIcon(...)");
                int intValue = r13.intValue();
                aVar.getClass();
                q42.c a13 = q42.a.a(intValue);
                int g03 = g3.g0(a13);
                if (v13.q()) {
                    String p13 = v13.p();
                    if (p13 == null) {
                        p13 = "";
                    }
                    view.l0(p13);
                    if (p13.length() == 0) {
                        view.K4(a13);
                    } else {
                        view.i1(p13);
                    }
                }
                List o13 = v13.o();
                List y13 = v13.y();
                if (o13 != null && y13 != null) {
                    view.G3(o13, y13);
                }
                String t13 = v13.t();
                view.F4(Integer.valueOf((t13 == null || t13.length() == 0) ^ true ? m42.a.one_bar_module_cover_image_padding : z14 ? m42.a.one_bar_module_filter_padding : ga2.b.lego_button_small_side_padding), Integer.valueOf(z14 ? m42.a.one_bar_module_filter_padding : ga2.b.lego_button_small_side_padding));
                List u13 = v13.u();
                if (u13 != null) {
                    if (!u13.isEmpty()) {
                        List list = u13;
                        ArrayList arrayList = new ArrayList(g0.q(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Pair((String) it.next(), model.getUid()));
                        }
                        view.D1(arrayList);
                    } else {
                        view.F(v13.t());
                    }
                    unit = Unit.f80348a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    view.F(v13.t());
                }
                vv1.i.E5(view, g03, a13, false, 12);
                if (view instanceof yv1.j) {
                    o00 v14 = model.v();
                    if (v14 == null || (bool2 = v14.v()) == null) {
                        bool2 = Boolean.FALSE;
                    }
                    view.s3(bool2.booleanValue(), true);
                } else {
                    o00 v15 = model.v();
                    if (v15 == null || (bool = v15.v()) == null) {
                        bool = Boolean.FALSE;
                    }
                    view.H6(bool.booleanValue());
                }
            }
            q42.d dVar = q42.f.Companion;
            Integer w13 = model.w();
            Intrinsics.checkNotNullExpressionValue(w13, "getModuleType(...)");
            int intValue2 = w13.intValue();
            dVar.getClass();
            q42.f a14 = q42.d.a(intValue2);
            int i14 = -1;
            int i15 = a14 == null ? -1 : c.f136028a[a14.ordinal()];
            if (i15 == 1) {
                i14 = t0.one_bar_module_filter_button_id;
            } else if (i15 == 2) {
                i14 = m42.c.one_bar_module_shop_button_id;
            }
            view.v2(i14);
            view.B2(a14 == q42.f.PROFILE_MODE || a14 == q42.f.SHOP_MODE || a14 == q42.f.SEARCH_FOR_YOU);
            b0 b0Var = (b0) this.f136041g.invoke();
            h61.h hVar = b0Var != null ? b0Var.f26728a : null;
            boolean z15 = this.f136040f > 1;
            if (a14 == q42.f.FILTER && (z15 || CollectionsKt.L(f0.j(h61.h.BOARDS, h61.h.USERS, h61.h.VIDEOS), hVar))) {
                z13 = true;
            }
            view.y2(z13);
        }
    }

    @Override // vq0.h
    public final yk1.m f() {
        return new b(this.f136035a, this.f136036b, this.f136037c, this.f136038d);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        g00 model = (g00) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
