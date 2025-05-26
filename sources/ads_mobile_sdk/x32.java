package ads_mobile_sdk;

import a.a6;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x32 extends r32 {

    /* renamed from: k, reason: collision with root package name */
    public final wi.h f13459k;

    /* renamed from: l, reason: collision with root package name */
    public final a.v7 f13460l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x32(wi.h adRequest, h92 requestType, oh0 flags, ws0 inspectorAdLifecycleMonitor, sb2 rootTraceCreator, ss2 traceMetaSet, String publisherRequestId, String appId, a.o8 componentProvider, j0 loadScope, j0 backgroundScope, boolean z13) {
        super(loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, publisherRequestId, requestType, adRequest, z13, appId, inspectorAdLifecycleMonitor);
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        this.f13459k = adRequest;
        this.f13460l = componentProvider;
    }

    @Override // ads_mobile_sdk.r32
    public final Object b(bl2.c cVar) {
        Object obj = this.f13460l.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        w20 w20Var = (w20) a((a6) obj, this.f13459k);
        kh2.a1.k(h92.class, w20Var.f12816b);
        kh2.a1.k(wi.k.class, w20Var.f12817c);
        kh2.a1.k(o52.class, w20Var.f12818d);
        kh2.a1.k(v01.class, w20Var.f12819e);
        kh2.a1.k(ws0.class, w20Var.f12820f);
        kh2.a1.k(Boolean.class, w20Var.f12821g);
        return ((yw0) new x20(w20Var.f12815a, w20Var.f12816b, w20Var.f12817c, w20Var.f12818d, w20Var.f12819e, w20Var.f12820f, w20Var.f12821g).f13394s0.get()).a(cVar);
    }
}
