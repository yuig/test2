package a;

import ads_mobile_sdk.bj;
import ads_mobile_sdk.ed2;
import ads_mobile_sdk.f80;
import ads_mobile_sdk.rw1;
import ads_mobile_sdk.ss2;
import ads_mobile_sdk.vo;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v1 extends bj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(String adId, ads_mobile_sdk.r0 adConfiguration, vo commonConfiguration, ss2 traceMetaSet, Optional webView, ads_mobile_sdk.n1 adEventEmitter, f80 delegatingAdListener, d2 fullScreenAdPresenter, rw1 phantomReferences, ed2 safeBrowsingManager) {
        super(adId, adConfiguration, commonConfiguration, traceMetaSet, webView, adEventEmitter, delegatingAdListener, fullScreenAdPresenter, phantomReferences, safeBrowsingManager);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(delegatingAdListener, "delegatingAdListener");
        Intrinsics.checkNotNullParameter(fullScreenAdPresenter, "fullScreenAdPresenter");
        Intrinsics.checkNotNullParameter(phantomReferences, "phantomReferences");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
    }
}
