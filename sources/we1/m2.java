package we1;

import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m2 implements androidx.recyclerview.widget.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n2 f129486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f129487b;

    public m2(n2 n2Var, p2 p2Var) {
        this.f129486a = n2Var;
        this.f129487b = p2Var;
    }

    @Override // androidx.recyclerview.widget.n2
    public final void a(RecyclerView rv2, MotionEvent e13) {
        Intrinsics.checkNotNullParameter(rv2, "rv");
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // androidx.recyclerview.widget.n2
    public final boolean b(RecyclerView rv2, MotionEvent e13) {
        Intrinsics.checkNotNullParameter(rv2, "rv");
        Intrinsics.checkNotNullParameter(e13, "e");
        int action = e13.getAction();
        p2 p2Var = this.f129487b;
        n2 n2Var = this.f129486a;
        if (action == 0) {
            n2Var.f129501h = e13.getX();
            p2Var.f129553c.d(new ls1.l(ls1.k.DISABLE));
            n2Var.f129500g = false;
        } else if (e13.getAction() == 2) {
            if (!n2Var.f129500g && Math.abs(e13.getX() - n2Var.f129501h) > n2Var.f129502i) {
                n2Var.f129500g = true;
                ViewParent parent = n2Var.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        } else if (e13.getAction() == 1 || e13.getAction() == 3) {
            p2Var.f129553c.d(new ls1.l(ls1.k.ENABLE));
            ViewParent parent2 = n2Var.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            n2Var.f129500g = false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n2
    public final void e(boolean z13) {
    }
}
