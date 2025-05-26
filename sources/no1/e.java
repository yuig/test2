package no1;

import com.pinterest.framework.multisection.datasource.pagedlist.h;
import kk2.m;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import x40.m9;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f91667a;

    public e(oc.c apolloClient, n1 experiments) {
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f91667a = apolloClient;
    }

    public final m a(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        m k13 = com.bumptech.glide.d.u0(this.f91667a.c(new m9(conversationId))).r(tk2.e.f118017c).l(wj2.c.a()).k(new h(24, b.f91662o));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }
}
