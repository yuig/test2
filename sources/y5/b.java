package y5;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.y1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q5.v0;
import r5.e;

/* loaded from: classes.dex */
public abstract class b extends q5.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f137734n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f137739h;

    /* renamed from: i, reason: collision with root package name */
    public final View f137740i;

    /* renamed from: j, reason: collision with root package name */
    public a f137741j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f137735d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f137736e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f137737f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f137738g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f137742k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f137743l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f137744m = Integer.MIN_VALUE;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f137740i = view;
        this.f137739h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = v0.f102521a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // q5.b
    public final y1 b(View view) {
        if (this.f137741j == null) {
            this.f137741j = new a(this);
        }
        return this.f137741j;
    }

    @Override // q5.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // q5.b
    public final void d(View view, e eVar) {
        this.f102402a.onInitializeAccessibilityNodeInfo(view, eVar.f106231a);
        q(eVar);
    }

    public final boolean j(int i13) {
        if (this.f137743l != i13) {
            return false;
        }
        this.f137743l = Integer.MIN_VALUE;
        s(i13, false);
        u(i13, 8);
        return true;
    }

    public final AccessibilityEvent k(int i13, int i14) {
        View view = this.f137740i;
        if (i13 == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i14);
            view.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i14);
        e o13 = o(i13);
        obtain2.getText().add(o13.i());
        AccessibilityNodeInfo accessibilityNodeInfo = o13.f106231a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(view, i13);
        obtain2.setPackageName(view.getContext().getPackageName());
        return obtain2;
    }

    public final e l(int i13) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        e eVar = new e(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        eVar.r("android.view.View");
        Rect rect = f137734n;
        eVar.o(rect);
        eVar.p(rect);
        eVar.f106232b = -1;
        View view = this.f137740i;
        obtain.setParent(view);
        r(i13, eVar);
        if (eVar.i() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f137736e;
        eVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(view.getContext().getPackageName());
        eVar.f106233c = i13;
        obtain.setSource(view, i13);
        if (this.f137742k == i13) {
            eVar.m(true);
            eVar.a(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        } else {
            eVar.m(false);
            eVar.a(64);
        }
        boolean z13 = this.f137743l == i13;
        if (z13) {
            eVar.a(2);
        } else if (obtain.isFocusable()) {
            eVar.a(1);
        }
        eVar.x(z13);
        int[] iArr = this.f137738g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f137735d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            eVar.f(rect3);
            if (eVar.f106232b != -1) {
                e eVar2 = new e(AccessibilityNodeInfo.obtain());
                for (int i14 = eVar.f106232b; i14 != -1; i14 = eVar2.f106232b) {
                    eVar2.f106232b = -1;
                    eVar2.f106231a.setParent(view, -1);
                    eVar2.o(rect);
                    r(i14, eVar2);
                    eVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f137737f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                eVar.p(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            eVar.f106231a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return eVar;
    }

    public abstract void m(ArrayList arrayList);

    public final void n(int i13) {
        View view;
        ViewParent parent;
        if (i13 == Integer.MIN_VALUE || !this.f137739h.isEnabled() || (parent = (view = this.f137740i).getParent()) == null) {
            return;
        }
        AccessibilityEvent k13 = k(i13, 2048);
        k13.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, k13);
    }

    public final e o(int i13) {
        if (i13 != -1) {
            return l(i13);
        }
        View view = this.f137740i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        e eVar = new e(obtain);
        WeakHashMap weakHashMap = v0.f102521a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            eVar.f106231a.addChild(view, ((Integer) arrayList.get(i14)).intValue());
        }
        return eVar;
    }

    public abstract boolean p(int i13, int i14, Bundle bundle);

    public void q(e eVar) {
    }

    public abstract void r(int i13, e eVar);

    public void s(int i13, boolean z13) {
    }

    public final boolean t(int i13) {
        int i14;
        View view = this.f137740i;
        if ((!view.isFocused() && !view.requestFocus()) || (i14 = this.f137743l) == i13) {
            return false;
        }
        if (i14 != Integer.MIN_VALUE) {
            j(i14);
        }
        if (i13 == Integer.MIN_VALUE) {
            return false;
        }
        this.f137743l = i13;
        s(i13, true);
        u(i13, 8);
        return true;
    }

    public final void u(int i13, int i14) {
        View view;
        ViewParent parent;
        if (i13 == Integer.MIN_VALUE || !this.f137739h.isEnabled() || (parent = (view = this.f137740i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i13, i14));
    }
}
