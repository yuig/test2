package yk2;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends kotlin.collections.n {

    /* renamed from: a, reason: collision with root package name */
    public final g f139263a;

    public j(g backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f139263a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.n
    public final int b() {
        return this.f139263a.f139256i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f139263a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f139263a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f139263a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        g gVar = this.f139263a;
        gVar.getClass();
        return new f(gVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        g gVar = this.f139263a;
        gVar.d();
        int i13 = gVar.i(obj);
        if (i13 < 0) {
            return false;
        }
        gVar.m(i13);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f139263a.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f139263a.d();
        return super.retainAll(elements);
    }
}
