package r12;

import dl1.a0;
import dl1.m;
import dl1.s;
import dl1.u;
import j12.i;
import kk2.k;
import kotlin.jvm.internal.Intrinsics;
import n00.c;
import uj2.b0;
import uj2.l;
import x02.c1;
import x02.d1;

/* loaded from: classes4.dex */
public final class a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f106027a;

    public a(b service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f106027a = service;
    }

    @Override // dl1.a0
    public final uj2.b a(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f106027a.c(params.a());
    }

    @Override // dl1.a0
    public final b0 b(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(params instanceof c1)) {
            throw new IllegalArgumentException("Get params must be of type ".concat(c1.class.getSimpleName()));
        }
        String a13 = params.a();
        c1 c1Var = (c1) params;
        return this.f106027a.b(a13, n00.b.a(c.CONVERSATION_MESSAGE_FEED), c1Var.f131297e, c1Var.f131298f);
    }

    @Override // dl1.a0
    public final l c(m mVar, s sVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(params instanceof d1)) {
            throw new IllegalArgumentException("Get params must be of type ".concat(d1.class.getSimpleName()));
        }
        return this.f106027a.a(params.a(), ((d1) params).f131319e);
    }

    @Override // dl1.a0
    public final b0 e(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        k kVar = new k(new i(4), 0);
        Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
        return kVar;
    }
}
