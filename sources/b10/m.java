package b10;

import com.pinterest.api.model.al0;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.eh;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.le0;
import com.pinterest.api.model.mz0;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.pe0;
import com.pinterest.api.model.pz0;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.tz0;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.ah;
import x40.ch;
import x40.dh;
import x40.e7;
import x40.f7;
import x40.fh;
import x40.hh;
import x40.ih;
import x40.jh;
import x40.kh;
import x40.lh;
import x40.tg;
import x40.ug;
import x40.vg;
import x40.wg;
import x40.xg;
import x40.yg;
import x40.zg;

/* loaded from: classes3.dex */
public final class m implements uf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20913a;

    /* renamed from: b, reason: collision with root package name */
    public final uf0.b f20914b;

    public m(uf0.b verifiedIdentityAdapter, int i13) {
        this.f20913a = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "verifiedIdentityAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "officialUserAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "officialUserAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "verifiedIdentityAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "verifiedIdentityAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "productsAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "productsAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "metadataAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "verifiedIdentityAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "verifiedIdentityAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
            default:
                Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "verifiedIdentityAdapter");
                this.f20914b = verifiedIdentityAdapter;
                break;
        }
    }

    public static void t(Object obj, l lVar) {
        if (obj != null) {
            lVar.invoke();
        }
    }

    public static void u(Object obj, p pVar) {
        if (obj != null) {
            pVar.invoke();
        }
    }

    public static void v(Object obj, q qVar) {
        if (obj != null) {
            qVar.invoke();
        }
    }

    public static void w(Object obj, r rVar) {
        if (obj != null) {
            rVar.invoke();
        }
    }

    public static void x(Object obj, u uVar) {
        if (obj != null) {
            uVar.invoke();
        }
    }

    public static void y(Object obj, lk0.c cVar) {
        if (obj != null) {
            cVar.invoke();
        }
    }

    @Override // uf0.a
    public final /* bridge */ /* synthetic */ Object B(Object obj) {
        switch (this.f20913a) {
            case 0:
                return o((xg) obj);
            case 1:
                return n((ug) obj);
            case 2:
                return h((vg) obj);
            case 3:
                return s((yg) obj);
            case 4:
                return p((ah) obj);
            case 5:
                return q((dh) obj);
            case 6:
                return j((fh) obj);
            case 7:
                return k((hh) obj);
            case 8:
                return l((jh) obj);
            case 9:
                return r((lh) obj);
            default:
                return m((f7) obj);
        }
    }

    public final f7 a(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        Integer q23 = plankModel.q2();
        Boolean s22 = plankModel.s2();
        String uid = plankModel.getUid();
        Boolean R2 = plankModel.R2();
        String U2 = plankModel.U2();
        Integer V2 = plankModel.V2();
        Integer X2 = plankModel.X2();
        String Z2 = plankModel.Z2();
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String k33 = plankModel.k3();
        String l33 = plankModel.l3();
        String m33 = plankModel.m3();
        String n33 = plankModel.n3();
        Boolean x33 = plankModel.x3();
        Boolean J3 = plankModel.J3();
        Boolean O3 = plankModel.O3();
        String P3 = plankModel.P3();
        String z43 = plankModel.z4();
        e7 e7Var = (e7) this.f20914b.k(plankModel);
        Intrinsics.f(uid);
        return new f7("User", o13, uid, e7Var, s22, O3, x33, n33, k33, l33, m33, U2, P3, Z2, z43, V2, X2, R2, J3, q23);
    }

    public final ug b(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new ug("User", str, uid, (tg) this.f20914b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final xg c(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new xg("User", str, uid, (wg) this.f20914b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final ah d(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new ah("User", str, uid, (zg) this.f20914b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final dh e(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new dh("User", str, uid, (ch) this.f20914b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final jh f(dl0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        Integer r13 = plankModel.r();
        ih ihVar = (ih) this.f20914b.k(plankModel);
        Boolean o13 = plankModel.o();
        String v13 = plankModel.v();
        return new jh(r13, ihVar, o13, "StoryPinData", v13 != null ? Double.valueOf(Double.parseDouble(v13)) : null, plankModel.u());
    }

    public final lh g(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new lh("User", str, uid, (kh) this.f20914b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final com.pinterest.api.model.hh h(vg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        eh ehVar = new eh(0);
        wy0 wy0Var = (wy0) this.f20914b.O(apolloModel);
        if (wy0Var != null) {
            ehVar.c(wy0Var);
        }
        com.pinterest.api.model.hh a13 = ehVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    @Override // uf0.a
    public final Object i(Object obj) {
        int i13 = this.f20913a;
        uf0.b bVar = this.f20914b;
        switch (i13) {
            case 0:
                return c((wy0) obj);
            case 1:
                return b((wy0) obj);
            case 2:
                com.pinterest.api.model.hh plankModel = (com.pinterest.api.model.hh) obj;
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                return new vg((ug) bVar.k(plankModel));
            case 3:
                pz0 plankModel2 = (pz0) obj;
                Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                return new yg((xg) bVar.k(plankModel2));
            case 4:
                return d((wy0) obj);
            case 5:
                return e((wy0) obj);
            case 6:
                oe0 plankModel3 = (oe0) obj;
                Intrinsics.checkNotNullParameter(plankModel3, "plankModel");
                return new fh((List) bVar.k(plankModel3));
            case 7:
                se0 plankModel4 = (se0) obj;
                Intrinsics.checkNotNullParameter(plankModel4, "plankModel");
                return new hh((List) bVar.k(plankModel4), plankModel4.A(), plankModel4.v());
            case 8:
                return f((dl0) obj);
            case 9:
                return g((wy0) obj);
            default:
                return a((wy0) obj);
        }
    }

    public final oe0 j(fh apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        le0 le0Var = new le0(0);
        List list = (List) this.f20914b.O(apolloModel);
        if (list != null) {
            le0Var.d(list);
        }
        oe0 a13 = le0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final se0 k(hh apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        pe0 pe0Var = new pe0(0);
        List list = (List) this.f20914b.O(apolloModel);
        if (list != null) {
            pe0Var.f40958n = list;
            boolean[] zArr = pe0Var.f40963s;
            if (zArr.length > 13) {
                zArr[13] = true;
            }
        }
        String str = apolloModel.f132511b;
        s sVar = new s(pe0Var, apolloModel, 0);
        if (str != null) {
            sVar.invoke();
        }
        s sVar2 = new s(pe0Var, apolloModel, 1);
        if (apolloModel.f132512c != null) {
            sVar2.invoke();
        }
        se0 a13 = pe0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final dl0 l(jh apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        al0 al0Var = new al0(0);
        Integer num = apolloModel.f132619a;
        t tVar = new t(al0Var, apolloModel, 0);
        if (num != null) {
            tVar.invoke();
        }
        jo0 jo0Var = (jo0) this.f20914b.O(apolloModel);
        if (jo0Var != null) {
            al0Var.f(jo0Var);
        }
        t tVar2 = new t(al0Var, apolloModel, 1);
        if (apolloModel.f132621c != null) {
            tVar2.invoke();
        }
        t tVar3 = new t(al0Var, apolloModel, 2);
        if (apolloModel.f132623e != null) {
            tVar3.invoke();
        }
        t tVar4 = new t(al0Var, apolloModel, 3);
        if (apolloModel.f132624f != null) {
            tVar4.invoke();
        }
        dl0 a13 = al0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 m(f7 apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        y(apolloModel.f132395t, new lk0.c(f23, apolloModel, 9));
        y(apolloModel.f132380e, new lk0.c(f23, apolloModel, 10));
        y(apolloModel.f132378c, new lk0.c(f23, apolloModel, 11));
        y(apolloModel.f132393r, new lk0.c(f23, apolloModel, 12));
        y(apolloModel.f132387l, new lk0.c(f23, apolloModel, 13));
        y(apolloModel.f132391p, new lk0.c(f23, apolloModel, 14));
        y(apolloModel.f132392q, new lk0.c(f23, apolloModel, 15));
        y(apolloModel.f132389n, new lk0.c(f23, apolloModel, 16));
        y(apolloModel.f132377b, new lk0.c(f23, apolloModel, 17));
        y(apolloModel.f132384i, new lk0.c(f23, apolloModel, 0));
        y(apolloModel.f132385j, new lk0.c(f23, apolloModel, 1));
        y(apolloModel.f132386k, new lk0.c(f23, apolloModel, 2));
        y(apolloModel.f132383h, new lk0.c(f23, apolloModel, 3));
        y(apolloModel.f132382g, new lk0.c(f23, apolloModel, 4));
        y(apolloModel.f132394s, new lk0.c(f23, apolloModel, 5));
        y(apolloModel.f132381f, new lk0.c(f23, apolloModel, 6));
        y(apolloModel.f132388m, new lk0.c(f23, apolloModel, 7));
        y(apolloModel.f132390o, new lk0.c(f23, apolloModel, 8));
        tz0 tz0Var = (tz0) this.f20914b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 n(ug apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        u(apolloModel.f133496b, new p(f23, apolloModel, 10));
        u(apolloModel.f133497c, new p(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20914b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        u(apolloModel.f133499e, new p(f23, apolloModel, 12));
        u(apolloModel.f133500f, new p(f23, apolloModel, 13));
        u(apolloModel.f133501g, new p(f23, apolloModel, 14));
        u(apolloModel.f133502h, new p(f23, apolloModel, 15));
        u(apolloModel.f133503i, new p(f23, apolloModel, 16));
        u(apolloModel.f133504j, new p(f23, apolloModel, 17));
        u(apolloModel.f133505k, new p(f23, apolloModel, 0));
        u(apolloModel.f133506l, new p(f23, apolloModel, 1));
        u(apolloModel.f133507m, new p(f23, apolloModel, 2));
        u(apolloModel.f133508n, new p(f23, apolloModel, 3));
        u(apolloModel.f133509o, new p(f23, apolloModel, 4));
        u(apolloModel.f133510p, new p(f23, apolloModel, 5));
        u(apolloModel.f133511q, new p(f23, apolloModel, 6));
        u(apolloModel.f133512r, new p(f23, apolloModel, 7));
        u(apolloModel.f133513s, new p(f23, apolloModel, 8));
        u(apolloModel.f133514t, new p(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 o(xg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        t(apolloModel.f133692b, new l(f23, apolloModel, 10));
        t(apolloModel.f133693c, new l(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20914b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        t(apolloModel.f133695e, new l(f23, apolloModel, 12));
        t(apolloModel.f133696f, new l(f23, apolloModel, 13));
        t(apolloModel.f133697g, new l(f23, apolloModel, 14));
        t(apolloModel.f133698h, new l(f23, apolloModel, 15));
        t(apolloModel.f133699i, new l(f23, apolloModel, 16));
        t(apolloModel.f133700j, new l(f23, apolloModel, 17));
        t(apolloModel.f133701k, new l(f23, apolloModel, 0));
        t(apolloModel.f133702l, new l(f23, apolloModel, 1));
        t(apolloModel.f133703m, new l(f23, apolloModel, 2));
        t(apolloModel.f133704n, new l(f23, apolloModel, 3));
        t(apolloModel.f133705o, new l(f23, apolloModel, 4));
        t(apolloModel.f133706p, new l(f23, apolloModel, 5));
        t(apolloModel.f133707q, new l(f23, apolloModel, 6));
        t(apolloModel.f133708r, new l(f23, apolloModel, 7));
        t(apolloModel.f133709s, new l(f23, apolloModel, 8));
        t(apolloModel.f133710t, new l(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 p(ah apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        v(apolloModel.f131972b, new q(f23, apolloModel, 10));
        v(apolloModel.f131973c, new q(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20914b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        v(apolloModel.f131975e, new q(f23, apolloModel, 12));
        v(apolloModel.f131976f, new q(f23, apolloModel, 13));
        v(apolloModel.f131977g, new q(f23, apolloModel, 14));
        v(apolloModel.f131978h, new q(f23, apolloModel, 15));
        v(apolloModel.f131979i, new q(f23, apolloModel, 16));
        v(apolloModel.f131980j, new q(f23, apolloModel, 17));
        v(apolloModel.f131981k, new q(f23, apolloModel, 0));
        v(apolloModel.f131982l, new q(f23, apolloModel, 1));
        v(apolloModel.f131983m, new q(f23, apolloModel, 2));
        v(apolloModel.f131984n, new q(f23, apolloModel, 3));
        v(apolloModel.f131985o, new q(f23, apolloModel, 4));
        v(apolloModel.f131986p, new q(f23, apolloModel, 5));
        v(apolloModel.f131987q, new q(f23, apolloModel, 6));
        v(apolloModel.f131988r, new q(f23, apolloModel, 7));
        v(apolloModel.f131989s, new q(f23, apolloModel, 8));
        v(apolloModel.f131990t, new q(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 q(dh apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        w(apolloModel.f132272b, new r(f23, apolloModel, 10));
        w(apolloModel.f132273c, new r(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20914b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        w(apolloModel.f132275e, new r(f23, apolloModel, 12));
        w(apolloModel.f132276f, new r(f23, apolloModel, 13));
        w(apolloModel.f132277g, new r(f23, apolloModel, 14));
        w(apolloModel.f132278h, new r(f23, apolloModel, 15));
        w(apolloModel.f132279i, new r(f23, apolloModel, 16));
        w(apolloModel.f132280j, new r(f23, apolloModel, 17));
        w(apolloModel.f132281k, new r(f23, apolloModel, 0));
        w(apolloModel.f132282l, new r(f23, apolloModel, 1));
        w(apolloModel.f132283m, new r(f23, apolloModel, 2));
        w(apolloModel.f132284n, new r(f23, apolloModel, 3));
        w(apolloModel.f132285o, new r(f23, apolloModel, 4));
        w(apolloModel.f132286p, new r(f23, apolloModel, 5));
        w(apolloModel.f132287q, new r(f23, apolloModel, 6));
        w(apolloModel.f132288r, new r(f23, apolloModel, 7));
        w(apolloModel.f132289s, new r(f23, apolloModel, 8));
        w(apolloModel.f132290t, new r(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 r(lh apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        x(apolloModel.f132777b, new u(f23, apolloModel, 10));
        x(apolloModel.f132778c, new u(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20914b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        x(apolloModel.f132780e, new u(f23, apolloModel, 12));
        x(apolloModel.f132781f, new u(f23, apolloModel, 13));
        x(apolloModel.f132782g, new u(f23, apolloModel, 14));
        x(apolloModel.f132783h, new u(f23, apolloModel, 15));
        x(apolloModel.f132784i, new u(f23, apolloModel, 16));
        x(apolloModel.f132785j, new u(f23, apolloModel, 17));
        x(apolloModel.f132786k, new u(f23, apolloModel, 0));
        x(apolloModel.f132787l, new u(f23, apolloModel, 1));
        x(apolloModel.f132788m, new u(f23, apolloModel, 2));
        x(apolloModel.f132789n, new u(f23, apolloModel, 3));
        x(apolloModel.f132790o, new u(f23, apolloModel, 4));
        x(apolloModel.f132791p, new u(f23, apolloModel, 5));
        x(apolloModel.f132792q, new u(f23, apolloModel, 6));
        x(apolloModel.f132793r, new u(f23, apolloModel, 7));
        x(apolloModel.f132794s, new u(f23, apolloModel, 8));
        x(apolloModel.f132795t, new u(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final pz0 s(yg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        mz0 mz0Var = new mz0(0);
        wy0 wy0Var = (wy0) this.f20914b.O(apolloModel);
        if (wy0Var != null) {
            mz0Var.f40268b = wy0Var;
            boolean[] zArr = mz0Var.f40269c;
            if (zArr.length > 1) {
                zArr[1] = true;
            }
        }
        pz0 a13 = mz0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }
}
