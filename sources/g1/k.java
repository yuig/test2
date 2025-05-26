package g1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public int f63278a;

    /* renamed from: b, reason: collision with root package name */
    public int f63279b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63280c;

    public k(int i13) {
        this.f63278a = i13;
    }

    public abstract Object b(int i13);

    public abstract void c(int i13);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63279b < this.f63278a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b13 = b(this.f63279b);
        this.f63279b++;
        this.f63280c = true;
        return b13;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f63280c) {
            Intrinsics.checkNotNullParameter("Call next() before removing an element.", "message");
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i13 = this.f63279b - 1;
        this.f63279b = i13;
        c(i13);
        this.f63278a--;
        this.f63280c = false;
    }
}
