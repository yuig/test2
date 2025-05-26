package s3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u implements List, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f110956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f110957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f110958c;

    public u(v vVar, int i13, int i14) {
        this.f110958c = vVar;
        this.f110956a = i13;
        this.f110957b = i14;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof u2.p) && indexOf((u2.p) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((u2.p) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        Object obj = this.f110958c.f110962a[i13 + this.f110956a];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (u2.p) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof u2.p)) {
            return -1;
        }
        u2.p pVar = (u2.p) obj;
        int i13 = this.f110956a;
        int i14 = this.f110957b;
        if (i13 > i14) {
            return -1;
        }
        int i15 = i13;
        while (!Intrinsics.d(this.f110958c.f110962a[i15], pVar)) {
            if (i15 == i14) {
                return -1;
            }
            i15++;
        }
        return i15 - i13;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i13 = this.f110956a;
        return new t(this.f110958c, i13, i13, this.f110957b);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof u2.p)) {
            return -1;
        }
        u2.p pVar = (u2.p) obj;
        int i13 = this.f110957b;
        int i14 = this.f110956a;
        if (i14 > i13) {
            return -1;
        }
        while (!Intrinsics.d(this.f110958c.f110962a[i13], pVar)) {
            if (i13 == i14) {
                return -1;
            }
            i13--;
        }
        return i13 - i14;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i13 = this.f110956a;
        return new t(this.f110958c, i13, i13, this.f110957b);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f110957b - this.f110956a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        int i15 = this.f110956a;
        return new u(this.f110958c, i13 + i15, i15 + i14);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        int i14 = this.f110956a;
        int i15 = this.f110957b;
        return new t(this.f110958c, i13 + i14, i14, i15);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.K(this, objArr);
    }
}
