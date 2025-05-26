package com.pinterest.feature.search.visual.cropper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends c {

    /* renamed from: y, reason: collision with root package name */
    public final float f48042y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(Context context, float f13, ib2.d dVar, bb2.j backgroundImageView) {
        super(context, f13, hf0.b.f69002b, dVar, false, null, true, false);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundImageView, "backgroundImageView");
        this.f48042y = 0.0f;
        addView((View) backgroundImageView, -1, -1);
    }

    @Override // com.pinterest.feature.search.visual.cropper.c
    public final FlashlightCropperView c(Context context) {
        FlashlightCropperView flashlightCropperView = new FlashlightCropperView(context);
        flashlightCropperView.f47972t = true;
        return flashlightCropperView;
    }

    @Override // com.pinterest.feature.search.visual.cropper.c
    public final float d() {
        return this.f47990a - this.f48042y;
    }

    @Override // com.pinterest.feature.search.visual.cropper.c
    public final float e() {
        return this.f48042y;
    }

    @Override // com.pinterest.feature.search.visual.cropper.c
    public final float f() {
        return ((ViewGroup.LayoutParams) this.f47996g).width - this.f48042y;
    }

    @Override // com.pinterest.feature.search.visual.cropper.c
    public final float g() {
        return this.f48042y;
    }
}
