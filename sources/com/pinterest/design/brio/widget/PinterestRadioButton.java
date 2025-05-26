package com.pinterest.design.brio.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import d5.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import lm1.b;
import te0.g;
import te0.h;
import te0.i;

/* loaded from: classes5.dex */
public class PinterestRadioButton extends AppCompatRadioButton {

    /* renamed from: e, reason: collision with root package name */
    public h f44846e;

    /* renamed from: f, reason: collision with root package name */
    public b f44847f;

    public PinterestRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, eo1.b.color_themed_text_default);
    }

    public final void a(Context context, AttributeSet attributeSet, int i13) {
        if (attributeSet != null) {
            this.f44846e = h.TEXT_NONE;
            this.f44847f = i.f117495b;
        }
        if (this.f44846e != h.TEXT_NONE) {
            if (this.f44847f != i.f117495b) {
                Context context2 = getContext();
                b fontType = this.f44847f;
                pe0.b bVar = new pe0.b(this, 1);
                LinkedHashMap linkedHashMap = g.f117488a;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(fontType, "fontType");
                setTypeface(g.a(context2, fontType, bVar, 8));
            }
            setTextSize(0, i.a(this.f44846e, getResources()).f58831a);
        }
        Object obj = a.f53679a;
        setTextColor(context.getColor(i13));
    }

    public PinterestRadioButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a(context, attributeSet, eo1.b.color_themed_text_default);
    }
}
