package e41;

import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.w;
import wk1.i;
import wk1.q;
import y01.p1;

/* loaded from: classes5.dex */
public final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    public final w f57181a;

    /* renamed from: b, reason: collision with root package name */
    public final g70.h f57182b;

    /* renamed from: c, reason: collision with root package name */
    public final bq0.a f57183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String userId, uj2.q networkStateStream, b60.b activeUserManager, w eventManager, g0 pageSizeProvider, uk1.d presenterPinalytics, pb0.d fuzzyDateFormatter, g70.h boardNavigator) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f57181a = eventManager;
        this.f57182b = boardNavigator;
        this.f57183c = new bq0.a(userId, pageSizeProvider, new yo0.a(new p1(this, 27), new gv0.b(this, 13), ((b60.d) activeUserManager).f(), fuzzyDateFormatter, new ka2.c(getPinalytics(), (gx0.b) null, 6), (ka2.a) null, 200));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f57183c);
    }
}
