package ads_mobile_sdk;

import a.a6;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p52 extends r32 {

    /* renamed from: k, reason: collision with root package name */
    public final wi.h f9562k;

    /* renamed from: l, reason: collision with root package name */
    public final a.v7 f9563l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p52(wi.h adRequest, h92 requestType, oh0 flags, ws0 inspectorAdLifecycleMonitor, sb2 rootTraceCreator, ss2 traceMetaSet, String publisherRequestId, String appId, a.o8 componentProvider, j0 loadScope, j0 backgroundScope, boolean z13) {
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
        this.f9562k = adRequest;
        this.f9563l = componentProvider;
    }

    @Override // ads_mobile_sdk.r32
    public final Object b(bl2.c cVar) {
        Object obj = this.f9563l.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        q30 q30Var = (q30) a((a6) obj, this.f9562k);
        kh2.a1.k(h92.class, q30Var.f9923b);
        kh2.a1.k(wi.k.class, q30Var.f9924c);
        kh2.a1.k(o52.class, q30Var.f9925d);
        kh2.a1.k(v01.class, q30Var.f9926e);
        kh2.a1.k(ws0.class, q30Var.f9927f);
        kh2.a1.k(Boolean.class, q30Var.f9928g);
        return ((yw0) new r30(q30Var.f9922a, q30Var.f9923b, q30Var.f9924c, q30Var.f9925d, q30Var.f9926e, q30Var.f9927f, q30Var.f9928g).f10469s0.get()).a(cVar);
    }
}
