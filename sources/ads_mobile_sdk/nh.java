package ads_mobile_sdk;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class nh implements wi.a {

    /* renamed from: a, reason: collision with root package name */
    public final sx0 f8798a;

    /* renamed from: b, reason: collision with root package name */
    public final View f8799b;

    public nh(sx0 internalBannerAd, View view) {
        Intrinsics.checkNotNullParameter(internalBannerAd, "internalBannerAd");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f8798a = internalBannerAd;
        this.f8799b = view;
    }

    public sx0 a() {
        return this.f8798a;
    }

    @Override // wi.a
    public final void destroy() {
        a().destroy();
    }
}
