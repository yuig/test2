package com.pinterest.ui.grid.pin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import d5.a;
import df.j1;
import m60.q0;
import m60.x0;
import pk.a0;
import sp.c;
import wa2.h;

/* loaded from: classes4.dex */
public class ImagelessPinView extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f52552a;

    /* renamed from: b, reason: collision with root package name */
    public String f52553b;

    /* renamed from: c, reason: collision with root package name */
    public String f52554c;

    /* renamed from: d, reason: collision with root package name */
    public h f52555d;

    /* renamed from: e, reason: collision with root package name */
    public final c f52556e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f52557f;

    /* renamed from: g, reason: collision with root package name */
    public int f52558g;

    /* renamed from: h, reason: collision with root package name */
    public int f52559h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52560i;

    public ImagelessPinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52556e = new c(getContext());
        this.f52558g = -1;
        this.f52559h = -1;
        this.f52560i = false;
    }

    public static ImagelessPinView a(Context context, String str, String str2, String str3, CharSequence charSequence) {
        ImagelessPinView imagelessPinView = new ImagelessPinView(context, null);
        try {
            imagelessPinView.f52552a = Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            Context context2 = imagelessPinView.getContext();
            int i13 = q0.bg_imageless_pin_default;
            Object obj = a.f53679a;
            imagelessPinView.f52552a = context2.getColor(i13);
        }
        imagelessPinView.f52554c = str3;
        imagelessPinView.f52553b = j1.k0(str2);
        Context context3 = imagelessPinView.getContext();
        int i14 = imagelessPinView.f52552a;
        String str4 = imagelessPinView.f52553b;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = imagelessPinView.f52554c;
        imagelessPinView.f52555d = new h(i14, context3, str4, str5 != null ? str5 : "");
        imagelessPinView.f52557f = charSequence;
        return imagelessPinView;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        h hVar = this.f52555d;
        if (hVar == null) {
            return;
        }
        hVar.draw(canvas);
        if (a0.x0(this.f52557f)) {
            return;
        }
        this.f52556e.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = this.f52560i ? getMeasuredHeight() : measuredWidth;
        h hVar = this.f52555d;
        if (hVar != null) {
            hVar.setBounds(0, 0, measuredWidth, measuredHeight);
            int i15 = this.f52558g;
            if (i15 != -1) {
                this.f52555d.f128755i = i15;
            }
            int i16 = this.f52559h;
            if (i16 != -1) {
                this.f52555d.f128756j = i16;
            }
        }
        if (!a0.x0(this.f52557f)) {
            CharSequence charSequence = this.f52557f;
            c cVar = this.f52556e;
            cVar.f114849q = charSequence;
            cVar.setBounds(0, 0, measuredWidth, measuredHeight);
            cVar.h(cVar.f114849q);
            StaticLayout staticLayout = cVar.f114848p;
            if ((cVar.f114844l * 2) + (staticLayout != null ? staticLayout.getHeight() : 0) > cVar.f128842e) {
                cVar.h(bs1.c.b2(x0.pinned));
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
