package com.pinterest.feature.search.visual.cropper;

import android.content.Context;
import android.graphics.RectF;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.pinterest.api.model.um;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nt.e2;
import s71.q;

/* loaded from: classes5.dex */
public final class m extends c implements k {
    public static final /* synthetic */ int H = 0;
    public final boolean A;
    public final ScrollView B;
    public final int C;
    public boolean D;
    public float E;
    public float F;
    public final int G;

    /* renamed from: y, reason: collision with root package name */
    public final f91.b f48040y;

    /* renamed from: z, reason: collision with root package name */
    public final o80.l f48041z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, f91.b closeupZoomableImage, float f13, int i13, ib2.d cropUpdateListener, q pinalytics, uj2.q networkStateStream, o80.l imageTouchListener, boolean z13, float f14, Integer num, boolean z14, boolean z15) {
        super(context, f13, i13, cropUpdateListener, false, num, z14, z15);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(closeupZoomableImage, "closeupZoomableImage");
        Intrinsics.checkNotNullParameter(cropUpdateListener, "cropUpdateListener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(imageTouchListener, "imageTouchListener");
        this.f48040y = closeupZoomableImage;
        this.f48041z = imageTouchListener;
        this.A = z13;
        this.C = getResources().getDimensionPixelSize(r0.margin_double);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G = scaledTouchSlop * scaledTouchSlop;
        yk1.j.a().d(this.f47997h, new l(getResources().getDimensionPixelSize(r0.margin), getResources().getDimensionPixelSize(r0.margin_half), f14, pinalytics, networkStateStream));
        o80.j jVar = closeupZoomableImage.f61465p0;
        if (jVar != null) {
            jVar.f93504k = 1.0f;
        }
        WebImageView j13 = closeupZoomableImage.j();
        um umVar = closeupZoomableImage.f96997v;
        if (j13 != null && umVar != null) {
            Integer valueOf = Integer.valueOf(umVar.f42587d);
            ViewGroup.LayoutParams layoutParams = j13.getLayoutParams();
            if (qb0.b.m(valueOf, layoutParams != null ? Integer.valueOf(layoutParams.height) : null)) {
                Context context2 = getContext();
                if (context2 != null) {
                    ScrollView scrollView = new ScrollView(context2);
                    scrollView.addView(closeupZoomableImage, -1, -1);
                    scrollView.getViewTreeObserver().addOnScrollChangedListener(new e2(this, 3));
                    scrollView.setOnTouchListener(new kj.e(this, 2));
                    this.B = scrollView;
                    addView(scrollView, -1, (int) this.f47990a);
                    return;
                }
                return;
            }
        }
        addView(closeupZoomableImage, -1, -1);
    }

    @Override // com.pinterest.feature.search.visual.cropper.c
    public final FlashlightCropperView c(Context context) {
        return new h(context, this, this.A);
    }

    @Override // com.pinterest.feature.search.visual.cropper.c
    public final float d() {
        float f13 = this.f48040y.f61462m0;
        return f13 == 0.0f ? this.f47990a : Math.min(this.f47990a, f13);
    }

    @Override // com.pinterest.feature.search.visual.cropper.c
    public final float e() {
        return 0.0f;
    }

    @Override // com.pinterest.feature.search.visual.cropper.c
    public final float f() {
        return ((ViewGroup.LayoutParams) this.f47996g).width;
    }

    @Override // com.pinterest.feature.search.visual.cropper.c
    public final float g() {
        return Math.max(this.f48040y.f61460k0, 0.0f);
    }

    public final void l() {
        this.f47997h.f47971s = true;
    }

    public final void m(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        FlashlightCropperView flashlightCropperView = this.f47997h;
        flashlightCropperView.getClass();
        rectF.left -= flashlightCropperView.getPaddingLeft();
        rectF.top -= flashlightCropperView.getPaddingTop();
        rectF.right += flashlightCropperView.getPaddingRight();
        rectF.bottom += flashlightCropperView.getPaddingRight();
        flashlightCropperView.f47965m = rectF;
    }

    public final void n(float f13) {
        i iVar;
        FlashlightCropperView flashlightCropperView = this.f47997h;
        h hVar = flashlightCropperView instanceof h ? (h) flashlightCropperView : null;
        if (hVar == null || (iVar = hVar.f48031z) == null) {
            return;
        }
        ((l) iVar).f48034c = f13;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ScrollView scrollView = this.B;
        if (scrollView != null) {
            scrollView.setOnTouchListener(null);
        }
        super.onDetachedFromWindow();
    }
}
