package androidx.viewpager2.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q2;
import androidx.recyclerview.widget.w2;

/* loaded from: classes3.dex */
public final class j extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    public j(ViewPager2 viewPager2) {
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean C0(q2 q2Var, w2 w2Var, int i13, Bundle bundle) {
        this.E.f19939s.getClass();
        return super.C0(q2Var, w2Var, i13, bundle);
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean I0(RecyclerView recyclerView, View view, Rect rect, boolean z13, boolean z14) {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Z0(w2 w2Var, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int i13 = viewPager2.f19938r;
        if (i13 == -1) {
            super.Z0(w2Var, iArr);
            return;
        }
        int d2 = viewPager2.d() * i13;
        iArr[0] = d2;
        iArr[1] = d2;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void p0(q2 q2Var, w2 w2Var, r5.e eVar) {
        super.p0(q2Var, w2Var, eVar);
        this.E.f19939s.getClass();
    }

    @Override // androidx.recyclerview.widget.l2
    public final void r0(q2 q2Var, w2 w2Var, View view, r5.e eVar) {
        this.E.f19939s.u(view, eVar);
    }
}
