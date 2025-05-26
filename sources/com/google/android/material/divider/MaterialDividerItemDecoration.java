package com.google.android.material.divider;

import a.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import com.bumptech.glide.d;
import com.google.android.material.internal.d0;
import fj.c;
import fj.e;
import fj.l;
import fj.m;
import lb.l0;

/* loaded from: classes3.dex */
public class MaterialDividerItemDecoration extends h2 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f32608i = l.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f32609a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32610b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32611c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32612d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32613e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32614f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32615g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f32616h;

    public MaterialDividerItemDecoration(@NonNull Context context, AttributeSet attributeSet, int i13) {
        int i14 = c.materialDividerStyle;
        this.f32616h = new Rect();
        TypedArray f13 = d0.f(context, attributeSet, m.MaterialDivider, i14, f32608i, new int[0]);
        this.f32611c = d.H(context, f13, m.MaterialDivider_dividerColor).getDefaultColor();
        this.f32610b = f13.getDimensionPixelSize(m.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(e.material_divider_thickness));
        this.f32613e = f13.getDimensionPixelOffset(m.MaterialDivider_dividerInsetStart, 0);
        this.f32614f = f13.getDimensionPixelOffset(m.MaterialDivider_dividerInsetEnd, 0);
        this.f32615g = f13.getBoolean(m.MaterialDivider_lastItemDecorated, true);
        f13.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int i15 = this.f32611c;
        this.f32611c = i15;
        this.f32609a = shapeDrawable;
        shapeDrawable.setTint(i15);
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException(a.e("Invalid orientation: ", i13, ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.f32612d = i13;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect rect, View view, RecyclerView recyclerView, w2 w2Var) {
        rect.set(0, 0, 0, 0);
        if (i(recyclerView, view)) {
            int i13 = this.f32612d;
            int i14 = this.f32610b;
            if (i13 == 1) {
                rect.bottom = i14;
            } else if (l0.H0(recyclerView)) {
                rect.left = i14;
            } else {
                rect.right = i14;
            }
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public final void g(Canvas canvas, RecyclerView recyclerView, w2 w2Var) {
        int height;
        int i13;
        int i14;
        int i15;
        int width;
        int i16;
        if (recyclerView.f19242n == null) {
            return;
        }
        int i17 = this.f32612d;
        int i18 = this.f32610b;
        int i19 = this.f32614f;
        int i23 = this.f32613e;
        Rect rect = this.f32616h;
        int i24 = 0;
        if (i17 == 1) {
            canvas.save();
            if (recyclerView.f19230h) {
                i16 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i16, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i16 = 0;
            }
            boolean H0 = l0.H0(recyclerView);
            int i25 = i16 + (H0 ? i19 : i23);
            if (H0) {
                i19 = i23;
            }
            int i26 = width - i19;
            int childCount = recyclerView.getChildCount();
            while (i24 < childCount) {
                View childAt = recyclerView.getChildAt(i24);
                if (i(recyclerView, childAt)) {
                    recyclerView.f19242n.J(rect, childAt);
                    int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                    this.f32609a.setBounds(i25, round - i18, i26, round);
                    this.f32609a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                    this.f32609a.draw(canvas);
                }
                i24++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.f19230h) {
            i13 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i13, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i13 = 0;
        }
        int i27 = i13 + i23;
        int i28 = height - i19;
        boolean H02 = l0.H0(recyclerView);
        int childCount2 = recyclerView.getChildCount();
        while (i24 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i24);
            if (i(recyclerView, childAt2)) {
                recyclerView.f19242n.J(rect, childAt2);
                int round2 = Math.round(childAt2.getTranslationX());
                if (H02) {
                    i15 = rect.left + round2;
                    i14 = i15 + i18;
                } else {
                    i14 = round2 + rect.right;
                    i15 = i14 - i18;
                }
                this.f32609a.setBounds(i15, i27, i14, i28);
                this.f32609a.setAlpha(Math.round(childAt2.getAlpha() * 255.0f));
                this.f32609a.draw(canvas);
            }
            i24++;
        }
        canvas.restore();
    }

    public final boolean i(RecyclerView recyclerView, View view) {
        recyclerView.getClass();
        int r13 = RecyclerView.r1(view);
        b2 b2Var = recyclerView.f19240m;
        boolean z13 = b2Var != null && r13 == b2Var.e() - 1;
        if (r13 != -1) {
            return !z13 || this.f32615g;
        }
        return false;
    }
}
