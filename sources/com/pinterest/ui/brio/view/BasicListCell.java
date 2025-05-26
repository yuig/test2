package com.pinterest.ui.brio.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import m60.t0;
import m60.v0;

/* loaded from: classes4.dex */
public class BasicListCell extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f52225b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TextView f52226a;

    public BasicListCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BasicListCell(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        View.inflate(getContext(), v0.basic_list_cell_brio, this);
        this.f52226a = (TextView) findViewById(t0.value_tv);
    }
}
