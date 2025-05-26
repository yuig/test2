package com.pinterest.design.brio.widget.progress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import eo1.c;
import nt.c2;
import se0.f;
import se0.g;
import se0.o;

/* loaded from: classes.dex */
public class LoadingView extends AppCompatImageView {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f44862d = false;

    /* renamed from: e, reason: collision with root package name */
    public static long f44863e = 1000;

    /* renamed from: a, reason: collision with root package name */
    public f f44864a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44865b;

    /* renamed from: c, reason: collision with root package name */
    public o f44866c;

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f2();
    }

    public final void f2() {
        o oVar = new o(getContext(), getResources().getDimensionPixelSize(c.spinner_diameter_small));
        this.f44866c = oVar;
        setImageDrawable(oVar);
        this.f44864a = f.NONE;
        setVisibility(8);
    }

    public final void g2(f fVar) {
        if (this.f44864a != fVar) {
            this.f44864a = fVar;
            i2();
        }
    }

    public final void i2() {
        if (g.f112383a[this.f44864a.ordinal()] != 3) {
            if (this.f44865b) {
                this.f44866c.stop();
            }
            setVisibility(8);
        } else {
            if (this.f44865b) {
                this.f44866c.start();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44865b = true;
        this.f44866c.setCallback(this);
        i2();
        if (f44862d) {
            long j13 = f44863e;
            if (this.f44864a == f.LOADING) {
                setImageDrawable(null);
                new Handler(Looper.getMainLooper()).postDelayed(new c2(this, 10), j13);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f44865b = false;
        this.f44866c.stop();
        this.f44866c.setCallback(null);
        super.onDetachedFromWindow();
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        f2();
    }

    public LoadingView(Context context) {
        super(context, null);
        f2();
    }
}
