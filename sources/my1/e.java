package my1;

import ao2.j0;
import bc2.l;
import bc2.q;
import c61.a0;
import c61.b0;
import c61.c0;
import c61.d0;
import c61.e0;
import c61.g0;
import c61.h0;
import c61.i0;
import c61.m0;
import c61.o0;
import c61.z;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.b01;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.api.model.zv0;
import dl1.s;
import dl2.j;
import hs1.m;
import ja.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import o82.l0;

/* loaded from: classes4.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88510r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a61.b f88511s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f88512t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m0 f88513u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ xj2.b f88514v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a61.b bVar, f fVar, m0 m0Var, xj2.b bVar2, bl2.c cVar) {
        super(2, cVar);
        this.f88511s = bVar;
        this.f88512t = fVar;
        this.f88513u = m0Var;
        this.f88514v = bVar2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f88511s, this.f88512t, this.f88513u, this.f88514v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object a13;
        List list;
        List list2;
        String str;
        List list3;
        List N;
        String str2;
        q r03;
        List list4;
        String l33;
        List list5;
        List split$default;
        List list6;
        List<String> y03;
        List list7;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88510r;
        f fVar = this.f88512t;
        if (i13 == 0) {
            ue.c.H(obj);
            int parseInt = Integer.parseInt(this.f88511s.d());
            fVar.getClass();
            o0 o0Var = new o0(false);
            this.f88510r = 1;
            a13 = this.f88513u.a(parseInt, null, o0Var, null, this);
            if (a13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
            a13 = obj;
        }
        NetworkResponse networkResponse = (NetworkResponse) a13;
        if (k3.s1(networkResponse)) {
            l0 l0Var = (l0) k3.f0(networkResponse);
            List<c61.j0> y04 = (l0Var == null || (list7 = l0Var.f93652a) == null) ? null : CollectionsKt.y0(list7, 4);
            if (y04 != null) {
                new Integer(y04.size());
            }
            fVar.getClass();
            if (y04 != null) {
                for (c61.j0 j0Var : y04) {
                    j0Var.getClass();
                    boolean z13 = j0Var instanceof z;
                    xj2.b bVar = this.f88514v;
                    if (z13) {
                        vh c13 = j0Var.c();
                        if (c13 != null && !bVar.f135163b && (list = c13.f42865w) != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (obj2 instanceof xk) {
                                    arrayList.add(obj2);
                                }
                            }
                            List y05 = CollectionsKt.y0(arrayList, 8);
                            if (y05 != null) {
                                Iterator it = y05.iterator();
                                while (it.hasNext()) {
                                    fVar.c(n10.b.b((xk) it.next()), "");
                                }
                            }
                        }
                    } else if (j0Var instanceof c0) {
                        vh c14 = j0Var.c();
                        if (c14 != null && !bVar.f135163b && (list2 = c14.f42865w) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list2) {
                                if (obj3 instanceof zv0) {
                                    arrayList2.add(obj3);
                                }
                            }
                            List y06 = CollectionsKt.y0(arrayList2, 3);
                            if (y06 != null) {
                                Iterator it2 = y06.iterator();
                                while (it2.hasNext()) {
                                    List N2 = ((zv0) it2.next()).N();
                                    if (N2 != null && (str = (String) CollectionsKt.firstOrNull(N2)) != null) {
                                        fVar.c(str, "");
                                    }
                                }
                            }
                        }
                    } else if (j0Var instanceof a0) {
                        vh c15 = j0Var.c();
                        if (c15 != null && !bVar.f135163b && (list3 = c15.f42865w) != null && !list3.isEmpty()) {
                            int i14 = 0;
                            for (Object obj4 : list3) {
                                int i15 = i14 + 1;
                                if (i14 < 0) {
                                    f0.p();
                                    throw null;
                                }
                                s sVar = (s) obj4;
                                if (i14 < 2) {
                                    if (sVar instanceof f30) {
                                        f30 f30Var = (f30) sVar;
                                        String B0 = bs1.c.B0(f30Var);
                                        if (B0 != null) {
                                            ((m) fVar.f88515c).q(B0, null, null);
                                        }
                                        n1 n1Var = fVar.f88522j;
                                        n1Var.getClass();
                                        z3 z3Var = a4.f83298b;
                                        g1 g1Var = (g1) n1Var.f83439a;
                                        if (g1Var.o("android_search_landing_page_prefetching_spotlight_ads", "enabled", z3Var) || g1Var.l("android_search_landing_page_prefetching_spotlight_ads")) {
                                            b01 M6 = f30Var.M6();
                                            Map g13 = M6 != null ? M6.g() : null;
                                            if (!(g13 == null || g13.isEmpty())) {
                                                if (g1Var.o("android_premiere_video_quality", "enabled", z3Var) || g1Var.l("android_premiere_video_quality")) {
                                                    String id3 = f30Var.getId();
                                                    Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                                                    b01 M62 = f30Var.M6();
                                                    r03 = dl2.b.r0(id3, M62 != null ? M62.g() : null, false, false, 0, l.PREMIERE, fVar.f88521i, bc2.m.GRID);
                                                } else {
                                                    r03 = dl2.b.S0(f30Var, 0);
                                                }
                                                if (r03 != null) {
                                                    wj2.c.a().b(new y(fVar, f30Var, r03, 29));
                                                }
                                            }
                                        }
                                    } else if (sVar instanceof xk) {
                                        List e13 = ((xk) sVar).e();
                                        Intrinsics.checkNotNullExpressionValue(e13, "getLargeCoverImageList(...)");
                                        for (String str3 : CollectionsKt.y0(e13, 3)) {
                                            Intrinsics.f(str3);
                                            ((m) fVar.f88515c).q(str3, null, null);
                                        }
                                    } else if ((sVar instanceof zv0) && (N = ((zv0) sVar).N()) != null && (str2 = (String) CollectionsKt.firstOrNull(N)) != null) {
                                        ((m) fVar.f88515c).q(str2, null, null);
                                    }
                                    i14 = i15;
                                }
                            }
                        }
                    } else if (j0Var instanceof b0) {
                        vh c16 = j0Var.c();
                        if (c16 != null && !bVar.f135163b && (list4 = c16.f42865w) != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj5 : list4) {
                                if (obj5 instanceof f30) {
                                    arrayList3.add(obj5);
                                }
                            }
                            List<f30> y07 = CollectionsKt.y0(arrayList3, 3);
                            if (y07 != null) {
                                for (f30 f30Var2 : y07) {
                                    String B02 = bs1.c.B0(f30Var2);
                                    if (B02 != null) {
                                        fVar.c(B02, "");
                                    }
                                    wy0 n13 = b40.n(f30Var2);
                                    if (n13 != null && (l33 = n13.l3()) != null) {
                                        ((m) fVar.f88515c).q(l33, null, null);
                                    }
                                }
                            }
                        }
                    } else if ((j0Var instanceof g0) || (j0Var instanceof e0) || (j0Var instanceof h0) || (j0Var instanceof d0) || (j0Var instanceof c61.f0) || (j0Var instanceof i0)) {
                        vh c17 = j0Var.c();
                        if (c17 != null && !bVar.f135163b && !bVar.f135163b) {
                            if (c17.M != null && (!r4.isEmpty()) && (list6 = c17.M) != null && (y03 = CollectionsKt.y0(list6, 4)) != null) {
                                for (String str4 : y03) {
                                    Intrinsics.f(str4);
                                    fVar.c(str4, "");
                                }
                            }
                            if (c17.f42865w != null && (!r4.isEmpty()) && (list5 = c17.f42865w) != null) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj6 : list5) {
                                    if (obj6 instanceof xk) {
                                        arrayList4.add(obj6);
                                    }
                                }
                                xk xkVar = (xk) CollectionsKt.firstOrNull(arrayList4);
                                if (xkVar != null) {
                                    String str5 = xkVar.f43722n;
                                    Intrinsics.checkNotNullExpressionValue(str5, "getLargeCoverImageUrls(...)");
                                    split$default = StringsKt__StringsKt.split$default(str5, new String[]{","}, false, 0, 6, null);
                                    Iterator it3 = split$default.iterator();
                                    while (it3.hasNext()) {
                                        fVar.c((String) it3.next(), "");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Unit.f80348a;
    }
}
