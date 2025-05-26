package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class j2 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2 f19458a;

    public j2(l2 l2Var) {
        this.f19458a = l2Var;
    }

    @Override // androidx.recyclerview.widget.l3
    public final int a(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19458a.getClass();
        return l2.O(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    @Override // androidx.recyclerview.widget.l3
    public final int b() {
        return this.f19458a.Y();
    }

    @Override // androidx.recyclerview.widget.l3
    public final int c() {
        l2 l2Var = this.f19458a;
        return l2Var.f19507o - l2Var.T();
    }

    @Override // androidx.recyclerview.widget.l3
    public final View d(int i13) {
        return this.f19458a.D(i13);
    }

    @Override // androidx.recyclerview.widget.l3
    public final int e(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19458a.getClass();
        return l2.I(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }
}
