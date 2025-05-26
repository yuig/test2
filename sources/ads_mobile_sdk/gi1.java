package ads_mobile_sdk;

import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gi1 implements a.qe {

    /* renamed from: a, reason: collision with root package name */
    public final xf1 f5577a;

    /* renamed from: b, reason: collision with root package name */
    public final h61 f5578b;

    public gi1(xf1 nativeAdCore) {
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        this.f5577a = nativeAdCore;
        this.f5578b = new h61();
    }

    @Override // a.qe
    public final Object a(boolean z13, bl2.c cVar) {
        FrameLayout nativeAdView;
        if (z13) {
            h61 h61Var = this.f5578b;
            if (h61Var.f5863a != null && (nativeAdView = ((yh1) ((a.pf) h61Var.a("The backing field has not yet been initialized."))).c()) != null) {
                Map assetViews = ((yh1) ((a.pf) this.f5578b.a("The backing field has not yet been initialized."))).b();
                ImageView.ScaleType mediaviewScaleType = ((yh1) ((a.pf) this.f5578b.a("The backing field has not yet been initialized."))).e();
                if (mediaviewScaleType == null) {
                    mediaviewScaleType = ci1.f3919i;
                }
                xf1 xf1Var = this.f5577a;
                xf1Var.getClass();
                Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
                Intrinsics.checkNotNullParameter(assetViews, "assetViews");
                Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
                if (!xf1Var.f13639a.getAndSet(true)) {
                    xf1Var.a(nativeAdView, mediaviewScaleType, assetViews);
                }
            }
        }
        return Unit.f80348a;
    }
}
