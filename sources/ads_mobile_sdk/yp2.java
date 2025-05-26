package ads_mobile_sdk;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ao2.j0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yp2 extends xf1 {

    /* renamed from: f, reason: collision with root package name */
    public final j0 f14354f;

    /* renamed from: g, reason: collision with root package name */
    public final a.p1 f14355g;

    /* renamed from: h, reason: collision with root package name */
    public final n1 f14356h;

    /* renamed from: i, reason: collision with root package name */
    public final r0 f14357i;

    /* renamed from: j, reason: collision with root package name */
    public final th1 f14358j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14359k;

    public yp2(j0 backgroundScope, a.p1 nativeAdMapper, n1 adEventEmitter, r0 adConfiguration, th1 nativeAdUtil) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(nativeAdMapper, "nativeAdMapper");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdUtil, "nativeAdUtil");
        this.f14354f = backgroundScope;
        this.f14355g = nativeAdMapper;
        this.f14356h = adEventEmitter;
        this.f14357i = adConfiguration;
        this.f14358j = nativeAdUtil;
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(View view, int i13) {
    }

    @Override // ads_mobile_sdk.xf1
    public final void b() {
    }

    @Override // ads_mobile_sdk.xf1
    public final boolean c() {
        return true;
    }

    @Override // ads_mobile_sdk.xf1
    public final int d() {
        return 0;
    }

    @Override // ads_mobile_sdk.xf1
    public final boolean i() {
        return false;
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
    }

    @Override // ads_mobile_sdk.xf1
    public final nm.u b(FrameLayout frameLayout, ImageView.ScaleType mediaViewScaleType, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        return new nm.u();
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(View clickedView, FrameLayout frameLayout, LinkedHashMap assetViews, ImageView.ScaleType mediaViewScaleType) {
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        if (this.f14355g.d()) {
            return;
        }
        this.f14355g.a(clickedView);
        kotlin.jvm.internal.j.z(this.f14354f, null, null, new wp2(this, null), 3);
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(FrameLayout nativeAdView, ImageView.ScaleType mediaviewScaleType, Map assetViews) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
        if (!this.f14359k || this.f14355g.b()) {
            return;
        }
        this.f14355g.recordImpression();
        kotlin.jvm.internal.j.z(this.f14354f, null, null, new xp2(this, null), 3);
    }

    @Override // ads_mobile_sdk.xf1
    public final nm.u a(FrameLayout frameLayout, ImageView.ScaleType mediaViewScaleType, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        return new nm.u();
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(FrameLayout frameLayout, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4 A[Catch: RuntimeException -> 0x0041, LOOP:1: B:18:0x009e->B:20:0x00a4, LOOP_END, TryCatch #1 {RuntimeException -> 0x0041, blocks: (B:17:0x008b, B:18:0x009e, B:20:0x00a4, B:22:0x00b2, B:23:0x00c3, B:25:0x00c9), top: B:16:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9 A[Catch: RuntimeException -> 0x0041, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0041, blocks: (B:17:0x008b, B:18:0x009e, B:20:0x00a4, B:22:0x00b2, B:23:0x00c3, B:25:0x00c9), top: B:16:0x008b }] */
    @Override // ads_mobile_sdk.xf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.ref.WeakReference r5, android.widget.FrameLayout r6, java.util.LinkedHashMap r7, android.view.View.OnTouchListener r8, android.view.View.OnClickListener r9) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yp2.a(java.lang.ref.WeakReference, android.widget.FrameLayout, java.util.LinkedHashMap, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // ads_mobile_sdk.xf1
    public final void a(FrameLayout frameLayout, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        this.f14355g.a(frameLayout);
    }
}
