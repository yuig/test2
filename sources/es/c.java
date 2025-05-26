package es;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.bu0;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.k;
import com.pinterest.api.model.l0;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.ln;
import com.pinterest.api.model.md;
import com.pinterest.api.model.n90;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.pe;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wz;
import com.pinterest.api.model.zt0;
import df.j1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final j80.a f59979a;

    public c(j80.a carouselIndexLookup) {
        Intrinsics.checkNotNullParameter(carouselIndexLookup, "carouselIndexLookup");
        this.f59979a = carouselIndexLookup;
    }

    public static wz m(f30 pin) {
        List r13;
        h80 h80Var;
        Intrinsics.checkNotNullParameter(pin, "pin");
        oe0 f63 = pin.f6();
        if (f63 == null || (r13 = f63.r()) == null || (h80Var = (h80) CollectionsKt.firstOrNull(r13)) == null) {
            return null;
        }
        return h80Var.p();
    }

    public static wz n(f30 pin) {
        List y13;
        we0 we0Var;
        Intrinsics.checkNotNullParameter(pin, "pin");
        se0 g63 = pin.g6();
        if (g63 == null || (y13 = g63.y()) == null || (we0Var = (we0) CollectionsKt.firstOrNull(y13)) == null) {
            return null;
        }
        return we0Var.u();
    }

    public final boolean A(f30 f30Var) {
        com.pinterest.api.model.g t33;
        ln e03;
        if (f30Var == null || (t33 = f30Var.t3()) == null || (e03 = t33.e0()) == null) {
            return false;
        }
        return e03.i().intValue() == ge0.c.DEAL.getValue();
    }

    public final boolean B(int i13, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean d53 = pin.d5();
        Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
        if (d53.booleanValue() && !pin.b5().booleanValue()) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (j1.U0(l(i13, pin))) {
                return true;
            }
        }
        return false;
    }

    public final boolean C(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return B(((j80.b) this.f59979a).a(pin), pin);
    }

    public final boolean D(int i13, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean b53 = pin.b5();
        Intrinsics.checkNotNullExpressionValue(b53, "getIsPremiere(...)");
        if (b53.booleanValue()) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (j1.U0(l(i13, pin))) {
                return true;
            }
        }
        return false;
    }

    public final boolean E(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return D(((j80.b) this.f59979a).a(pin), pin);
    }

    public final boolean F(f30 pin) {
        List f13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (R(pin) && ((f13 = b40.f(pin)) == null || f13.isEmpty())) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (!Y(pin)) {
                return true;
            }
        }
        return false;
    }

    public final boolean G(f30 f30Var) {
        Integer g13 = g(f30Var);
        return g13 != null && g13.intValue() == u22.l.DIRECT_TO_DESTINATION.getValue();
    }

    public final boolean H(f30 f30Var) {
        se0 g63;
        List y13;
        return f30Var != null && n60.o.y(f30Var, "getIsThirdPartyAd(...)") && f30Var.h6() && f30Var.N6() && (g63 = f30Var.g6()) != null && (y13 = g63.y()) != null && (y13.isEmpty() ^ true);
    }

    public final boolean I(f30 f30Var) {
        com.pinterest.api.model.g t33;
        return !((f30Var == null || (t33 = f30Var.t3()) == null) ? false : Intrinsics.d(t33.c0(), Boolean.TRUE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0.intValue() == u22.i.ALL_PLATFORMS.getValue()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(com.pinterest.api.model.f30 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.pinterest.api.model.g r0 = r3.t3()
            if (r0 == 0) goto L1c
            java.lang.Integer r0 = r0.K()
            u22.i r1 = u22.i.ALL_PLATFORMS
            int r1 = r1.getValue()
            int r0 = r0.intValue()
            if (r0 != r1) goto L1c
            goto L32
        L1c:
            com.pinterest.api.model.g r3 = r3.t3()
            if (r3 == 0) goto L34
            java.lang.Integer r3 = r3.K()
            u22.i r0 = u22.i.ANDROID
            int r0 = r0.getValue()
            int r3 = r3.intValue()
            if (r3 != r0) goto L34
        L32:
            r3 = 1
            goto L35
        L34:
            r3 = 0
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: es.c.J(com.pinterest.api.model.f30):boolean");
    }

    public final boolean K(f30 f30Var) {
        if (f30Var == null) {
            return false;
        }
        return V(f30Var);
    }

    public final boolean L(f30 f30Var) {
        com.pinterest.api.model.g t33;
        if (((f30Var == null || (t33 = f30Var.t3()) == null) ? null : t33.Y()) != null) {
            com.pinterest.api.model.g t34 = f30Var.t3();
            if ((t34 != null ? t34.Z() : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean M(f30 f30Var) {
        if (f30Var == null) {
            return false;
        }
        if (!n60.o.B(f30Var, "getIsPromoted(...)")) {
            Boolean F4 = f30Var.F4();
            Intrinsics.checkNotNullExpressionValue(F4, "getIsDownstreamPromotion(...)");
            if (!F4.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean N(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Integer g13 = g(pin);
        int value = u22.l.DIRECT_TO_DESTINATION.getValue();
        if (g13 != null && g13.intValue() == value) {
            Boolean b53 = pin.b5();
            Intrinsics.checkNotNullExpressionValue(b53, "getIsPremiere(...)");
            if (b53.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean O(f30 f30Var) {
        return (f30Var == null || !n60.o.B(f30Var, "getIsPromoted(...)") || f30Var.F4().booleanValue()) ? false : true;
    }

    public final boolean P(f30 f30Var) {
        if (f30Var == null) {
            return false;
        }
        return X(f30Var);
    }

    public final boolean Q(f30 f30Var) {
        com.pinterest.api.model.g t33;
        ln e03;
        if (f30Var == null || (t33 = f30Var.t3()) == null || (e03 = t33.e0()) == null) {
            return false;
        }
        return e03.i().intValue() == ge0.c.SALES.getValue();
    }

    public final boolean R(f30 pin) {
        if (pin == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean d53 = pin.d5();
        Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
        if (!d53.booleanValue()) {
            return false;
        }
        Set set = b40.f35967a;
        Intrinsics.checkNotNullParameter(pin, "<this>");
        se0 g63 = pin.g6();
        Boolean x13 = g63 != null ? g63.x() : null;
        return (x13 != null && x13.booleanValue()) || b40.I0(pin);
    }

    public final boolean S(f30 f30Var) {
        if (f30Var == null) {
            return false;
        }
        return Z(f30Var);
    }

    public final boolean T(f30 f30Var) {
        return (f30Var != null ? f30Var.u6() : null) != null && U(f30Var);
    }

    public final boolean U(f30 f30Var) {
        if (f30Var == null) {
            return false;
        }
        return a0(f30Var);
    }

    public final boolean V(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean P5 = pin.P5();
        Intrinsics.checkNotNullExpressionValue(P5, "getPromotedIsLeadAd(...)");
        if (P5.booleanValue()) {
            n90 W5 = pin.W5();
            String t13 = W5 != null ? W5.t() : null;
            if (t13 == null || t13.length() == 0) {
                n90 W52 = pin.W5();
                String u13 = W52 != null ? W52.u() : null;
                if (u13 == null || u13.length() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean W(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean d53 = pin.d5();
        Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
        return d53.booleanValue() && b40.r0(pin);
    }

    public final boolean X(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean S5 = pin.S5();
        Intrinsics.checkNotNullExpressionValue(S5, "getPromotedIsQuiz(...)");
        return S5.booleanValue() && pin.Z5() != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r0.booleanValue() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(com.pinterest.api.model.f30 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Boolean r0 = r3.d5()
            java.lang.String r1 = "getIsPromoted(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L23
            java.lang.Boolean r0 = r3.F4()
            java.lang.String r1 = "getIsDownstreamPromotion(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
        L23:
            boolean r3 = com.pinterest.api.model.b40.X0(r3)
            if (r3 == 0) goto L2b
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: es.c.Y(com.pinterest.api.model.f30):boolean");
    }

    public final boolean Z(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean U5 = pin.U5();
        Intrinsics.checkNotNullExpressionValue(U5, "getPromotedIsShowcase(...)");
        return U5.booleanValue();
    }

    public final cs.c a(f30 f30Var) {
        f3 z33;
        f3.a I;
        Object obj;
        md O3;
        md.a l13;
        cs.b bVar = cs.c.Companion;
        int value = (f30Var == null || (O3 = f30Var.O3()) == null || (l13 = O3.l()) == null) ? (f30Var == null || (z33 = f30Var.z3()) == null || (I = z33.I()) == null) ? 0 : I.getValue() : l13.getValue();
        bVar.getClass();
        Iterator<E> it = cs.c.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((cs.c) obj).getValue() == value) {
                break;
            }
        }
        cs.c cVar = (cs.c) obj;
        return cVar == null ? cs.c.HERO_AND_CHIPS : cVar;
    }

    public final boolean a0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return b40.Q0(pin) && n60.o.B(pin, "getIsPromoted(...)");
    }

    public final String b(int i13, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        cc J3 = pin.J3();
        if (J3 == null) {
            return null;
        }
        List d2 = J3.d();
        l30 l30Var = d2 != null ? (l30) CollectionsKt.U(i13, d2) : null;
        if (l30Var != null) {
            return l30Var.n();
        }
        return null;
    }

    public final boolean b0(f30 pin) {
        com.pinterest.api.model.k L;
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        return ((t33 == null || (L = t33.L()) == null) ? null : L.i()) == k.b.LEAD;
    }

    public final String c(f30 f30Var) {
        com.pinterest.api.model.g t33;
        ln e03;
        com.pinterest.api.model.g t34;
        ln e04;
        if (f30Var == null || (t33 = f30Var.t3()) == null || (e03 = t33.e0()) == null) {
            return null;
        }
        if (e03.i().intValue() != ge0.c.DEAL.getValue() || (t34 = f30Var.t3()) == null || (e04 = t34.e0()) == null) {
            return null;
        }
        return e04.g();
    }

    public final boolean c0(f30 pin) {
        com.pinterest.api.model.k L;
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        return ((t33 == null || (L = t33.L()) == null) ? null : L.i()) == k.b.CAROUSEL;
    }

    public final bu0 d(f30 pin) {
        List N;
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 == null || (N = t33.N()) == null) {
            return null;
        }
        return (bu0) CollectionsKt.firstOrNull(N);
    }

    public final boolean d0(f30 pin) {
        com.pinterest.api.model.k L;
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        return ((t33 == null || (L = t33.L()) == null) ? null : L.i()) == k.b.QUIZ;
    }

    public final String e(f30 f30Var) {
        com.pinterest.api.model.g t33;
        com.pinterest.api.model.r n03;
        Map m13;
        return (String) ((f30Var == null || (t33 = f30Var.t3()) == null || (n03 = t33.n0()) == null || (m13 = n03.m()) == null) ? null : m13.get(String.valueOf(h92.c.GAM_AD_UNIT_ID.getValue())));
    }

    public final boolean e0(f30 pin) {
        com.pinterest.api.model.k L;
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        return ((t33 == null || (L = t33.L()) == null) ? null : L.k()) == k.d.VIDEO;
    }

    public final String f(f30 f30Var) {
        com.pinterest.api.model.g t33;
        com.pinterest.api.model.r n03;
        Map m13;
        return (String) ((f30Var == null || (t33 = f30Var.t3()) == null || (n03 = t33.n0()) == null || (m13 = n03.m()) == null) ? null : m13.get(String.valueOf(h92.c.GAM_AD_CHOICE_URL.getValue())));
    }

    public final boolean f0(f30 pin) {
        com.pinterest.api.model.k L;
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        return ((t33 == null || (L = t33.L()) == null) ? null : L.i()) == k.b.SHOWCASE;
    }

    public final Integer g(f30 f30Var) {
        com.pinterest.api.model.g t33;
        if (f30Var == null || (t33 = f30Var.t3()) == null) {
            return null;
        }
        Integer d03 = t33.d0();
        if (n60.o.B(f30Var, "getIsPromoted(...)")) {
            return d03;
        }
        return null;
    }

    public final boolean g0(f30 pin) {
        com.pinterest.api.model.k L;
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        return ((t33 == null || (L = t33.L()) == null) ? null : L.h()) == k.a.IDEA;
    }

    public final String h(f30 f30Var) {
        com.pinterest.api.model.g t33;
        ln e03;
        String j13;
        if (f30Var == null || (t33 = f30Var.t3()) == null || (e03 = t33.e0()) == null || (j13 = e03.j()) == null || !n60.o.B(f30Var, "getIsPromoted(...)")) {
            return null;
        }
        return j13;
    }

    public final boolean h0(f30 f30Var) {
        Integer m63 = f30Var.m6();
        if (m63.intValue() == v22.c.IAB.getValue()) {
            return true;
        }
        if (m63.intValue() == v22.c.IAB_TRIGGER.getValue()) {
            return true;
        }
        return m63.intValue() == v22.c.APP_STORE_TRIGGER.getValue();
    }

    public final String i(f30 f30Var) {
        com.pinterest.api.model.g t33;
        pe U;
        if (f30Var == null || (t33 = f30Var.t3()) == null || (U = t33.U()) == null) {
            return null;
        }
        return U.g();
    }

    public final boolean i0(f30 f30Var) {
        Integer m63 = f30Var != null ? f30Var.m6() : null;
        int value = v22.c.NBF.getValue();
        if (m63 != null && m63.intValue() == value) {
            return true;
        }
        return m63 != null && m63.intValue() == v22.c.NBF_TRIGGER.getValue();
    }

    public final String j(f30 pin) {
        String s13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        wz m13 = m(pin);
        if (m13 != null && (s13 = m13.s()) != null) {
            return s13;
        }
        wz n13 = n(pin);
        if (n13 != null) {
            return n13.s();
        }
        return null;
    }

    public final boolean j0(f30 f30Var) {
        if (f30Var == null) {
            return false;
        }
        com.pinterest.api.model.g t33 = f30Var.t3();
        if ((t33 != null ? t33.Y() : null) == null) {
            return false;
        }
        com.pinterest.api.model.g t34 = f30Var.t3();
        return (t34 != null ? t34.Z() : null) != null;
    }

    public final String k(f30 pin) {
        String r13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        wz m13 = m(pin);
        if (m13 == null || (r13 = m13.r()) == null) {
            wz n13 = n(pin);
            r13 = n13 != null ? n13.r() : null;
        }
        String j13 = j(pin);
        if (r13 == null || j13 == null || Intrinsics.d(r13, j13)) {
            return null;
        }
        return r13;
    }

    public final boolean k0(f30 f30Var) {
        f3 z33 = f30Var.z3();
        if ((z33 != null ? z33.I() : null) == null) {
            md O3 = f30Var.O3();
            if ((O3 != null ? O3.l() : null) == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l(int r3, com.pinterest.api.model.f30 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.pinterest.api.model.cc r0 = r4.J3()
            r1 = 0
            if (r0 == 0) goto L21
            java.util.List r0 = r0.d()
            if (r0 == 0) goto L19
            java.lang.Object r3 = kotlin.collections.CollectionsKt.U(r3, r0)
            com.pinterest.api.model.l30 r3 = (com.pinterest.api.model.l30) r3
            goto L1a
        L19:
            r3 = r1
        L1a:
            if (r3 == 0) goto L21
            java.lang.String r3 = r3.o()
            goto L22
        L21:
            r3 = r1
        L22:
            if (r3 == 0) goto L2f
            boolean r0 = kotlin.text.z.j(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L2d
            r1 = r3
        L2d:
            if (r1 != 0) goto L33
        L2f:
            java.lang.String r1 = r4.M5()
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: es.c.l(int, com.pinterest.api.model.f30):java.lang.String");
    }

    public final boolean l0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean d53 = pin.d5();
        Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
        return d53.booleanValue() && pin.B3() != null;
    }

    public final String o(f30 f30Var) {
        com.pinterest.api.model.g t33;
        ln e03;
        com.pinterest.api.model.g t34;
        ln e04;
        if (f30Var == null || (t33 = f30Var.t3()) == null || (e03 = t33.e0()) == null) {
            return null;
        }
        if (e03.i().intValue() != ge0.c.SALES.getValue() || (t34 = f30Var.t3()) == null || (e04 = t34.e0()) == null) {
            return null;
        }
        return e04.g();
    }

    public final String p(f30 f30Var) {
        com.pinterest.api.model.g t33;
        ln e03;
        List y13;
        we0 we0Var;
        wz u13;
        ln e04;
        String g13;
        if (f30Var == null || (t33 = f30Var.t3()) == null || (e03 = t33.e0()) == null) {
            return null;
        }
        if (e03.i().intValue() != ge0.c.SALES.getValue()) {
            return null;
        }
        com.pinterest.api.model.g t34 = f30Var.t3();
        if (t34 != null && (e04 = t34.e0()) != null && (g13 = e04.g()) != null) {
            return g13;
        }
        se0 g63 = f30Var.g6();
        if (g63 == null || (y13 = g63.y()) == null || (we0Var = (we0) CollectionsKt.firstOrNull(y13)) == null || (u13 = we0Var.u()) == null) {
            return null;
        }
        return u13.q();
    }

    public final Float q(f30 f30Var, Function0 isPintagDecanEnabledAndActivate) {
        f3 z33;
        Float valueOf;
        Intrinsics.checkNotNullParameter(isPintagDecanEnabledAndActivate, "isPintagDecanEnabledAndActivate");
        if (!w(f30Var, isPintagDecanEnabledAndActivate)) {
            return null;
        }
        if (f30Var != null && Intrinsics.d(f30Var.d5(), Boolean.TRUE) && ((Boolean) isPintagDecanEnabledAndActivate.invoke()).booleanValue()) {
            md O3 = f30Var.O3();
            if (O3 != null) {
                valueOf = Float.valueOf((float) O3.n().doubleValue());
            }
            valueOf = null;
        } else {
            if (f30Var != null && (z33 = f30Var.z3()) != null) {
                valueOf = Float.valueOf((float) z33.O().doubleValue());
            }
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        float floatValue = valueOf.floatValue();
        if (floatValue == 0.0f) {
            return null;
        }
        return Float.valueOf(floatValue);
    }

    public final boolean r(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        int a13 = ((j80.b) this.f59979a).a(pin);
        Intrinsics.checkNotNullParameter(pin, "pin");
        return j1.U0(l(a13, pin));
    }

    public final boolean s(f30 f30Var) {
        l0 w33 = f30Var.w3();
        Boolean F = w33 != null ? w33.F() : null;
        if (F == null) {
            return false;
        }
        return F.booleanValue();
    }

    public final boolean t(f30 pin) {
        com.pinterest.api.model.r n03;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        zt0 j13 = (t33 == null || (n03 = t33.n0()) == null) ? null : n03.j();
        if (j13 != null) {
            return Intrinsics.d(j13.c(), Boolean.TRUE);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0.intValue() == com.pinterest.api.model.k.b.VIDEO.getValue()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(com.pinterest.api.model.f30 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.pinterest.api.model.g r0 = r3.t3()
            if (r0 == 0) goto L1c
            java.lang.Integer r0 = r0.V()
            com.pinterest.api.model.k$b r1 = com.pinterest.api.model.k.b.VIDEO
            int r1 = r1.getValue()
            int r0 = r0.intValue()
            if (r0 != r1) goto L1c
            goto L32
        L1c:
            com.pinterest.api.model.g r3 = r3.t3()
            if (r3 == 0) goto L34
            java.lang.Integer r3 = r3.V()
            com.pinterest.api.model.k$b r0 = com.pinterest.api.model.k.b.MAXVIDEO
            int r0 = r0.getValue()
            int r3 = r3.intValue()
            if (r3 != r0) goto L34
        L32:
            r3 = 1
            goto L35
        L34:
            r3 = 0
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: es.c.u(com.pinterest.api.model.f30):boolean");
    }

    public final boolean v(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return M(pin) && b40.X0(pin) && !pin.R4().booleanValue();
    }

    public final boolean w(f30 f30Var, Function0 isPintagDecanEnabledAndActivate) {
        f3 z33;
        Integer D;
        Intrinsics.checkNotNullParameter(isPintagDecanEnabledAndActivate, "isPintagDecanEnabledAndActivate");
        c32.c cVar = null;
        if (f30Var != null && Intrinsics.d(f30Var.d5(), Boolean.TRUE) && ((Boolean) isPintagDecanEnabledAndActivate.invoke()).booleanValue()) {
            md O3 = f30Var.O3();
            if (O3 != null) {
                D = O3.j();
            }
            D = null;
        } else {
            if (f30Var != null && (z33 = f30Var.z3()) != null) {
                D = z33.D();
            }
            D = null;
        }
        if (D == null) {
            return false;
        }
        int intValue = D.intValue();
        c32.c.Companion.getClass();
        if (intValue == 0) {
            cVar = c32.c.UNDEFINED;
        } else if (intValue == 1) {
            cVar = c32.c.CATALOG_COLLECTION;
        } else if (intValue == 2) {
            cVar = c32.c.SLIDESHOW_CATALOG_COLLECTION;
        }
        return cVar != null && cVar == c32.c.SLIDESHOW_CATALOG_COLLECTION;
    }

    public final boolean x(f30 f30Var) {
        com.pinterest.api.model.g t33;
        if (f30Var != null && Intrinsics.d(f30Var.d5(), Boolean.TRUE) && (t33 = f30Var.t3()) != null) {
            if (t33.V().intValue() == k.b.COLLAGE.getValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean y(f30 f30Var) {
        if (f30Var == null || !Intrinsics.d(f30Var.d5(), Boolean.TRUE)) {
            return false;
        }
        is.a aVar = is.b.Companion;
        com.pinterest.api.model.g t33 = f30Var.t3();
        Integer T = t33 != null ? t33.T() : null;
        aVar.getClass();
        is.b a13 = is.a.a(T);
        int i13 = a13 == null ? -1 : b.f59978a[a13.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return false;
        }
        return i13 == 3 || i13 == 4;
    }

    public final boolean z(f30 f30Var) {
        com.pinterest.api.model.g t33;
        if (y(f30Var)) {
            is.a aVar = is.b.Companion;
            Integer T = (f30Var == null || (t33 = f30Var.t3()) == null) ? null : t33.T();
            aVar.getClass();
            if (is.a.a(T) != is.b.DL_COLLECTION_NO_ICON) {
                return true;
            }
        }
        return false;
    }
}
