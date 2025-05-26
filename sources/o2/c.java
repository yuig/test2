package o2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import n2.d;

/* loaded from: classes2.dex */
public final class c implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f92796a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f92797b;

    /* renamed from: c, reason: collision with root package name */
    public int f92798c;

    public c(Object obj, d dVar) {
        this.f92796a = obj;
        this.f92797b = dVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f92798c < this.f92797b.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f92796a;
        this.f92798c++;
        Object obj2 = this.f92797b.get(obj);
        if (obj2 != null) {
            this.f92796a = ((a) obj2).f92791b;
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
