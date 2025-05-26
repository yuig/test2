package q5;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: b, reason: collision with root package name */
    public static final a2 f102399b;

    /* renamed from: a, reason: collision with root package name */
    public final y1 f102400a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f102399b = x1.f102539q;
        } else {
            f102399b = y1.f102542b;
        }
    }

    public a2(WindowInsets windowInsets) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            this.f102400a = new x1(this, windowInsets);
            return;
        }
        if (i13 >= 29) {
            this.f102400a = new w1(this, windowInsets);
        } else if (i13 >= 28) {
            this.f102400a = new v1(this, windowInsets);
        } else {
            this.f102400a = new u1(this, windowInsets);
        }
    }

    public static f5.e f(f5.e eVar, int i13, int i14, int i15, int i16) {
        int max = Math.max(0, eVar.f61081a - i13);
        int max2 = Math.max(0, eVar.f61082b - i14);
        int max3 = Math.max(0, eVar.f61083c - i15);
        int max4 = Math.max(0, eVar.f61084d - i16);
        return (max == i13 && max2 == i14 && max3 == i15 && max4 == i16) ? eVar : f5.e.b(max, max2, max3, max4);
    }

    public static a2 i(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        a2 a2Var = new a2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = v0.f102521a;
            a2 a13 = n0.a(view);
            y1 y1Var = a2Var.f102400a;
            y1Var.q(a13);
            y1Var.d(view.getRootView());
        }
        return a2Var;
    }

    public final f5.e a(int i13) {
        return this.f102400a.f(i13);
    }

    public final int b() {
        return this.f102400a.j().f61084d;
    }

    public final int c() {
        return this.f102400a.j().f61081a;
    }

    public final int d() {
        return this.f102400a.j().f61083c;
    }

    public final int e() {
        return this.f102400a.j().f61082b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        return Objects.equals(this.f102400a, ((a2) obj).f102400a);
    }

    public final a2 g(int i13, int i14, int i15, int i16) {
        int i17 = Build.VERSION.SDK_INT;
        s1 r1Var = i17 >= 30 ? new r1(this) : i17 >= 29 ? new q1(this) : new p1(this);
        r1Var.g(f5.e.b(i13, i14, i15, i16));
        return r1Var.b();
    }

    public final WindowInsets h() {
        y1 y1Var = this.f102400a;
        if (y1Var instanceof t1) {
            return ((t1) y1Var).f102509c;
        }
        return null;
    }

    public final int hashCode() {
        y1 y1Var = this.f102400a;
        if (y1Var == null) {
            return 0;
        }
        return y1Var.hashCode();
    }

    public a2() {
        this.f102400a = new y1(this);
    }
}
