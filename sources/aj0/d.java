package aj0;

import android.view.View;
import c91.f;
import com.google.android.gms.internal.measurement.x;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.following.carousel.view.ImpressionableUserRep;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.errorstate.ShoppingFilterEmptyStateView;
import ee1.i;
import is1.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kh2.u2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.u;
import m60.w;
import mz1.g;
import nx.d0;
import o71.k;
import o71.l0;
import oa2.o;
import oa2.p;
import oa2.r;
import oa2.t;
import t3.s1;
import uj2.q;
import vq0.h;
import x02.i2;
import x02.x2;
import yk1.j;
import yk1.m;
import yk1.n;
import yk1.v;
import zd1.e0;

/* loaded from: classes5.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15422a = 4;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f15423b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15424c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15425d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15426e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15427f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15428g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(uk1.d presenterPinalytics, q networkStateStream, i2 pinRepository, l uriNavigator, x2 userRepository) {
        this(presenterPinalytics, networkStateStream, pinRepository, uriNavigator, (f) null, userRepository);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, zi0.b] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, k71.c] */
    /* JADX WARN: Type inference failed for: r13v15, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, le1.a] */
    /* JADX WARN: Type inference failed for: r13v24, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r13v8, types: [yk1.m] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        o oVar;
        int i14 = this.f15422a;
        boolean z13 = true;
        Object obj2 = this.f15425d;
        Object obj3 = this.f15424c;
        c cVar = null;
        me1.a aVar = null;
        k kVar = null;
        switch (i14) {
            case 0:
                ?? view = (zi0.b) nVar;
                vh model = (vh) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                kj kjVar = model.f42855m;
                String title = kjVar != null ? kjVar.a() : null;
                if (title == null) {
                    title = "";
                }
                List articles = model.f42865w;
                Intrinsics.checkNotNullExpressionValue(articles, "getObjects(...)");
                View view2 = view instanceof View ? (View) view : null;
                if (view2 != null) {
                    ?? j13 = s1.j(view2);
                    cVar = j13 instanceof c ? j13 : null;
                }
                if (cVar != null) {
                    String q13 = model.q();
                    String storyType = q13 != null ? q13 : "";
                    Intrinsics.checkNotNullParameter(articles, "articles");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(storyType, "storyType");
                    cVar.f15419c = articles;
                    cVar.f15420d = title;
                    cVar.f15421e = storyType;
                    break;
                }
                break;
            case 1:
                ?? view3 = (k71.c) nVar;
                br.d model2 = (br.d) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                View view4 = view3 instanceof View ? (View) view3 : null;
                if (view4 != null) {
                    ?? j14 = s1.j(view4);
                    kVar = j14 instanceof k ? j14 : null;
                }
                if (kVar != null) {
                    kVar.f93325d = model2;
                    kVar.r3();
                    String str = (String) this.f15428g;
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    kVar.f93327f = str;
                    kVar.f93326e = i13;
                    break;
                }
                break;
            case 2:
                ImpressionableUserRep view5 = (ImpressionableUserRep) nVar;
                wy0 model3 = (wy0) obj;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                ImpressionableUserRep impressionableUserRep = view5 instanceof View ? view5 : null;
                if (impressionableUserRep != null) {
                    j.a().getClass();
                    m b13 = j.b(impressionableUserRep);
                    if (!(b13 instanceof o)) {
                        b13 = null;
                    }
                    oVar = (o) b13;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    oVar.t3(model3);
                }
                jd1.h hVar = (jd1.h) obj2;
                ze0.a aVar2 = hVar.f75537g;
                if (aVar2 != ze0.a.NoPreview || aVar2 != ze0.a.List) {
                    List V0 = dl2.b.V0(model3);
                    if (V0 == null) {
                        Map k43 = model3.k4();
                        List list = k43 != null ? (List) k43.get(as1.b.a().f()) : null;
                        V0 = list == null ? dl2.b.Z0(model3) : list;
                    }
                    view5.s1(V0);
                    view5.b1(eo1.b.color_themed_background_dark_opacity_200);
                }
                String u03 = dl2.b.u0(model3);
                String M0 = dl2.b.M0(model3);
                boolean z14 = hVar.f75531a;
                if (!z14) {
                    z13 = z14;
                } else if (!dl2.b.W1(model3) || model3.O3().booleanValue()) {
                    z13 = false;
                }
                t.C1(view5, u03, M0, z13);
                view5.getClass();
                view5.f52345e.H2(new fx1.d(hVar.f75535e, 19));
                view5.B0(hVar.f75536f);
                view5.r0(hVar.f75532b);
                view5.t0(hVar.f75533c);
                if (hVar.f75534d) {
                    u2.T0(view5, (oa2.l) ((Function1) obj3).invoke(model3));
                    break;
                }
                break;
            case 3:
                ShoppingFilterEmptyStateView view6 = (ShoppingFilterEmptyStateView) nVar;
                i model4 = (i) obj;
                Intrinsics.checkNotNullParameter(view6, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                e0 e0Var = (e0) this.f15428g;
                if (e0Var != null) {
                    x xVar = new x((d0) this.f15427f, e0Var);
                    ee1.e eVar = new ee1.e(this.f15423b, (q) obj3, (e0) this.f15428g, (ee1.f) this.f15426e, xVar, model4.f58802a, true);
                    view6.b(((yk1.a) ((v) obj2)).f139224a.getString(g.end_of_feed_search_filter_header), vn1.g.HEADING_600);
                    view6.a(eVar, xVar, true);
                    break;
                }
                break;
            default:
                ?? view7 = (le1.a) nVar;
                vh story = (vh) obj;
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(story, "model");
                View view8 = view7 instanceof View ? (View) view7 : null;
                if (view8 != null) {
                    ?? j15 = s1.j(view8);
                    aVar = j15 instanceof me1.a ? j15 : null;
                }
                if (aVar != null) {
                    Intrinsics.checkNotNullParameter(story, "story");
                    aVar.f87043e = story;
                    aVar.f87044f = Integer.valueOf(i13);
                    break;
                }
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        int i13 = 0;
        int i14 = this.f15422a;
        Object obj = this.f15426e;
        Object obj2 = this.f15424c;
        Object obj3 = this.f15425d;
        Object obj4 = this.f15427f;
        switch (i14) {
            case 0:
                q networkStateStream = (q) obj2;
                i2 pinRepository = (i2) obj3;
                l uriNavigator = (l) obj;
                f fVar = (f) obj4;
                x2 userRepository = (x2) this.f15428g;
                uk1.d presenterPinalytics = this.f15423b;
                Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
                Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
                Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
                Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                c cVar = new c(presenterPinalytics, networkStateStream);
                cVar.f15419c = new ArrayList();
                cVar.f15420d = "";
                cVar.f15421e = "";
                xv.g gVar = new xv.g(presenterPinalytics, pinRepository, uriNavigator, userRepository);
                a7.o oVar = cVar.f126436a;
                oVar.j(RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE, gVar);
                oVar.j(RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO, new xv.g(presenterPinalytics, pinRepository, uriNavigator, userRepository));
                oVar.j(RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM, new xv.g(presenterPinalytics, pinRepository, uriNavigator, fVar));
                oVar.j(RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED, new xv.g(presenterPinalytics, pinRepository, uriNavigator, fVar));
                return cVar;
            case 1:
                return new k((v) obj3, this.f15423b, (q) obj2, (l0) obj, (g70.h) obj4);
            case 2:
                p pVar = (p) obj4;
                Function1 function1 = (Function1) this.f15428g;
                jd1.h hVar = (jd1.h) obj3;
                oa2.q qVar = hVar.f75532b ? r.f93960i : r.f93961j;
                return p.a(pVar, this.f15423b, hVar.f75538h, null, null, function1, null, jd1.f.f75526j, null, qVar, new jd1.g(this, i13), jd1.f.f75527k, hVar.f75539i, (String) obj, 3500);
            case 3:
            default:
                return null;
            case 4:
                String str = (String) obj4;
                w wVar = u.f85943a;
                Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
                return new me1.a(str, wVar, new ll.j(16, i13), this.f15423b, (q) obj2, (i2) obj3, (s) this.f15428g);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f15422a;
        switch (i14) {
            case 0:
                vh model = (vh) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model, "model");
                        return null;
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        return null;
                }
            case 1:
                Intrinsics.checkNotNullParameter((br.d) obj, "model");
                return null;
            case 2:
                wy0 model2 = (wy0) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                return model2.g2();
            case 3:
                Intrinsics.checkNotNullParameter((i) obj, "model");
                v vVar = (v) this.f15425d;
                return ((yk1.a) vVar).f139224a.getString(g.end_of_feed_content_description);
            default:
                vh model3 = (vh) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model3, "model");
                        return null;
                    default:
                        Intrinsics.checkNotNullParameter(model3, "model");
                        return null;
                }
        }
    }

    public d(String str, uk1.d pinalytics, q networkStateStream, String str2, i2 pinRepository, is1.t pinSwipePreferences) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinSwipePreferences, "pinSwipePreferences");
        this.f15426e = str;
        this.f15423b = pinalytics;
        this.f15424c = networkStateStream;
        this.f15427f = str2;
        this.f15425d = pinRepository;
        this.f15428g = pinSwipePreferences;
    }

    public d(Function1 merchantListener, uk1.d pinalytics, jd1.h viewConfig, String str, p legoUserRepPresenterFactory) {
        Intrinsics.checkNotNullParameter(merchantListener, "merchantListener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewConfig, "viewConfig");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        this.f15424c = merchantListener;
        this.f15423b = pinalytics;
        this.f15425d = viewConfig;
        this.f15426e = str;
        this.f15427f = legoUserRepPresenterFactory;
        this.f15428g = new jd1.g(this, 1);
    }

    public d(uk1.d presenterPinalytics, q networkStateStream, i2 pinRepository, l uriNavigator, f fVar, x2 userRepository) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f15423b = presenterPinalytics;
        this.f15424c = networkStateStream;
        this.f15425d = pinRepository;
        this.f15426e = uriNavigator;
        this.f15427f = fVar;
        this.f15428g = userRepository;
    }

    public d(uk1.d presenterPinalytics, q networkStateStream, v viewResources, ee1.f listener, d0 pinalytics, e0 e0Var) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f15423b = presenterPinalytics;
        this.f15424c = networkStateStream;
        this.f15425d = viewResources;
        this.f15426e = listener;
        this.f15427f = pinalytics;
        this.f15428g = e0Var;
    }

    public d(v viewResources, uk1.d presenterPinalytics, q networkStateStream, l0 typeaheadLogging, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(typeaheadLogging, "typeaheadLogging");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f15425d = viewResources;
        this.f15423b = presenterPinalytics;
        this.f15424c = networkStateStream;
        this.f15426e = typeaheadLogging;
        this.f15427f = boardNavigator;
        this.f15428g = "";
    }
}
