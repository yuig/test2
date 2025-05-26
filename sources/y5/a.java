package y5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.y1;
import java.util.WeakHashMap;
import q5.v0;
import r5.e;

/* loaded from: classes3.dex */
public final class a extends y1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f137733b;

    public a(b bVar) {
        this.f137733b = bVar;
    }

    @Override // androidx.recyclerview.widget.y1
    public final e c(int i13) {
        return new e(AccessibilityNodeInfo.obtain(this.f137733b.o(i13).f106231a));
    }

    @Override // androidx.recyclerview.widget.y1
    public final e e(int i13) {
        b bVar = this.f137733b;
        int i14 = i13 == 2 ? bVar.f137742k : bVar.f137743l;
        if (i14 == Integer.MIN_VALUE) {
            return null;
        }
        return c(i14);
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean m(int i13, int i14, Bundle bundle) {
        int i15;
        b bVar = this.f137733b;
        View view = bVar.f137740i;
        if (i13 == -1) {
            WeakHashMap weakHashMap = v0.f102521a;
            return view.performAccessibilityAction(i14, bundle);
        }
        boolean z13 = true;
        if (i14 == 1) {
            return bVar.t(i13);
        }
        if (i14 == 2) {
            return bVar.j(i13);
        }
        if (i14 == 64) {
            AccessibilityManager accessibilityManager = bVar.f137739h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i15 = bVar.f137742k) != i13) {
                if (i15 != Integer.MIN_VALUE) {
                    bVar.f137742k = Integer.MIN_VALUE;
                    bVar.f137740i.invalidate();
                    bVar.u(i15, 65536);
                }
                bVar.f137742k = i13;
                view.invalidate();
                bVar.u(i13, 32768);
            }
            z13 = false;
        } else {
            if (i14 != 128) {
                return bVar.p(i13, i14, bundle);
            }
            if (bVar.f137742k == i13) {
                bVar.f137742k = Integer.MIN_VALUE;
                view.invalidate();
                bVar.u(i13, 65536);
            }
            z13 = false;
        }
        return z13;
    }
}
