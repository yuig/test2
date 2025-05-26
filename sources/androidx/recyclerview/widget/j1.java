package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class j1 extends l1 {
    @Override // androidx.recyclerview.widget.l1
    public final int b(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19490a.getClass();
        return l2.N(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19490a.getClass();
        return l2.M(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19490a.getClass();
        return l2.L(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int e(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19490a.getClass();
        return l2.K(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int f() {
        return this.f19490a.f19506n;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int g() {
        l2 l2Var = this.f19490a;
        return l2Var.f19506n - l2Var.W();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int h() {
        return this.f19490a.W();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int i() {
        return this.f19490a.f19504l;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int j() {
        return this.f19490a.f19505m;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int k() {
        return this.f19490a.V();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int l() {
        l2 l2Var = this.f19490a;
        return (l2Var.f19506n - l2Var.V()) - l2Var.W();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int n(View view) {
        l2 l2Var = this.f19490a;
        Rect rect = this.f19492c;
        l2Var.c0(view, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int o(View view) {
        l2 l2Var = this.f19490a;
        Rect rect = this.f19492c;
        l2Var.c0(view, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void p(int i13) {
        this.f19490a.i0(i13);
    }
}
