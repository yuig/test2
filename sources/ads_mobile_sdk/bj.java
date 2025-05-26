package ads_mobile_sdk;

import android.content.Context;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class bj extends lw0 {

    /* renamed from: j, reason: collision with root package name */
    public final a.d2 f2889j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2890k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(String adId, r0 adConfiguration, vo commonConfiguration, ss2 traceMetaSet, Optional webView, n1 adEventEmitter, f80 delegatingAdListener, a.d2 fullScreenAdPresenter, rw1 phantomReferences, ed2 safeBrowsingManager) {
        super(adId, adConfiguration, commonConfiguration, traceMetaSet, webView, adEventEmitter, delegatingAdListener, phantomReferences, safeBrowsingManager);
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
        this.f2889j = fullScreenAdPresenter;
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2889j.a(context, this.f2890k);
    }
}
