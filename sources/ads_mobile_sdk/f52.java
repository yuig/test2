package ads_mobile_sdk;

import ao2.j0;
import bj.n;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class f52 extends w32 {

    /* renamed from: s, reason: collision with root package name */
    public final a.v7 f5062s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f52(a.o8 componentProvider, rh2 signalGenerationMap, dv cryptoUtil, String adString, j0 loadScope, j0 backgroundScope, ss2 traceMetaSet, oh0 flags, sb2 rootTraceCreator, String publisherRequestId, h92 requestType, String appId, ws0 inspectorAdLifecycleMonitor) {
        super(signalGenerationMap, cryptoUtil, adString, loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, publisherRequestId, requestType, appId, inspectorAdLifecycleMonitor);
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(signalGenerationMap, "signalGenerationMap");
        Intrinsics.checkNotNullParameter(cryptoUtil, "cryptoUtil");
        Intrinsics.checkNotNullParameter(adString, "adString");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        this.f5062s = componentProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.w32
    public final Object a(String str, mh2 mh2Var, v32 v32Var) {
        dj.e eVar = mh2Var.f8229b;
        if (!(eVar instanceof bj.p)) {
            return l0.i0(new Pair(w32.f12849p, null));
        }
        Object obj = this.f5062s.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        k30 k30Var = (k30) a((a.g5) obj, eVar, str, mh2Var);
        n nVar = (n) eVar;
        nVar.getClass();
        k30Var.f7085j = nVar;
        kh2.a1.k(mh2.class, k30Var.f7077b);
        kh2.a1.k(String.class, k30Var.f7078c);
        kh2.a1.k(wi.k.class, k30Var.f7079d);
        kh2.a1.k(h92.class, k30Var.f7080e);
        kh2.a1.k(Boolean.class, k30Var.f7081f);
        kh2.a1.k(o52.class, k30Var.f7082g);
        kh2.a1.k(v01.class, k30Var.f7083h);
        kh2.a1.k(ws0.class, k30Var.f7084i);
        kh2.a1.k(n.class, k30Var.f7085j);
        return ((yw0) new l30(k30Var.f7076a, k30Var.f7077b, k30Var.f7078c, k30Var.f7079d, k30Var.f7080e, k30Var.f7082g, k30Var.f7083h, k30Var.f7085j).f7654x.get()).a(v32Var);
    }
}
