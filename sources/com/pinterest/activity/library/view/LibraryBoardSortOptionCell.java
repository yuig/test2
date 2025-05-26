package com.pinterest.activity.library.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import bb2.h;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GrayWebImageView;
import eo1.b;
import m60.t0;
import m60.v0;

/* loaded from: classes3.dex */
public class LibraryBoardSortOptionCell extends RelativeLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final int f34952c = b.color_themed_icon_default;

    /* renamed from: d, reason: collision with root package name */
    public static final int f34953d = b.color_gray_500;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f34954a;

    /* renamed from: b, reason: collision with root package name */
    public final GrayWebImageView f34955b;

    public LibraryBoardSortOptionCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LibraryBoardSortOptionCell(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        View.inflate(getContext(), v0.library_board_sort_option_cell, this);
        this.f34954a = (GestaltText) findViewById(t0.value_tv);
        GrayWebImageView grayWebImageView = (GrayWebImageView) findViewById(t0.dialog_cell_image);
        this.f34955b = grayWebImageView;
        grayWebImageView.f52575J = h.TRANSPARENT;
        grayWebImageView.A2();
    }
}
