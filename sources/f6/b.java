package f6;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.util.WeakHashMap;
import q5.v0;
import r5.d;
import r5.e;

/* loaded from: classes3.dex */
public final class b extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f61206d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f61207e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f61208f;

    public b(DrawerLayout drawerLayout) {
        this.f61208f = drawerLayout;
    }

    @Override // q5.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        int i13 = this.f61206d;
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        switch (i13) {
            case 0:
                if (accessibilityEvent.getEventType() != 32) {
                    break;
                } else {
                    accessibilityEvent.getText();
                    DrawerLayout drawerLayout = (DrawerLayout) this.f61208f;
                    View f13 = drawerLayout.f();
                    if (f13 != null) {
                        int h10 = drawerLayout.h(f13);
                        WeakHashMap weakHashMap = v0.f102521a;
                        Gravity.getAbsoluteGravity(h10, drawerLayout.getLayoutDirection());
                        break;
                    }
                }
                break;
        }
        return accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // q5.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f61206d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            default:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                break;
        }
    }

    @Override // q5.b
    public final void d(View view, e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f106231a;
        int i13 = this.f61206d;
        Rect rect = this.f61207e;
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        switch (i13) {
            case 0:
                if (DrawerLayout.E) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                } else {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
                    eVar.f106233c = -1;
                    accessibilityNodeInfo.setSource(view);
                    WeakHashMap weakHashMap = v0.f102521a;
                    Object parentForAccessibility = view.getParentForAccessibility();
                    if (parentForAccessibility instanceof View) {
                        eVar.f106232b = -1;
                        accessibilityNodeInfo.setParent((View) parentForAccessibility);
                    }
                    obtain.getBoundsInScreen(rect);
                    eVar.p(rect);
                    accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
                    accessibilityNodeInfo.setPackageName(obtain.getPackageName());
                    eVar.r(obtain.getClassName());
                    eVar.v(obtain.getContentDescription());
                    accessibilityNodeInfo.setEnabled(obtain.isEnabled());
                    eVar.x(obtain.isFocused());
                    eVar.m(obtain.isAccessibilityFocused());
                    eVar.D(obtain.isSelected());
                    eVar.a(obtain.getActions());
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = viewGroup.getChildAt(i14);
                        if (DrawerLayout.i(childAt)) {
                            accessibilityNodeInfo.addChild(childAt);
                        }
                    }
                }
                eVar.r("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo.setFocusable(false);
                eVar.x(false);
                eVar.l(d.f106211e);
                eVar.l(d.f106212f);
                break;
            default:
                AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain2);
                obtain2.getBoundsInScreen(rect);
                eVar.p(rect);
                accessibilityNodeInfo.setVisibleToUser(obtain2.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(obtain2.getPackageName());
                eVar.r(obtain2.getClassName());
                eVar.v(obtain2.getContentDescription());
                accessibilityNodeInfo.setEnabled(obtain2.isEnabled());
                eVar.s(obtain2.isClickable());
                accessibilityNodeInfo.setFocusable(obtain2.isFocusable());
                eVar.x(obtain2.isFocused());
                eVar.m(obtain2.isAccessibilityFocused());
                eVar.D(obtain2.isSelected());
                accessibilityNodeInfo.setLongClickable(obtain2.isLongClickable());
                eVar.a(obtain2.getActions());
                eVar.B(obtain2.getMovementGranularities());
                eVar.r("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                eVar.f106233c = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap weakHashMap2 = v0.f102521a;
                Object parentForAccessibility2 = view.getParentForAccessibility();
                if (parentForAccessibility2 instanceof View) {
                    eVar.f106232b = -1;
                    accessibilityNodeInfo.setParent((View) parentForAccessibility2);
                }
                ViewGroup viewGroup2 = this.f61208f;
                SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) viewGroup2;
                int childCount2 = slidingPaneLayout.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = slidingPaneLayout.getChildAt(i15);
                    if (!((SlidingPaneLayout) viewGroup2).a(childAt2) && childAt2.getVisibility() == 0) {
                        childAt2.setImportantForAccessibility(1);
                        accessibilityNodeInfo.addChild(childAt2);
                    }
                }
                break;
        }
    }

    @Override // q5.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int i13 = this.f61206d;
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        switch (i13) {
            case 0:
                if (DrawerLayout.E || DrawerLayout.i(view)) {
                    break;
                }
                break;
            default:
                if (!((SlidingPaneLayout) this.f61208f).a(view)) {
                    break;
                }
                break;
        }
        return accessibilityDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public b(SlidingPaneLayout slidingPaneLayout) {
        this.f61208f = slidingPaneLayout;
    }
}
