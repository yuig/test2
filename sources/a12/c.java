package a12;

import dl1.a0;
import dl1.m;
import dl1.s;
import dl1.u;
import hk2.p;
import java.util.List;
import kk2.k;
import kotlin.jvm.internal.Intrinsics;
import l7.w0;
import nm.o;
import uj2.b0;
import uj2.l;
import x02.h;
import x02.i;
import x02.q;

/* loaded from: classes4.dex */
public final class c implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f374a;

    /* renamed from: b, reason: collision with root package name */
    public final o f375b;

    public c(d aggregatedCommentService, o gson) {
        Intrinsics.checkNotNullParameter(aggregatedCommentService, "aggregatedCommentService");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f374a = aggregatedCommentService;
        this.f375b = gson;
    }

    @Override // dl1.a0
    public final uj2.b a(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(params instanceof i)) {
            throw new IllegalArgumentException("Delete params must be of type ".concat(i.class.getSimpleName()));
        }
        return this.f374a.u(params.a(), ((i) params).f131409e);
    }

    @Override // dl1.a0
    public final b0 b(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        kk2.m mVar2 = new kk2.m(new k(new w0(21), 1), new jr1.a(25, new b(this, params)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar2, "flatMap(...)");
        return mVar2;
    }

    @Override // dl1.a0
    public final l c(m mVar, s sVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(params instanceof q)) {
            throw new IllegalArgumentException("Update params must be of type ".concat(q.class.getSimpleName()));
        }
        hk2.k kVar = new hk2.k(new p(new w0(20)), new jr1.a(24, new b(params, this, 2)), 1);
        Intrinsics.checkNotNullExpressionValue(kVar, "flatMap(...)");
        return kVar;
    }

    @Override // dl1.a0
    public final b0 e(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(params instanceof h)) {
            throw new IllegalArgumentException("Create params must be of type ".concat(h.class.getSimpleName()));
        }
        kk2.m mVar2 = new kk2.m(new k(new w0(19), 1), new jr1.a(23, new b(params, this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar2, "flatMap(...)");
        return mVar2;
    }

    public final String f(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return this.f375b.k(list);
        }
        return null;
    }
}
