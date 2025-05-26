package b10;

import com.pinterest.api.model.al0;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.eh;
import com.pinterest.api.model.hh;
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
import x40.ag;
import x40.bg;
import x40.cg;
import x40.kf;
import x40.lf;
import x40.mf;
import x40.nf;
import x40.of;
import x40.pf;
import x40.qf;
import x40.rf;
import x40.tf;
import x40.uf;
import x40.wf;
import x40.y2;
import x40.yf;
import x40.z2;
import x40.zf;

/* loaded from: classes.dex */
public final class k implements uf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20908a;

    /* renamed from: b, reason: collision with root package name */
    public final uf0.b f20909b;

    public k(a10.b officialUserAdapter, int i13) {
        this.f20908a = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "officialUserAdapter");
                this.f20909b = officialUserAdapter;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "officialUserAdapter");
                this.f20909b = officialUserAdapter;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "verifiedIdentityAdapter");
                this.f20909b = officialUserAdapter;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "verifiedIdentityAdapter");
                this.f20909b = officialUserAdapter;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "verifiedIdentityAdapter");
                this.f20909b = officialUserAdapter;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "verifiedIdentityAdapter");
                this.f20909b = officialUserAdapter;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "productsAdapter");
                this.f20909b = officialUserAdapter;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "productsAdapter");
                this.f20909b = officialUserAdapter;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "metadataAdapter");
                this.f20909b = officialUserAdapter;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "verifiedIdentityAdapter");
                this.f20909b = officialUserAdapter;
                break;
            default:
                Intrinsics.checkNotNullParameter(officialUserAdapter, "verifiedIdentityAdapter");
                this.f20909b = officialUserAdapter;
                break;
        }
    }

    public static void s(Object obj, n nVar) {
        if (obj != null) {
            nVar.invoke();
        }
    }

    public static void t(Object obj, x xVar) {
        if (obj != null) {
            xVar.invoke();
        }
    }

    public static void u(Object obj, y yVar) {
        if (obj != null) {
            yVar.invoke();
        }
    }

    public static void v(Object obj, c0 c0Var) {
        if (obj != null) {
            c0Var.invoke();
        }
    }

    public static void w(Object obj, h0 h0Var) {
        if (obj != null) {
            h0Var.invoke();
        }
    }

    public static void x(Object obj, j jVar) {
        if (obj != null) {
            jVar.invoke();
        }
    }

    @Override // uf0.a
    public final /* bridge */ /* synthetic */ Object B(Object obj) {
        switch (this.f20908a) {
            case 0:
                return m((lf) obj);
            case 1:
                return g((mf) obj);
            case 2:
                return r((pf) obj);
            case 3:
                return o((rf) obj);
            case 4:
                return l((z2) obj);
            case 5:
                return n((of) obj);
            case 6:
                return p((uf) obj);
            case 7:
                return h((wf) obj);
            case 8:
                return j((yf) obj);
            case 9:
                return k((ag) obj);
            default:
                return q((cg) obj);
        }
    }

    public final z2 a(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new z2("User", str, uid, (y2) this.f20909b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final lf b(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new lf("User", str, uid, (kf) this.f20909b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final of c(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new of("User", str, uid, (nf) this.f20909b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final rf d(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new rf("User", str, uid, (qf) this.f20909b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final uf e(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new uf("User", str, uid, (tf) this.f20909b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final cg f(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String str = o13;
        String uid = plankModel.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new cg("User", str, uid, (bg) this.f20909b.k(plankModel), plankModel.s2(), plankModel.O3(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.U2(), plankModel.P3(), plankModel.Z2(), plankModel.z4(), plankModel.V2(), plankModel.X2(), plankModel.R2(), plankModel.J3(), plankModel.q2());
    }

    public final hh g(mf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        eh ehVar = new eh(0);
        wy0 wy0Var = (wy0) this.f20909b.O(apolloModel);
        if (wy0Var != null) {
            ehVar.c(wy0Var);
        }
        hh a13 = ehVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final oe0 h(wf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        le0 le0Var = new le0(0);
        List list = (List) this.f20909b.O(apolloModel);
        if (list != null) {
            le0Var.d(list);
        }
        oe0 a13 = le0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    @Override // uf0.a
    public final Object i(Object obj) {
        int i13 = this.f20908a;
        uf0.b bVar = this.f20909b;
        switch (i13) {
            case 0:
                return b((wy0) obj);
            case 1:
                hh plankModel = (hh) obj;
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                return new mf((lf) bVar.k(plankModel));
            case 2:
                pz0 plankModel2 = (pz0) obj;
                Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                return new pf((of) bVar.k(plankModel2));
            case 3:
                return d((wy0) obj);
            case 4:
                return a((wy0) obj);
            case 5:
                return c((wy0) obj);
            case 6:
                return e((wy0) obj);
            case 7:
                oe0 plankModel3 = (oe0) obj;
                Intrinsics.checkNotNullParameter(plankModel3, "plankModel");
                return new wf((List) bVar.k(plankModel3));
            case 8:
                se0 plankModel4 = (se0) obj;
                Intrinsics.checkNotNullParameter(plankModel4, "plankModel");
                return new yf((List) bVar.k(plankModel4), plankModel4.A(), plankModel4.v());
            case 9:
                dl0 plankModel5 = (dl0) obj;
                Intrinsics.checkNotNullParameter(plankModel5, "plankModel");
                return new ag(plankModel5.r(), (zf) bVar.k(plankModel5), plankModel5.o());
            default:
                return f((wy0) obj);
        }
    }

    public final se0 j(yf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        pe0 pe0Var = new pe0(0);
        List list = (List) this.f20909b.O(apolloModel);
        if (list != null) {
            pe0Var.f40958n = list;
            boolean[] zArr = pe0Var.f40963s;
            if (zArr.length > 13) {
                zArr[13] = true;
            }
        }
        String str = apolloModel.f133750b;
        f0 f0Var = new f0(pe0Var, apolloModel, 0);
        if (str != null) {
            f0Var.invoke();
        }
        f0 f0Var2 = new f0(pe0Var, apolloModel, 1);
        if (apolloModel.f133751c != null) {
            f0Var2.invoke();
        }
        se0 a13 = pe0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final dl0 k(ag apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        al0 al0Var = new al0(0);
        Integer num = apolloModel.f131968a;
        g0 g0Var = new g0(al0Var, apolloModel, 0);
        if (num != null) {
            g0Var.invoke();
        }
        jo0 jo0Var = (jo0) this.f20909b.O(apolloModel);
        if (jo0Var != null) {
            al0Var.f(jo0Var);
        }
        g0 g0Var2 = new g0(al0Var, apolloModel, 1);
        if (apolloModel.f131970c != null) {
            g0Var2.invoke();
        }
        dl0 a13 = al0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 l(z2 apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        t(apolloModel.f133764b, new x(f23, apolloModel, 10));
        t(apolloModel.f133765c, new x(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20909b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        t(apolloModel.f133767e, new x(f23, apolloModel, 12));
        t(apolloModel.f133768f, new x(f23, apolloModel, 13));
        t(apolloModel.f133769g, new x(f23, apolloModel, 14));
        t(apolloModel.f133770h, new x(f23, apolloModel, 15));
        t(apolloModel.f133771i, new x(f23, apolloModel, 16));
        t(apolloModel.f133772j, new x(f23, apolloModel, 17));
        t(apolloModel.f133773k, new x(f23, apolloModel, 0));
        t(apolloModel.f133774l, new x(f23, apolloModel, 1));
        t(apolloModel.f133775m, new x(f23, apolloModel, 2));
        t(apolloModel.f133776n, new x(f23, apolloModel, 3));
        t(apolloModel.f133777o, new x(f23, apolloModel, 4));
        t(apolloModel.f133778p, new x(f23, apolloModel, 5));
        t(apolloModel.f133779q, new x(f23, apolloModel, 6));
        t(apolloModel.f133780r, new x(f23, apolloModel, 7));
        t(apolloModel.f133781s, new x(f23, apolloModel, 8));
        t(apolloModel.f133782t, new x(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 m(lf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        x(apolloModel.getId(), new j(f23, apolloModel, 10));
        x(apolloModel.a(), new j(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20909b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        x(apolloModel.q(), new j(f23, apolloModel, 12));
        x(apolloModel.h(), new j(f23, apolloModel, 13));
        x(apolloModel.o(), new j(f23, apolloModel, 14));
        x(apolloModel.m(), new j(f23, apolloModel, 15));
        x(apolloModel.e(), new j(f23, apolloModel, 16));
        x(apolloModel.b(), new j(f23, apolloModel, 17));
        x(apolloModel.k(), new j(f23, apolloModel, 0));
        x(apolloModel.l(), new j(f23, apolloModel, 1));
        x(apolloModel.p(), new j(f23, apolloModel, 2));
        x(apolloModel.f(), new j(f23, apolloModel, 3));
        x(apolloModel.g(), new j(f23, apolloModel, 4));
        x(apolloModel.c(), new j(f23, apolloModel, 5));
        x(apolloModel.j(), new j(f23, apolloModel, 6));
        x(apolloModel.d(), new j(f23, apolloModel, 7));
        x(apolloModel.r(), new j(f23, apolloModel, 8));
        x(apolloModel.n(), new j(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 n(of apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        u(apolloModel.f132974b, new y(f23, apolloModel, 10));
        u(apolloModel.f132975c, new y(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20909b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        u(apolloModel.f132977e, new y(f23, apolloModel, 12));
        u(apolloModel.f132978f, new y(f23, apolloModel, 13));
        u(apolloModel.f132979g, new y(f23, apolloModel, 14));
        u(apolloModel.f132980h, new y(f23, apolloModel, 15));
        u(apolloModel.f132981i, new y(f23, apolloModel, 16));
        u(apolloModel.f132982j, new y(f23, apolloModel, 17));
        u(apolloModel.f132983k, new y(f23, apolloModel, 0));
        u(apolloModel.f132984l, new y(f23, apolloModel, 1));
        u(apolloModel.f132985m, new y(f23, apolloModel, 2));
        u(apolloModel.f132986n, new y(f23, apolloModel, 3));
        u(apolloModel.f132987o, new y(f23, apolloModel, 4));
        u(apolloModel.f132988p, new y(f23, apolloModel, 5));
        u(apolloModel.f132989q, new y(f23, apolloModel, 6));
        u(apolloModel.f132990r, new y(f23, apolloModel, 7));
        u(apolloModel.f132991s, new y(f23, apolloModel, 8));
        u(apolloModel.f132992t, new y(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 o(rf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        s(apolloModel.f133191b, new n(f23, apolloModel, 10));
        s(apolloModel.f133192c, new n(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20909b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        s(apolloModel.f133194e, new n(f23, apolloModel, 12));
        s(apolloModel.f133195f, new n(f23, apolloModel, 13));
        s(apolloModel.f133196g, new n(f23, apolloModel, 14));
        s(apolloModel.f133197h, new n(f23, apolloModel, 15));
        s(apolloModel.f133198i, new n(f23, apolloModel, 16));
        s(apolloModel.f133199j, new n(f23, apolloModel, 17));
        s(apolloModel.f133200k, new n(f23, apolloModel, 0));
        s(apolloModel.f133201l, new n(f23, apolloModel, 1));
        s(apolloModel.f133202m, new n(f23, apolloModel, 2));
        s(apolloModel.f133203n, new n(f23, apolloModel, 3));
        s(apolloModel.f133204o, new n(f23, apolloModel, 4));
        s(apolloModel.f133205p, new n(f23, apolloModel, 5));
        s(apolloModel.f133206q, new n(f23, apolloModel, 6));
        s(apolloModel.f133207r, new n(f23, apolloModel, 7));
        s(apolloModel.f133208s, new n(f23, apolloModel, 8));
        s(apolloModel.f133209t, new n(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 p(uf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        v(apolloModel.f133476b, new c0(f23, apolloModel, 10));
        v(apolloModel.f133477c, new c0(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20909b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        v(apolloModel.f133479e, new c0(f23, apolloModel, 12));
        v(apolloModel.f133480f, new c0(f23, apolloModel, 13));
        v(apolloModel.f133481g, new c0(f23, apolloModel, 14));
        v(apolloModel.f133482h, new c0(f23, apolloModel, 15));
        v(apolloModel.f133483i, new c0(f23, apolloModel, 16));
        v(apolloModel.f133484j, new c0(f23, apolloModel, 17));
        v(apolloModel.f133485k, new c0(f23, apolloModel, 0));
        v(apolloModel.f133486l, new c0(f23, apolloModel, 1));
        v(apolloModel.f133487m, new c0(f23, apolloModel, 2));
        v(apolloModel.f133488n, new c0(f23, apolloModel, 3));
        v(apolloModel.f133489o, new c0(f23, apolloModel, 4));
        v(apolloModel.f133490p, new c0(f23, apolloModel, 5));
        v(apolloModel.f133491q, new c0(f23, apolloModel, 6));
        v(apolloModel.f133492r, new c0(f23, apolloModel, 7));
        v(apolloModel.f133493s, new c0(f23, apolloModel, 8));
        v(apolloModel.f133494t, new c0(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final wy0 q(cg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        w(apolloModel.f132151b, new h0(f23, apolloModel, 10));
        w(apolloModel.f132152c, new h0(f23, apolloModel, 11));
        tz0 tz0Var = (tz0) this.f20909b.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        w(apolloModel.f132154e, new h0(f23, apolloModel, 12));
        w(apolloModel.f132155f, new h0(f23, apolloModel, 13));
        w(apolloModel.f132156g, new h0(f23, apolloModel, 14));
        w(apolloModel.f132157h, new h0(f23, apolloModel, 15));
        w(apolloModel.f132158i, new h0(f23, apolloModel, 16));
        w(apolloModel.f132159j, new h0(f23, apolloModel, 17));
        w(apolloModel.f132160k, new h0(f23, apolloModel, 0));
        w(apolloModel.f132161l, new h0(f23, apolloModel, 1));
        w(apolloModel.f132162m, new h0(f23, apolloModel, 2));
        w(apolloModel.f132163n, new h0(f23, apolloModel, 3));
        w(apolloModel.f132164o, new h0(f23, apolloModel, 4));
        w(apolloModel.f132165p, new h0(f23, apolloModel, 5));
        w(apolloModel.f132166q, new h0(f23, apolloModel, 6));
        w(apolloModel.f132167r, new h0(f23, apolloModel, 7));
        w(apolloModel.f132168s, new h0(f23, apolloModel, 8));
        w(apolloModel.f132169t, new h0(f23, apolloModel, 9));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final pz0 r(pf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        mz0 mz0Var = new mz0(0);
        wy0 wy0Var = (wy0) this.f20909b.O(apolloModel);
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
