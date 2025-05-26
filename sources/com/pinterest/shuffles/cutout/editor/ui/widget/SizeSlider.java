package com.pinterest.shuffles.cutout.editor.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.material.navigation.b;
import com.google.android.material.slider.Slider;
import kg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.x;
import org.jetbrains.annotations.NotNull;
import s81.g;
import u62.w;
import z62.c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/pinterest/shuffles/cutout/editor/ui/widget/SizeSlider;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "org/chromium/net/y", "z62/b", "shuffles-cutout-editor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SizeSlider extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f51990d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Size f51991a;

    /* renamed from: b, reason: collision with root package name */
    public final g f51992b;

    /* renamed from: c, reason: collision with root package name */
    public final c f51993c;

    static {
        k0.f80436a.e(new x(SizeSlider.class, "value", "getValue()F", 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SizeSlider(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f51993c;
        PopupWindow popupWindow = cVar.f140896a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        cVar.f140896a = null;
        removeCallbacks(this.f51992b);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeSlider(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int g03 = a.g0(64, context);
        this.f51991a = new Size(g03, g03);
        this.f51992b = new g(this, 18);
        c cVar = new c(this, context);
        this.f51993c = cVar;
        View.inflate(context, u62.x.view_brush_size_slider, this);
        View findViewById = findViewById(w.slider);
        Slider slider = (Slider) findViewById;
        slider.d0(cVar);
        slider.c0(new z62.a(this));
        if (!slider.isLaidOut() || slider.isLayoutRequested()) {
            slider.addOnLayoutChangeListener(new b(slider, 28));
        } else {
            slider.setRotation(270.0f);
            slider.setTranslationX((slider.getHeight() / 2.0f) + ((-slider.getWidth()) / 2.0f));
            slider.setTranslationY((slider.getWidth() / 2.0f) - (slider.getHeight() / 2.0f));
        }
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        setBackground(new z62.b());
    }
}
