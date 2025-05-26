package com.pinterest.api.model;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class b40 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f35967a = kotlin.collections.h1.f("article", "recipe", "product", "tutorial");

    /* renamed from: b, reason: collision with root package name */
    public static final Set f35968b = kotlin.collections.h1.f(bi0.c.FOLLOWED_INTEREST, bi0.c.LANDING_PAGE_PINS, bi0.c.FOLLOWING_FEED, bi0.c.RECENT_FOLLOWED_BOARD, bi0.c.EVERYTHING_FEED, bi0.c.POPULAR_FEED, bi0.c.PROMOTED_PIN, bi0.c.DARK_PROMOTED_PIN, bi0.c.COMMERCE_EDUCATION);

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f35969c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f35970d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f35971e;

    static {
        kotlin.collections.h1.f(bi0.c.INSTANT_PFY_NON_MATERIALIZABLE, bi0.c.NAVBOOST_PFY, bi0.c.FRESH_REPIN_BOARD, bi0.c.REPIN_BOARD, bi0.c.NAVBOOST_P2P, bi0.c.FRESH_CLICKTHROUGH, bi0.c.CLICKTHROUGH, bi0.c.LOCAL_REPIN_BOARD, bi0.c.P2P, bi0.c.FRESH_USER_ACTIVITY, bi0.c.GRAPHSAGE_USER_EMBEDDINGS_TO_ORGANIC_PINS);
        f35969c = new LinkedHashMap();
        f35970d = new LinkedHashMap();
        f35971e = new LinkedHashSet();
    }

    public static final r40 A(f30 f30Var) {
        oe0 f63;
        if (f30Var == null || (f63 = f30Var.f6()) == null) {
            return null;
        }
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        s10.a w03 = kotlin.jvm.internal.r.w0(f63, uid, f30Var.g6());
        if (w03 != null) {
            return w03;
        }
        String uid2 = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        t10.f x03 = kotlin.jvm.internal.r.x0(f63, uid2);
        if (x03 != null) {
            return x03;
        }
        String uid3 = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
        return kotlin.jvm.internal.r.p0(f63, uid3);
    }

    public static final boolean A0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        oc0 d63 = f30Var.d6();
        if (d63 != null) {
            return Intrinsics.d("FOLLOWED_INTEREST", d63.j()) || Intrinsics.d("RECOMMENDED_LOCAL_PIN", d63.j());
        }
        return false;
    }

    public static final List B(f30 f30Var) {
        List s13;
        uo0 uo0Var;
        List t13;
        uo0 uo0Var2;
        List s14;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        dl0 v63 = f30Var.v6();
        if (v63 != null && (t13 = v63.t()) != null && (uo0Var2 = (uo0) CollectionsKt.U(0, t13)) != null && (s14 = uo0Var2.s()) != null) {
            return s14;
        }
        dl0 v64 = f30Var.v6();
        List s15 = (v64 == null || (s13 = v64.s()) == null || (uo0Var = (uo0) CollectionsKt.U(0, s13)) == null) ? null : uo0Var.s();
        return s15 == null ? f30Var.y5() : s15;
    }

    public static final boolean B0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (!T0(f30Var)) {
            Boolean Q5 = f30Var.Q5();
            Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
            if (!Q5.booleanValue()) {
                Boolean S4 = f30Var.S4();
                Intrinsics.checkNotNullExpressionValue(S4, "getIsFullWidth(...)");
                if (!S4.booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final String C(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 z53 = f30Var.z5();
        if (z53 != null) {
            return z53.getUid();
        }
        return null;
    }

    public static final boolean C0(f30 f30Var) {
        dl0 v63;
        dl0 v64;
        List s13;
        uo0 uo0Var;
        List t13;
        uo0 uo0Var2;
        if (f30Var == null) {
            return false;
        }
        Boolean p63 = f30Var.p6();
        Intrinsics.checkNotNullExpressionValue(p63, "getShouldMute(...)");
        return p63.booleanValue() || !(((v63 = f30Var.v6()) == null || (t13 = v63.t()) == null || (uo0Var2 = (uo0) CollectionsKt.U(0, t13)) == null || !Intrinsics.d(uo0Var2.t(), Boolean.TRUE)) && ((v64 = f30Var.v6()) == null || (s13 = v64.s()) == null || (uo0Var = (uo0) CollectionsKt.U(0, s13)) == null || !Intrinsics.d(uo0Var.t(), Boolean.TRUE)));
    }

    public static final z42.r D(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (X0(f30Var)) {
            return z42.r.VIDEO;
        }
        Boolean n53 = f30Var.n5();
        Intrinsics.checkNotNullExpressionValue(n53, "getIsVirtualTryOn(...)");
        return n53.booleanValue() ? z42.r.VIRTUAL_TRY_ON_IMAGE : z42.r.SINGLE_IMAGE;
    }

    public static final boolean D0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        gn m43 = f30Var.m4();
        String g13 = m43 != null ? m43.g() : null;
        if (g13 == null) {
            g13 = "";
        }
        return Intrinsics.d("gif", g13);
    }

    public static final String E(f30 f30Var) {
        String H;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        pz0 u53 = f30Var.u5();
        if (u53 != null && (H = kg.t.H(u53)) != null) {
            return H;
        }
        hh t53 = f30Var.t5();
        if (t53 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(t53, "<this>");
        wy0 d2 = t53.d();
        if (d2 != null) {
            return d2.Z2();
        }
        return null;
    }

    public static final boolean E0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return k0(f30Var) > h0(f30Var);
    }

    public static final wy0 F(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean e53 = f30Var.e5();
        Intrinsics.checkNotNullExpressionValue(e53, "getIsRepin(...)");
        return e53.booleanValue() ? f30Var.C5() : f30Var.I5();
    }

    public static final boolean F0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        dl0 v63 = f30Var.v6();
        if (v63 != null) {
            return Intrinsics.d(v63.o(), Boolean.TRUE);
        }
        return false;
    }

    public static final LinkedHashMap G(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map A4 = f30Var.A4();
        if (A4 != null) {
            for (Map.Entry entry : A4.entrySet()) {
                String str = (String) entry.getKey();
                sr srVar = (sr) entry.getValue();
                e40 e40Var = new e40();
                e40Var.h(srVar.j());
                e40Var.g(Integer.valueOf((int) srVar.h().doubleValue()));
                e40Var.j(Integer.valueOf((int) srVar.k().doubleValue()));
                e40Var.f37174a = f30Var.getUid();
                Intrinsics.f(str);
                linkedHashMap.put(str, e40Var);
            }
        }
        return linkedHashMap;
    }

    public static final boolean G0(f30 f30Var) {
        dl0 v63;
        dl0 v64;
        List t13;
        if (f30Var == null || (v63 = f30Var.v6()) == null) {
            return false;
        }
        boolean[] zArr = v63.f36889m;
        return (zArr.length > 6 && zArr[6]) && d0(f30Var) == 1 && !f30Var.d5().booleanValue() && (v64 = f30Var.v6()) != null && (t13 = v64.t()) != null && (t13.isEmpty() ^ true);
    }

    public static final String H(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 I5 = f30Var.I5();
        String uid = I5 != null ? I5.getUid() : null;
        return uid == null ? "" : uid;
    }

    public static final boolean H0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return (f30Var.d5().booleanValue() || f30Var.F4().booleanValue() || !X0(f30Var)) ? false : true;
    }

    public static final String I(f30 f30Var) {
        String h10;
        if (f30Var != null && (h10 = h(f30Var)) != null && StringsKt.E(h10, "play.google.com/store/apps/details", false)) {
            try {
                String queryParameter = Uri.parse(h10).getQueryParameter("id");
                if (queryParameter != null) {
                    if (queryParameter.length() != 0) {
                        return queryParameter;
                    }
                }
            } catch (Exception e13) {
                String m13 = a.a.m("Pin (id=", f30Var.getUid(), ", link=", h10, ") could not be parsed to check if it is an App Pin.");
                HashSet hashSet = tb0.h.f117076w;
                tb0.h hVar = tb0.g.f117075a;
                hVar.h(m13);
                hVar.q(e13, m13, tb0.p.PLAY_SERVICES);
            }
        }
        return null;
    }

    public static final boolean I0(f30 f30Var) {
        List r13;
        int size;
        List y13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 g63 = f30Var.g6();
        if (g63 == null || (y13 = g63.y()) == null) {
            oe0 f63 = f30Var.f6();
            if (f63 != null && (r13 = f63.r()) != null) {
                size = r13.size();
            }
        }
        size = y13.size();
        return size > 0;
    }

    public static final String J(f30 f30Var) {
        List r13;
        h80 h80Var;
        wz p13;
        wz u13;
        String r14;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        we0 we0Var = (we0) CollectionsKt.firstOrNull(Z(f30Var));
        if (we0Var != null && (u13 = we0Var.u()) != null && (r14 = u13.r()) != null) {
            return r14;
        }
        oe0 f63 = f30Var.f6();
        if (f63 == null || (r13 = f63.r()) == null || (h80Var = (h80) CollectionsKt.firstOrNull(r13)) == null || (p13 = h80Var.p()) == null) {
            return null;
        }
        return p13.r();
    }

    public static final boolean J0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (!I0(f30Var)) {
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            se0 g63 = f30Var.g6();
            Boolean x13 = g63 != null ? g63.x() : null;
            if (x13 == null || !x13.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Integer K(int i13, f30 f30Var) {
        v2 s13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 M = M(i13, f30Var);
        if (M == null || (s13 = M.s()) == null) {
            return null;
        }
        return s13.g();
    }

    public static final boolean K0(f30 f30Var) {
        if (f30Var != null) {
            se0 g63 = f30Var.g6();
            if (Intrinsics.d("recipe", g63 != null ? g63.A() : null)) {
                return true;
            }
        }
        return false;
    }

    public static final float L(int i13, f30 f30Var) {
        v2 s13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (!K0(f30Var) && !f30Var.M4().booleanValue() && !f30Var.d5().booleanValue()) {
            return 0.0f;
        }
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 M = M(i13, f30Var);
        String str = null;
        if (M != null && (s13 = M.s()) != null) {
            str = s13.h();
        }
        if (str == null) {
            str = "";
        }
        Pair a13 = u10.a.a(str);
        if (((Boolean) a13.f80346a).booleanValue()) {
            return ((Number) a13.f80347b).floatValue();
        }
        return 0.0f;
    }

    public static final boolean L0(f30 f30Var) {
        fi0 r63;
        return (f30Var == null || b1(f30Var) || (r63 = f30Var.r6()) == null || !Intrinsics.d(r63.L(), Boolean.TRUE)) ? false : true;
    }

    public static final se0 M(int i13, f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return ((l30) k(f30Var).get(i13)).w();
    }

    public static final boolean M0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return !f30Var.T5().booleanValue();
    }

    public static final wy0 N(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 a63 = f30Var.a6();
        if (a63 != null) {
            return (a63.Z2() != null || f30Var.I5() == null) ? a63 : f30Var.I5();
        }
        return null;
    }

    public static final boolean N0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        f3 z33 = f30Var.z3();
        Boolean L = z33 != null ? z33.L() : null;
        if (L == null) {
            return false;
        }
        return L.booleanValue();
    }

    public static final v32.c O(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        v32.a aVar = v32.c.Companion;
        Integer b63 = f30Var.b6();
        Intrinsics.checkNotNullExpressionValue(b63, "getReactionByMe(...)");
        int intValue = b63.intValue();
        aVar.getClass();
        v32.c a13 = v32.a.a(intValue);
        return a13 == null ? v32.c.NONE : a13;
    }

    public static final boolean O0(f30 f30Var) {
        return (f30Var == null || f30Var.r6() == null || f30Var.d5().booleanValue() || f30Var.M4().booleanValue() || s0(f30Var)) ? false : true;
    }

    public static final Map P(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Map c63 = f30Var.c6();
        if (c63 == null) {
            return kotlin.collections.z0.d();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : c63.entrySet()) {
            v32.a aVar = v32.c.Companion;
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            int parseInt = Integer.parseInt((String) key);
            aVar.getClass();
            if (v32.a.a(parseInt) != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str = (String) entry2.getKey();
            Integer num = (Integer) entry2.getValue();
            v32.a aVar2 = v32.c.Companion;
            Intrinsics.f(str);
            int parseInt2 = Integer.parseInt(str);
            aVar2.getClass();
            v32.c a13 = v32.a.a(parseInt2);
            Intrinsics.f(a13);
            Intrinsics.f(num);
            linkedHashMap.put(a13, num);
        }
        return linkedHashMap;
    }

    public static final boolean P0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (Q0(f30Var)) {
            boolean[] zArr = f30Var.f37485h3;
            if (zArr.length > 186 && zArr[186] && !f30Var.q6().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final bi0.c Q(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        try {
            return bi0.c.valueOf(reason);
        } catch (Exception unused) {
            return bi0.c.UNKNOWN;
        }
    }

    public static final boolean Q0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return f30Var.w6() != null;
    }

    public static final int R(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return Q(reason).getValue();
    }

    public static final boolean R0(f30 f30Var) {
        uo0 uo0Var;
        List t13;
        List s13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (!Q0(f30Var)) {
            return false;
        }
        dl0 v63 = f30Var.v6();
        if (v63 == null || (s13 = v63.s()) == null || (uo0Var = (uo0) s13.get(0)) == null) {
            dl0 v64 = f30Var.v6();
            uo0Var = (v64 == null || (t13 = v64.t()) == null) ? null : (uo0) t13.get(0);
        }
        if (uo0Var != null) {
            return com.bumptech.glide.d.c0(uo0Var);
        }
        return false;
    }

    public static final String S(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 g63 = f30Var.g6();
        if (g63 != null) {
            return g63.v();
        }
        return null;
    }

    public static final boolean S0(f30 f30Var) {
        g t33;
        if (f30Var == null || (t33 = f30Var.t3()) == null) {
            return false;
        }
        return t33.k0().intValue() == gb0.f.TARGET_HANDSHAKE.getValue();
    }

    public static final String T(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 g63 = f30Var.g6();
        if (g63 == null) {
            return null;
        }
        String t13 = g63.t();
        return t13 == null ? g63.w() : t13;
    }

    public static final boolean T0(f30 f30Var) {
        g t33;
        r n03;
        return (f30Var == null || (t33 = f30Var.t3()) == null || (n03 = t33.n0()) == null || n03.k().intValue() != 0) ? false : true;
    }

    public static final String U(f30 f30Var) {
        v2 s13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 g63 = f30Var.g6();
        if (g63 == null || (s13 = g63.s()) == null) {
            return null;
        }
        return s13.h();
    }

    public static final boolean U0(f30 f30Var) {
        g t33;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean i53 = f30Var.i5();
        Intrinsics.checkNotNullExpressionValue(i53, "getIsThirdPartyAd(...)");
        if (i53.booleanValue() && (t33 = f30Var.t3()) != null) {
            if (t33.d0().intValue() == u22.l.CLOSEUP.getValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Integer V(f30 f30Var) {
        v2 s13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 g63 = f30Var.g6();
        int intValue = ((g63 == null || (s13 = g63.s()) == null) ? 0 : s13.g()).intValue();
        return intValue > 0 ? Integer.valueOf(intValue) : X(f30Var);
    }

    public static final boolean V0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        h32.j3 j3Var = h32.l3.Companion;
        Integer K6 = f30Var.K6();
        Intrinsics.checkNotNullExpressionValue(K6, "getVideoStatus(...)");
        int intValue = K6.intValue();
        j3Var.getClass();
        h32.l3 a13 = h32.j3.a(intValue);
        return (a13 == null || a13 == h32.l3.SUCCESS) ? false : true;
    }

    public static final float W(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (!K0(f30Var) && !f30Var.M4().booleanValue() && !f30Var.d5().booleanValue()) {
            return 0.0f;
        }
        String U = U(f30Var);
        if (U == null) {
            U = "";
        }
        Pair a13 = u10.a.a(U);
        if (((Boolean) a13.f80346a).booleanValue()) {
            return ((Number) a13.f80347b).floatValue();
        }
        return 0.0f;
    }

    public static final boolean W0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean k53 = f30Var.k5();
        Intrinsics.checkNotNullExpressionValue(k53, "getIsUnsafe(...)");
        if (!k53.booleanValue()) {
            Boolean W4 = f30Var.W4();
            Intrinsics.checkNotNullExpressionValue(W4, "getIsHidden(...)");
            if (!W4.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Integer X(f30 f30Var) {
        v2 s13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 g63 = f30Var.g6();
        if (g63 == null || (s13 = g63.s()) == null) {
            return null;
        }
        return s13.i();
    }

    public static final boolean X0(f30 f30Var) {
        String i03;
        String s13;
        String s14;
        if (f30Var != null && (i03 = i0(f30Var)) != null && df.j1.U0(i03)) {
            b01 M6 = f30Var.M6();
            h01 W = M6 != null ? d7.b.W(M6) : null;
            if (W != null && (s14 = W.s()) != null && s14.length() != 0 && W.n().doubleValue() != 0.0d && W.t().doubleValue() != 0.0d) {
                return true;
            }
            if (a1(f30Var, true)) {
                b01 M62 = f30Var.M6();
                h01 W2 = M62 != null ? d7.b.W(M62) : null;
                if (W2 != null && (s13 = W2.s()) != null && s13.length() != 0 && W2.n().doubleValue() != 0.0d && W2.t().doubleValue() != 0.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String Y(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 g63 = f30Var.g6();
        if (g63 != null) {
            return g63.z();
        }
        return null;
    }

    public static final t10.f Y0(f30 f30Var) {
        if (f30Var == null) {
            return null;
        }
        r40 p13 = p(f30Var);
        t10.f fVar = p13 instanceof t10.f ? (t10.f) p13 : null;
        r40 A = A(f30Var);
        t10.f fVar2 = A instanceof t10.f ? (t10.f) A : null;
        if (fVar != null) {
            return fVar;
        }
        if (fVar2 == null) {
            return null;
        }
        return fVar2;
    }

    public static final List Z(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 g63 = f30Var.g6();
        List y13 = g63 != null ? g63.y() : null;
        return y13 == null ? kotlin.collections.q0.f80391a : y13;
    }

    public static final void Z0(f30 f30Var, d40 value) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = f35970d;
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        linkedHashMap.put(uid, value);
    }

    public static final boolean a(f30 f30Var) {
        v7 D3;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return (Intrinsics.d("SECRET", f30Var.L5()) || ((D3 = f30Var.D3()) != null && kh2.d.M0(D3)) || f30Var.d5().booleanValue() || f30Var.F4().booleanValue() || f30Var.u6() != null || w(f30Var)) ? false : true;
    }

    public static final List a0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        List l63 = f30Var.l6();
        if (l63 != null) {
            Boolean T4 = f30Var.T4();
            Intrinsics.checkNotNullExpressionValue(T4, "getIsGhost(...)");
            if (T4.booleanValue()) {
                l63.add(Integer.valueOf(h32.e2.GHOST_PIN.getValue()));
            }
        } else {
            l63 = null;
        }
        if (l63 != null) {
            return l63;
        }
        Boolean T42 = f30Var.T4();
        Intrinsics.checkNotNullExpressionValue(T42, "getIsGhost(...)");
        return T42.booleanValue() ? kotlin.collections.e0.b(Integer.valueOf(h32.e2.GHOST_PIN.getValue())) : kotlin.collections.q0.f80391a;
    }

    public static final boolean a1(f30 f30Var, boolean z13) {
        b01 M6;
        b01 M62;
        b01 M63;
        b01 M64;
        b01 M65;
        Map g13;
        Map g14;
        Map g15;
        Map g16;
        Map g17;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return z13 && !(((M6 = f30Var.M6()) == null || (g17 = M6.g()) == null || !g17.containsKey("V_HEVC_MP4_T1_V2")) && (((M62 = f30Var.M6()) == null || (g16 = M62.g()) == null || !g16.containsKey("V_HEVC_MP4_T2_V2")) && (((M63 = f30Var.M6()) == null || (g15 = M63.g()) == null || !g15.containsKey("V_HEVC_MP4_T3_V2")) && (((M64 = f30Var.M6()) == null || (g14 = M64.g()) == null || !g14.containsKey("V_HEVC_MP4_T4_V2")) && ((M65 = f30Var.M6()) == null || (g13 = M65.g()) == null || !g13.containsKey("V_HEVC_MP4_T5_V2")))))) && !v(f30Var) && n60.o.y(f30Var, "getIsThirdPartyAd(...)") && n60.o.B(f30Var, "getIsPromoted(...)");
    }

    public static final boolean b(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return a(f30Var) && Q0(f30Var);
    }

    public static final boolean b0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        oc0 d63 = f30Var.d6();
        String j13 = d63 != null ? d63.j() : null;
        if (j13 == null || kotlin.text.z.j(j13)) {
            return false;
        }
        return !f35968b.contains(Q(j13));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b1(com.pinterest.api.model.f30 r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = O0(r4)
            r1 = 0
            if (r0 == 0) goto L50
            com.pinterest.api.model.fi0 r4 = r4.r6()
            if (r4 == 0) goto L50
            java.lang.Integer r4 = r4.P()
            h32.p r0 = h32.p.IPHONE_SHUFFLES
            int r0 = r0.getValue()
            int r2 = r4.intValue()
            r3 = 1
            if (r2 != r0) goto L24
            goto L3d
        L24:
            h32.p r0 = h32.p.IPAD_SHUFFLES
            int r0 = r0.getValue()
            int r2 = r4.intValue()
            if (r2 != r0) goto L31
            goto L3d
        L31:
            h32.p r0 = h32.p.ANDROID_MOBILE_SHUFFLES
            int r0 = r0.getValue()
            int r2 = r4.intValue()
            if (r2 != r0) goto L3f
        L3d:
            r4 = r3
            goto L4d
        L3f:
            h32.p r0 = h32.p.ANDROID_TABLET_SHUFFLES
            int r0 = r0.getValue()
            int r4 = r4.intValue()
            if (r4 != r0) goto L4c
            goto L3d
        L4c:
            r4 = r1
        L4d:
            if (r4 == 0) goto L50
            r1 = r3
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.api.model.b40.b1(com.pinterest.api.model.f30):boolean");
    }

    public static final boolean c(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return a(f30Var) && X0(f30Var);
    }

    public static final boolean c0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return (f30Var.a6() == null || f30Var.F4().booleanValue()) ? false : true;
    }

    public static final f30 d(f30 f30Var, boolean z13) {
        e3 H;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        f3 z33 = f30Var.z3();
        f3 f3Var = null;
        if (z33 != null && (H = z33.H()) != null) {
            d3 d3Var = new d3(H, 0);
            Integer valueOf = Integer.valueOf(dn.c.v(z33) + (z13 ? 1 : -1));
            d3Var.f36642a = valueOf;
            boolean[] zArr = d3Var.f36646e;
            if (zArr.length > 0) {
                zArr[0] = true;
            }
            e3 e3Var = new e3(valueOf, d3Var.f36643b, d3Var.f36644c, d3Var.f36645d, zArr, 0);
            Intrinsics.checkNotNullExpressionValue(e3Var, "build(...)");
            i3 P = z33.P();
            P.f38618h = e3Var;
            boolean[] zArr2 = P.f38629s;
            if (zArr2.length > 7) {
                zArr2[7] = true;
            }
            f3Var = P.a();
        }
        e30 R6 = f30Var.R6();
        R6.Z = Boolean.valueOf(z13);
        boolean[] zArr3 = R6.f37101h3;
        if (zArr3.length > 51) {
            zArr3[51] = true;
        }
        R6.h(f3Var);
        f30 a13 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static final int d0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        dl0 v63 = f30Var.v6();
        Integer r13 = v63 != null ? v63.r() : null;
        if (r13 == null) {
            return 0;
        }
        return r13.intValue();
    }

    public static final boolean e(f30 f30Var, String boardId) {
        v7 D3;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        return Intrinsics.d((f30Var == null || (D3 = f30Var.D3()) == null) ? null : D3.getUid(), boardId);
    }

    public static final int e0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Integer C6 = f30Var.C6();
        Intrinsics.checkNotNullExpressionValue(C6, "getTotalReactionCount(...)");
        return C6.intValue();
    }

    public static final List f(f30 f30Var) {
        List y13;
        we0 we0Var;
        List r13;
        h80 h80Var;
        List m13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        oe0 f63 = f30Var.f6();
        if (f63 != null && (r13 = f63.r()) != null && (h80Var = (h80) CollectionsKt.firstOrNull(r13)) != null && (m13 = h80Var.m()) != null) {
            return m13;
        }
        se0 g63 = f30Var.g6();
        if (g63 == null || (y13 = g63.y()) == null || (we0Var = (we0) CollectionsKt.firstOrNull(y13)) == null) {
            return null;
        }
        return we0Var.n();
    }

    public static final int f0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        f3 z33 = f30Var.z3();
        int v13 = z33 != null ? dn.c.v(z33) : 0;
        f3 z34 = f30Var.z3();
        return (z34 != null ? z34.F() : 0).intValue() + v13;
    }

    public static final String g(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        f3 z33 = f30Var.z3();
        String uid = z33 != null ? z33.getUid() : null;
        return uid == null ? "" : uid;
    }

    public static final String g0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        b01 M6 = f30Var.M6();
        String e13 = M6 != null ? M6.e() : null;
        return e13 == null ? "0.0" : e13;
    }

    public static final String h(f30 f30Var) {
        if (f30Var == null) {
            return null;
        }
        String D6 = f30Var.D6();
        return D6 == null ? f30Var.s5() : D6;
    }

    public static final double h0(f30 f30Var) {
        b01 M6;
        h01 W;
        Double n13 = (f30Var == null || (M6 = f30Var.M6()) == null || (W = d7.b.W(M6)) == null) ? null : W.n();
        if (n13 == null) {
            return 0.0d;
        }
        return n13.doubleValue();
    }

    public static final String i(f30 f30Var) {
        v7 D3;
        String uid = (f30Var == null || (D3 = f30Var.D3()) == null) ? null : D3.getUid();
        return uid == null ? "" : uid;
    }

    public static final String i0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        b01 M6 = f30Var.M6();
        if (M6 != null) {
            return M6.f();
        }
        return null;
    }

    public static final String j(int i13, f30 f30Var) {
        List y13;
        we0 we0Var;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 M = M(i13, f30Var);
        String t13 = (M == null || (y13 = M.y()) == null || (we0Var = (we0) CollectionsKt.firstOrNull(y13)) == null) ? null : we0Var.t();
        return t13 == null ? "" : t13;
    }

    public static final String j0(f30 f30Var) {
        b01 M6;
        h01 W;
        if (f30Var == null || (M6 = f30Var.M6()) == null || (W = d7.b.W(M6)) == null) {
            return null;
        }
        return W.s();
    }

    public static final List k(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        cc J3 = f30Var.J3();
        List d2 = J3 != null ? J3.d() : null;
        return d2 == null ? kotlin.collections.q0.f80391a : d2;
    }

    public static final double k0(f30 f30Var) {
        b01 M6;
        h01 W;
        Double t13 = (f30Var == null || (M6 = f30Var.M6()) == null || (W = d7.b.W(M6)) == null) ? null : W.t();
        if (t13 == null) {
            return 0.0d;
        }
        return t13.doubleValue();
    }

    public static final String l(f30 f30Var) {
        String n13;
        String n14;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String i43 = f30Var.i4();
        if (i43 == null || (n13 = kotlin.text.z.n(i43, "null", "")) == null || (n14 = kotlin.text.z.n(n13, "[", "")) == null) {
            return null;
        }
        return kotlin.text.z.n(n14, "]", "");
    }

    public static final boolean l0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Set set = f35967a;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 g63 = f30Var.g6();
        return CollectionsKt.L(set, g63 != null ? g63.A() : null) && df.j1.d1(T(f30Var)) && df.j1.d1(Y(f30Var));
    }

    public static final sr m(f30 f30Var) {
        hi0 s63;
        Map q13;
        if (f30Var == null || !s0(f30Var) || (s63 = f30Var.s6()) == null || (q13 = s63.q()) == null) {
            return null;
        }
        return (sr) q13.get("originals");
    }

    public static final boolean m0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Integer X = X(f30Var);
        return U(f30Var) != null && W(f30Var) > 0.0f && X != null && X.intValue() > 0;
    }

    public static final wy0 n(f30 f30Var) {
        wy0 c13;
        wy0 c14;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 wy0Var = null;
        if (I0(f30Var)) {
            pz0 u53 = f30Var.u5();
            if (u53 == null || (c14 = u53.c()) == null) {
                hh t53 = f30Var.t5();
                if (t53 != null) {
                    wy0Var = t53.d();
                }
            } else {
                wy0Var = c14;
            }
            if (wy0Var != null) {
                return wy0Var;
            }
            wy0 y63 = f30Var.y6();
            return y63 == null ? f30Var.z5() : y63;
        }
        wy0 z53 = f30Var.z5();
        if (z53 != null) {
            return z53;
        }
        pz0 u54 = f30Var.u5();
        if (u54 == null || (c13 = u54.c()) == null) {
            hh t54 = f30Var.t5();
            if (t54 != null) {
                wy0Var = t54.d();
            }
        } else {
            wy0Var = c13;
        }
        if (wy0Var != null) {
            return wy0Var;
        }
        wy0 y64 = f30Var.y6();
        if (y64 != null) {
            return y64;
        }
        wy0 C5 = f30Var.C5();
        if (C5 != null) {
            return C5;
        }
        wy0 F = F(f30Var);
        return F == null ? f30Var.I5() : F;
    }

    public static final boolean n0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        dl0 v63 = f30Var.v6();
        Boolean n13 = v63 != null ? v63.n() : null;
        if (n13 == null) {
            return false;
        }
        return n13.booleanValue();
    }

    public static final String o(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 n13 = n(f30Var);
        if (n13 != null) {
            return n13.getUid();
        }
        return null;
    }

    public static final boolean o0(f30 f30Var) {
        return (f30Var == null || !Intrinsics.d(f30Var.d5(), Boolean.TRUE) || Q0(f30Var)) ? false : true;
    }

    public static final r40 p(f30 f30Var) {
        cc J3;
        l30 l30Var;
        oe0 v13;
        if (f30Var == null || (J3 = f30Var.J3()) == null) {
            return null;
        }
        Integer e13 = J3.e();
        Intrinsics.checkNotNullExpressionValue(e13, "getIndex(...)");
        int intValue = e13.intValue();
        List d2 = J3.d();
        if (d2 == null || (l30Var = (l30) CollectionsKt.U(intValue, d2)) == null || (v13 = l30Var.v()) == null) {
            return null;
        }
        return kotlin.jvm.internal.r.u(v13);
    }

    public static final boolean p0(f30 f30Var) {
        g t33;
        if (f30Var == null || (t33 = f30Var.t3()) == null) {
            return false;
        }
        return t33.k0().intValue() == gb0.f.AMAZON_HANDSHAKE.getValue();
    }

    public static final String q(f30 f30Var) {
        List d2;
        String p13;
        if (f30Var == null) {
            return "";
        }
        if (r0(f30Var)) {
            cc J3 = f30Var.J3();
            if (J3 == null || (d2 = J3.d()) == null) {
                return "";
            }
            int size = d2.size();
            Integer e13 = J3.e();
            Intrinsics.checkNotNullExpressionValue(e13, "getIndex(...)");
            int intValue = e13.intValue();
            if (intValue < 0 || intValue >= size) {
                return "";
            }
            Integer e14 = J3.e();
            Intrinsics.checkNotNullExpressionValue(e14, "getIndex(...)");
            l30 l30Var = (l30) d2.get(e14.intValue());
            p13 = l30Var != null ? l30Var.p() : null;
            if (p13 == null) {
                return "";
            }
        } else {
            p13 = f30Var.c4();
            if (p13 == null) {
                return "";
            }
        }
        return p13;
    }

    public static final boolean q0(f30 f30Var) {
        String I = f30Var != null ? I(f30Var) : null;
        return !(I == null || I.length() == 0);
    }

    public static final String r(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        gn m43 = f30Var.m4();
        String f13 = m43 != null ? m43.f() : null;
        return f13 == null ? "" : f13;
    }

    public static final boolean r0(f30 f30Var) {
        List d2;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        cc J3 = f30Var.J3();
        return (J3 == null || (d2 = J3.d()) == null || !(d2.isEmpty() ^ true)) ? false : true;
    }

    public static final ArrayList s(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        List Q6 = f30Var.Q6();
        if (Q6 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Q6) {
            Boolean p13 = ((q11) obj).p();
            Intrinsics.checkNotNullExpressionValue(p13, "getIsStela(...)");
            if (p13.booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean s0(f30 f30Var) {
        return (f30Var == null || f30Var.s6() == null || f30Var.d5().booleanValue() || f30Var.M4().booleanValue()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r0[0] != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String t(com.pinterest.api.model.f30 r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.pinterest.api.model.oe0 r0 = r4.f6()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L2b
            java.util.List r0 = r0.r()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            com.pinterest.api.model.h80 r0 = (com.pinterest.api.model.h80) r0
            if (r0 == 0) goto L2b
            com.pinterest.api.model.xh0 r0 = r0.r()
            if (r0 == 0) goto L2b
            boolean[] r0 = r0.f43691d
            int r3 = r0.length
            if (r3 <= 0) goto L2b
            boolean r0 = r0[r1]
            if (r0 == 0) goto L2b
            goto L4e
        L2b:
            com.pinterest.api.model.se0 r0 = r4.g6()
            if (r0 == 0) goto L8f
            java.util.List r0 = r0.y()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            com.pinterest.api.model.we0 r0 = (com.pinterest.api.model.we0) r0
            if (r0 == 0) goto L8f
            com.pinterest.api.model.xh0 r0 = r0.w()
            if (r0 == 0) goto L8f
            boolean[] r0 = r0.f43691d
            int r3 = r0.length
            if (r3 <= 0) goto L8f
            boolean r0 = r0[r1]
            if (r0 == 0) goto L8f
        L4e:
            com.pinterest.api.model.oe0 r0 = r4.f6()
            if (r0 == 0) goto L71
            java.util.List r0 = r0.r()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r0.get(r1)
            com.pinterest.api.model.h80 r0 = (com.pinterest.api.model.h80) r0
            if (r0 == 0) goto L71
            com.pinterest.api.model.xh0 r0 = r0.r()
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.d()
            if (r0 != 0) goto L6f
            goto L71
        L6f:
            r2 = r0
            goto L8f
        L71:
            com.pinterest.api.model.se0 r4 = r4.g6()
            if (r4 == 0) goto L8f
            java.util.List r4 = r4.y()
            if (r4 == 0) goto L8f
            java.lang.Object r4 = r4.get(r1)
            com.pinterest.api.model.we0 r4 = (com.pinterest.api.model.we0) r4
            if (r4 == 0) goto L8f
            com.pinterest.api.model.xh0 r4 = r4.w()
            if (r4 == 0) goto L8f
            java.lang.String r2 = r4.d()
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.api.model.b40.t(com.pinterest.api.model.f30):java.lang.String");
    }

    public static final boolean t0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean G4 = f30Var.G4();
        Intrinsics.checkNotNullExpressionValue(G4, "getIsEligibleForAggregatedComments(...)");
        if (G4.booleanValue()) {
            Boolean I3 = f30Var.I3();
            Intrinsics.checkNotNullExpressionValue(I3, "getCanDeleteDidItAndComments(...)");
            if (I3.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Integer u(f30 f30Var) {
        se0 g63;
        List y13;
        we0 we0Var;
        xh0 w13;
        List y14;
        we0 we0Var2;
        xh0 w14;
        List r13;
        h80 h80Var;
        xh0 r14;
        List r15;
        h80 h80Var2;
        xh0 r16;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        oe0 f63 = f30Var.f6();
        if ((f63 == null || (r15 = f63.r()) == null || (h80Var2 = (h80) CollectionsKt.firstOrNull(r15)) == null || (r16 = h80Var2.r()) == null || !r16.f()) && ((g63 = f30Var.g6()) == null || (y13 = g63.y()) == null || (we0Var = (we0) CollectionsKt.firstOrNull(y13)) == null || (w13 = we0Var.w()) == null || !w13.f())) {
            return null;
        }
        oe0 f64 = f30Var.f6();
        if (f64 != null && (r13 = f64.r()) != null && (h80Var = (h80) r13.get(0)) != null && (r14 = h80Var.r()) != null) {
            return r14.e();
        }
        se0 g64 = f30Var.g6();
        if (g64 == null || (y14 = g64.y()) == null || (we0Var2 = (we0) y14.get(0)) == null || (w14 = we0Var2.w()) == null) {
            return null;
        }
        return w14.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.booleanValue() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean u0(com.pinterest.api.model.f30 r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = z0(r2)
            if (r0 != 0) goto L1a
            java.lang.Boolean r0 = r2.e4()
            java.lang.String r1 = "getDidItDisabled(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
        L1a:
            java.lang.Boolean r2 = r2.I3()
            java.lang.String r0 = "getCanDeleteDidItAndComments(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2b
            r2 = 1
            goto L2c
        L2b:
            r2 = 0
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.api.model.b40.u0(com.pinterest.api.model.f30):boolean");
    }

    public static final boolean v(f30 f30Var) {
        Map g13;
        Map g14;
        b01 M6 = f30Var.M6();
        if (M6 != null && (g14 = M6.g()) != null && g14.containsKey("V_DASH_HEVC")) {
            return true;
        }
        b01 M62 = f30Var.M6();
        return (M62 == null || (g13 = M62.g()) == null || !g13.containsKey("V_HLSV3_MOBILE")) ? false : true;
    }

    public static final boolean v0(f30 f30Var) {
        return (f30Var == null || f30Var.r6() != null || f30Var.d5().booleanValue() || (Q0(f30Var) && !P0(f30Var)) || D0(f30Var) || f30Var.m5().booleanValue() || r0(f30Var)) ? false : true;
    }

    public static final boolean w(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        dl0 v63 = f30Var.v6();
        if (v63 != null) {
            return Intrinsics.d(v63.m(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean w0(f30 f30Var) {
        g t33;
        return f30Var != null && ((t33 = f30Var.t3()) == null || !Intrinsics.d(t33.c0(), Boolean.TRUE));
    }

    public static final d40 x(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        d40 d40Var = (d40) f35970d.get(f30Var.getUid());
        return d40Var == null ? d40.NOT_HIDDEN : d40Var;
    }

    public static final boolean x0(f30 f30Var) {
        Boolean J4 = f30Var.J4();
        Intrinsics.checkNotNullExpressionValue(J4, "getIsEligibleForCutoutTool(...)");
        return J4.booleanValue() || v0(f30Var);
    }

    public static final sr y(f30 f30Var, tr size) {
        Intrinsics.checkNotNullParameter(size, "size");
        Map A4 = f30Var != null ? f30Var.A4() : null;
        if (A4 == null) {
            A4 = kotlin.collections.z0.d();
        }
        sr srVar = (sr) A4.get(size.getValue());
        return srVar == null ? (sr) A4.values().iterator().next() : srVar;
    }

    public static final boolean y0(f30 f30Var, boolean z13, boolean z14) {
        return !(f30Var == null || !n60.o.B(f30Var, "getIsPromoted(...)") || z13) || z14;
    }

    public static final int z(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        cc J3 = f30Var.J3();
        Integer e13 = J3 != null ? J3.e() : null;
        if (e13 == null) {
            return 0;
        }
        return e13.intValue();
    }

    public static final boolean z0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean p53 = f30Var.p5();
        Intrinsics.checkNotNullExpressionValue(p53, "getIsWhitelistedForTriedIt(...)");
        return p53.booleanValue();
    }
}
