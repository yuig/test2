package ads_mobile_sdk;

import a.k2;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hg1 implements a.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeAdMapper f5953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5954b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5955c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5956d;

    /* renamed from: e, reason: collision with root package name */
    public final fg1 f5957e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5958f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5959g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5960h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5961i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5962j;

    /* renamed from: k, reason: collision with root package name */
    public final View f5963k;

    /* renamed from: l, reason: collision with root package name */
    public final View f5964l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f5965m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f5966n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5967o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5968p;

    /* renamed from: q, reason: collision with root package name */
    public final float f5969q;

    public hg1(NativeAdMapper nativeAdMapper) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(nativeAdMapper, "nativeAdMapper");
        this.f5953a = nativeAdMapper;
        this.f5954b = nativeAdMapper.getHeadline();
        List images = nativeAdMapper.getImages();
        if (images != null) {
            arrayList = new ArrayList(g0.q(images, 10));
            Iterator it = images.iterator();
            while (it.hasNext()) {
                arrayList.add(new gg1((NativeAd.Image) it.next()));
            }
        } else {
            arrayList = null;
        }
        this.f5955c = arrayList;
        this.f5956d = this.f5953a.getBody();
        NativeAd.Image icon = this.f5953a.getIcon();
        this.f5957e = icon != null ? new fg1(icon) : null;
        this.f5958f = this.f5953a.getCallToAction();
        this.f5959g = this.f5953a.getAdvertiser();
        this.f5953a.getClass();
        this.f5960h = this.f5953a.getStore();
        this.f5961i = this.f5953a.getPrice();
        this.f5953a.getClass();
        this.f5962j = this.f5953a.getHasVideoContent();
        NativeAd.AdChoicesInfo attributionInfo = this.f5953a.getAttributionInfo();
        if (attributionInfo != null) {
            attributionInfo.b();
            List a13 = attributionInfo.a();
            if (a13 != null) {
                ArrayList arrayList2 = new ArrayList(g0.q(a13, 10));
                Iterator it2 = a13.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new eg1((NativeAd.Image) it2.next()));
                }
            }
        }
        this.f5963k = this.f5953a.getAdChoicesContent();
        this.f5964l = this.f5953a.getMediatedMediaView();
        this.f5965m = this.f5953a.getMediatedAd();
        this.f5966n = this.f5953a.getExtras();
        this.f5967o = this.f5953a.getOverrideImpressionRecording();
        this.f5968p = this.f5953a.getOverrideClickHandling();
        this.f5969q = this.f5953a.getMediaContentAspectRatio();
    }

    @Override // a.p1
    public final View a() {
        return this.f5964l;
    }

    @Override // a.p1
    public final boolean b() {
        return this.f5967o;
    }

    @Override // a.p1
    public final View c() {
        return this.f5963k;
    }

    @Override // a.p1
    public final boolean d() {
        return this.f5968p;
    }

    @Override // a.p1
    public final float e() {
        return this.f5969q;
    }

    @Override // a.p1
    public final ArrayList f() {
        return this.f5955c;
    }

    @Override // a.p1
    public final String getAdvertiser() {
        return this.f5959g;
    }

    @Override // a.p1
    public final String getBody() {
        return this.f5956d;
    }

    @Override // a.p1
    public final String getCallToAction() {
        return this.f5958f;
    }

    @Override // a.p1
    public final Bundle getExtras() {
        return this.f5966n;
    }

    @Override // a.p1
    public final boolean getHasVideoContent() {
        return this.f5962j;
    }

    @Override // a.p1
    public final String getHeadline() {
        return this.f5954b;
    }

    @Override // a.p1
    public final k2 getIcon() {
        return this.f5957e;
    }

    @Override // a.p1
    public final String getPrice() {
        return this.f5961i;
    }

    @Override // a.p1
    public final String getStore() {
        return this.f5960h;
    }

    @Override // a.p1
    public final void recordImpression() {
        this.f5953a.getClass();
    }

    @Override // a.p1
    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f5953a.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // a.p1
    public final void a(FrameLayout frameLayout, Map clickableAssetViews, Map nonclickableAssetViews) {
        Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        Intrinsics.checkNotNullParameter(nonclickableAssetViews, "nonclickableAssetViews");
        this.f5953a.getClass();
        Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        Intrinsics.checkNotNullParameter(nonclickableAssetViews, "nonclickableAssetViews");
    }

    @Override // a.p1
    public final void a(FrameLayout frameLayout) {
        this.f5953a.getClass();
    }
}
