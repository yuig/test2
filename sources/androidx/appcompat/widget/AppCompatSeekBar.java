package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f16317a;

    public AppCompatSeekBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c0 c0Var = this.f16317a;
        Drawable drawable = c0Var.f16522e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = c0Var.f16521d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16317a.f16522e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f16317a.d(canvas);
    }

    public AppCompatSeekBar(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        x2.a(getContext(), this);
        c0 c0Var = new c0(this);
        this.f16317a = c0Var;
        c0Var.a(attributeSet, i13);
    }
}
