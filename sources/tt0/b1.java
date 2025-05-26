package tt0;

import android.util.Size;

/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final Size f119086a;

    /* renamed from: b, reason: collision with root package name */
    public final int f119087b;

    /* renamed from: c, reason: collision with root package name */
    public final int f119088c;

    public b1(int i13, int i14) {
        Size size = new Size(i13, i14);
        this.f119086a = size;
        this.f119087b = Math.max(size.getWidth(), size.getHeight());
        this.f119088c = Math.min(size.getWidth(), size.getHeight());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SmartSize(");
        sb3.append(this.f119087b);
        sb3.append("x");
        return a.a.n(sb3, this.f119088c, ")");
    }
}
