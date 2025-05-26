package com.pinterest.design.brio.widget.voice;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import d5.a;
import df.j1;
import le0.i;
import os.d;
import pk.a0;
import ve0.b;
import ve0.c;
import ve0.f;
import ve0.q;

/* loaded from: classes.dex */
public class PinterestVoiceMessage extends PinterestVoiceLayout implements c {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f44914j = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f44915f;

    /* renamed from: g, reason: collision with root package name */
    public int f44916g;

    /* renamed from: h, reason: collision with root package name */
    public q f44917h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltText f44918i;

    public PinterestVoiceMessage(Context context) {
        this(context, null, 0);
    }

    @Override // ve0.c
    public final void a(CharSequence charSequence) {
        a0.q(this.f44918i, bs1.c.h2(charSequence));
    }

    @Override // ve0.c
    public final boolean b() {
        return !a0.x0(a0.R(this.f44918i));
    }

    @Override // ve0.c
    public final void c(int i13) {
        if (this.f44915f != i13) {
            this.f44915f = i13;
            this.f44917h.d(i13);
            invalidate();
        }
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final f d() {
        return this.f44917h;
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final void e(Context context, b bVar) {
        super.e(context, bVar);
        Resources resources = getResources();
        GestaltText gestaltText = new GestaltText(context);
        gestaltText.i(new d(1));
        gestaltText.setPaddingRelative(0, 0, 0, 0);
        this.f44918i = gestaltText;
        this.f44917h = new q(resources, this.f44915f, j1.f0(resources), this.f44916g);
        addView(this.f44918i, new FrameLayout.LayoutParams(-1, -2));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.lego_spacing_vertical_medium);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(eo1.c.lego_spacing_horizontal_medium);
        this.f44917h.e(context, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
        this.f44917h.c(bVar);
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.PinterestVoiceMessage);
        String string = obtainStyledAttributes.getString(i.PinterestVoiceMessage_message);
        this.f44915f = obtainStyledAttributes.getColor(i.PinterestVoiceMessage_bubbleColor, this.f44915f);
        obtainStyledAttributes.recycle();
        if (a0.x0(string)) {
            return;
        }
        a0.q(this.f44918i, bs1.c.h2(string));
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final void h(Context context) {
        this.f44913e = b.TOP_LEFT;
        this.f44915f = j1.K(context);
        int i13 = eo1.b.color_themed_background_default;
        Object obj = a.f53679a;
        this.f44916g = context.getColor(i13);
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f44918i.invalidate();
    }

    public PinterestVoiceMessage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinterestVoiceMessage(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
