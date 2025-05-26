package g1;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e0 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public int f63257a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final yn2.o f63258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f63259c;

    public e0(g0 g0Var) {
        this.f63259c = g0Var;
        this.f63258b = yn2.q.a(new d0(g0Var, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63258b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f63258b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i13 = this.f63257a;
        if (i13 != -1) {
            this.f63259c.m(i13);
            this.f63257a = -1;
        }
    }
}
