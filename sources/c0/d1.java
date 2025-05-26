package c0;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes2.dex */
public final class d1 extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final Object f24220d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f24221e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24222f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24223g;

    public d1(n0 n0Var, Size size, j0 j0Var) {
        super(n0Var);
        this.f24220d = new Object();
        if (size == null) {
            this.f24222f = this.f24201b.j();
            this.f24223g = this.f24201b.i();
        } else {
            this.f24222f = size.getWidth();
            this.f24223g = size.getHeight();
        }
        this.f24221e = j0Var;
    }

    @Override // c0.b0, c0.n0
    public final j0 H1() {
        return this.f24221e;
    }

    public final void c(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f24222f, this.f24223g)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.f24220d) {
        }
    }

    @Override // c0.b0, c0.n0
    public final int i() {
        return this.f24223g;
    }

    @Override // c0.b0, c0.n0
    public final int j() {
        return this.f24222f;
    }
}
