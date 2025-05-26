package aq;

import androidx.appcompat.widget.q;
import com.pinterest.api.model.aa;
import com.pinterest.api.model.al0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.fl0;
import com.pinterest.api.model.il0;
import com.pinterest.api.model.jl0;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.lp0;
import com.pinterest.api.model.md;
import com.pinterest.api.model.mp0;
import com.pinterest.api.model.oo0;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.st;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import lh0.n1;
import nm.o;
import nx.d1;
import v.q1;
import x02.a2;
import x02.b2;
import x02.e0;
import x02.f2;
import x02.i2;
import x02.o2;
import x02.x0;
import x02.z0;
import z42.r;
import zp.n0;

/* loaded from: classes3.dex */
public final class c extends j {

    /* renamed from: c, reason: collision with root package name */
    public final f30 f20340c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f20341d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f20342e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f20343f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f20344g;

    /* renamed from: h, reason: collision with root package name */
    public final n1 f20345h;

    public c(f30 pin, d1 trackingParamAttacher, b60.b activeUserManager, i2 pinRepository, x0 boardRepository, n1 experiments) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f20340c = pin;
        this.f20341d = trackingParamAttacher;
        this.f20342e = activeUserManager;
        this.f20343f = pinRepository;
        this.f20344g = boardRepository;
        this.f20345h = experiments;
    }

    @Override // aq.j
    public final String A() {
        return "";
    }

    @Override // aq.j
    public final String B() {
        String uid = this.f20340c.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }

    @Override // aq.j
    public final String C() {
        jo0 q13;
        o oVar = vd0.c.f125622b;
        dl0 v63 = this.f20340c.v6();
        String k13 = oVar.k((v63 == null || (q13 = v63.q()) == null) ? null : q13.k());
        Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
        return k13;
    }

    @Override // aq.j
    public final String D() {
        jo0 q13;
        dl0 v63 = this.f20340c.v6();
        return String.valueOf((v63 == null || (q13 = v63.q()) == null) ? null : q13.s());
    }

    @Override // aq.j
    public final String E() {
        String B0 = bs1.c.B0(this.f20340c);
        return B0 == null ? "" : B0;
    }

    @Override // aq.j
    public final String F() {
        return "";
    }

    @Override // aq.j
    public final String G() {
        return "";
    }

    @Override // aq.j
    public final List H() {
        List m13;
        f30 f30Var = this.f20340c;
        boolean Q0 = b40.Q0(f30Var);
        n1 n1Var = this.f20345h;
        if (Q0 && !n1Var.j()) {
            dl0 v63 = f30Var.v6();
            if (v63 != null) {
                return jl0.a(v63);
            }
            return null;
        }
        md O3 = f30Var.O3();
        if (O3 == null || (m13 = O3.m()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : m13) {
            st stVar = (st) obj;
            if (n1Var.j()) {
                Boolean p13 = stVar.p();
                Intrinsics.f(p13);
                if (p13.booleanValue()) {
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((st) it.next()).s());
        }
        return CollectionsKt.Q(arrayList2);
    }

    @Override // aq.j
    public final Boolean I() {
        return null;
    }

    @Override // aq.j
    public final String J() {
        String s53 = this.f20340c.s5();
        return s53 == null ? "" : s53;
    }

    @Override // aq.j
    public final List K() {
        return this.f20345h.j() ? H() : r();
    }

    @Override // aq.j
    public final wy0 M() {
        return this.f20340c.I5();
    }

    @Override // aq.j
    public final Long N() {
        return null;
    }

    @Override // aq.j
    public final ba O() {
        return this.f20340c.j6();
    }

    @Override // aq.j
    public final String P() {
        ba j63 = this.f20340c.j6();
        String uid = j63 != null ? j63.getUid() : null;
        return uid == null ? "" : uid;
    }

    @Override // aq.j
    public final String Q() {
        return null;
    }

    @Override // aq.j
    public final rj0 R() {
        return this.f20340c.u6();
    }

    @Override // aq.j
    public final String S() {
        jo0 q13;
        String q14;
        f30 f30Var = this.f20340c;
        String z63 = f30Var.z6();
        String str = "";
        if (z63 == null) {
            z63 = "";
        }
        if (z63.length() != 0) {
            return z63;
        }
        dl0 v63 = f30Var.v6();
        if (v63 != null && (q13 = v63.q()) != null && (q14 = q13.q()) != null) {
            str = q14;
        }
        return str;
    }

    @Override // aq.j
    public final String U() {
        o oVar = vd0.c.f125622b;
        List H6 = this.f20340c.H6();
        if (H6 == null) {
            H6 = q0.f80391a;
        }
        String k13 = oVar.k(H6);
        Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
        return k13;
    }

    @Override // aq.j
    public final List V() {
        return this.f20340c.H6();
    }

    @Override // aq.j
    public final boolean W() {
        return b40.n0(this.f20340c);
    }

    @Override // aq.j
    public final boolean Y() {
        return true;
    }

    @Override // aq.j
    public final boolean Z() {
        return b40.Q0(this.f20340c);
    }

    @Override // aq.j
    public final boolean a() {
        return b40.t0(this.f20340c);
    }

    @Override // aq.j
    public final void a0(h saveActionListener) {
        boolean z13;
        List list;
        Iterator it;
        Intrinsics.checkNotNullParameter(saveActionListener, "saveActionListener");
        Integer intOrNull = StringsKt.toIntOrNull(j.T(this, d.TEMPLATE_TYPE));
        d dVar = d.PRODUCT_TAGS;
        String T = j.T(this, dVar);
        if (Intrinsics.d(T, L(dVar)) || !X(dVar)) {
            T = null;
        }
        d field = d.BOARD_ID;
        String z14 = z(field);
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(z14, "default");
        Object orDefault = this.f20348a.getOrDefault(field, z14);
        Intrinsics.checkNotNullExpressionValue(orDefault, "getOrDefault(...)");
        String boardId = (String) orDefault;
        String T2 = j.T(this, d.SECTION_ID);
        if (T2.length() == 0) {
            T2 = null;
        }
        String websiteUrl = z(d.LINK);
        String title = z(d.TITLE);
        String summary = z(d.DESCRIPTION);
        String pinAltText = z(d.ALT_TEXT);
        d dVar2 = d.IS_COMMENTING_ALLOWED;
        boolean z15 = !Boolean.parseBoolean(z(dVar2));
        boolean z16 = !Boolean.parseBoolean(z(dVar2));
        String T3 = j.T(this, d.USER_MENTION_TAGS);
        if (T3.length() == 0) {
            T3 = U();
        }
        String str = T3;
        boolean z17 = !Boolean.parseBoolean(z(d.IS_SHOPPING_REC_ALLOWED));
        String T4 = j.T(this, d.DETAILS);
        String str2 = T4.length() == 0 ? null : T4;
        Integer num = (intOrNull != null && intOrNull.intValue() == 0) ? null : intOrNull;
        f30 pin = this.f20340c;
        fi0 r63 = pin.r6();
        boolean o03 = com.bumptech.glide.d.o0(r63 != null ? r63.L() : null);
        i2 i2Var = this.f20343f;
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(websiteUrl, "websiteUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(pinAltText, "pinAltText");
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        f2 f2Var = new f2(uid, boardId, T2, false, websiteUrl, title, summary, pinAltText, z15, z16, o03, str, z17, null, str2, num, T, 16384);
        e30 R6 = pin.R6();
        v7 v7Var = (v7) ((x0) ((bf2.b) i2Var.O).get()).O(boardId);
        if (v7Var == null) {
            u7 x03 = v7.x0();
            x03.P(boardId);
            x03.C("");
            v7Var = x03.a();
        }
        R6.l(v7Var);
        int i13 = 0;
        if (T2 == null || z.j(T2)) {
            z13 = true;
        } else {
            ba baVar = (ba) ((z0) ((bf2.b) i2Var.N).get()).O(T2);
            if (baVar == null) {
                aa aaVar = new aa(i13);
                aaVar.f35671a = T2;
                boolean[] zArr = aaVar.f35681k;
                if (zArr.length > 0) {
                    z13 = true;
                    zArr[0] = true;
                } else {
                    z13 = true;
                }
                baVar = aaVar.a();
            } else {
                z13 = true;
            }
            R6.Z1(baVar);
        }
        R6.n1(websiteUrl);
        R6.M(summary);
        R6.f37110k = pinAltText;
        boolean[] zArr2 = R6.f37101h3;
        if (zArr2.length > 10) {
            zArr2[10] = z13;
        }
        R6.z(Boolean.valueOf(z15));
        R6.O(Boolean.valueOf(z16));
        R6.d2(Boolean.valueOf(z17));
        if (T != null) {
            Iterable split$default = T.length() == 0 ? q0.f80391a : StringsKt__StringsKt.split$default(T, new String[]{","}, false, 0, 6, null);
            dl0 dl0Var = R6.K2;
            if (dl0Var != null) {
                Iterable a13 = jl0.a(dl0Var);
                if (a13 == null) {
                    a13 = q0.f80391a;
                }
                Iterable iterable = split$default;
                List productsToRemove = CollectionsKt.i0(a13, CollectionsKt.J0(iterable));
                if (productsToRemove.isEmpty() ^ z13) {
                    Intrinsics.checkNotNullParameter(productsToRemove, "productsToRemove");
                    if (dl0Var.s() != null && !productsToRemove.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        il0 il0Var = new il0(productsToRemove);
                        List s13 = dl0Var.s();
                        if (s13 != null) {
                            int i14 = 0;
                            for (Object obj : s13) {
                                int i15 = i14 + 1;
                                if (i14 < 0) {
                                    f0.p();
                                    throw null;
                                }
                                uo0 uo0Var = (uo0) obj;
                                if (uo0Var.o() == null || i14 != 0) {
                                    arrayList.add(uo0Var);
                                } else {
                                    List o13 = uo0Var.o();
                                    ArrayList H0 = o13 != null ? CollectionsKt.H0(o13) : new ArrayList();
                                    List<ro0> o14 = uo0Var.o();
                                    if (o14 != null) {
                                        for (ro0 ro0Var : o14) {
                                            if (((mp0) ro0Var.a(il0Var)) != null) {
                                                H0.remove(ro0Var);
                                            }
                                        }
                                    }
                                    oo0 x13 = uo0Var.x();
                                    x13.c(H0);
                                    uo0 a14 = x13.a();
                                    Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                                    arrayList.add(a14);
                                }
                                i14 = i15;
                            }
                        }
                        al0 w13 = dl0Var.w();
                        w13.g(arrayList);
                        dl0Var = w13.a();
                    }
                }
                Iterable a15 = jl0.a(dl0Var);
                if (a15 == null) {
                    a15 = q0.f80391a;
                }
                List<String> productsToAdd = CollectionsKt.i0(iterable, CollectionsKt.J0(a15));
                if (productsToAdd.isEmpty() ^ z13) {
                    Intrinsics.checkNotNullParameter(productsToAdd, "productsToAdd");
                    if (dl0Var.s() != null && !productsToAdd.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        List s14 = dl0Var.s();
                        if (s14 != null) {
                            Iterator it2 = s14.iterator();
                            int i16 = 0;
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                int i17 = i16 + 1;
                                if (i16 < 0) {
                                    f0.p();
                                    throw null;
                                }
                                uo0 uo0Var2 = (uo0) next;
                                if (i16 == 0) {
                                    List o15 = uo0Var2.o();
                                    ArrayList H02 = o15 != null ? CollectionsKt.H0(o15) : new ArrayList();
                                    for (String str3 : productsToAdd) {
                                        lp0 lp0Var = new lp0(i13);
                                        lp0Var.f39853a = Integer.valueOf(a42.f.PRODUCT_STICKER.getValue());
                                        boolean[] zArr3 = lp0Var.f39861i;
                                        if (zArr3.length > 0) {
                                            zArr3[0] = true;
                                        }
                                        lp0Var.f39854b = h22.g.f66585b;
                                        List list2 = productsToAdd;
                                        if (zArr3.length > 1) {
                                            zArr3[1] = true;
                                        }
                                        lp0Var.f39859g = mp0.a.TITLE;
                                        Iterator it3 = it2;
                                        if (zArr3.length > 6) {
                                            zArr3[6] = true;
                                        }
                                        lp0Var.f39857e = str3;
                                        if (zArr3.length > 4) {
                                            zArr3[4] = true;
                                        }
                                        mp0 a16 = lp0Var.a();
                                        Intrinsics.checkNotNullExpressionValue(a16, "build(...)");
                                        H02.add(new ro0(a16));
                                        productsToAdd = list2;
                                        it2 = it3;
                                        i13 = 0;
                                    }
                                    list = productsToAdd;
                                    it = it2;
                                    oo0 x14 = uo0Var2.x();
                                    x14.c(H02);
                                    uo0 a17 = x14.a();
                                    Intrinsics.checkNotNullExpressionValue(a17, "build(...)");
                                    arrayList2.add(a17);
                                } else {
                                    list = productsToAdd;
                                    it = it2;
                                    Intrinsics.f(uo0Var2);
                                    arrayList2.add(uo0Var2);
                                }
                                i16 = i17;
                                productsToAdd = list;
                                it2 = it;
                                i13 = 0;
                            }
                        }
                        al0 w14 = dl0Var.w();
                        w14.g(arrayList2);
                        dl0Var = w14.a();
                    }
                }
            }
            R6.m2(dl0Var);
        }
        f30 a18 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a18, "build(...)");
        uj2.l G = i2Var.G(f2Var, a18);
        e0 e0Var = new e0(18, new o2(i2Var, 1));
        G.getClass();
        a2 a2Var = ck2.i.f27924d;
        hk2.z zVar = new hk2.z(G, a2Var, e0Var, a2Var, ck2.i.f27923c);
        Intrinsics.checkNotNullExpressionValue(zVar, "doOnSuccess(...)");
        zVar.f(new q(saveActionListener, 0));
    }

    @Override // aq.j
    public final boolean b() {
        return !this.f20340c.Q3().booleanValue();
    }

    @Override // aq.j
    public final boolean c() {
        return rl2.g0.T(this.f20340c);
    }

    @Override // aq.j
    public final boolean d() {
        return !this.f20340c.o6().booleanValue();
    }

    @Override // aq.j
    public final boolean e() {
        return true;
    }

    @Override // aq.j
    public final boolean f() {
        String str;
        f30 f30Var = this.f20340c;
        boolean z13 = !b40.Q0(f30Var);
        boolean z14 = b40.D(f30Var) == r.VIDEO;
        boolean z15 = b40.D(f30Var) == r.SINGLE_IMAGE;
        if (z13 && (z14 || z15)) {
            wy0 Q = com.bumptech.glide.d.Q(this.f20342e);
            wy0 n13 = b40.n(f30Var);
            if (n13 == null || (str = n13.getUid()) == null) {
                str = "";
            }
            if (dl2.b.S1(Q, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // aq.j
    public final boolean g() {
        return !b40.r0(this.f20340c);
    }

    @Override // aq.j
    public final boolean h() {
        return this.f20340c.u6() != null;
    }

    @Override // aq.j
    public final boolean i() {
        String str;
        wy0 Q = com.bumptech.glide.d.Q(this.f20342e);
        Set set = b40.f35967a;
        f30 f30Var = this.f20340c;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean e53 = f30Var.e5();
        Intrinsics.checkNotNullExpressionValue(e53, "getIsRepin(...)");
        wy0 C5 = e53.booleanValue() ? f30Var.C5() : f30Var.I5();
        if (C5 == null || (str = C5.getUid()) == null) {
            str = "";
        }
        return dl2.b.S1(Q, str);
    }

    @Override // aq.j
    public final boolean j() {
        String str;
        wy0 Q = com.bumptech.glide.d.Q(this.f20342e);
        f30 f30Var = this.f20340c;
        wy0 F = b40.F(f30Var);
        if (F == null || (str = F.getUid()) == null) {
            str = "";
        }
        return (!dl2.b.S1(Q, str) || f30Var.e5().booleanValue() || b40.r0(f30Var) || b40.N0(f30Var)) ? false : true;
    }

    @Override // aq.j
    public final boolean k() {
        List s13;
        boolean z13 = false;
        b bVar = new b(0);
        dl0 v63 = this.f20340c.v6();
        if (v63 != null && (s13 = v63.s()) != null) {
            Iterator it = s13.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List o13 = ((uo0) it.next()).o();
                if (o13 != null) {
                    Iterator it2 = o13.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.d(((ro0) it2.next()).a(bVar), Boolean.FALSE)) {
                            z13 = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        return !z13;
    }

    @Override // aq.j
    public final boolean l() {
        return false;
    }

    @Override // aq.j
    public final boolean m() {
        return false;
    }

    @Override // aq.j
    public final boolean n() {
        return b40.Q0(this.f20340c);
    }

    @Override // aq.j
    public final boolean o() {
        String str;
        String uid;
        f30 f30Var = this.f20340c;
        v7 D3 = f30Var.D3();
        wy0 Q = com.bumptech.glide.d.Q(this.f20342e);
        if (D3 != null) {
            wy0 k13 = D3.k1();
            String str2 = "";
            if (k13 == null || (str = k13.getUid()) == null) {
                str = "";
            }
            if (!dl2.b.S1(Q, str)) {
                wy0 I5 = f30Var.I5();
                if (I5 != null && (uid = I5.getUid()) != null) {
                    str2 = uid;
                }
                if (!dl2.b.S1(Q, str2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // aq.j
    public final void p(q1 createActionListener) {
        Intrinsics.checkNotNullParameter(createActionListener, "createActionListener");
        Intrinsics.checkNotNullParameter("An operation is not implemented: Not yet implemented", "message");
        throw new xk2.o("An operation is not implemented: Not yet implemented");
    }

    @Override // aq.j
    public final void q(q deleteActionListener) {
        Intrinsics.checkNotNullParameter(deleteActionListener, "deleteActionListener");
        d1 d1Var = this.f20341d;
        f30 f30Var = this.f20340c;
        String b13 = d1Var.b(f30Var);
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.f20343f.m(new b2(uid, b13), f30Var).i(new fp.a(1, deleteActionListener, this), new n0(9, new a(deleteActionListener, 0)));
    }

    @Override // aq.j
    public final List r() {
        List m13;
        f30 f30Var = this.f20340c;
        if (!b40.Q0(f30Var) || this.f20345h.j()) {
            md O3 = f30Var.O3();
            if (O3 == null || (m13 = O3.m()) == null) {
                return null;
            }
            List list = m13;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((st) it.next()).s());
            }
            return CollectionsKt.Q(arrayList);
        }
        dl0 v63 = f30Var.v6();
        if (v63 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(v63, "<this>");
        List s13 = v63.s();
        if (s13 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        fl0 fl0Var = new fl0(arrayList2, Unit.f80348a);
        Iterator it2 = s13.iterator();
        while (it2.hasNext()) {
            List o13 = ((uo0) it2.next()).o();
            if (o13 != null) {
                Iterator it3 = o13.iterator();
                while (it3.hasNext()) {
                    ((ro0) it3.next()).a(fl0Var);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(g0.q(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((mp0) it4.next()).l());
        }
        return arrayList3;
    }

    @Override // aq.j
    public final List s() {
        md O3 = this.f20340c.O3();
        if (O3 != null) {
            return O3.m();
        }
        return null;
    }

    @Override // aq.j
    public final String t() {
        String A3 = this.f20340c.A3();
        return A3 == null ? "" : A3;
    }

    @Override // aq.j
    public final v7 u() {
        return this.f20340c.D3();
    }

    @Override // aq.j
    public final String v() {
        return b40.i(this.f20340c);
    }

    @Override // aq.j
    public final wy0 w() {
        return b40.n(this.f20340c);
    }

    @Override // aq.j
    public final String x() {
        String c43 = this.f20340c.c4();
        return c43 == null ? "" : c43;
    }

    @Override // aq.j
    public final e y() {
        return b40.Q0(this.f20340c) ? e.UNIFIED_PIN : e.STANDARD_PIN;
    }
}
