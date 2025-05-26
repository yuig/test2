package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final l2 f19490a;

    /* renamed from: b, reason: collision with root package name */
    public int f19491b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f19492c = new Rect();

    public l1(l2 l2Var) {
        this.f19490a = l2Var;
    }

    public static l1 a(l2 l2Var, int i13) {
        if (i13 == 0) {
            return new j1(l2Var);
        }
        if (i13 == 1) {
            return new k1(l2Var);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f19491b) {
            return 0;
        }
        return l() - this.f19491b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i13);
}
