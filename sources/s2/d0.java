package s2;

import ao2.m0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;

/* loaded from: classes.dex */
public final class d0 implements List, ll2.c {

    /* renamed from: a, reason: collision with root package name */
    public final t f110621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f110622b;

    /* renamed from: c, reason: collision with root package name */
    public int f110623c;

    /* renamed from: d, reason: collision with root package name */
    public int f110624d;

    public d0(t tVar, int i13, int i14) {
        this.f110621a = tVar;
        this.f110622b = i13;
        this.f110623c = tVar.f();
        this.f110624d = i14 - i13;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i13 = this.f110622b + this.f110624d;
        t tVar = this.f110621a;
        tVar.add(i13, obj);
        this.f110624d++;
        this.f110623c = tVar.f();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f110624d, collection);
    }

    public final void b() {
        if (this.f110621a.f() != this.f110623c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i13;
        l2.c cVar;
        i k13;
        boolean z13;
        if (this.f110624d > 0) {
            b();
            t tVar = this.f110621a;
            int i14 = this.f110622b;
            int i15 = this.f110624d + i14;
            tVar.getClass();
            do {
                Object obj = u.f110684a;
                synchronized (obj) {
                    r rVar = tVar.f110683a;
                    Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    r rVar2 = (r) p.i(rVar);
                    i13 = rVar2.f110678d;
                    cVar = rVar2.f110677c;
                    Unit unit = Unit.f80348a;
                }
                Intrinsics.f(cVar);
                m2.f q13 = cVar.q();
                q13.subList(i14, i15).clear();
                l2.c d2 = q13.d();
                if (Intrinsics.d(d2, cVar)) {
                    break;
                }
                r rVar3 = tVar.f110683a;
                Intrinsics.g(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (p.f110667b) {
                    k13 = p.k();
                    r rVar4 = (r) p.w(rVar3, tVar, k13);
                    synchronized (obj) {
                        int i16 = rVar4.f110678d;
                        if (i16 == i13) {
                            rVar4.f110677c = d2;
                            rVar4.f110678d = i16 + 1;
                            z13 = true;
                            rVar4.f110679e++;
                        } else {
                            z13 = false;
                        }
                    }
                }
                p.n(k13, tVar);
            } while (!z13);
            this.f110624d = 0;
            this.f110623c = this.f110621a.f();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        b();
        u.a(i13, this.f110624d);
        return this.f110621a.get(this.f110622b + i13);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i13 = this.f110624d;
        int i14 = this.f110622b;
        Iterator it = ql2.s.q(i14, i13 + i14).iterator();
        while (it.hasNext()) {
            int b13 = ((u0) it).b();
            if (Intrinsics.d(obj, this.f110621a.get(b13))) {
                return b13 - i14;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f110624d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i13 = this.f110624d;
        int i14 = this.f110622b;
        for (int i15 = (i13 + i14) - 1; i15 >= i14; i15--) {
            if (Intrinsics.d(obj, this.f110621a.get(i15))) {
                return i15 - i14;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z13 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z13) {
                    z13 = true;
                }
            }
            return z13;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i13;
        l2.c cVar;
        i k13;
        boolean z13;
        b();
        t tVar = this.f110621a;
        int i14 = this.f110622b;
        int i15 = this.f110624d + i14;
        int size = tVar.size();
        do {
            Object obj = u.f110684a;
            synchronized (obj) {
                r rVar = tVar.f110683a;
                Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i13 = rVar2.f110678d;
                cVar = rVar2.f110677c;
                Unit unit = Unit.f80348a;
            }
            Intrinsics.f(cVar);
            m2.f q13 = cVar.q();
            q13.subList(i14, i15).retainAll(collection);
            l2.c d2 = q13.d();
            if (Intrinsics.d(d2, cVar)) {
                break;
            }
            r rVar3 = tVar.f110683a;
            Intrinsics.g(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f110667b) {
                k13 = p.k();
                r rVar4 = (r) p.w(rVar3, tVar, k13);
                synchronized (obj) {
                    int i16 = rVar4.f110678d;
                    if (i16 == i13) {
                        rVar4.f110677c = d2;
                        rVar4.f110678d = i16 + 1;
                        rVar4.f110679e++;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
            }
            p.n(k13, tVar);
        } while (!z13);
        int size2 = size - tVar.size();
        if (size2 > 0) {
            this.f110623c = this.f110621a.f();
            this.f110624d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        u.a(i13, this.f110624d);
        b();
        int i14 = i13 + this.f110622b;
        t tVar = this.f110621a;
        Object obj2 = tVar.set(i14, obj);
        this.f110623c = tVar.f();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f110624d;
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        if (!(i13 >= 0 && i13 <= i14 && i14 <= this.f110624d)) {
            m0.o0("fromIndex or toIndex are out of bounds");
            throw null;
        }
        b();
        int i15 = this.f110622b;
        return new d0(this.f110621a, i13 + i15, i14 + i15);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.K(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        b();
        int i14 = i13 + this.f110622b;
        t tVar = this.f110621a;
        boolean addAll = tVar.addAll(i14, collection);
        if (addAll) {
            this.f110624d = collection.size() + this.f110624d;
            this.f110623c = tVar.f();
        }
        return addAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        b();
        h0 h0Var = new h0();
        h0Var.f80426a = i13 - 1;
        return new c0(h0Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        b();
        int i14 = this.f110622b + i13;
        t tVar = this.f110621a;
        Object remove = tVar.remove(i14);
        this.f110624d--;
        this.f110623c = tVar.f();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        b();
        int i14 = this.f110622b + i13;
        t tVar = this.f110621a;
        tVar.add(i14, obj);
        this.f110624d++;
        this.f110623c = tVar.f();
    }
}
