package com.pinterest.ui.brio.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import d5.a;
import eo1.c;
import hs1.m;
import hs1.t;
import hs1.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m60.q0;
import qb0.b;

/* loaded from: classes4.dex */
public class SquareFourImageView extends View {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f52227a;

    /* renamed from: b, reason: collision with root package name */
    public int f52228b;

    /* renamed from: c, reason: collision with root package name */
    public int f52229c;

    /* renamed from: d, reason: collision with root package name */
    public int f52230d;

    /* renamed from: e, reason: collision with root package name */
    public int f52231e;

    /* renamed from: f, reason: collision with root package name */
    public int f52232f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f52233g;

    /* renamed from: h, reason: collision with root package name */
    public Paint f52234h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f52235i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f52236j;

    /* renamed from: k, reason: collision with root package name */
    public List f52237k;

    /* renamed from: l, reason: collision with root package name */
    public l0 f52238l;

    public SquareFourImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52235i = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f52236j = new Path();
        i(c.lego_corner_radius_small, c.image_grid_padding);
    }

    public void a(Canvas canvas) {
        g(canvas);
        e(canvas);
    }

    public final void b(float f13, float f14, qa2.c cVar, Canvas canvas) {
        float f15 = this.f52228b;
        float f16 = this.f52229c;
        if (cVar.c() != null && b.d(cVar.c())) {
            if (this.f52233g == null) {
                this.f52233g = new RectF();
            }
            RectF rectF = this.f52233g;
            rectF.set(f13, f14, f13 + f15, f14 + f16);
            float f17 = 0;
            if (this.f52234h == null) {
                Paint paint = new Paint(1);
                this.f52234h = paint;
                paint.setColor(this.f52232f);
            }
            canvas.drawRoundRect(rectF, f17, f17, this.f52234h);
        }
        cVar.f103232a = 0;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        cVar.a(canvas, f13, f14, f15, f16, false);
    }

    public final void e(Canvas canvas) {
        int size = this.f52227a.size();
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = this.f52228b;
            int i15 = this.f52230d;
            b((i14 + i15) * (i13 % 2), (this.f52229c + i15) * (i13 / 2), (qa2.c) this.f52227a.get(i13), canvas);
        }
    }

    public final void g(Canvas canvas) {
        int i13 = this.f52228b * 2;
        int i14 = this.f52230d;
        float f13 = i13 + i14;
        float f14 = (this.f52229c * 2) + i14;
        RectF rectF = this.f52235i;
        rectF.set(0.0f, 0.0f, f13, f14);
        Path path = this.f52236j;
        path.reset();
        int i15 = this.f52231e;
        path.addRoundRect(rectF, i15, i15, Path.Direction.CW);
        canvas.clipPath(path);
    }

    public final void i(int i13, int i14) {
        Context context = getContext();
        int i15 = q0.pinterest_grid_bg;
        Object obj = a.f53679a;
        this.f52232f = context.getColor(i15);
        Resources resources = getResources();
        this.f52227a = new ArrayList();
        for (int i16 = 0; i16 < 4; i16++) {
            this.f52227a.add(new qa2.c(this));
        }
        this.f52231e = resources.getDimensionPixelSize(i13);
        this.f52230d = resources.getDimensionPixelSize(i14);
    }

    public final void j() {
        List list;
        if (this.f52228b == 0 || this.f52229c == 0 || b.o(this.f52227a) || (list = this.f52237k) == null || b.o(list)) {
            return;
        }
        int size = this.f52237k.size();
        int size2 = this.f52227a.size();
        for (int i13 = 0; i13 < size2; i13++) {
            qa2.c cVar = (qa2.c) this.f52227a.get(i13);
            if (i13 < size) {
                l0 l0Var = this.f52238l;
                if (l0Var != null) {
                    cVar.f103242k = l0Var;
                }
                z o13 = ((m) t.a()).o((String) this.f52237k.get(i13), false);
                o13.f70086d = true;
                o13.f70087e = this.f52228b;
                o13.f70088f = this.f52229c;
                Bitmap.Config config = Bitmap.Config.RGB_565;
                o13.a(cVar);
            } else {
                cVar.f103239h = null;
                cVar.f(null);
                cVar.f103242k = null;
            }
        }
    }

    public void k() {
        int size = this.f52227a.size();
        for (int i13 = 0; i13 < size; i13++) {
            qa2.c cVar = (qa2.c) this.f52227a.get(i13);
            ((m) t.a()).h(cVar);
            cVar.f(null);
            cVar.f103239h = null;
            cVar.f103242k = null;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        int i15 = this.f52230d;
        int i16 = (size - i15) / 2;
        this.f52228b = i16;
        this.f52229c = i16;
        setMeasuredDimension(size, (i16 * 2) + i15);
        j();
    }

    public SquareFourImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f52235i = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f52236j = new Path();
        i(c.lego_corner_radius_small, c.image_grid_padding);
    }
}
