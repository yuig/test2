package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yb2 extends v0 {

    /* renamed from: j, reason: collision with root package name */
    public final qo2 f14188j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb2(qo2 thirdPartyAdConfigurationRenderer, ss2 traceMetaSet, wi.k baseRequest, h92 requestType, long j13, int i13, r0 adConfiguration, vo commonConfiguration, cf2 serverTransaction, String renderId) {
        super(traceMetaSet, baseRequest, requestType, j13, i13, adConfiguration, commonConfiguration, serverTransaction, renderId);
        Intrinsics.checkNotNullParameter(thirdPartyAdConfigurationRenderer, "thirdPartyAdConfigurationRenderer");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        this.f14188j = thirdPartyAdConfigurationRenderer;
    }

    @Override // ads_mobile_sdk.v0
    public final Object a(boolean z13, bl2.c cVar) {
        return this.f14188j.a(true, cVar);
    }

    @Override // a.kb
    public final boolean b() {
        return this.f14188j.b();
    }
}
