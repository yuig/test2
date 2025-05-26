package ok;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b0 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CharSequence f95411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f95412b;

    public b0(e0 e0Var, CharSequence charSequence) {
        this.f95411a = charSequence;
        this.f95412b = e0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        e0 e0Var = this.f95412b;
        return e0Var.f95422c.c(e0Var, this.f95411a);
    }

    public final String toString() {
        z.a n13 = z.a.n(", ");
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        n13.e(sb3, this);
        sb3.append(']');
        return sb3.toString();
    }
}
