package com.pinterest.ui.brio.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import m60.t0;
import m60.v0;

/* loaded from: classes4.dex */
public class TitleListCell extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f52239b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f52240a;

    public TitleListCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TitleListCell(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        View.inflate(getContext(), v0.title_list_cell_brio, this);
        this.f52240a = (GestaltText) findViewById(t0.title_tv);
    }
}
