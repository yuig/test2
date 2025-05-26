package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c1 extends o {

    /* renamed from: a, reason: collision with root package name */
    public final List f80356a;

    public c1(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f80356a = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        this.f80356a.add(l0.E(i13, this), obj);
    }

    @Override // kotlin.collections.o
    public final int b() {
        return this.f80356a.size();
    }

    @Override // kotlin.collections.o
    public final Object c(int i13) {
        return this.f80356a.remove(l0.D(i13, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f80356a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return this.f80356a.get(l0.D(i13, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new s2.c0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new s2.c0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        return this.f80356a.set(l0.D(i13, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new s2.c0(this, i13);
    }
}
