package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.y1;
import fj.l;
import fj.m;
import java.util.Arrays;
import q5.v0;

/* loaded from: classes3.dex */
class ClockFaceView extends RadialViewGroup implements d {

    /* renamed from: d, reason: collision with root package name */
    public final ClockHandView f33330d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f33331e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f33332f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f33333g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f33334h;

    /* renamed from: i, reason: collision with root package name */
    public final c f33335i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f33336j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f33337k;

    /* renamed from: l, reason: collision with root package name */
    public final int f33338l;

    /* renamed from: m, reason: collision with root package name */
    public final int f33339m;

    /* renamed from: n, reason: collision with root package name */
    public final int f33340n;

    /* renamed from: o, reason: collision with root package name */
    public final int f33341o;

    /* renamed from: p, reason: collision with root package name */
    public final String[] f33342p;

    /* renamed from: q, reason: collision with root package name */
    public float f33343q;

    /* renamed from: r, reason: collision with root package name */
    public final ColorStateList f33344r;

    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.materialClockStyle);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void L() {
        super.L();
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f33334h;
            if (i13 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i13)).setVisibility(0);
            i13++;
        }
    }

    public final void T() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f33330d.f33351g;
        float f13 = Float.MAX_VALUE;
        TextView textView = null;
        int i13 = 0;
        while (true) {
            sparseArray = this.f33334h;
            int size = sparseArray.size();
            rectF = this.f33332f;
            rect = this.f33331e;
            if (i13 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i13);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f13) {
                    textView = textView2;
                    f13 = height;
                }
            }
            i13++;
        }
        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
            TextView textView3 = (TextView) sparseArray.get(i14);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f33333g);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f33336j, this.f33337k, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) y1.i(1, this.f33342p.length, 1).f19715a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        T();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f33341o / Math.max(Math.max(this.f33339m / displayMetrics.heightPixels, this.f33340n / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f33331e = new Rect();
        this.f33332f = new RectF();
        this.f33333g = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f33334h = sparseArray;
        this.f33337k = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.ClockFaceView, i13, l.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList H = com.bumptech.glide.d.H(context, obtainStyledAttributes, m.ClockFaceView_clockNumberTextColor);
        this.f33344r = H;
        LayoutInflater.from(context).inflate(fj.i.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(fj.g.material_clock_hand);
        this.f33330d = clockHandView;
        this.f33338l = resources.getDimensionPixelSize(fj.e.material_clock_hand_padding);
        int colorForState = H.getColorForState(new int[]{R.attr.state_selected}, H.getDefaultColor());
        this.f33336j = new int[]{colorForState, colorForState, H.getDefaultColor()};
        clockHandView.f33347c.add(this);
        int defaultColor = d5.a.b(context, fj.d.material_timepicker_clockface).getDefaultColor();
        ColorStateList H2 = com.bumptech.glide.d.H(context, obtainStyledAttributes, m.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(H2 != null ? H2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f33335i = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f33342p = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z13 = false;
        for (int i14 = 0; i14 < Math.max(this.f33342p.length, size); i14++) {
            TextView textView = (TextView) sparseArray.get(i14);
            if (i14 >= this.f33342p.length) {
                removeView(textView);
                sparseArray.remove(i14);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(fj.i.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i14, textView);
                    addView(textView);
                }
                textView.setText(this.f33342p[i14]);
                textView.setTag(fj.g.material_value_index, Integer.valueOf(i14));
                int i15 = (i14 / 12) + 1;
                textView.setTag(fj.g.material_clock_level, Integer.valueOf(i15));
                z13 = i15 > 1 ? true : z13;
                v0.o(textView, this.f33335i);
                textView.setTextColor(this.f33344r);
            }
        }
        ClockHandView clockHandView2 = this.f33330d;
        if (clockHandView2.f33346b && !z13) {
            clockHandView2.f33357m = 1;
        }
        clockHandView2.f33346b = z13;
        clockHandView2.invalidate();
        this.f33339m = resources.getDimensionPixelSize(fj.e.material_time_picker_minimum_screen_height);
        this.f33340n = resources.getDimensionPixelSize(fj.e.material_time_picker_minimum_screen_width);
        this.f33341o = resources.getDimensionPixelSize(fj.e.material_clock_size);
    }
}
