package com.pinterest.feature.todaytab.articlefeed;

import androidx.appcompat.widget.c2;
import com.pinterest.api.model.zv0;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import jk2.j1;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import so.n6;
import uj2.q;
import x02.x2;

/* loaded from: classes5.dex */
public final class n extends wk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final zv0 f48633a;

    /* renamed from: b, reason: collision with root package name */
    public final c2 f48634b;

    /* renamed from: c, reason: collision with root package name */
    public final l f48635c;

    /* renamed from: d, reason: collision with root package name */
    public final ah1.a f48636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wk1.c params, zv0 article, int i13, w eventManager, w20.a todayTabService, nr0.m dynamicGridViewBinderDelegateFactory, x2 userRepository, String str, c2 sharesheetUtils) {
        super(params);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(article, "article");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(todayTabService, "todayTabService");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f48633a = article;
        this.f48634b = sharesheetUtils;
        String uid = article.getUid();
        String str2 = uid == null ? "" : uid;
        Boolean O = article.O();
        Intrinsics.checkNotNullExpressionValue(O, "getIsFeedSingleColumn(...)");
        boolean booleanValue = O.booleanValue();
        uk1.d presenterPinalytics = getPresenterPinalytics();
        q<Boolean> networkStateStream = getNetworkStateStream();
        uk1.d presenterPinalytics2 = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        this.f48635c = new l(str2, i13, booleanValue, presenterPinalytics, networkStateStream, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics2, nVar.f103320a, nVar, params.f130137h), null, str);
        String uid2 = article.getUid();
        zt0.b list = new zt0.b(uid2 == null ? "" : uid2, getPresenterPinalytics(), getNetworkStateStream(), userRepository, todayTabService, eventManager);
        Intrinsics.checkNotNullParameter(list, "list");
        ah1.a aVar = new ah1.a(list, false, 6);
        aVar.k(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER);
        aVar.g(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER);
        this.f48636d = aVar;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(new com.pinterest.framework.multisection.datasource.pagedlist.f(this.f48635c, 14));
        iVar.b(this.f48636d);
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        j jVar = (j) view;
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = jVar.f139734h0;
        int i13 = 0;
        if (pinterestSwipeRefreshLayout != null) {
            pinterestSwipeRefreshLayout.setEnabled(false);
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        jVar.Y0 = this;
        gb2.f fVar = gb2.f.f64747a;
        mk2.k kVar = gl1.c.f65741g;
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(18, i.f48617k);
        dVar.getClass();
        x xVar = new x(new j1(new j1(pk2.f.j(new j1(dVar, aVar, 0), new qt.b(18, i.f48618l), 2, "filter(...)"), new f5.g(false, 6), 0), new qt.a(18, new m(this, i13)), 0), new qt.b(18, i.f48619m), 2);
        if (kVar != null) {
            xVar.A(kVar);
        }
        xj2.c F = xVar.F(new rr.c(7, new m(this, 1)), ck2.i.f27925e, ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void v3() {
        this.f48634b.q(y32.f.TODAY_ARTICLE_FEED.getValue(), this.f48633a);
    }
}
