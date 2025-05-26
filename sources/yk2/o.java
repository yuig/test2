package yk2;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends q implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final o f139269b;

    /* renamed from: a, reason: collision with root package name */
    public final g f139270a;

    static {
        g.f139246n.getClass();
        f139269b = new o(g.f139247o);
    }

    public o(g backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f139270a = backing;
    }

    private final Object writeReplace() {
        if (this.f139270a.f139260m) {
            return new l(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f139270a.b(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f139270a.d();
        return super.addAll(elements);
    }

    @Override // kotlin.collections.q
    public final int b() {
        return this.f139270a.f139256i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f139270a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f139270a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f139270a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g gVar = this.f139270a;
        gVar.getClass();
        return new d(gVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g gVar = this.f139270a;
        gVar.d();
        int h10 = gVar.h(obj);
        if (h10 >= 0) {
            gVar.m(h10);
            if (h10 >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f139270a.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f139270a.d();
        return super.retainAll(elements);
    }

    public o() {
        this(new g());
    }
}
