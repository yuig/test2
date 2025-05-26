package com.pinterest.dialog.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import mf0.n;
import mf0.o;
import mf0.r;
import os.d;

/* loaded from: classes.dex */
public class DialogTitleView extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f44945e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f44946a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f44947b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f44948c;

    /* renamed from: d, reason: collision with root package name */
    public final View f44949d;

    public DialogTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public DialogTitleView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        View.inflate(getContext(), o.view_dialog_header, this);
        this.f44946a = (GestaltText) findViewById(n.title_tv);
        this.f44947b = (GestaltText) findViewById(n.subtitle_tv);
        this.f44948c = (GestaltText) findViewById(n.text_tv);
        this.f44949d = findViewById(n.title_divider);
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.DialogTitleView, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(r.DialogTitleView_titleTextSize, -1);
        if (dimensionPixelSize != -1) {
            this.f44946a.setTextSize(0, dimensionPixelSize);
        }
        int integer = obtainStyledAttributes.getInteger(r.DialogTitleView_titleTextGravity, -1);
        if (integer != -1 && integer == 0) {
            this.f44946a.i(new d(2));
        }
        if (obtainStyledAttributes.getBoolean(r.DialogTitleView_hideDivider, false)) {
            this.f44949d.setVisibility(8);
        }
        obtainStyledAttributes.recycle();
    }
}
