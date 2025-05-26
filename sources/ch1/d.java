package ch1;

import android.content.Context;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.zv0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.todaytab.tab.view.n;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nr0.l;
import qz.f0;
import so.oa;
import uj2.q;
import we1.f2;
import x02.x2;
import xv.g;
import z32.m0;

/* loaded from: classes5.dex */
public final class d extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i13, boolean z13, yk1.a viewResources, uk1.d presenterPinalytics, q networkStateStream, l viewBinderDelegate, x2 userRepository, w eventManager) {
        super("today_articles/recommended/", viewBinderDelegate, null, null, null, new ke0.a[]{(ke0.a) ((oa) ((so1.b) ep.b.g(so1.b.class))).f113995x3.get(), gh0.b.N()}, null, null, null, 0L, null, 8156);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Context context = kb0.a.f79058b;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.TODAY_ARTICLE_DEFAULT));
        f0Var.e("num_days", String.valueOf(3));
        f0Var.e("story_pin_version", "0.16.0");
        f0Var.e("referrer", String.valueOf(i13));
        this.f49121k = f0Var;
        c(n.f48737a, new g(eventManager, presenterPinalytics, userRepository, networkStateStream));
        o(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER, new f2(17));
        o(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER, new tj0.w(this, presenterPinalytics, networkStateStream, z13, viewResources));
        o(-2, new f2(18));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        return i13 == 205;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        if (getItem(i13) instanceof zv0) {
            s item = getItem(i13);
            zv0 zv0Var = item instanceof zv0 ? (zv0) item : null;
            return n.a((zv0Var != null ? zv0Var.L() : 0).intValue());
        }
        if (!(getItem(i13) instanceof vh)) {
            return -2;
        }
        s item2 = getItem(i13);
        vh vhVar = item2 instanceof vh ? (vh) item2 : null;
        m0 m0Var = vhVar != null ? vhVar.f42868z : null;
        if (m0Var == null) {
            m0Var = m0.NONE;
        }
        int i14 = c.f27739a[m0Var.ordinal()];
        if (i14 == 1) {
            return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER;
        }
        if (i14 != 2) {
            return -2;
        }
        return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean q(int i13) {
        return i13 == 205;
    }
}
