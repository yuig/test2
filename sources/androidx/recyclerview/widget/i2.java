package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i2 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2 f19453a;

    public i2(l2 l2Var) {
        this.f19453a = l2Var;
    }

    @Override // androidx.recyclerview.widget.l3
    public final int a(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19453a.getClass();
        return l2.K(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    @Override // androidx.recyclerview.widget.l3
    public final int b() {
        return this.f19453a.V();
    }

    @Override // androidx.recyclerview.widget.l3
    public final int c() {
        l2 l2Var = this.f19453a;
        return l2Var.f19506n - l2Var.W();
    }

    @Override // androidx.recyclerview.widget.l3
    public final View d(int i13) {
        return this.f19453a.D(i13);
    }

    @Override // androidx.recyclerview.widget.l3
    public final int e(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19453a.getClass();
        return l2.N(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }
}
