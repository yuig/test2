package ads_mobile_sdk;

import a.a6;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y42 extends r32 {

    /* renamed from: k, reason: collision with root package name */
    public final wi.h f14084k;

    /* renamed from: l, reason: collision with root package name */
    public final a.v7 f14085l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y42(wi.h adRequest, h92 requestType, oh0 flags, ws0 inspectorAdLifecycleMonitor, sb2 rootTraceCreator, ss2 traceMetaSet, String publisherRequestId, String appId, a.o8 componentProvider, j0 loadScope, j0 backgroundScope, boolean z13) {
        super(loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, publisherRequestId, requestType, adRequest, z13, appId, inspectorAdLifecycleMonitor);
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        this.f14084k = adRequest;
        this.f14085l = componentProvider;
    }

    @Override // ads_mobile_sdk.r32
    public final Object b(bl2.c cVar) {
        Object obj = this.f14085l.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        i30 i30Var = (i30) a((a6) obj, this.f14084k);
        kh2.a1.k(h92.class, i30Var.f6201b);
        kh2.a1.k(wi.k.class, i30Var.f6202c);
        kh2.a1.k(o52.class, i30Var.f6203d);
        kh2.a1.k(v01.class, i30Var.f6204e);
        kh2.a1.k(ws0.class, i30Var.f6205f);
        kh2.a1.k(Boolean.class, i30Var.f6206g);
        return ((yw0) new j30(i30Var.f6200a, i30Var.f6201b, i30Var.f6202c, i30Var.f6203d, i30Var.f6204e, i30Var.f6205f, i30Var.f6206g).f6656s0.get()).a(cVar);
    }
}
