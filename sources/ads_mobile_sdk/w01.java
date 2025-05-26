package ads_mobile_sdk;

import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w01 extends bj {

    /* renamed from: l, reason: collision with root package name */
    public final ze2 f12794l;

    /* renamed from: m, reason: collision with root package name */
    public final e2 f12795m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w01(String adId, r0 adConfiguration, vo commonConfiguration, ss2 traceMetaSet, Optional webView, n1 adEventEmitter, f80 delegatingAdListener, a.d2 fullScreenAdPresenter, ze2 serverSideVerificationOptionsHolder, e2 adMetadataHolder, rw1 phantomReferences, ed2 safeBrowsingManager) {
        super(adId, adConfiguration, commonConfiguration, traceMetaSet, webView, adEventEmitter, delegatingAdListener, fullScreenAdPresenter, phantomReferences, safeBrowsingManager);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(delegatingAdListener, "delegatingAdListener");
        Intrinsics.checkNotNullParameter(fullScreenAdPresenter, "fullScreenAdPresenter");
        Intrinsics.checkNotNullParameter(serverSideVerificationOptionsHolder, "serverSideVerificationOptionsHolder");
        Intrinsics.checkNotNullParameter(adMetadataHolder, "adMetadataHolder");
        Intrinsics.checkNotNullParameter(phantomReferences, "phantomReferences");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        this.f12794l = serverSideVerificationOptionsHolder;
        this.f12795m = adMetadataHolder;
    }
}
