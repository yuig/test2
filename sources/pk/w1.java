package pk;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class w1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f100510a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f100511b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f100512c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayDeque f100513d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.f100511b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.f100512c;
                if (it3 != null && it3.hasNext()) {
                    it = this.f100512c;
                    break;
                }
                ArrayDeque arrayDeque = this.f100513d;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                this.f100512c = (Iterator) this.f100513d.removeFirst();
            }
            it = null;
            this.f100512c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.f100511b = it4;
            if (it4 instanceof w1) {
                w1 w1Var = (w1) it4;
                this.f100511b = w1Var.f100511b;
                if (this.f100513d == null) {
                    this.f100513d = new ArrayDeque();
                }
                this.f100513d.addFirst(this.f100512c);
                if (w1Var.f100513d != null) {
                    while (!w1Var.f100513d.isEmpty()) {
                        this.f100513d.addFirst((Iterator) w1Var.f100513d.removeLast());
                    }
                }
                this.f100512c = w1Var.f100512c;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.f100511b;
        this.f100510a = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f100510a;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.f100510a = null;
    }
}
