package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f16316a;

    public AppCompatRatingBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        Bitmap bitmap = this.f16316a.f16507b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i13, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        x2.a(getContext(), this);
        a0 a0Var = new a0(this);
        this.f16316a = a0Var;
        a0Var.a(attributeSet, i13);
    }
}
