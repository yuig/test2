package androidx.viewpager2.widget;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.y1;
import c0.s0;
import q5.v0;

/* loaded from: classes3.dex */
public final class m extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final l f19975b;

    /* renamed from: c, reason: collision with root package name */
    public final l f19976c;

    /* renamed from: d, reason: collision with root package name */
    public f f19977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f19978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ViewPager2 viewPager2) {
        super(viewPager2);
        this.f19978e = viewPager2;
        this.f19975b = new l(this, 0);
        this.f19976c = new l(this, 1);
    }

    public final void q(b2 b2Var) {
        x();
        if (b2Var != null) {
            b2Var.z(this.f19977d);
        }
    }

    public final void r(b2 b2Var) {
        if (b2Var != null) {
            b2Var.B(this.f19977d);
        }
    }

    public final void s(RecyclerView recyclerView) {
        recyclerView.setImportantForAccessibility(2);
        this.f19977d = new f(this, 1);
        ViewPager2 viewPager2 = this.f19978e;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    public final void t(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i13;
        int i14;
        int e13;
        ViewPager2 viewPager2 = this.f19978e;
        if (viewPager2.f19930j.f19240m == null) {
            i13 = 0;
            i14 = 0;
        } else if (viewPager2.c() == 1) {
            i13 = viewPager2.f19930j.f19240m.e();
            i14 = 1;
        } else {
            i14 = viewPager2.f19930j.f19240m.e();
            i13 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) y1.i(i13, i14, 0).f19715a);
        b2 b2Var = viewPager2.f19930j.f19240m;
        if (b2Var == null || (e13 = b2Var.e()) == 0 || !viewPager2.f19937q) {
            return;
        }
        if (viewPager2.f19924d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f19924d < e13 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    public final void u(View view, r5.e eVar) {
        int i13;
        ViewPager2 viewPager2 = this.f19978e;
        int i14 = 0;
        if (viewPager2.c() == 1) {
            viewPager2.f19927g.getClass();
            i13 = l2.Z(view);
        } else {
            i13 = 0;
        }
        if (viewPager2.c() == 0) {
            viewPager2.f19927g.getClass();
            i14 = l2.Z(view);
        }
        eVar.u(y1.j(i13, 1, i14, 1, false, false));
    }

    public final void v(int i13, Bundle bundle) {
        if (i13 != 8192 && i13 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = this.f19978e;
        int i14 = i13 == 8192 ? viewPager2.f19924d - 1 : viewPager2.f19924d + 1;
        if (viewPager2.f19937q) {
            viewPager2.j(i14, true);
        }
    }

    public final void w(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.f19978e);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    public final void x() {
        int e13;
        ViewPager2 viewPager2 = this.f19978e;
        int i13 = R.id.accessibilityActionPageLeft;
        v0.l(viewPager2, R.id.accessibilityActionPageLeft);
        v0.i(viewPager2, 0);
        v0.l(viewPager2, R.id.accessibilityActionPageRight);
        v0.i(viewPager2, 0);
        v0.l(viewPager2, R.id.accessibilityActionPageUp);
        v0.i(viewPager2, 0);
        v0.l(viewPager2, R.id.accessibilityActionPageDown);
        v0.i(viewPager2, 0);
        b2 b2Var = viewPager2.f19930j.f19240m;
        if (b2Var == null || (e13 = b2Var.e()) == 0 || !viewPager2.f19937q) {
            return;
        }
        int c13 = viewPager2.c();
        l lVar = this.f19976c;
        l lVar2 = this.f19975b;
        if (c13 != 0) {
            if (viewPager2.f19924d < e13 - 1) {
                v0.m(viewPager2, new r5.d(R.id.accessibilityActionPageDown, (String) null), null, lVar2);
            }
            if (viewPager2.f19924d > 0) {
                v0.m(viewPager2, new r5.d(R.id.accessibilityActionPageUp, (String) null), null, lVar);
                return;
            }
            return;
        }
        boolean z13 = viewPager2.f19927g.Q() == 1;
        int i14 = z13 ? 16908360 : 16908361;
        if (z13) {
            i13 = 16908361;
        }
        if (viewPager2.f19924d < e13 - 1) {
            v0.m(viewPager2, new r5.d(i14, (String) null), null, lVar2);
        }
        if (viewPager2.f19924d > 0) {
            v0.m(viewPager2, new r5.d(i13, (String) null), null, lVar);
        }
    }
}
