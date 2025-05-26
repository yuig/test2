package xz0;

import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import mq.w;
import ni1.c0;
import ni1.d0;
import ni1.t2;
import nr0.j;
import qz.f0;
import so.ba;
import wa2.m;

/* loaded from: classes5.dex */
public final class c extends h0 implements j {
    public final c0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String insightId, yz0.a presenterPinalytics, t2 viewModelFactory, d0 converterFactory) {
        super(a.a.p(new StringBuilder("insights/"), insightId, "/feed/"), new ke0.a[]{gh0.b.R()}, null, null, null, null, null, null, 0L, 2044);
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        this.E = ((ba) converterFactory).a(new m(-513, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), new w(presenterPinalytics, 10), new mj.m(18));
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.PIN_BASE_FIELDS));
        this.f49121k = f0Var;
        o(10, new sz0.a(4));
        W(11, new lx0.b(viewModelFactory, 1), new gv0.b(this, 5));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, nr0.a
    /* renamed from: I */
    public final s getItem(int i13) {
        if (i13 > 0) {
            return super.getItem(i13 - 1);
        }
        return null;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, sq0.e0
    public final int a() {
        if (this.f49127q.size() > 0) {
            return this.f49127q.size() + 1;
        }
        return 0;
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return i13 == 10;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return getItem(i13) == null ? 10 : 11;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return getItemViewType(i13) == 10;
    }
}
