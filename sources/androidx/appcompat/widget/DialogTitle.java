package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class DialogTitle extends AppCompatTextView {
    public DialogTitle(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int lineCount;
        super.onMeasure(i13, i14);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, i.j.TextAppearance, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i.j.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        super.onMeasure(i13, i14);
    }

    public DialogTitle(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
