package s2;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.c1;
import kotlin.collections.d1;
import kotlin.collections.l0;
import kotlin.jvm.internal.h0;

/* loaded from: classes2.dex */
public final class c0 implements ListIterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110616a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f110617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f110618c;

    public c0(d1 d1Var, int i13) {
        this.f110618c = d1Var;
        this.f110617b = ((List) d1Var.f80360c).listIterator(l0.E(i13, d1Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f110616a) {
            case 0:
                Object obj2 = u.f110684a;
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            case 1:
                ListIterator listIterator = (ListIterator) this.f110617b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f110616a;
        Object obj = this.f110617b;
        switch (i13) {
            case 0:
                if (((h0) obj).f80426a < ((d0) this.f110618c).f110624d - 1) {
                }
                break;
        }
        return ((ListIterator) obj).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i13 = this.f110616a;
        Object obj = this.f110617b;
        switch (i13) {
            case 0:
                if (((h0) obj).f80426a >= 0) {
                }
                break;
        }
        return ((ListIterator) obj).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i13 = this.f110616a;
        Object obj = this.f110617b;
        switch (i13) {
            case 0:
                h0 h0Var = (h0) obj;
                int i14 = h0Var.f80426a + 1;
                d0 d0Var = (d0) this.f110618c;
                u.a(i14, d0Var.f110624d);
                h0Var.f80426a = i14;
                break;
        }
        return ((ListIterator) obj).previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        Object obj = this.f110618c;
        int i13 = this.f110616a;
        Object obj2 = this.f110617b;
        switch (i13) {
            case 0:
                return ((h0) obj2).f80426a + 1;
            case 1:
                return kotlin.collections.f0.i((c1) obj) - ((ListIterator) obj2).previousIndex();
            default:
                return kotlin.collections.f0.i((d1) obj) - ((ListIterator) obj2).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i13 = this.f110616a;
        Object obj = this.f110617b;
        switch (i13) {
            case 0:
                h0 h0Var = (h0) obj;
                int i14 = h0Var.f80426a;
                d0 d0Var = (d0) this.f110618c;
                u.a(i14, d0Var.f110624d);
                h0Var.f80426a = i14 - 1;
                break;
        }
        return ((ListIterator) obj).next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        Object obj = this.f110618c;
        int i13 = this.f110616a;
        Object obj2 = this.f110617b;
        switch (i13) {
            case 0:
                return ((h0) obj2).f80426a;
            case 1:
                return kotlin.collections.f0.i((c1) obj) - ((ListIterator) obj2).nextIndex();
            default:
                return kotlin.collections.f0.i((d1) obj) - ((ListIterator) obj2).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f110616a) {
            case 0:
                Object obj = u.f110684a;
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            case 1:
                ((ListIterator) this.f110617b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f110616a) {
            case 0:
                Object obj2 = u.f110684a;
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            case 1:
                ((ListIterator) this.f110617b).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c0(c1 c1Var, int i13) {
        this.f110618c = c1Var;
        this.f110617b = c1Var.f80356a.listIterator(l0.E(i13, c1Var));
    }

    public c0(h0 h0Var, d0 d0Var) {
        this.f110617b = h0Var;
        this.f110618c = d0Var;
    }
}
