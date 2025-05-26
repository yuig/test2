package s12;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import dl1.a0;
import dl1.m;
import dl1.s;
import dl1.u;
import fk2.g;
import fk2.h;
import j12.i;
import java.util.List;
import kk2.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import n00.c;
import nm.o;
import uj2.b0;
import uj2.l;
import x02.g1;
import x02.h1;
import x02.i1;
import x02.j1;
import x02.k1;
import x02.l1;
import x02.m1;
import x02.n1;
import x02.x2;

/* loaded from: classes4.dex */
public final class b implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final l22.a f110596a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f110597b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f110598c;

    /* renamed from: d, reason: collision with root package name */
    public final o f110599d;

    public b(l22.a service, x2 userRepository, b60.b activeUserManager, o gson) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f110596a = service;
        this.f110597b = userRepository;
        this.f110598c = activeUserManager;
        this.f110599d = gson;
    }

    @Override // dl1.a0
    public final uj2.b a(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        h1 h1Var = params instanceof h1 ? (h1) params : null;
        if (h1Var == null) {
            h hVar = new h(new i(5), 1);
            Intrinsics.checkNotNullExpressionValue(hVar, "error(...)");
            return hVar;
        }
        g i13 = this.f110596a.h(h1Var.f131405e, h1Var.f131404d.getUid()).k(new jr1.a(29, new a(this, 0))).i();
        Intrinsics.checkNotNullExpressionValue(i13, "ignoreElement(...)");
        return i13;
    }

    @Override // dl1.a0
    public final b0 b(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f110596a.b(params.a(), n00.b.a(c.DID_IT_EDIT_ADD));
    }

    @Override // dl1.a0
    public final l c(m mVar, s sVar) {
        l lVar;
        f30 O;
        String uid;
        u params = (u) mVar;
        az0 az0Var = (az0) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z13 = params instanceof k1;
        l22.a aVar = this.f110596a;
        if (z13) {
            lVar = aVar.f(params.a(), ((k1) params).f131459d).o();
        } else if (params instanceof m1) {
            lVar = aVar.k(params.a(), ((m1) params).f131459d).o();
        } else if (params instanceof l1) {
            lVar = aVar.c(o32.c.USER_DID_IT_DATA.getValue(), params.a(), ((l1) params).f131459d).o();
        } else if (params instanceof n1) {
            lVar = aVar.i(o32.c.USER_DID_IT_DATA.getValue(), params.a(), ((n1) params).f131459d).o();
        } else if (params instanceof j1) {
            String a13 = params.a();
            j1 j1Var = (j1) params;
            lVar = aVar.e(a13, j1Var.f131459d, j1Var.f131423f).o();
        } else if (!(params instanceof i1)) {
            hk2.c cVar = new hk2.c(new i(8), 1);
            Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
            lVar = cVar;
        } else {
            if (az0Var == null || (O = az0Var.O()) == null || (uid = O.getUid()) == null) {
                hk2.c cVar2 = new hk2.c(new i(7), 1);
                Intrinsics.checkNotNullExpressionValue(cVar2, "error(...)");
                return cVar2;
            }
            float max = Math.max((float) az0Var.R().doubleValue(), 0.0f);
            String str = ((i1) params).f131412f;
            lVar = this.f110596a.a(params.a(), n00.b.a(c.DID_IT_EDIT_ADD), uid, max == -1.0f ? null : Float.valueOf(max), (str == null || !(z.j(str) ^ true)) ? null : str, ((i1) params).f131413g).t();
        }
        return lVar;
    }

    @Override // dl1.a0
    public final b0 e(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        g1 g1Var = params instanceof g1 ? (g1) params : null;
        if (g1Var == null) {
            k kVar = new k(new i(6), 0);
            Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
            return kVar;
        }
        String uid = g1Var.f131387e.getUid();
        List list = g1Var.f131390h;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        String k13 = list != null ? this.f110599d.k(list) : null;
        String a13 = n00.b.a(g1Var.f131391i == az0.a.RESPONSE.ordinal() ? c.RESPONSE_FIELDS : c.DID_IT_MODEL);
        Intrinsics.f(uid);
        return this.f110596a.d(uid, g1Var.f131391i, g1Var.f131388f, g1Var.f131389g, k13, a13, g1Var.f131393k, g1Var.f131392j, g1Var.f131394l, g1Var.f131395m);
    }
}
