package i4;

import d7.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class c implements Collection, ll2.a {

    /* renamed from: c */
    public static final c f71503c = new c(q0.f80391a);

    /* renamed from: a */
    public final List f71504a;

    /* renamed from: b */
    public final int f71505b;

    public c(List list) {
        this.f71504a = list;
        this.f71505b = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f71504a.contains((b) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f71504a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Intrinsics.d(this.f71504a, ((c) obj).f71504a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f71504a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f71504a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f71504a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f71505b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return j.J(this);
    }

    public final String toString() {
        return g.k(new StringBuilder("LocaleList(localeList="), this.f71504a, ')');
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.K(this, objArr);
    }
}
