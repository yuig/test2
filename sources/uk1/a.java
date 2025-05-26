package uk1;

import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.f0;

/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f122378a;

    public a(f0 pinalyticsFactory) {
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f122378a = pinalyticsFactory;
    }

    public final d d(String objectId) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        return new d(objectId, new e3.a(5), this.f122378a);
    }

    public final d e(String objectId, e3.a pinalyticsViewType) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(pinalyticsViewType, "pinalyticsViewType");
        return new d(objectId, pinalyticsViewType, this.f122378a);
    }

    public final d f(d0 pinalytics, String objectId) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        return new d(new e3.a(5), pinalytics, objectId);
    }

    public final d g() {
        return new d("", new e3.a(5), this.f122378a);
    }
}
