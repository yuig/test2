package l71;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i32.y0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jk2.a1;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.f3;
import m60.w;
import rg0.y;

/* loaded from: classes5.dex */
public abstract class s extends f {

    /* renamed from: s, reason: collision with root package name */
    public final r71.b f81962s;

    /* renamed from: t, reason: collision with root package name */
    public final yo0.a f81963t;

    /* renamed from: u, reason: collision with root package name */
    public final p f81964u;

    /* renamed from: v, reason: collision with root package name */
    public q f81965v;

    /* renamed from: w, reason: collision with root package name */
    public uk2.f f81966w;

    /* renamed from: x, reason: collision with root package name */
    public h61.n f81967x;

    /* renamed from: y, reason: collision with root package name */
    public final uk2.f f81968y;

    /* renamed from: z, reason: collision with root package name */
    public final a1 f81969z;

    public /* synthetic */ s(w wVar, o71.w wVar2, ip1.b bVar, uk1.d dVar, uj2.q qVar, vy.m mVar, z61.b bVar2) {
        this(wVar, wVar2, bVar, dVar, qVar, mVar, bVar2, null, null);
    }

    public void L(Date date) {
        this.f81962s.f106415i = date;
        this.f81963t.f139601h = date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v0, types: [l71.s, xk1.c] */
    public s(w eventManager, o71.w screenNavigatorManager, ip1.b prefetchManager, uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, z61.b searchPWTManager, lh0.o oVar, f3 f3Var) {
        super(oVar, f3Var);
        ?? r03;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        uk2.f r13 = cb.r("create(...)");
        this.f81968y = r13;
        a1 a1Var = new a1(r13);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        this.f81969z = a1Var;
        rg0.s a13 = y.a();
        y0 placement = y0.ANDROID_SEARCH_TYPEAHEAD_TAKEOVER;
        dh0.d dVar = (dh0.d) a13;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(placement, "placement");
        List list = (List) dVar.f54985d.get(placement);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                rg0.n nVar = (rg0.n) obj;
                if ((nVar != null ? nVar.f108068j : null) != null) {
                    arrayList.add(obj);
                }
            }
            r03 = new ArrayList(g0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rg0.n nVar2 = (rg0.n) it.next();
                ag2.e eVar = nVar2.f108068j;
                Intrinsics.g(eVar, "null cannot be cast to non-null type com.pinterest.experience.DisplayData");
                rg0.g gVar = (rg0.g) eVar;
                ArrayList searchQueryList = gVar.f108017m;
                Intrinsics.checkNotNullExpressionValue(searchQueryList, "searchQueryList");
                Iterator it2 = it;
                ArrayList textColors = gVar.f108018n;
                Intrinsics.checkNotNullExpressionValue(textColors, "textColors");
                Intrinsics.checkNotNullParameter(searchQueryList, "searchQueryList");
                Intrinsics.checkNotNullParameter(textColors, "textColors");
                kv0.p pVar = new kv0.p();
                pVar.f80994a = searchQueryList;
                pVar.f80995b = textColors;
                pVar.f80996c = gVar.f108019o;
                r03.add(new com.pinterest.feature.search.a(pVar, nVar2));
                it = it2;
            }
        } else {
            r03 = q0.f80391a;
        }
        List list2 = r03;
        p pVar2 = new p(this, presenterPinalytics, analyticsApi, prefetchManager, searchPWTManager);
        this.f81964u = pVar2;
        r71.b bVar = new r71.b(presenterPinalytics, networkStateStream, pVar2, screenNavigatorManager, list2, f3Var);
        this.f81962s = bVar;
        yo0.a aVar = new yo0.a(presenterPinalytics, networkStateStream, pVar2, eventManager);
        this.f81963t = aVar;
        o(1, bVar);
        o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, aVar);
        o(10, new cg0.c(3, presenterPinalytics, networkStateStream));
    }
}
