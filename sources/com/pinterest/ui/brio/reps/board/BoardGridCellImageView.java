package com.pinterest.ui.brio.reps.board;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.pinterest.ui.brio.view.SquareFourImageView;
import qa2.c;

@Deprecated
/* loaded from: classes4.dex */
public class BoardGridCellImageView extends SquareFourImageView {
    public BoardGridCellImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new c(this);
    }

    @Override // com.pinterest.ui.brio.view.SquareFourImageView
    public final void a(Canvas canvas) {
        g(canvas);
        e(canvas);
    }

    @Override // com.pinterest.ui.brio.view.SquareFourImageView, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
    }

    public BoardGridCellImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        new c(this);
    }
}
