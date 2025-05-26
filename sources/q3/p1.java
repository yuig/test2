package q3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class p1 implements Collection, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f102263a = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f102263a.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(Object obj) {
        this.f102263a.add(obj);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f102263a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f102263a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f102263a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f102263a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f102263a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f102263a.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f102263a.remove(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f102263a.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f102263a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.J(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.K(this, objArr);
    }
}
