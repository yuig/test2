package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f16740a;

    /* renamed from: b, reason: collision with root package name */
    public z2 f16741b;

    /* renamed from: c, reason: collision with root package name */
    public int f16742c = 0;

    public z(ImageView imageView) {
        this.f16740a = imageView;
    }

    public final void a() {
        z2 z2Var;
        ImageView imageView = this.f16740a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            c1.a(drawable);
        }
        if (drawable == null || (z2Var = this.f16741b) == null) {
            return;
        }
        y.e(drawable, z2Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i13) {
        int C;
        ImageView imageView = this.f16740a;
        x92.b N = x92.b.N(imageView.getContext(), attributeSet, i.j.AppCompatImageView, i13, 0);
        ImageView imageView2 = this.f16740a;
        q5.v0.n(imageView2, imageView2.getContext(), i.j.AppCompatImageView, attributeSet, (TypedArray) N.f134366c, i13, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (C = N.C(i.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = com.bumptech.glide.c.I(imageView.getContext(), C)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c1.a(drawable);
            }
            if (N.G(i.j.AppCompatImageView_tint)) {
                imageView.setImageTintList(N.u(i.j.AppCompatImageView_tint));
            }
            if (N.G(i.j.AppCompatImageView_tintMode)) {
                imageView.setImageTintMode(c1.d(N.B(i.j.AppCompatImageView_tintMode, -1), null));
            }
            N.O();
        } catch (Throwable th3) {
            N.O();
            throw th3;
        }
    }

    public final void c(int i13) {
        ImageView imageView = this.f16740a;
        if (i13 != 0) {
            Drawable I = com.bumptech.glide.c.I(imageView.getContext(), i13);
            if (I != null) {
                c1.a(I);
            }
            imageView.setImageDrawable(I);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
