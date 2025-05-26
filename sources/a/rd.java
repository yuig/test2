package a;

import ads_mobile_sdk.cf2;
import ads_mobile_sdk.dz;
import ads_mobile_sdk.h92;
import ads_mobile_sdk.lz2;
import ads_mobile_sdk.ss2;
import ads_mobile_sdk.tp0;
import ads_mobile_sdk.vo;
import ads_mobile_sdk.zi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rd extends zi {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(int i13, long j13, wi.k baseRequest, ads_mobile_sdk.r0 adConfiguration, ads_mobile_sdk.hf appSettings, vo commonConfiguration, h92 requestType, cf2 serverTransaction, ss2 traceMetaSet, dz csiTicker, tp0 htmlUtil, lz2 webViewFactory, String renderId, o8 adComponentProvider, ao2.j0 uiScope) {
        super(i13, j13, baseRequest, adConfiguration, appSettings, commonConfiguration, requestType, serverTransaction, traceMetaSet, csiTicker, htmlUtil, webViewFactory, renderId, adComponentProvider, uiScope);
        Intrinsics.checkNotNullParameter(adComponentProvider, "adComponentProvider");
        Intrinsics.checkNotNullParameter(csiTicker, "csiTicker");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(htmlUtil, "htmlUtil");
    }
}
