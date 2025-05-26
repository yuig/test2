package yn2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class f0 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f139553a;

    /* renamed from: b, reason: collision with root package name */
    public int f139554b = -1;

    /* renamed from: c, reason: collision with root package name */
    public Object f139555c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f139556d;

    public f0(c cVar) {
        this.f139556d = cVar;
        this.f139553a = cVar.f139539b.iterator();
    }

    public final void b() {
        Iterator it = this.f139553a;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) this.f139556d.f139540c.invoke(next)).booleanValue()) {
                this.f139554b = 1;
                this.f139555c = next;
                return;
            }
        }
        this.f139554b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f139554b == -1) {
            b();
        }
        return this.f139554b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f139554b == -1) {
            b();
        }
        if (this.f139554b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f139555c;
        this.f139555c = null;
        this.f139554b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
