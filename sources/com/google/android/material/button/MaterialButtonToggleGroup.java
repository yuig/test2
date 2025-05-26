package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.y1;
import bk.m;
import bk.o;
import fj.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kj.d;
import lb.l0;
import oi.u6;
import q5.v0;
import s4.g;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final int f32356k = l.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f32357a;

    /* renamed from: b, reason: collision with root package name */
    public final u6 f32358b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f32359c;

    /* renamed from: d, reason: collision with root package name */
    public final g f32360d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f32361e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32362f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32363g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f32364h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32365i;

    /* renamed from: j, reason: collision with root package name */
    public HashSet f32366j;

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.materialButtonToggleGroupStyle);
    }

    public final void a() {
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i13 = -1;
                break;
            } else if (c(i13)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 == -1) {
            return;
        }
        for (int i14 = i13 + 1; i14 < getChildCount(); i14++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i14);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i14 - 1);
            int min = Math.min(materialButton.h() ? materialButton.f32341d.f32374h : 0, materialButton2.h() ? materialButton2.f32341d.f32374h : 0);
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || i13 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(i13)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i13, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = v0.f102521a;
            materialButton.setId(View.generateViewId());
        }
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        boolean h10 = materialButton.h();
        b bVar = materialButton.f32341d;
        if (h10) {
            bVar.f32383q = true;
        }
        materialButton.f32343f = this.f32358b;
        if (materialButton.h()) {
            bVar.f32380n = true;
            bVar.g();
        }
        b(materialButton.getId(), materialButton.f32352o);
        if (!materialButton.h()) {
            throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        }
        o oVar = bVar.f32368b;
        this.f32357a.add(new c(oVar.f23095e, oVar.f23098h, oVar.f23096f, oVar.f23097g));
        materialButton.setEnabled(isEnabled());
        v0.o(materialButton, new d(this, 2));
    }

    public final void b(int i13, boolean z13) {
        if (i13 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i13);
            return;
        }
        HashSet hashSet = new HashSet(this.f32366j);
        if (z13 && !hashSet.contains(Integer.valueOf(i13))) {
            if (this.f32363g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i13));
        } else {
            if (z13 || !hashSet.contains(Integer.valueOf(i13))) {
                return;
            }
            if (!this.f32364h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i13));
            }
        }
        e(hashSet);
    }

    public final boolean c(int i13) {
        return getChildAt(i13).getVisibility() != 8;
    }

    public final void d(MaterialButton materialButton, boolean z13) {
        if (this.f32362f) {
            return;
        }
        b(materialButton.getId(), z13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f32360d);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            treeMap.put((MaterialButton) getChildAt(i13), Integer.valueOf(i13));
        }
        this.f32361e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set set) {
        HashSet hashSet = this.f32366j;
        this.f32366j = new HashSet(set);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            int id3 = ((MaterialButton) getChildAt(i13)).getId();
            boolean contains = set.contains(Integer.valueOf(id3));
            View findViewById = findViewById(id3);
            if (findViewById instanceof MaterialButton) {
                this.f32362f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f32362f = false;
            }
            if (hashSet.contains(Integer.valueOf(id3)) != set.contains(Integer.valueOf(id3))) {
                set.contains(Integer.valueOf(id3));
                Iterator it = this.f32359c.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.g) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i13;
        c cVar;
        int childCount = getChildCount();
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            i13 = -1;
            if (i14 >= childCount2) {
                i14 = -1;
                break;
            } else if (c(i14)) {
                break;
            } else {
                i14++;
            }
        }
        int childCount3 = getChildCount() - 1;
        while (true) {
            if (childCount3 < 0) {
                break;
            }
            if (c(childCount3)) {
                i13 = childCount3;
                break;
            }
            childCount3--;
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i15);
            if (materialButton.getVisibility() != 8) {
                if (!materialButton.h()) {
                    throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
                }
                m h10 = materialButton.f32341d.f32368b.h();
                c cVar2 = (c) this.f32357a.get(i15);
                if (i14 != i13) {
                    boolean z13 = getOrientation() == 0;
                    bk.a aVar = c.f32387e;
                    if (i15 == i14) {
                        cVar = z13 ? l0.H0(this) ? new c(aVar, aVar, cVar2.f32389b, cVar2.f32390c) : new c(cVar2.f32388a, cVar2.f32391d, aVar, aVar) : new c(cVar2.f32388a, aVar, cVar2.f32389b, aVar);
                    } else if (i15 == i13) {
                        cVar = z13 ? l0.H0(this) ? new c(cVar2.f32388a, cVar2.f32391d, aVar, aVar) : new c(aVar, aVar, cVar2.f32389b, cVar2.f32390c) : new c(aVar, cVar2.f32391d, aVar, cVar2.f32390c);
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    h10.c(0.0f);
                } else {
                    h10.f23082e = cVar2.f32388a;
                    h10.f23085h = cVar2.f32391d;
                    h10.f23083f = cVar2.f32389b;
                    h10.f23084g = cVar2.f32390c;
                }
                materialButton.Y0(h10.a());
            }
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i13, int i14) {
        Integer[] numArr = this.f32361e;
        if (numArr != null && i14 < numArr.length) {
            return numArr[i14].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i14;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i13 = this.f32365i;
        if (i13 != -1) {
            e(Collections.singleton(Integer.valueOf(i13)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            if ((getChildAt(i14) instanceof MaterialButton) && c(i14)) {
                i13++;
            }
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) y1.i(1, i13, this.f32363g ? 1 : 2).f19715a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        f();
        a();
        super.onMeasure(i13, i14);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).f32343f = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f32357a.remove(indexOfChild);
        }
        f();
        a();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z13) {
        super.setEnabled(z13);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            ((MaterialButton) getChildAt(i13)).setEnabled(z13);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(@androidx.annotation.NonNull android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f32356k
            android.content.Context r7 = fk.a.a(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f32357a = r7
            oi.u6 r7 = new oi.u6
            r7.<init>(r6)
            r6.f32358b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f32359c = r7
            s4.g r7 = new s4.g
            r0 = 3
            r7.<init>(r6, r0)
            r6.f32360d = r7
            r7 = 0
            r6.f32362f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f32366j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = fj.m.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.d0.f(r0, r1, r2, r3, r4, r5)
            int r9 = fj.m.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            boolean r0 = r6.f32363g
            if (r0 == r9) goto L52
            r6.f32363g = r9
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r6.e(r9)
        L52:
            r9 = r7
        L53:
            int r0 = r6.getChildCount()
            if (r9 >= r0) goto L72
            boolean r0 = r6.f32363g
            if (r0 == 0) goto L64
            java.lang.Class<android.widget.RadioButton> r0 = android.widget.RadioButton.class
        L5f:
            java.lang.String r0 = r0.getName()
            goto L67
        L64:
            java.lang.Class<android.widget.ToggleButton> r0 = android.widget.ToggleButton.class
            goto L5f
        L67:
            android.view.View r1 = r6.getChildAt(r9)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r1.f32347j = r0
            int r9 = r9 + 1
            goto L53
        L72:
            int r9 = fj.m.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f32365i = r9
            int r9 = fj.m.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f32364h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r9 = fj.m.MaterialButtonToggleGroup_android_enabled
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setEnabled(r9)
            r8.recycle()
            java.util.WeakHashMap r8 = q5.v0.f102521a
            r6.setImportantForAccessibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
