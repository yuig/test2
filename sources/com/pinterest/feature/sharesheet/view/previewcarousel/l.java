package com.pinterest.feature.sharesheet.view.previewcarousel;

import android.content.Context;
import android.util.TypedValue;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends FrameLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f48442a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48443b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48444c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48445d;

    /* renamed from: e, reason: collision with root package name */
    public final SharesheetPinOrSpinPreviewView$RoundedCornerImageView f48446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i13, int i14, Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f48443b) {
            this.f48443b = true;
        }
        this.f48444c = i13;
        this.f48445d = i14;
        Intrinsics.checkNotNullParameter(context, "context");
        SharesheetPinOrSpinPreviewView$RoundedCornerImageView sharesheetPinOrSpinPreviewView$RoundedCornerImageView = new SharesheetPinOrSpinPreviewView$RoundedCornerImageView(context, null);
        sharesheetPinOrSpinPreviewView$RoundedCornerImageView.x(context);
        this.f48446e = sharesheetPinOrSpinPreviewView$RoundedCornerImageView;
        sharesheetPinOrSpinPreviewView$RoundedCornerImageView.setLayoutParams(new FrameLayout.LayoutParams(i14, i13));
        sharesheetPinOrSpinPreviewView$RoundedCornerImageView.t(TypedValue.applyDimension(1, 32.0f, sharesheetPinOrSpinPreviewView$RoundedCornerImageView.getResources().getDisplayMetrics()));
        addView(sharesheetPinOrSpinPreviewView$RoundedCornerImageView);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f48442a == null) {
            this.f48442a = new ye2.o(this);
        }
        return this.f48442a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48442a == null) {
            this.f48442a = new ye2.o(this);
        }
        return this.f48442a.generatedComponent();
    }
}
