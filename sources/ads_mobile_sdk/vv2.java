package ads_mobile_sdk;

import a.k2;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vv2 implements a.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final UnifiedNativeAdMapper f12663a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12664b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12665c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12666d;

    /* renamed from: e, reason: collision with root package name */
    public final tv2 f12667e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12668f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12669g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12670h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12671i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12672j;

    /* renamed from: k, reason: collision with root package name */
    public final View f12673k;

    /* renamed from: l, reason: collision with root package name */
    public final View f12674l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f12675m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f12676n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f12677o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12678p;

    /* renamed from: q, reason: collision with root package name */
    public final float f12679q;

    public vv2(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(unifiedNativeAdMapper, "unifiedNativeAdMapper");
        this.f12663a = unifiedNativeAdMapper;
        this.f12664b = unifiedNativeAdMapper.getHeadline();
        List images = unifiedNativeAdMapper.getImages();
        if (images != null) {
            arrayList = new ArrayList(g0.q(images, 10));
            Iterator it = images.iterator();
            while (it.hasNext()) {
                arrayList.add(new uv2((NativeAd.Image) it.next()));
            }
        } else {
            arrayList = null;
        }
        this.f12665c = arrayList;
        this.f12666d = this.f12663a.getBody();
        NativeAd.Image icon = this.f12663a.getIcon();
        this.f12667e = icon != null ? new tv2(icon) : null;
        this.f12668f = this.f12663a.getCallToAction();
        this.f12669g = this.f12663a.getAdvertiser();
        this.f12663a.getClass();
        this.f12670h = this.f12663a.getStore();
        this.f12671i = this.f12663a.getPrice();
        this.f12663a.getClass();
        this.f12672j = this.f12663a.getHasVideoContent();
        NativeAd.AdChoicesInfo attributionInfo = this.f12663a.getAttributionInfo();
        if (attributionInfo != null) {
            attributionInfo.b();
            List a13 = attributionInfo.a();
            if (a13 != null) {
                ArrayList arrayList2 = new ArrayList(g0.q(a13, 10));
                Iterator it2 = a13.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new sv2((NativeAd.Image) it2.next()));
                }
            }
        }
        this.f12673k = this.f12663a.getAdChoicesContent();
        this.f12674l = this.f12663a.getMediaView();
        this.f12675m = this.f12663a.getMediatedAd();
        this.f12676n = this.f12663a.getExtras();
        this.f12677o = this.f12663a.getOverrideImpressionRecording();
        this.f12678p = this.f12663a.getOverrideClickHandling();
        this.f12679q = this.f12663a.getMediaContentAspectRatio();
    }

    @Override // a.p1
    public final View a() {
        return this.f12674l;
    }

    @Override // a.p1
    public final boolean b() {
        return this.f12677o;
    }

    @Override // a.p1
    public final View c() {
        return this.f12673k;
    }

    @Override // a.p1
    public final boolean d() {
        return this.f12678p;
    }

    @Override // a.p1
    public final float e() {
        return this.f12679q;
    }

    @Override // a.p1
    public final ArrayList f() {
        return this.f12665c;
    }

    @Override // a.p1
    public final String getAdvertiser() {
        return this.f12669g;
    }

    @Override // a.p1
    public final String getBody() {
        return this.f12666d;
    }

    @Override // a.p1
    public final String getCallToAction() {
        return this.f12668f;
    }

    @Override // a.p1
    public final Bundle getExtras() {
        return this.f12676n;
    }

    @Override // a.p1
    public final boolean getHasVideoContent() {
        return this.f12672j;
    }

    @Override // a.p1
    public final String getHeadline() {
        return this.f12664b;
    }

    @Override // a.p1
    public final k2 getIcon() {
        return this.f12667e;
    }

    @Override // a.p1
    public final String getPrice() {
        return this.f12671i;
    }

    @Override // a.p1
    public final String getStore() {
        return this.f12670h;
    }

    @Override // a.p1
    public final void recordImpression() {
        this.f12663a.getClass();
    }

    @Override // a.p1
    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f12663a.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // a.p1
    public final void a(FrameLayout frameLayout, Map clickableAssetViews, Map nonclickableAssetViews) {
        Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        Intrinsics.checkNotNullParameter(nonclickableAssetViews, "nonclickableAssetViews");
        this.f12663a.getClass();
        Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        Intrinsics.checkNotNullParameter(nonclickableAssetViews, "nonclickableAssetViews");
    }

    @Override // a.p1
    public final void a(FrameLayout frameLayout) {
        this.f12663a.getClass();
    }
}
