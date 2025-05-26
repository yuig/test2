package i1;

import com.pinterest.api.model.hk0;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.xk;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.s4;
import j1.b2;
import j1.g2;
import j1.m2;
import j1.p2;
import j1.q2;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70914i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f70915j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70916k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f70917l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xk2.g f70918m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Object obj, Object obj2, Object obj3, xk2.g gVar, int i13) {
        super(2);
        this.f70914i = i13;
        this.f70915j = obj;
        this.f70916k = obj2;
        this.f70917l = obj3;
        this.f70918m = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        NavigationImpl navigationImpl;
        String uid;
        int i13 = this.f70914i;
        xk2.g gVar = this.f70918m;
        Object obj3 = this.f70917l;
        Object obj4 = this.f70916k;
        Unit unit = null;
        Object obj5 = this.f70915j;
        switch (i13) {
            case 0:
                i2.o oVar = (i2.o) obj;
                int i14 = 2;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return Unit.f80348a;
                    }
                }
                g2 g2Var = (g2) obj5;
                h hVar = new h((j1.h0) obj4, i14);
                p2 p2Var = q2.f74205a;
                Object c13 = g2Var.c();
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(-438678252);
                float f13 = Intrinsics.d(c13, obj3) ? 1.0f : 0.0f;
                int i15 = 0;
                sVar2.r(false);
                Float valueOf = Float.valueOf(f13);
                Object value = g2Var.f74078d.getValue();
                sVar2.W(-438678252);
                float f14 = Intrinsics.d(value, obj3) ? 1.0f : 0.0f;
                sVar2.r(false);
                b2 b13 = m2.b(g2Var, valueOf, Float.valueOf(f14), (j1.h0) hVar.invoke(g2Var.f(), sVar2, 0), p2Var, sVar2, 0);
                u2.n nVar = u2.n.f120041b;
                boolean h10 = sVar2.h(b13);
                Object J2 = sVar2.J();
                if (h10 || J2 == i2.n.f71185a) {
                    J2 = new u0(b13, i15);
                    sVar2.g0(J2);
                }
                u2.q n13 = androidx.compose.ui.graphics.a.n(nVar, (Function1) J2);
                kl2.l lVar = (kl2.l) gVar;
                q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
                int i16 = sVar2.P;
                i2.z1 o13 = sVar2.o();
                u2.q X = ao2.m0.X(sVar2, n13);
                s3.k.Qo.getClass();
                s3.i iVar = s3.j.f110798b;
                if (!(sVar2.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar);
                } else {
                    sVar2.j0();
                }
                tb.f.f0(sVar2, e13, s3.j.f110801e);
                tb.f.f0(sVar2, o13, s3.j.f110800d);
                s3.h hVar2 = s3.j.f110802f;
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i16))) {
                    ep.b.y(i16, sVar2, i16, hVar2);
                }
                tb.f.f0(sVar2, X, s3.j.f110799c);
                lVar.invoke(obj3, sVar2, 0);
                sVar2.r(true);
                return Unit.f80348a;
            default:
                xk bubble = (xk) obj;
                HashMap hashMap = (HashMap) obj2;
                Intrinsics.checkNotNullParameter(bubble, "bubble");
                h32.u0 u0Var = (h32.u0) oe1.c.f94273a.get(bubble.k());
                oe1.a aVar = (oe1.a) obj5;
                nx.d0 a13 = aVar.a();
                h32.f1 f1Var = h32.f1.TAP;
                String uid2 = bubble.getUid();
                h32.g0 componentType = aVar.getComponentType();
                String c14 = aVar.c();
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                c0.d.j2(a13, f1Var, uid2, componentType, u0Var, c14, hashMap);
                HashMap auxData = aVar.getAuxData();
                String str = auxData != null ? (String) auxData.get("entered_query") : null;
                String c15 = n10.b.c(bubble);
                ih ihVar = bubble.f43728t;
                if (ihVar != null) {
                    vh vhVar = (vh) obj4;
                    c91.f fVar = (c91.f) obj3;
                    kl2.m mVar = (kl2.m) gVar;
                    if (vhVar == null || !vhVar.r0()) {
                        String uid3 = bubble.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                        mVar.c(ihVar, uid3, str, bubble);
                        unit = Unit.f80348a;
                    } else if (fVar != null) {
                        fVar.a(new j1.v0(mVar, ihVar, bubble, str, 16), null, c91.a.f26973a);
                        unit = Unit.f80348a;
                    }
                }
                if (unit == null) {
                    m60.w wVar = m60.u.f85943a;
                    if (c15 == null) {
                        navigationImpl = Navigation.z0((ScreenLocation) s4.f51355b.getValue(), bubble.getUid());
                    } else {
                        NavigationImpl z03 = Navigation.z0((ScreenLocation) s4.f51359f.getValue(), c15);
                        vh vhVar2 = (vh) obj4;
                        z03.m0("com.pinterest.EXTRA_SEARCH_ARTICLE", bubble.getUid());
                        Integer j13 = bubble.j();
                        z03.m0("com.pinterest.EXTRA_SEARCH_REFERRING_SOURCE", j13.intValue() == hk0.TRENDING.getValue() ? "trending" : j13.intValue() == hk0.BUBBLE_ANNOTATION.getValue() ? "autocomplete_bubble" : j13.intValue() == hk0.BUBBLE_SHOP_TAB.getValue() ? "shop_tab_bubble" : "homefeed_bubble");
                        if (vhVar2 != null && (uid = vhVar2.getUid()) != null) {
                            z03.m0("com.pinterest.EXTRA_SEARCH_SOURCE_ID", uid);
                        }
                        navigationImpl = z03;
                    }
                    wVar.d(navigationImpl);
                }
                return Unit.f80348a;
        }
    }
}
