package jj;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.f;

/* loaded from: classes3.dex */
public final class a extends f {
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, int i13) {
        super(context);
        this.I = i13;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        switch (this.I) {
            case 1:
                super.onMeasure(i13, i14);
                if (View.MeasureSpec.getMode(i14) == 0) {
                    setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i14)));
                    break;
                }
                break;
            default:
                super.onMeasure(i13, i14);
                break;
        }
    }
}
