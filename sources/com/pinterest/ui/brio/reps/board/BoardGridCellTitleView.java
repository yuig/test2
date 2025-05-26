package com.pinterest.ui.brio.reps.board;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import m60.t0;
import m60.v0;

/* loaded from: classes4.dex */
public class BoardGridCellTitleView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f52212a;

    /* renamed from: b, reason: collision with root package name */
    public final View f52213b;

    public BoardGridCellTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoardGridCellTitleView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        View.inflate(getContext(), v0.list_cell_board_title_brio, this);
        this.f52212a = (GestaltText) findViewById(t0.title_tv);
        this.f52213b = findViewById(t0.secret_iv);
    }
}
