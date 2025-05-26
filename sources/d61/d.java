package d61;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

/* loaded from: classes5.dex */
public final class d extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f53763a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53764b;

    /* renamed from: c, reason: collision with root package name */
    public final b3 f53765c;

    public d(int i13, int i14, b3 b3Var) {
        this.f53763a = i13;
        this.f53764b = i14;
        this.f53765c = b3Var;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        b2 b2Var = this.f53765c;
        if (b2Var == null) {
            b2Var = parent.f19240m;
        }
        parent.getClass();
        int r13 = RecyclerView.r1(view);
        if (r13 >= 0) {
            if ((b2Var != null ? b2Var.e() : -1) <= r13) {
                return;
            }
            Integer valueOf = b2Var != null ? Integer.valueOf(b2Var.g(r13)) : null;
            if ((valueOf == null || valueOf.intValue() != 20) && (valueOf == null || valueOf.intValue() != 28)) {
                outRect.setEmpty();
                return;
            }
            int i13 = r13 % 2;
            int i14 = this.f53763a;
            outRect.left = i13 == 0 ? i14 : i14 / 2;
            if (i13 == 0) {
                i14 /= 2;
            }
            outRect.right = i14;
            outRect.bottom = this.f53764b;
        }
    }
}
