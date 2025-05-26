package pk;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class f3 extends i3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f100399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f100400c;

    public f3(o1 o1Var, o1 o1Var2) {
        this.f100399b = o1Var;
        this.f100400c = o1Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f100399b.contains(obj) && this.f100400c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f100399b.containsAll(collection) && this.f100400c.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f100400c, this.f100399b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new u1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f100399b.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (this.f100400c.contains(it.next())) {
                i13++;
            }
        }
        return i13;
    }
}
