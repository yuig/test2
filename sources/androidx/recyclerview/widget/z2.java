package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z2 extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final a3 f19754d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f19755e = new WeakHashMap();

    public z2(a3 a3Var) {
        this.f19754d = a3Var;
    }

    @Override // q5.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        q5.b bVar = (q5.b) this.f19755e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f102402a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // q5.b
    public final y1 b(View view) {
        q5.b bVar = (q5.b) this.f19755e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // q5.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        q5.b bVar = (q5.b) this.f19755e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // q5.b
    public final void d(View view, r5.e eVar) {
        l2 l2Var;
        a3 a3Var = this.f19754d;
        RecyclerView recyclerView = (RecyclerView) a3Var.f19319e;
        boolean z13 = recyclerView.f19256u;
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f106231a;
        if (!z13 || recyclerView.D || recyclerView.f19224e.i() || (l2Var = ((RecyclerView) a3Var.f19319e).f19242n) == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        l2Var.q0(view, eVar);
        q5.b bVar = (q5.b) this.f19755e.get(view);
        if (bVar != null) {
            bVar.d(view, eVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // q5.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        q5.b bVar = (q5.b) this.f19755e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // q5.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        q5.b bVar = (q5.b) this.f19755e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f102402a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // q5.b
    public final boolean g(View view, int i13, Bundle bundle) {
        a3 a3Var = this.f19754d;
        RecyclerView recyclerView = (RecyclerView) a3Var.f19319e;
        if (recyclerView.f19256u && !recyclerView.D && !recyclerView.f19224e.i()) {
            View view2 = a3Var.f19319e;
            if (((RecyclerView) view2).f19242n != null) {
                q5.b bVar = (q5.b) this.f19755e.get(view);
                if (bVar != null) {
                    if (bVar.g(view, i13, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i13, bundle)) {
                    return true;
                }
                q2 q2Var = ((RecyclerView) view2).f19242n.f19494b.f19220c;
                return false;
            }
        }
        return super.g(view, i13, bundle);
    }

    @Override // q5.b
    public final void h(View view, int i13) {
        q5.b bVar = (q5.b) this.f19755e.get(view);
        if (bVar != null) {
            bVar.h(view, i13);
        } else {
            super.h(view, i13);
        }
    }

    @Override // q5.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        q5.b bVar = (q5.b) this.f19755e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
