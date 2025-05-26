package pk;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class z0 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final transient c1 f100527c;

    public z0(c1 c1Var) {
        this.f100527c = c1Var;
    }

    @Override // pk.c1, java.util.List
    /* renamed from: B */
    public final c1 subList(int i13, int i14) {
        c1 c1Var = this.f100527c;
        bf.b.r(i13, i14, c1Var.size());
        return c1Var.subList(c1Var.size() - i14, c1Var.size() - i13).z();
    }

    @Override // pk.c1, pk.v0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f100527c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i13) {
        c1 c1Var = this.f100527c;
        bf.b.l(i13, c1Var.size());
        return c1Var.get((c1Var.size() - 1) - i13);
    }

    @Override // pk.v0
    public final boolean i() {
        return this.f100527c.i();
    }

    @Override // pk.c1, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f100527c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // pk.c1, pk.v0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // pk.c1, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f100527c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // pk.c1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f100527c.size();
    }

    @Override // pk.c1, pk.v0
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // pk.c1
    public final c1 z() {
        return this.f100527c;
    }

    @Override // pk.c1, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i13) {
        return listIterator(i13);
    }
}
