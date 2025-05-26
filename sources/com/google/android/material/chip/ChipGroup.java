package com.google.android.material.chip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.y1;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.a;
import fj.c;
import fj.l;
import java.util.Map;
import nj.g;

/* loaded from: classes3.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final int f32459j = l.Widget_MaterialComponents_ChipGroup;

    /* renamed from: e, reason: collision with root package name */
    public final int f32460e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32461f;

    /* renamed from: g, reason: collision with root package name */
    public final a f32462g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32463h;

    /* renamed from: i, reason: collision with root package name */
    public final g f32464i;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.chipGroupStyle);
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean a() {
        return this.f32671c;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i13 = this.f32463h;
        if (i13 != -1) {
            a aVar = this.f32462g;
            com.google.android.material.internal.g gVar = (com.google.android.material.internal.g) ((Map) aVar.f32696d).get(Integer.valueOf(i13));
            if (gVar != null && aVar.a(gVar)) {
                aVar.b();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i13;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f32671c) {
            i13 = 0;
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                if ((getChildAt(i14) instanceof Chip) && getChildAt(i14).getVisibility() == 0) {
                    i13++;
                }
            }
        } else {
            i13 = -1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) y1.i(this.f32672d, i13, this.f32462g.f32694b ? 1 : 2).f19715a);
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f32464i.f90968a = onHierarchyChangeListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f32459j
            android.content.Context r8 = fk.a.a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.internal.a r8 = new com.google.android.material.internal.a
            r8.<init>()
            r7.f32462g = r8
            nj.g r0 = new nj.g
            r0.<init>(r7)
            r7.f32464i = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = fj.m.ChipGroup
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.d0.f(r0, r1, r2, r3, r4, r5)
            int r10 = fj.m.ChipGroup_chipSpacing
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = fj.m.ChipGroup_chipSpacingHorizontal
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            int r1 = r7.f32460e
            if (r1 == r0) goto L3d
            r7.f32460e = r0
            r7.f32670b = r0
            r7.requestLayout()
        L3d:
            int r0 = fj.m.ChipGroup_chipSpacingVertical
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            int r0 = r7.f32461f
            if (r0 == r10) goto L4e
            r7.f32461f = r10
            r7.f32669a = r10
            r7.requestLayout()
        L4e:
            int r10 = fj.m.ChipGroup_singleLine
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f32671c = r10
            int r10 = fj.m.ChipGroup_singleSelection
            boolean r10 = r9.getBoolean(r10, r6)
            boolean r0 = r8.f32694b
            r1 = 1
            if (r0 == r10) goto L8d
            r8.f32694b = r10
            java.lang.Object r10 = r8.f32697e
            java.util.Set r10 = (java.util.Set) r10
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r1
            java.io.Serializable r0 = r8.f32696d
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L78:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r0.next()
            com.google.android.material.internal.g r2 = (com.google.android.material.internal.g) r2
            r8.c(r2, r6)
            goto L78
        L88:
            if (r10 == 0) goto L8d
            r8.b()
        L8d:
            int r8 = fj.m.ChipGroup_selectionRequired
            boolean r8 = r9.getBoolean(r8, r6)
            com.google.android.material.internal.a r10 = r7.f32462g
            r10.f32695c = r8
            int r8 = fj.m.ChipGroup_checkedChip
            r10 = -1
            int r8 = r9.getResourceId(r8, r10)
            r7.f32463h = r8
            r9.recycle()
            com.google.android.material.internal.a r8 = r7.f32462g
            oi.u6 r9 = new oi.u6
            r10 = 8
            r9.<init>(r7, r10)
            r8.f32698f = r9
            nj.g r8 = r7.f32464i
            super.setOnHierarchyChangeListener(r8)
            java.util.WeakHashMap r8 = q5.v0.f102521a
            r7.setImportantForAccessibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
