package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes2.dex */
public final class c0 extends a0 {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f16521d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f16522e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f16523f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f16524g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16525h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16526i;

    public c0(SeekBar seekBar) {
        super(seekBar);
        this.f16523f = null;
        this.f16524g = null;
        this.f16525h = false;
        this.f16526i = false;
        this.f16521d = seekBar;
    }

    @Override // androidx.appcompat.widget.a0
    public final void a(AttributeSet attributeSet, int i13) {
        super.a(attributeSet, i13);
        SeekBar seekBar = this.f16521d;
        x92.b N = x92.b.N(seekBar.getContext(), attributeSet, i.j.AppCompatSeekBar, i13, 0);
        SeekBar seekBar2 = this.f16521d;
        q5.v0.n(seekBar2, seekBar2.getContext(), i.j.AppCompatSeekBar, attributeSet, (TypedArray) N.f134366c, i13, 0);
        Drawable y13 = N.y(i.j.AppCompatSeekBar_android_thumb);
        if (y13 != null) {
            seekBar.setThumb(y13);
        }
        Drawable x13 = N.x(i.j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f16522e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f16522e = x13;
        if (x13 != null) {
            x13.setCallback(seekBar);
            x13.setLayoutDirection(seekBar.getLayoutDirection());
            if (x13.isStateful()) {
                x13.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (N.G(i.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f16524g = c1.d(N.B(i.j.AppCompatSeekBar_tickMarkTintMode, -1), this.f16524g);
            this.f16526i = true;
        }
        if (N.G(i.j.AppCompatSeekBar_tickMarkTint)) {
            this.f16523f = N.u(i.j.AppCompatSeekBar_tickMarkTint);
            this.f16525h = true;
        }
        N.O();
        c();
    }

    public final void c() {
        Drawable drawable = this.f16522e;
        if (drawable != null) {
            if (this.f16525h || this.f16526i) {
                Drawable mutate = drawable.mutate();
                this.f16522e = mutate;
                if (this.f16525h) {
                    mutate.setTintList(this.f16523f);
                }
                if (this.f16526i) {
                    this.f16522e.setTintMode(this.f16524g);
                }
                if (this.f16522e.isStateful()) {
                    this.f16522e.setState(this.f16521d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f16522e != null) {
            int max = this.f16521d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f16522e.getIntrinsicWidth();
                int intrinsicHeight = this.f16522e.getIntrinsicHeight();
                int i13 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i14 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f16522e.setBounds(-i13, -i14, i13, i14);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i15 = 0; i15 <= max; i15++) {
                    this.f16522e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
