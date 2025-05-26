package eb2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.k3;
import androidx.recyclerview.widget.w2;

/* loaded from: classes4.dex */
public final class o extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58280b;

    public o(int i13, int i14) {
        this.f58280b = i13;
        this.f58279a = i14;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect rect, View view, RecyclerView recyclerView, w2 w2Var) {
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        if (recyclerView.t1(view) instanceof os.c) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        } else {
            k3 k3Var = layoutParams.f19297e;
            int i13 = k3Var == null ? -1 : k3Var.f19470e;
            int i14 = this.f58280b;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (i13 * i14) / 2;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((1 - (k3Var != null ? k3Var.f19470e : -1)) * i14) / 2;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f58279a;
        }
    }
}
