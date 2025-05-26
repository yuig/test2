package ads_mobile_sdk;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b03 extends g41 implements a.b {

    /* renamed from: j, reason: collision with root package name */
    public final ym0 f2613j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b03(ym0 gmaWebView, sb2 rootTraceCreator, ss2 traceMetaSet, cm0 gmaUtil, j0 backgroundScope, oh0 flags) {
        super(rootTraceCreator, traceMetaSet, gmaUtil, backgroundScope, flags);
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f2613j = gmaWebView;
    }

    @Override // a.b
    public final ym0 a() {
        return this.f2613j;
    }
}
