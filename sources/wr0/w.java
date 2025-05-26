package wr0;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends wk1.q {

    /* renamed from: a, reason: collision with root package name */
    public final k20.a f130927a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f130928b;

    /* renamed from: c, reason: collision with root package name */
    public final x12.a f130929c;

    /* renamed from: d, reason: collision with root package name */
    public final y f130930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(uj2.q networkStateStream, uk1.e presenterPinalyticsFactory, k20.a engagementTabService, b60.b activeUserManager, x12.a pagedListService, pb0.d fuzzyDateFormatter) {
        super(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(engagementTabService, "engagementTabService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        this.f130927a = engagementTabService;
        this.f130928b = activeUserManager;
        this.f130929c = pagedListService;
        xb0.a aVar = new xb0.a(this, 27);
        v vVar = new v(this);
        wy0 f13 = ((b60.d) activeUserManager).f();
        String z43 = f13 != null ? f13.z4() : null;
        this.f130930d = new y(a.a.k("interactions/users/", z43 == null ? "" : z43, "/"), pagedListService, fuzzyDateFormatter, aVar, vVar);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f130930d);
    }
}
