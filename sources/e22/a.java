package e22;

import b22.f;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import dl1.a0;
import dl1.m;
import dl1.s;
import dl1.u;
import fk2.h;
import hk2.c;
import j12.i;
import kk2.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import uj2.b;
import uj2.b0;
import uj2.l;
import x02.m2;

/* loaded from: classes2.dex */
public final class a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final a30.a f56994a;

    public a(a30.a urlInfoService) {
        Intrinsics.checkNotNullParameter(urlInfoService, "urlInfoService");
        this.f56994a = urlInfoService;
    }

    @Override // dl1.a0
    public final b a(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        h hVar = new h(new i(16), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "error(...)");
        return hVar;
    }

    @Override // dl1.a0
    public final b0 b(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        m2 m2Var = (m2) params;
        String str = m2Var.f131449e;
        kk2.m k13 = ((str == null || z.j(str)) ? this.f56994a.a(m2Var.f131448d) : this.f56994a.b(m2Var.f131448d, m2Var.f131449e, null, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, "closeup")).k(new f(2, new s12.a(params, 1)));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }

    @Override // dl1.a0
    public final l c(m mVar, s sVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        c cVar = new c(new i(18), 1);
        Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
        return cVar;
    }

    @Override // dl1.a0
    public final b0 e(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        k kVar = new k(new i(17), 0);
        Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
        return kVar;
    }
}
