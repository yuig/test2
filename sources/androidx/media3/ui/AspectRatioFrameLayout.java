package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f18869d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a f18870a;

    /* renamed from: b, reason: collision with root package name */
    public float f18871b;

    /* renamed from: c, reason: collision with root package name */
    public int f18872c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18872c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m0.AspectRatioFrameLayout, 0, 0);
            try {
                this.f18872c = obtainStyledAttributes.getInt(m0.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f18870a = new a(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        float f13;
        float f14;
        super.onMeasure(i13, i14);
        if (this.f18871b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f15 = measuredWidth;
        float f16 = measuredHeight;
        float f17 = (this.f18871b / (f15 / f16)) - 1.0f;
        float abs = Math.abs(f17);
        a aVar = this.f18870a;
        if (abs <= 0.01f) {
            if (aVar.f19018a) {
                return;
            }
            aVar.f19018a = true;
            aVar.f19019b.post(aVar);
            return;
        }
        int i15 = this.f18872c;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 == 2) {
                    f13 = this.f18871b;
                } else if (i15 == 4) {
                    if (f17 > 0.0f) {
                        f13 = this.f18871b;
                    } else {
                        f14 = this.f18871b;
                    }
                }
                measuredWidth = (int) (f16 * f13);
            } else {
                f14 = this.f18871b;
            }
            measuredHeight = (int) (f15 / f14);
        } else if (f17 > 0.0f) {
            f14 = this.f18871b;
            measuredHeight = (int) (f15 / f14);
        } else {
            f13 = this.f18871b;
            measuredWidth = (int) (f16 * f13);
        }
        if (!aVar.f19018a) {
            aVar.f19018a = true;
            aVar.f19019b.post(aVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
