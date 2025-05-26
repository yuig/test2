package com.pinterest.toast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import i92.c;
import i92.d;
import oo0.b;

/* loaded from: classes4.dex */
public class TextToastView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f52194b = 0;

    /* renamed from: a, reason: collision with root package name */
    public GestaltText f52195a;

    public TextToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        View.inflate(getContext(), d.pinterest_voice_message, this);
        this.f52195a = (GestaltText) findViewById(c.system_message);
        this.f52195a.i(new b(17));
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_600);
        this.f52195a.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public TextToastView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a();
    }
}
