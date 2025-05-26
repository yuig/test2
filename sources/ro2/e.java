package ro2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g(with = h.class)
/* loaded from: classes4.dex */
public final class e extends n implements List<n>, ll2.a {

    @NotNull
    public static final d Companion = new d();

    /* renamed from: a, reason: collision with root package name */
    public final List f108981a;

    public e(List content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f108981a = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i13, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection<? extends n> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n element = (n) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f108981a.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f108981a.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return Intrinsics.d(this.f108981a, obj);
    }

    @Override // java.util.List
    public final n get(int i13) {
        return (n) this.f108981a.get(i13);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f108981a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        n element = (n) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f108981a.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f108981a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f108981a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        n element = (n) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f108981a.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<n> listIterator() {
        return this.f108981a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ n remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<n> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ n set(int i13, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f108981a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super n> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<n> subList(int i13, int i14) {
        return this.f108981a.subList(i13, i14);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.J(this);
    }

    public final String toString() {
        return CollectionsKt.Z(this.f108981a, ",", "[", "]", 0, null, null, 56);
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
    public final ListIterator<n> listIterator(int i13) {
        return this.f108981a.listIterator(i13);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return kotlin.jvm.internal.j.K(this, array);
    }
}
