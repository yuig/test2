package androidx.legacy.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes3.dex */
public class Space extends View {
    @Deprecated
    public Space(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        } else if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        } else if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    @Deprecated
    public Space(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
