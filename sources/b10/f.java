package b10;

import com.pinterest.api.model.mv;
import com.pinterest.api.model.re;
import com.pinterest.api.model.tz0;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.v10;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import java.util.List;
import java.util.Map;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import x40.bj;
import x40.cj;
import x40.d3;
import x40.e3;
import x40.oi;
import x40.v2;

/* loaded from: classes.dex */
public final class f implements uf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20876a;

    /* renamed from: b, reason: collision with root package name */
    public final uf0.b f20877b;

    /* renamed from: c, reason: collision with root package name */
    public final uf0.b f20878c;

    /* renamed from: d, reason: collision with root package name */
    public final uf0.b f20879d;

    /* renamed from: e, reason: collision with root package name */
    public final uf0.b f20880e;

    public f(uf0.b contextualPinImageUrlsAdapter, uf0.b recentPinImagesAdapter, uf0.b verifiedIdentityAdapter, uf0.b bizPartnerAdapter, int i13) {
        this.f20876a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(contextualPinImageUrlsAdapter, "usersAdapter");
            Intrinsics.checkNotNullParameter(recentPinImagesAdapter, "emailsAdapter");
            Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "readTimesMsAdapter");
            Intrinsics.checkNotNullParameter(bizPartnerAdapter, "lastMessageAdapter");
            this.f20877b = contextualPinImageUrlsAdapter;
            this.f20878c = recentPinImagesAdapter;
            this.f20879d = verifiedIdentityAdapter;
            this.f20880e = bizPartnerAdapter;
            return;
        }
        Intrinsics.checkNotNullParameter(contextualPinImageUrlsAdapter, "contextualPinImageUrlsAdapter");
        Intrinsics.checkNotNullParameter(recentPinImagesAdapter, "recentPinImagesAdapter");
        Intrinsics.checkNotNullParameter(verifiedIdentityAdapter, "verifiedIdentityAdapter");
        Intrinsics.checkNotNullParameter(bizPartnerAdapter, "bizPartnerAdapter");
        this.f20877b = contextualPinImageUrlsAdapter;
        this.f20878c = recentPinImagesAdapter;
        this.f20879d = verifiedIdentityAdapter;
        this.f20880e = bizPartnerAdapter;
    }

    public static void e(Object obj, i0 i0Var) {
        if (obj != null) {
            i0Var.invoke();
        }
    }

    @Override // uf0.a
    public final /* bridge */ /* synthetic */ Object B(Object obj) {
        switch (this.f20876a) {
            case 0:
                return c((e3) obj);
            default:
                return d((cj) obj);
        }
    }

    public final e3 a(ue plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String id3 = plankModel.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return new e3("ConversationNode", o13, id3, (List) this.f20878c.k(plankModel), plankModel.F(), plankModel.B(), plankModel.D(), (d3) this.f20877b.k(plankModel), (List) this.f20879d.k(plankModel), (v2) this.f20880e.k(plankModel));
    }

    public final cj b(wy0 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String id3 = plankModel.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        Integer V2 = plankModel.V2();
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        return new cj("User", id3, V2, o13, plankModel.O3(), (List) this.f20877b.k(plankModel), (List) this.f20878c.k(plankModel), plankModel.z4(), (bj) this.f20879d.k(plankModel), plankModel.s2(), plankModel.R2(), plankModel.x3(), plankModel.n3(), plankModel.k3(), plankModel.l3(), plankModel.m3(), plankModel.Z2(), plankModel.U2(), plankModel.P3(), plankModel.k2(), plankModel.N2(), plankModel.G3(), plankModel.E4(), plankModel.g2(), plankModel.h4(), plankModel.G2(), (oi) this.f20880e.k(plankModel), plankModel.u4(), plankModel.c3(), null, null, plankModel.a3(), plankModel.J3(), plankModel.E4(), plankModel.S3(), q0.f80391a, plankModel.C4(), plankModel.o3(), null);
    }

    public final ue c(e3 apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        re reVar = new re(0);
        String b13 = apolloModel.b();
        e eVar = new e(reVar, apolloModel, 0);
        if (b13 != null) {
            eVar.invoke();
        }
        String a13 = apolloModel.a();
        e eVar2 = new e(reVar, apolloModel, 1);
        if (a13 != null) {
            eVar2.invoke();
        }
        List list = (List) this.f20878c.O(apolloModel);
        if (list != null) {
            reVar.d(list);
        }
        Integer d2 = apolloModel.d();
        e eVar3 = new e(reVar, apolloModel, 2);
        if (d2 != null) {
            eVar3.invoke();
        }
        Boolean e13 = apolloModel.e();
        e eVar4 = new e(reVar, apolloModel, 3);
        if (e13 != null) {
            eVar4.invoke();
        }
        String c13 = apolloModel.c();
        e eVar5 = new e(reVar, apolloModel, 4);
        if (c13 != null) {
            eVar5.invoke();
        }
        uf0.b bVar = this.f20877b;
        List list2 = (List) bVar.O(apolloModel);
        if (list2 != null) {
            reVar.g(list2);
        }
        List list3 = (List) bVar.O(apolloModel);
        if (list3 != null) {
            reVar.c(list3);
        }
        Map map = (Map) this.f20879d.O(apolloModel);
        if (map != null) {
            reVar.f(map);
        }
        mv mvVar = (mv) this.f20880e.O(apolloModel);
        if (mvVar != null) {
            reVar.e(mvVar);
        }
        ue a14 = reVar.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        return a14;
    }

    public final wy0 d(cj apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        vy0 f23 = wy0.f2();
        e(apolloModel.f132176b, new i0(f23, apolloModel, 10));
        e(apolloModel.f132177c, new i0(f23, apolloModel, 20));
        e(apolloModel.f132178d, new i0(f23, apolloModel, 26));
        e(apolloModel.f132179e, new i0(f23, apolloModel, 27));
        Map map = (Map) this.f20877b.O(apolloModel);
        if (map != null) {
            f23.x(map);
        }
        Map map2 = (Map) this.f20878c.O(apolloModel);
        if (map2 != null) {
            f23.X0(map2);
        }
        e(apolloModel.f132182h, new i0(f23, apolloModel, 28));
        tz0 tz0Var = (tz0) this.f20879d.O(apolloModel);
        if (tz0Var != null) {
            f23.t1(tz0Var);
        }
        e(apolloModel.f132184j, new i0(f23, apolloModel, 29));
        e(apolloModel.f132185k, new i0(f23, apolloModel, 0));
        e(apolloModel.f132186l, new i0(f23, apolloModel, 1));
        e(apolloModel.f132187m, new i0(f23, apolloModel, 2));
        e(apolloModel.f132188n, new i0(f23, apolloModel, 3));
        e(apolloModel.f132189o, new i0(f23, apolloModel, 4));
        e(apolloModel.f132190p, new i0(f23, apolloModel, 5));
        e(apolloModel.f132191q, new i0(f23, apolloModel, 6));
        e(apolloModel.f132192r, new i0(f23, apolloModel, 7));
        e(apolloModel.f132193s, new i0(f23, apolloModel, 8));
        e(apolloModel.f132194t, new i0(f23, apolloModel, 9));
        e(apolloModel.f132195u, new i0(f23, apolloModel, 11));
        e(apolloModel.f132196v, new i0(f23, apolloModel, 12));
        e(apolloModel.f132197w, new i0(f23, apolloModel, 13));
        e(apolloModel.f132198x, new i0(f23, apolloModel, 14));
        e(apolloModel.f132199y, new i0(f23, apolloModel, 15));
        e(apolloModel.f132200z, new i0(f23, apolloModel, 16));
        v10 v10Var = (v10) this.f20880e.O(apolloModel);
        if (v10Var != null) {
            f23.L0(v10Var);
        }
        e(apolloModel.B, new i0(f23, apolloModel, 17));
        e(apolloModel.C, new i0(f23, apolloModel, 18));
        e(apolloModel.F, new i0(f23, apolloModel, 19));
        e(apolloModel.G, new i0(f23, apolloModel, 21));
        e(apolloModel.H, new i0(f23, apolloModel, 22));
        e(apolloModel.I, new i0(f23, apolloModel, 23));
        e(apolloModel.K, new i0(f23, apolloModel, 24));
        e(apolloModel.L, new i0(f23, apolloModel, 25));
        wy0 a13 = f23.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    @Override // uf0.a
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        switch (this.f20876a) {
            case 0:
                return a((ue) obj);
            default:
                return b((wy0) obj);
        }
    }
}
