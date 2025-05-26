package px0;

import android.content.Context;
import com.pinterest.api.model.dh;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.tx;
import com.pinterest.feature.newshub.feed.view.NewsHubFeedItemBaseView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.s2;
import h32.q1;
import h32.u0;
import i92.k;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.h2;
import m60.u;
import m60.w;
import nx.d0;
import so.oa;

/* loaded from: classes5.dex */
public final class j extends yk1.b implements mx0.a {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f101616a;

    /* renamed from: b, reason: collision with root package name */
    public final w12.b f101617b;

    /* renamed from: c, reason: collision with root package name */
    public final uo.a f101618c;

    /* renamed from: d, reason: collision with root package name */
    public qx f101619d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f101620e;

    /* renamed from: f, reason: collision with root package name */
    public final h2 f101621f;

    /* renamed from: g, reason: collision with root package name */
    public final k f101622g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d0 pinalytics, nu1.a inAppNavigator, w12.b newsHubService, uo.a graphQLNewsHubDataSource) {
        super(0);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(newsHubService, "newsHubService");
        Intrinsics.checkNotNullParameter(graphQLNewsHubDataSource, "graphQLNewsHubDataSource");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(newsHubService, "newsHubService");
        Intrinsics.checkNotNullParameter(graphQLNewsHubDataSource, "graphQLNewsHubDataSource");
        this.f101616a = pinalytics;
        this.f101617b = newsHubService;
        this.f101618c = graphQLNewsHubDataSource;
        this.f101621f = h2.f83379b.b();
        Context context = kb0.a.f79058b;
        this.f101622g = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0313, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.x1(), java.lang.Boolean.TRUE) != false) goto L129;
     */
    @Override // yk1.b
    /* renamed from: onBind */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3(yk1.n r10) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: px0.j.r3(yk1.n):void");
    }

    @Override // yk1.b
    public final void onUnbind() {
        ((NewsHubFeedItemBaseView) ((mx0.b) getView())).f46808i = null;
        super.onUnbind();
    }

    public final void p3(u0 elementType, w12.a aVar) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        qx item = this.f101619d;
        if (item == null) {
            return;
        }
        int i13 = aVar == null ? -1 : c.f101585a[aVar.ordinal()];
        q1 q1Var = i13 != 1 ? i13 != 2 ? i13 != 3 ? null : q1.PHOTOS : q1.COMMENTS : q1.ALL;
        HashMap hashMap = new HashMap();
        hashMap.put("news_id", item.getUid());
        tx u13 = item.u();
        hashMap.put("news_type", String.valueOf(u13 != null ? Integer.valueOf(u13.getValue()) : null));
        dh g13 = item.g();
        hashMap.put("display_mode", String.valueOf(g13 != null ? Integer.valueOf(g13.getValue()) : null));
        String num = q1Var != null ? Integer.valueOf(q1Var.value()).toString() : null;
        if (num == null) {
            num = "";
        }
        hashMap.put("notification_filter_type", num);
        Integer num2 = this.f101620e;
        bs1.c.G1("grid_index", num2 != null ? num2.toString() : null, hashMap);
        this.f101616a.f0(elementType, null, item.getUid(), hashMap, false);
        w wVar = u.f85943a;
        String uid = item.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        wVar.d(new mx0.e(uid));
        if (item.v() != null) {
            NewsHubFeedItemBaseView newsHubFeedItemBaseView = (NewsHubFeedItemBaseView) ((mx0.b) getView());
            newsHubFeedItemBaseView.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            nu1.a aVar2 = newsHubFeedItemBaseView.f46803d;
            if (aVar2 == null) {
                Intrinsics.r("inAppNavigator");
                throw null;
            }
            nu1.a.c(aVar2, item.v(), null, null, false, 30);
        } else {
            NewsHubFeedItemBaseView newsHubFeedItemBaseView2 = (NewsHubFeedItemBaseView) ((mx0.b) getView());
            newsHubFeedItemBaseView2.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            newsHubFeedItemBaseView2.a().d(Navigation.r0((ScreenLocation) s2.f51346e.getValue(), item));
        }
        String uid2 = item.getUid();
        String v13 = item.v();
        if (v13 == null) {
            v13 = a.a.j("/news_hub/", item.getUid());
        }
        fk2.c l13 = this.f101617b.c(uid2, v13).l(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
        nl.b.r(l13, null, d.f101592p, 1);
    }
}
