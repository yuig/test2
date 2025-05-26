package ads_mobile_sdk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ci1 {

    /* renamed from: i, reason: collision with root package name */
    public static final ImageView.ScaleType f3919i = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f3920a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f3921b;

    /* renamed from: c, reason: collision with root package name */
    public final if1 f3922c;

    /* renamed from: d, reason: collision with root package name */
    public final oh0 f3923d;

    /* renamed from: e, reason: collision with root package name */
    public final ty0 f3924e;

    /* renamed from: f, reason: collision with root package name */
    public final dh1 f3925f;

    /* renamed from: g, reason: collision with root package name */
    public final wi.k f3926g;

    /* renamed from: h, reason: collision with root package name */
    public final nm.u f3927h;

    public ci1(j0 uiScope, j0 backgroundScope, if1 nativeAdAssets, oh0 flags, ty0 internalMediaContent, dh1 nativeAdSettingsDataStore, wi.k baseRequest, nm.u nativeAdJson) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(internalMediaContent, "internalMediaContent");
        Intrinsics.checkNotNullParameter(nativeAdSettingsDataStore, "nativeAdSettingsDataStore");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeAdJson, "nativeAdJson");
        this.f3920a = uiScope;
        this.f3921b = backgroundScope;
        this.f3922c = nativeAdAssets;
        this.f3923d = flags;
        this.f3924e = internalMediaContent;
        this.f3925f = nativeAdSettingsDataStore;
        this.f3926g = baseRequest;
        this.f3927h = nativeAdJson;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(ads_mobile_sdk.ci1 r17, a.pf r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ci1.a(ads_mobile_sdk.ci1, a.pf):void");
    }

    public final void a(a.pf nativeAdViewContainer) {
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "nativeAdViewContainer");
        yh1 yh1Var = (yh1) nativeAdViewContainer;
        View b13 = yh1Var.b("3010");
        ViewGroup mediaViewContainer = b13 instanceof ViewGroup ? (ViewGroup) b13 : null;
        kotlin.jvm.internal.j.z(this.f3921b, null, null, new ai1(this, mediaViewContainer, null), 3);
        if (mediaViewContainer == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(mediaViewContainer, "mediaViewContainer");
        View view = this.f3922c.f6378k;
        if (view == null) {
            mediaViewContainer.removeAllViews();
            FrameLayout c13 = yh1Var.c();
            if (c13 == null) {
                return;
            }
            Context context = c13.getContext();
            Intrinsics.f(context);
            Drawable e13 = this.f3924e.e();
            if (e13 == null) {
                return;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(e13);
            ImageView.ScaleType e14 = yh1Var.e();
            if (e14 == null) {
                e14 = f3919i;
            }
            imageView.setScaleType(e14);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            mediaViewContainer.addView(imageView);
            return;
        }
        mediaViewContainer.removeAllViews();
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        mediaViewContainer.addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
        ym0 ym0Var = this.f3922c.f6377j;
        if (ym0Var == null) {
            return;
        }
        ym0Var.f14332r = new a.z0(yh1Var, 0);
    }

    public static final void a(a.pf nativeAdViewContainer, MotionEvent event) {
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "$nativeAdViewContainer");
        Intrinsics.checkNotNullParameter(event, "event");
        ((yh1) nativeAdViewContainer).onTouch(null, event);
    }
}
