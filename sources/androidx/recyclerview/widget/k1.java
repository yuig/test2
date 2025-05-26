package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class k1 extends l1 {
    @Override // androidx.recyclerview.widget.l1
    public final int b(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19490a.getClass();
        return l2.I(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19490a.getClass();
        return l2.L(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19490a.getClass();
        return l2.M(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int e(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f19490a.getClass();
        return l2.O(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int f() {
        return this.f19490a.f19507o;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int g() {
        l2 l2Var = this.f19490a;
        return l2Var.f19507o - l2Var.T();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int h() {
        return this.f19490a.T();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int i() {
        return this.f19490a.f19505m;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int j() {
        return this.f19490a.f19504l;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int k() {
        return this.f19490a.Y();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int l() {
        l2 l2Var = this.f19490a;
        return (l2Var.f19507o - l2Var.Y()) - l2Var.T();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int n(View view) {
        l2 l2Var = this.f19490a;
        Rect rect = this.f19492c;
        l2Var.c0(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int o(View view) {
        l2 l2Var = this.f19490a;
        Rect rect = this.f19492c;
        l2Var.c0(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void p(int i13) {
        this.f19490a.j0(i13);
    }
}
