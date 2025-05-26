package yn2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class d0 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f139544a;

    /* renamed from: b, reason: collision with root package name */
    public int f139545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f139546c;

    public d0(e0 e0Var) {
        this.f139546c = e0Var;
        this.f139544a = e0Var.f139550a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        e0 e0Var;
        Iterator it;
        while (true) {
            int i13 = this.f139545b;
            e0Var = this.f139546c;
            int i14 = e0Var.f139551b;
            it = this.f139544a;
            if (i13 >= i14 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f139545b++;
        }
        return this.f139545b < e0Var.f139552c && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        e0 e0Var;
        Iterator it;
        while (true) {
            int i13 = this.f139545b;
            e0Var = this.f139546c;
            int i14 = e0Var.f139551b;
            it = this.f139544a;
            if (i13 >= i14 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f139545b++;
        }
        int i15 = this.f139545b;
        if (i15 >= e0Var.f139552c) {
            throw new NoSuchElementException();
        }
        this.f139545b = i15 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
