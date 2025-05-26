package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.l;
import androidx.constraintlayout.widget.p;
import bk.k;
import bk.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
class RadialViewGroup extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final e f33358a;

    /* renamed from: b, reason: collision with root package name */
    public int f33359b;

    /* renamed from: c, reason: collision with root package name */
    public final bk.i f33360c;

    public RadialViewGroup(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void L() {
        p pVar = new p();
        pVar.j(this);
        HashMap hashMap = new HashMap();
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getId() != fj.g.circle_center && !"skip".equals(childAt.getTag())) {
                int i14 = (Integer) childAt.getTag(fj.g.material_clock_level);
                if (i14 == null) {
                    i14 = 1;
                }
                if (!hashMap.containsKey(i14)) {
                    hashMap.put(i14, new ArrayList());
                }
                ((List) hashMap.get(i14)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f33359b * 0.66f) : this.f33359b;
            Iterator it = list.iterator();
            float f13 = 0.0f;
            while (it.hasNext()) {
                int id3 = ((View) it.next()).getId();
                int i15 = fj.g.circle_center;
                l lVar = pVar.w(id3).f17767e;
                lVar.A = i15;
                lVar.B = round;
                lVar.C = f13;
                f13 += 360.0f / list.size();
            }
        }
        pVar.b(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i13, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = v0.f102521a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f33358a;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        L();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f33358a;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i13) {
        this.f33360c.t(ColorStateList.valueOf(i13));
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.material.timepicker.e] */
    public RadialViewGroup(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        LayoutInflater.from(context).inflate(fj.i.material_radial_view_group, this);
        bk.i iVar = new bk.i();
        this.f33360c = iVar;
        k kVar = new k(0.5f);
        m h10 = iVar.f23052a.f23030a.h();
        h10.f23082e = kVar;
        h10.f23083f = kVar;
        h10.f23084g = kVar;
        h10.f23085h = kVar;
        iVar.Y0(h10.a());
        this.f33360c.t(ColorStateList.valueOf(-1));
        bk.i iVar2 = this.f33360c;
        WeakHashMap weakHashMap = v0.f102521a;
        setBackground(iVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fj.m.RadialViewGroup, i13, 0);
        this.f33359b = obtainStyledAttributes.getDimensionPixelSize(fj.m.RadialViewGroup_materialCircleRadius, 0);
        this.f33358a = new Runnable() { // from class: com.google.android.material.timepicker.e
            @Override // java.lang.Runnable
            public final void run() {
                RadialViewGroup.this.L();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
