package com.google.android.material.slider;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import fj.k;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class f extends y5.b {

    /* renamed from: o, reason: collision with root package name */
    public final BaseSlider f33109o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f33110p;

    public f(BaseSlider baseSlider) {
        super(baseSlider);
        this.f33110p = new Rect();
        this.f33109o = baseSlider;
    }

    @Override // y5.b
    public final void m(ArrayList arrayList) {
        for (int i13 = 0; i13 < this.f33109o.n().size(); i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
    }

    @Override // y5.b
    public final boolean p(int i13, int i14, Bundle bundle) {
        BaseSlider baseSlider = this.f33109o;
        if (!baseSlider.isEnabled()) {
            return false;
        }
        if (i14 != 4096 && i14 != 8192) {
            if (i14 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                float f13 = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                int i15 = BaseSlider.f33043t0;
                if (baseSlider.S(i13, f13)) {
                    baseSlider.V();
                    baseSlider.postInvalidate();
                    n(i13);
                    return true;
                }
            }
            return false;
        }
        int i16 = BaseSlider.f33043t0;
        float f14 = baseSlider.V;
        if (f14 == 0.0f) {
            f14 = 1.0f;
        }
        if ((baseSlider.R - baseSlider.Q) / f14 > 20) {
            f14 *= Math.round(r1 / r5);
        }
        if (i14 == 8192) {
            f14 = -f14;
        }
        if (baseSlider.q()) {
            f14 = -f14;
        }
        if (!baseSlider.S(i13, com.bumptech.glide.c.p(((Float) baseSlider.n().get(i13)).floatValue() + f14, baseSlider.l(), baseSlider.m()))) {
            return false;
        }
        baseSlider.V();
        baseSlider.postInvalidate();
        n(i13);
        return true;
    }

    @Override // y5.b
    public final void r(int i13, r5.e eVar) {
        eVar.b(r5.d.f106226t);
        BaseSlider baseSlider = this.f33109o;
        ArrayList n13 = baseSlider.n();
        float floatValue = ((Float) n13.get(i13)).floatValue();
        float l13 = baseSlider.l();
        float m13 = baseSlider.m();
        if (baseSlider.isEnabled()) {
            if (floatValue > l13) {
                eVar.a(8192);
            }
            if (floatValue < m13) {
                eVar.a(4096);
            }
        }
        eVar.f106231a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, l13, m13, floatValue));
        eVar.r(SeekBar.class.getName());
        StringBuilder sb3 = new StringBuilder();
        if (baseSlider.getContentDescription() != null) {
            sb3.append(baseSlider.getContentDescription());
            sb3.append(",");
        }
        String g13 = baseSlider.g(floatValue);
        String string = baseSlider.getContext().getString(k.material_slider_value);
        if (n13.size() > 1) {
            string = i13 == baseSlider.n().size() - 1 ? baseSlider.getContext().getString(k.material_slider_range_end) : i13 == 0 ? baseSlider.getContext().getString(k.material_slider_range_start) : "";
        }
        Locale locale = Locale.US;
        sb3.append(string + ", " + g13);
        eVar.v(sb3.toString());
        Rect rect = this.f33110p;
        baseSlider.U(i13, rect);
        eVar.o(rect);
    }

    public final int v(float f13, float f14) {
        int i13 = 0;
        while (true) {
            BaseSlider baseSlider = this.f33109o;
            if (i13 >= baseSlider.n().size()) {
                return -1;
            }
            Rect rect = this.f33110p;
            baseSlider.U(i13, rect);
            if (rect.contains((int) f13, (int) f14)) {
                return i13;
            }
            i13++;
        }
    }
}
