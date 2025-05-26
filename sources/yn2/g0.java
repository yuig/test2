package yn2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g0 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f139558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f139559b;

    public g0(h0 h0Var) {
        this.f139559b = h0Var;
        this.f139558a = h0Var.f139564a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f139558a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f139559b.f139565b.invoke(this.f139558a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
