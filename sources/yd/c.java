package yd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class c extends Drawable implements f, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final b f138714a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f138715b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f138716c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f138717d;

    /* renamed from: f, reason: collision with root package name */
    public int f138719f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f138721h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f138722i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f138723j;

    /* renamed from: e, reason: collision with root package name */
    public boolean f138718e = true;

    /* renamed from: g, reason: collision with root package name */
    public final int f138720g = -1;

    public c(b bVar) {
        d7.b.p(bVar, "Argument must not be null");
        this.f138714a = bVar;
    }

    public final void a() {
        d7.b.n("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f138717d);
        b bVar = this.f138714a;
        if (bVar.f138713a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f138715b) {
                return;
            }
            this.f138715b = true;
            bVar.f138713a.m(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f138717d) {
            return;
        }
        if (this.f138721h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f138723j == null) {
                this.f138723j = new Rect();
            }
            Gravity.apply(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, intrinsicWidth, intrinsicHeight, bounds, this.f138723j);
            this.f138721h = false;
        }
        Bitmap c13 = this.f138714a.f138713a.c();
        if (this.f138723j == null) {
            this.f138723j = new Rect();
        }
        Rect rect = this.f138723j;
        if (this.f138722i == null) {
            this.f138722i = new Paint(2);
        }
        canvas.drawBitmap(c13, (Rect) null, rect, this.f138722i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f138714a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f138714a.f138713a.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f138714a.f138713a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f138715b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f138721h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        if (this.f138722i == null) {
            this.f138722i = new Paint(2);
        }
        this.f138722i.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f138722i == null) {
            this.f138722i = new Paint(2);
        }
        this.f138722i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z13, boolean z14) {
        d7.b.n("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f138717d);
        this.f138718e = z13;
        if (!z13) {
            this.f138715b = false;
            this.f138714a.f138713a.n(this);
        } else if (this.f138716c) {
            a();
        }
        return super.setVisible(z13, z14);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f138716c = true;
        this.f138719f = 0;
        if (this.f138718e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f138716c = false;
        this.f138715b = false;
        this.f138714a.f138713a.n(this);
    }
}
