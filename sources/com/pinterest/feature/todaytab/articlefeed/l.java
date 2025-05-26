package com.pinterest.feature.todaytab.articlefeed;

import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import java.util.Map;
import kotlin.collections.c0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import qz.f0;
import uj2.q;
import z32.m0;

/* loaded from: classes5.dex */
public final class l extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public final boolean L;
    public final Map M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String articleId, int i13, boolean z13, uk1.d presenterPinalytics, q networkStateStream, nr0.l viewBinderDelegate, xt1.d dVar, String str) {
        super(a.a.p(new StringBuilder("today_articles/"), articleId, "/feed/"), viewBinderDelegate, null, null, null, null, null, null, dVar, 0L, null, 7164);
        g1.g uiUpdates = new g1.g(0);
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(uiUpdates, "uiUpdates");
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        this.L = z13;
        this.M = uiUpdates;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.TODAY_ARTICLE_FEED_FIELDS));
        if (i13 != c42.f.UNKNOWN.getValue()) {
            f0Var.e("referrer", String.valueOf(i13));
        }
        if (str != null) {
            f0Var.e("request_params", str);
        }
        this.f49121k = f0Var;
        o(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION, new cg0.c(8, presenterPinalytics, networkStateStream));
        o(RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER, new h90.m(articleId, 18, 0));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, nr0.a
    public final gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Object[] E = super.E(uid);
        Object obj = this.M.get(uid);
        if (obj != null) {
            if (E == null) {
                E = new gb2.l[]{obj};
            } else if (!c0.y(E, obj)) {
                E = z.t(E, obj);
            }
        }
        return (gb2.l[]) E;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        return i13 == 208 ? this.E.f(i13) : this.L || i13 == 209;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        if (getItem(i13) instanceof vh) {
            s item = getItem(i13);
            Intrinsics.g(item, "null cannot be cast to non-null type com.pinterest.api.model.DynamicStory");
            if (((vh) item).f42868z == m0.TODAY_ARTICLE_SECTION) {
                return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION;
            }
        }
        if (getItem(i13) instanceof vh) {
            s item2 = getItem(i13);
            Intrinsics.g(item2, "null cannot be cast to non-null type com.pinterest.api.model.DynamicStory");
            if (((vh) item2).m0()) {
                return RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER;
            }
        }
        return this.E.getItemViewType(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean n0(int i13) {
        return getItemViewType(i13) == 208 ? super.n0(i13) : this.L || getItemViewType(i13) == 209;
    }
}
