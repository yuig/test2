package com.pinterest.ui.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import bo1.a;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GrayWebImageView;
import eo1.c;
import m60.r0;
import m60.t0;
import m60.v0;

/* loaded from: classes4.dex */
public class ListCellBasic extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f52579g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f52580a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52581b;

    /* renamed from: c, reason: collision with root package name */
    public final GrayWebImageView f52582c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f52583d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltDivider f52584e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52585f;

    public ListCellBasic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52580a = getResources().getDimensionPixelSize(r0.thumbnail_size);
        this.f52581b = getResources().getDimensionPixelSize(c.thumbnail_small_size);
        setMinimumHeight(getResources().getDimensionPixelSize(r0.list_cell_basic_height));
        setBackgroundResource(a.touch_clear_bg);
        View.inflate(getContext(), v0.list_cell_basic, this);
        this.f52582c = (GrayWebImageView) findViewById(t0.icon_wiv);
        this.f52583d = (GestaltText) findViewById(t0.title_tv);
        this.f52584e = (GestaltDivider) findViewById(t0.list_divider);
    }
}
