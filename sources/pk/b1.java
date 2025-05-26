package pk;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class b1 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f100356c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f100357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1 f100358e;

    public b1(c1 c1Var, int i13, int i14) {
        this.f100358e = c1Var;
        this.f100356c = i13;
        this.f100357d = i14;
    }

    @Override // pk.c1, java.util.List
    /* renamed from: B */
    public final c1 subList(int i13, int i14) {
        bf.b.r(i13, i14, this.f100357d);
        int i15 = this.f100356c;
        return this.f100358e.subList(i13 + i15, i14 + i15);
    }

    @Override // pk.v0
    public final Object[] d() {
        return this.f100358e.d();
    }

    @Override // pk.v0
    public final int e() {
        return this.f100358e.f() + this.f100356c + this.f100357d;
    }

    @Override // pk.v0
    public final int f() {
        return this.f100358e.f() + this.f100356c;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        bf.b.l(i13, this.f100357d);
        return this.f100358e.get(i13 + this.f100356c);
    }

    @Override // pk.v0
    public final boolean i() {
        return true;
    }

    @Override // pk.c1, pk.v0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // pk.c1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f100357d;
    }

    @Override // pk.c1, pk.v0
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // pk.c1, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i13) {
        return listIterator(i13);
    }
}
