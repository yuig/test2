package h3;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f0 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66662a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f66663b;

    public /* synthetic */ f0(Iterator it, int i13) {
        this.f66662a = i13;
        this.f66663b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f66662a;
        Iterator it = this.f66663b;
        switch (i13) {
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f66662a;
        Iterator it = this.f66663b;
        switch (i13) {
            case 0:
                return (i0) it.next();
            case 1:
                return ((Map.Entry) it.next()).getKey();
            default:
                return ((Map.Entry) it.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f66662a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f0(g0 g0Var) {
        this.f66662a = 0;
        this.f66663b = g0Var.f66676j.iterator();
    }
}
