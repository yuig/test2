package yk2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final g f139261a;

    public h(g backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f139261a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.q
    public final int b() {
        return this.f139261a.f139256i;
    }

    @Override // yk2.a
    public final boolean c(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f139261a.f(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f139261a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f139261a.e(elements);
    }

    @Override // yk2.a
    public final boolean d(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        g gVar = this.f139261a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        gVar.d();
        int h10 = gVar.h(entry.getKey());
        if (h10 < 0) {
            return false;
        }
        Object[] objArr = gVar.f139249b;
        Intrinsics.f(objArr);
        if (!Intrinsics.d(objArr[h10], entry.getValue())) {
            return false;
        }
        gVar.m(h10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f139261a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g gVar = this.f139261a;
        gVar.getClass();
        return new d(gVar, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f139261a.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f139261a.d();
        return super.retainAll(elements);
    }
}
