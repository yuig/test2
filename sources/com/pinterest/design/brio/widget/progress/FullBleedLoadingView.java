package com.pinterest.design.brio.widget.progress;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import d5.a;
import eo1.b;
import se0.c;
import se0.f;

@Deprecated
/* loaded from: classes5.dex */
public class FullBleedLoadingView extends FrameLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    public f f44860a;

    /* renamed from: b, reason: collision with root package name */
    public LoadingView f44861b;

    public FullBleedLoadingView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(Context context) {
        int i13 = b.color_themed_background_default;
        Object obj = a.f53679a;
        setBackgroundColor(context.getColor(i13));
        setAlpha(0.8f);
        this.f44861b = new LoadingView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f44861b, layoutParams);
        this.f44860a = f.NONE;
    }

    @Override // se0.c
    public final void showLoadingSpinner(boolean z13) {
        f fVar = z13 ? f.LOADING : f.LOADED;
        if (this.f44860a != fVar) {
            this.f44860a = fVar;
            this.f44861b.g2(fVar);
            if (se0.b.f112380a[this.f44860a.ordinal()] != 3) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
        }
    }

    public FullBleedLoadingView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a(context);
    }
}
