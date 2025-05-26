package nx0;

import android.content.Context;
import ck2.i;
import com.pinterest.api.model.deserializer.NewsHubItemDeserializer;
import com.pinterest.api.model.dh;
import com.pinterest.api.model.qx;
import com.pinterest.feature.newshub.feed.datasource.NewsHubFeedFilter;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import dl1.s;
import ek2.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.h2;
import nx.d0;
import qz.f0;
import so.oa;
import sq0.f;
import xv.g;
import zu1.e;

/* loaded from: classes5.dex */
public final class c extends h0 {
    public final h2 E;
    public final Function1 F;
    public final d G;
    public final f H;
    public j I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f92491J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h2 experiments, sx0.b sectionTitle, uk1.d presenterPinalytics, nu1.a inAppNavigator, w12.b newsHubService, uo.a graphQLNewsHubDataSource, d dVar, f fVar) {
        super("news_hub/feed/", new ke0.a[]{(NewsHubItemDeserializer) ((oa) ((so1.b) ep.b.g(so1.b.class))).Jc.get()}, null, null, null, new NewsHubFeedFilter(), null, null, 0L, 1980);
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(newsHubService, "newsHubService");
        Intrinsics.checkNotNullParameter(graphQLNewsHubDataSource, "graphQLNewsHubDataSource");
        Context context = kb0.a.f79058b;
        this.E = experiments;
        this.F = sectionTitle;
        this.G = dVar;
        this.H = fVar;
        d0 d0Var = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        e0();
        c(new int[]{294, 296}, new g(d0Var, inAppNavigator, newsHubService, graphQLNewsHubDataSource));
        o(295, new pk0.b(26));
        if (experiments.d()) {
            o(297, new pk0.b(27));
        }
    }

    @Override // wk1.e
    public final void E2() {
        this.I = (j) this.f49129s.F(new hx0.a(1, new dx0.d(this, 4)), new hx0.a(2, b.f92490i), i.f27923c, i.f27924d);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void Z() {
        this.f92491J = true;
        super.Z();
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        ArrayList arrayList = new ArrayList();
        boolean d2 = this.E.d();
        Function1 function1 = this.F;
        if (!d2) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : itemsToSet) {
                s sVar = (s) obj;
                Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.NewsHubItem");
                Boolean y13 = ((qx) sVar).y();
                Intrinsics.checkNotNullExpressionValue(y13, "getUnread(...)");
                if (y13.booleanValue()) {
                    arrayList2.add(obj);
                } else {
                    arrayList3.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(qx.C((String) function1.invoke(Integer.valueOf(e.news_hub_new))));
                arrayList.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(qx.C((String) function1.invoke(Integer.valueOf(e.news_hub_seen))));
                arrayList.addAll(arrayList3);
            }
        } else if (!this.f92491J) {
            arrayList.add(qx.C((String) function1.invoke(Integer.valueOf(e.notification_host_activities_tab))));
            List list = itemsToSet;
            if (!list.isEmpty()) {
                Object firstOrNull = CollectionsKt.firstOrNull(itemsToSet);
                qx highlight = firstOrNull instanceof qx ? (qx) firstOrNull : null;
                if ((highlight != null ? highlight.g() : null) == dh.DISPLAY_MODE_HIGHLIGHT_NOTIFICATION) {
                    Boolean y14 = highlight.y();
                    Intrinsics.checkNotNullExpressionValue(y14, "getUnread(...)");
                    if (y14.booleanValue()) {
                        d dVar = this.G;
                        if (dVar != null) {
                            Intrinsics.checkNotNullParameter(highlight, "highlight");
                            dVar.j2(highlight);
                        }
                        arrayList.addAll(itemsToSet.subList(1, itemsToSet.size()));
                    }
                }
                arrayList.addAll(list);
            }
            if (arrayList.size() == 1) {
                qx A = qx.A();
                Intrinsics.checkNotNullExpressionValue(A, "makeEmptyItem(...)");
                arrayList.add(A);
            }
        }
        super.b0(arrayList, z13);
        this.f92491J = false;
    }

    public final void e0() {
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.NEWS_HUB_FEED));
        f0Var.e("page_size", "10");
        this.f49121k = f0Var;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        qx qxVar = item instanceof qx ? (qx) item : null;
        if (qxVar == null) {
            return 0;
        }
        dh g13 = qxVar.g();
        int i14 = g13 == null ? -1 : a.f92489a[g13.ordinal()];
        if (i14 == 1) {
            return 295;
        }
        if (i14 != 2) {
            return i14 != 3 ? 294 : 297;
        }
        return 296;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, wk1.e
    public final void onUnbind() {
        super.onUnbind();
        j jVar = this.I;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.I = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if ((r0 != null ? r0.g() : null) == com.pinterest.api.model.dh.DISPLAY_MODE_EMPTY_ITEM) goto L14;
     */
    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.util.List r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "itemsToAppend"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L3d
            java.util.List r0 = r3.d()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L39
            java.util.List r0 = r3.d()
            int r0 = kotlin.collections.f0.i(r0)
            dl1.s r0 = r3.getItem(r0)
            boolean r1 = r0 instanceof com.pinterest.api.model.qx
            r2 = 0
            if (r1 == 0) goto L2e
            com.pinterest.api.model.qx r0 = (com.pinterest.api.model.qx) r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            if (r0 == 0) goto L35
            com.pinterest.api.model.dh r2 = r0.g()
        L35:
            com.pinterest.api.model.dh r0 = com.pinterest.api.model.dh.DISPLAY_MODE_EMPTY_ITEM
            if (r2 != r0) goto L3d
        L39:
            r3.b0(r4, r5)
            goto L40
        L3d:
            super.w(r4, r5)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nx0.c.w(java.util.List, boolean):void");
    }
}
