package xb1;

import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import sq0.c0;
import wb1.t;
import wk1.q;
import x02.x2;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends q implements com.pinterest.feature.settings.permissions.c {

    /* renamed from: a, reason: collision with root package name */
    public final w f134505a;

    /* renamed from: b, reason: collision with root package name */
    public final v f134506b;

    /* renamed from: c, reason: collision with root package name */
    public final x10.d f134507c;

    /* renamed from: d, reason: collision with root package name */
    public final t f134508d;

    /* renamed from: e, reason: collision with root package name */
    public final c f134509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uk1.d pinalytics, uj2.q networkStateStream, w eventManager, yk1.a resources, x10.d settingsApi, x2 userRepository) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f134505a = eventManager;
        this.f134506b = resources;
        this.f134507c = settingsApi;
        this.f134508d = new t(userRepository, resources);
        this.f134509e = new c(this);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        d0.v(getPinalytics(), f1.MANUAL_FILTERS_VISIT, null, false, 12);
        ((wk1.i) dataSources).b(this.f134508d);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f134505a.j(this.f134509e);
        ((yb1.j) ((com.pinterest.feature.settings.permissions.d) getView())).B0 = null;
        super.onUnbind();
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void r3(com.pinterest.feature.settings.permissions.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        this.f134505a.h(this.f134509e);
        yb1.j jVar = (yb1.j) view;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        jVar.B0 = this;
    }
}
