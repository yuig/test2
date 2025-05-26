package com.google.android.material.bottomsheet;

import a8.v;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import fj.c;
import fj.k;
import fj.l;
import java.util.WeakHashMap;
import kj.f;
import q5.v0;
import r5.d;

/* loaded from: classes3.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static final int f32328j = l.Widget_Material3_BottomSheet_DragHandle;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f32329a;

    /* renamed from: b, reason: collision with root package name */
    public BottomSheetBehavior f32330b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32331c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32332d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32333e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32334f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32335g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32336h;

    /* renamed from: i, reason: collision with root package name */
    public final f f32337i;

    public BottomSheetDragHandleView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.bottomSheetDragHandleStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r1 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f2() {
        /*
            r7 = this;
            boolean r0 = r7.f32332d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.view.accessibility.AccessibilityManager r0 = r7.f32329a
            if (r0 != 0) goto Lb
            goto L1d
        Lb:
            r2 = 16384(0x4000, float:2.2959E-41)
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain(r2)
            java.util.List r3 = r2.getText()
            java.lang.String r4 = r7.f32336h
            r3.add(r4)
            r0.sendAccessibilityEvent(r2)
        L1d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.f32330b
            boolean r2 = r0.f32293b
            r3 = 1
            if (r2 != 0) goto L28
            r0.getClass()
            r1 = r3
        L28:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.f32330b
            int r2 = r0.L
            r4 = 6
            r5 = 3
            r6 = 4
            if (r2 != r6) goto L34
            if (r1 == 0) goto L41
            goto L42
        L34:
            if (r2 != r5) goto L3b
            if (r1 == 0) goto L39
            goto L42
        L39:
            r4 = r6
            goto L42
        L3b:
            boolean r1 = r7.f32333e
            if (r1 == 0) goto L40
            goto L41
        L40:
            r5 = r6
        L41:
            r4 = r5
        L42:
            r0.X(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.f2():boolean");
    }

    public final void g2(int i13) {
        if (i13 == 4) {
            this.f32333e = true;
        } else if (i13 == 3) {
            this.f32333e = false;
        }
        v0.m(this, d.f106213g, this.f32333e ? this.f32334f : this.f32335g, new v(this, 13));
    }

    public final void i2(BottomSheetBehavior bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.f32330b;
        f fVar = this.f32337i;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.X.remove(fVar);
            this.f32330b.Q(null);
        }
        this.f32330b = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.Q(this);
            g2(this.f32330b.L);
            this.f32330b.C(fVar);
        }
        k2();
    }

    public final void k2() {
        this.f32332d = this.f32331c && this.f32330b != null;
        int i13 = this.f32330b == null ? 2 : 1;
        WeakHashMap weakHashMap = v0.f102521a;
        setImportantForAccessibility(i13);
        setClickable(this.f32332d);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z13) {
        this.f32331c = z13;
        k2();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof androidx.coordinatorlayout.widget.c) {
                CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) layoutParams).f17900a;
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        i2(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.f32329a;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f32329a;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        i2(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(fk.a.a(context, attributeSet, i13, f32328j), attributeSet, i13);
        this.f32334f = getResources().getString(k.bottomsheet_action_expand);
        this.f32335g = getResources().getString(k.bottomsheet_action_collapse);
        this.f32336h = getResources().getString(k.bottomsheet_drag_handle_clicked);
        this.f32337i = new f(this, 2);
        this.f32329a = (AccessibilityManager) getContext().getSystemService("accessibility");
        k2();
        v0.o(this, new kj.d(this, 1));
    }
}
