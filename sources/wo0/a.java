package wo0;

import com.pinterest.api.model.hk0;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.xk;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.b0;
import com.pinterest.screens.c0;
import h32.f1;
import h32.g0;
import h32.r;
import j1.v0;
import java.util.HashMap;
import kl2.l;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import nx.d0;
import xo0.o;
import xo0.x;

/* loaded from: classes5.dex */
public final class a implements uo0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130616a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xk f130617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f130618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uo0.d f130619d;

    /* renamed from: e, reason: collision with root package name */
    public Object f130620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yk1.c f130621f;

    public a(h hVar, xk xkVar, int i13, x xVar) {
        this.f130621f = hVar;
        this.f130617b = xkVar;
        this.f130618c = i13;
        this.f130619d = xVar;
    }

    @Override // uo0.c
    public final r a() {
        int i13 = this.f130616a;
        int i14 = this.f130618c;
        xk xkVar = this.f130617b;
        yk1.c cVar = this.f130621f;
        switch (i13) {
            case 0:
                ((c) cVar).f130635l.add(xkVar);
                ((o) this.f130620e).b(i14, xkVar);
                return null;
            default:
                h hVar = (h) cVar;
                hVar.f130660i.add(xkVar);
                if (!(!Intrinsics.d(hVar.f130658g, "srs"))) {
                    return null;
                }
                if (((r) this.f130620e) == null) {
                    this.f130620e = new r(xkVar.getUid(), null, null, Long.valueOf(((pb0.g) hVar.f130656e).a()), null, null, Short.valueOf((short) i14), null, (short) 0, xkVar.getUid(), null, null, null, xkVar.j());
                }
                return (r) this.f130620e;
        }
    }

    @Override // uo0.c
    public final r b() {
        r rVar;
        switch (this.f130616a) {
            case 0:
                ((o) this.f130620e).a(this.f130617b);
                return null;
            default:
                h hVar = (h) this.f130621f;
                if (!(!Intrinsics.d(hVar.f130658g, "srs"))) {
                    return null;
                }
                r source = (r) this.f130620e;
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    rVar = new r(source.f67199a, source.f67200b, source.f67201c, source.f67202d, Long.valueOf(((pb0.g) hVar.f130656e).a()), source.f67204f, source.f67205g, source.f67206h, source.f67207i, source.f67208j, source.f67209k, source.f67210l, source.f67211m, source.f67212n);
                } else {
                    rVar = null;
                }
                this.f130620e = null;
                return rVar;
        }
    }

    @Override // uo0.c
    public final void c() {
        NavigationImpl z03;
        String e13;
        NavigationImpl navigationImpl;
        String e14;
        int i13 = this.f130616a;
        Unit unit = null;
        xk bubble = this.f130617b;
        yk1.c cVar = this.f130621f;
        switch (i13) {
            case 0:
                String uid = bubble.getUid();
                c cVar2 = (c) cVar;
                l lVar = cVar2.f130628e;
                if (lVar == null) {
                    d0 pinalytics = cVar2.getPinalytics();
                    f1 f1Var = f1.BUBBLE_OPEN;
                    HashMap hashMap = new HashMap();
                    hashMap.put("grid_index", String.valueOf(this.f130618c));
                    Unit unit2 = Unit.f80348a;
                    pinalytics.g(f1Var, uid, hashMap, false);
                    Intrinsics.f(uid);
                    String c13 = n10.b.c(bubble);
                    ih ihVar = bubble.f43728t;
                    if (ihVar != null && (e13 = ihVar.e()) != null) {
                        boolean z13 = cVar2.f130639p;
                        uo0.d dVar = this.f130619d;
                        if (z13) {
                            c91.f fVar = cVar2.f130629f;
                            if (fVar != null) {
                                fVar.a(new v0(cVar2, e13, uid, dVar, 11), null, c91.a.f26973a);
                                unit = Unit.f80348a;
                            }
                        } else {
                            ((xo0.d) dVar).M5(e13, z0.f(new Pair("com.pinterest.EXTRA_SEARCH_ENTERED_QUERY", cVar2.f130636m), new Pair("com.pinterest.EXTRA_SEARCH_ARTICLE", uid)));
                            unit = Unit.f80348a;
                        }
                    }
                    if (unit == null) {
                        w wVar = u.f85943a;
                        if (c13 == null) {
                            z03 = Navigation.z0((ScreenLocation) b0.f50547a.getValue(), uid);
                        } else {
                            z03 = Navigation.z0((ScreenLocation) b0.f50548b.getValue(), c13);
                            z03.m0("com.pinterest.EXTRA_SEARCH_ARTICLE", uid);
                            Integer j13 = bubble.j();
                            z03.m0("com.pinterest.EXTRA_SEARCH_REFERRING_SOURCE", j13.intValue() == hk0.TRENDING.getValue() ? "trending" : j13.intValue() == hk0.BUBBLE_ANNOTATION.getValue() ? "autocomplete_bubble" : j13.intValue() == hk0.BUBBLE_SHOP_TAB.getValue() ? "shop_tab_bubble" : cVar2.f130625b);
                            z03.m0("com.pinterest.EXTRA_SEARCH_SOURCE_ID", cVar2.f130633j);
                        }
                        wVar.d(z03);
                        break;
                    }
                } else {
                    String n13 = bubble.n();
                    Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
                    Intrinsics.f(uid);
                    lVar.invoke(n13, uid, cVar2.f130637n);
                    break;
                }
                break;
            default:
                h hVar = (h) cVar;
                d0 d0Var = hVar.getPresenterPinalytics().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                d0Var.g(f1.BUBBLE_OPEN, bubble.getUid(), hVar.f130665n, false);
                hVar.getPresenterPinalytics().f122379a.h(g0.DYNAMIC_GRID_STORY, null, hVar.f130665n);
                uo0.d bubbleView = this.f130619d;
                Intrinsics.checkNotNullParameter(bubbleView, "bubbleView");
                Intrinsics.checkNotNullParameter(bubble, "bubble");
                String uid2 = bubble.getUid();
                String c14 = n10.b.c(bubble);
                ih ihVar2 = bubble.f43728t;
                if (ihVar2 != null && (e14 = ihVar2.e()) != null) {
                    ((xo0.d) bubbleView).M5(e14, null);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    if (c14 == null) {
                        navigationImpl = Navigation.z0((ScreenLocation) c0.f50602a.getValue(), uid2);
                    } else {
                        NavigationImpl z04 = Navigation.z0((ScreenLocation) c0.f50603b.getValue(), c14);
                        z04.m0("com.pinterest.EXTRA_SEARCH_ARTICLE", uid2);
                        z04.m0("com.pinterest.EXTRA_SEARCH_REFERRING_SOURCE", hVar.f130658g);
                        z04.m0("com.pinterest.EXTRA_SEARCH_SOURCE_ID", hVar.f130657f);
                        navigationImpl = z04;
                    }
                    hVar.f130652a.d(navigationImpl);
                    break;
                }
                break;
        }
    }

    public a(c cVar, xk xkVar, int i13, x xVar) {
        this.f130621f = cVar;
        this.f130617b = xkVar;
        this.f130618c = i13;
        this.f130619d = xVar;
        d0 pinalytics = cVar.getPinalytics();
        Function1 function1 = cVar.f130631h;
        this.f130620e = new o(pinalytics, cVar.f130627d, cVar.f130630g, function1 != null ? (HashMap) function1.invoke(xkVar) : null, 48);
    }
}
