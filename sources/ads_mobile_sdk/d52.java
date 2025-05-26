package ads_mobile_sdk;

import a.a6;
import ao2.j0;
import bj.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d52 extends r32 {

    /* renamed from: k, reason: collision with root package name */
    public final bj.m f4176k;

    /* renamed from: l, reason: collision with root package name */
    public final a.v7 f4177l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4178m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d52(j0 loadScope, j0 backgroundScope, bj.m nativeAdRequest, ss2 traceMetaSet, oh0 flags, sb2 rootTraceCreator, String publisherRequestId, h92 requestType, String appId, boolean z13, ws0 inspectorAdLifecycleMonitor, a.o8 componentProvider, int i13) {
        super(loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, publisherRequestId, requestType, nativeAdRequest, z13, appId, inspectorAdLifecycleMonitor);
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(nativeAdRequest, "nativeAdRequest");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        this.f4176k = nativeAdRequest;
        this.f4177l = componentProvider;
        this.f4178m = i13;
    }

    @Override // ads_mobile_sdk.r32
    public final Object b(bl2.c cVar) {
        Object obj = this.f4177l.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        m30 m30Var = (m30) a((a6) obj, this.f4176k);
        bj.m mVar = this.f4176k;
        mVar.getClass();
        m30Var.f8069i = mVar;
        m30Var.f8068h = Integer.valueOf(this.f4178m);
        kh2.a1.k(h92.class, m30Var.f8062b);
        kh2.a1.k(wi.k.class, m30Var.f8063c);
        kh2.a1.k(o52.class, m30Var.f8064d);
        kh2.a1.k(v01.class, m30Var.f8065e);
        kh2.a1.k(ws0.class, m30Var.f8066f);
        kh2.a1.k(Boolean.class, m30Var.f8067g);
        kh2.a1.k(Integer.class, m30Var.f8068h);
        kh2.a1.k(n.class, m30Var.f8069i);
        return ((yw0) new n30(m30Var.f8061a, m30Var.f8062b, m30Var.f8063c, m30Var.f8064d, m30Var.f8065e, m30Var.f8066f, m30Var.f8067g, m30Var.f8068h, m30Var.f8069i).f8656u0.get()).a(cVar);
    }
}
