package s2;

import ao2.m0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k1.s2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t implements z, List, RandomAccess, ll2.c {

    /* renamed from: a, reason: collision with root package name */
    public r f110683a;

    public t() {
        m2.j jVar = m2.j.f85687c;
        r rVar = new r(jVar);
        if (p.f110666a.a() != null) {
            r rVar2 = new r(jVar);
            rVar2.f110604a = 1;
            rVar.f110605b = rVar2;
        }
        this.f110683a = rVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i13;
        l2.c cVar;
        boolean z13;
        i k13;
        do {
            Object obj2 = u.f110684a;
            synchronized (obj2) {
                r rVar = this.f110683a;
                Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i13 = rVar2.f110678d;
                cVar = rVar2.f110677c;
                Unit unit = Unit.f80348a;
            }
            Intrinsics.f(cVar);
            l2.c add = cVar.add(obj);
            z13 = false;
            if (Intrinsics.d(add, cVar)) {
                return false;
            }
            r rVar3 = this.f110683a;
            Intrinsics.g(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f110667b) {
                k13 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k13);
                synchronized (obj2) {
                    int i14 = rVar4.f110678d;
                    if (i14 == i13) {
                        rVar4.f110677c = add;
                        rVar4.f110679e++;
                        rVar4.f110678d = i14 + 1;
                        z13 = true;
                    }
                }
            }
            p.n(k13, this);
        } while (!z13);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        return i(new s(i13, collection, 0));
    }

    public final r c() {
        r rVar = this.f110683a;
        Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (r) p.t(rVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i k13;
        r rVar = this.f110683a;
        Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (p.f110667b) {
            k13 = p.k();
            r rVar2 = (r) p.w(rVar, this, k13);
            synchronized (u.f110684a) {
                rVar2.f110677c = m2.j.f85687c;
                rVar2.f110678d++;
                rVar2.f110679e++;
            }
        }
        p.n(k13, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return c().f110677c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return c().f110677c.containsAll(collection);
    }

    @Override // s2.z
    public final b0 d() {
        return this.f110683a;
    }

    @Override // s2.z
    public final void e(b0 b0Var) {
        b0Var.f110605b = this.f110683a;
        this.f110683a = (r) b0Var;
    }

    public final int f() {
        r rVar = this.f110683a;
        Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((r) p.i(rVar)).f110679e;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        return c().f110677c.get(i13);
    }

    public final boolean i(Function1 function1) {
        int i13;
        l2.c cVar;
        Object invoke;
        i k13;
        boolean z13;
        do {
            Object obj = u.f110684a;
            synchronized (obj) {
                r rVar = this.f110683a;
                Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i13 = rVar2.f110678d;
                cVar = rVar2.f110677c;
                Unit unit = Unit.f80348a;
            }
            Intrinsics.f(cVar);
            m2.f q13 = cVar.q();
            invoke = function1.invoke(q13);
            l2.c d2 = q13.d();
            if (Intrinsics.d(d2, cVar)) {
                break;
            }
            r rVar3 = this.f110683a;
            Intrinsics.g(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f110667b) {
                k13 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k13);
                synchronized (obj) {
                    int i14 = rVar4.f110678d;
                    if (i14 == i13) {
                        rVar4.f110677c = d2;
                        rVar4.f110678d = i14 + 1;
                        z13 = true;
                        rVar4.f110679e++;
                    } else {
                        z13 = false;
                    }
                }
            }
            p.n(k13, this);
        } while (!z13);
        return ((Boolean) invoke).booleanValue();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().f110677c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return c().f110677c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().f110677c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new y(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        int i14;
        l2.c cVar;
        i k13;
        boolean z13;
        Object obj = get(i13);
        do {
            Object obj2 = u.f110684a;
            synchronized (obj2) {
                r rVar = this.f110683a;
                Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i14 = rVar2.f110678d;
                cVar = rVar2.f110677c;
                Unit unit = Unit.f80348a;
            }
            Intrinsics.f(cVar);
            l2.c W = cVar.W(i13);
            if (Intrinsics.d(W, cVar)) {
                break;
            }
            r rVar3 = this.f110683a;
            Intrinsics.g(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f110667b) {
                k13 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k13);
                synchronized (obj2) {
                    int i15 = rVar4.f110678d;
                    if (i15 == i14) {
                        rVar4.f110677c = W;
                        z13 = true;
                        rVar4.f110679e++;
                        rVar4.f110678d = i15 + 1;
                    } else {
                        z13 = false;
                    }
                }
            }
            p.n(k13, this);
        } while (!z13);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i13;
        l2.c cVar;
        int i14;
        i k13;
        do {
            Object obj = u.f110684a;
            synchronized (obj) {
                r rVar = this.f110683a;
                Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i13 = rVar2.f110678d;
                cVar = rVar2.f110677c;
                Unit unit = Unit.f80348a;
            }
            Intrinsics.f(cVar);
            i14 = 0;
            l2.c P = ((m2.c) cVar).P(new m2.b(i14, collection));
            if (Intrinsics.d(P, cVar)) {
                return false;
            }
            r rVar3 = this.f110683a;
            Intrinsics.g(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f110667b) {
                k13 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k13);
                synchronized (obj) {
                    int i15 = rVar4.f110678d;
                    if (i15 == i13) {
                        rVar4.f110677c = P;
                        rVar4.f110679e++;
                        rVar4.f110678d = i15 + 1;
                        i14 = 1;
                    }
                }
            }
            p.n(k13, this);
        } while (i14 == 0);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return i(new s2(collection, 7));
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        int i14;
        l2.c cVar;
        i k13;
        boolean z13;
        Object obj2 = get(i13);
        do {
            Object obj3 = u.f110684a;
            synchronized (obj3) {
                r rVar = this.f110683a;
                Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i14 = rVar2.f110678d;
                cVar = rVar2.f110677c;
                Unit unit = Unit.f80348a;
            }
            Intrinsics.f(cVar);
            l2.c cVar2 = cVar.set(i13, obj);
            if (Intrinsics.d(cVar2, cVar)) {
                break;
            }
            r rVar3 = this.f110683a;
            Intrinsics.g(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f110667b) {
                k13 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k13);
                synchronized (obj3) {
                    int i15 = rVar4.f110678d;
                    if (i15 == i14) {
                        rVar4.f110677c = cVar2;
                        rVar4.f110678d = i15 + 1;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
            }
            p.n(k13, this);
        } while (!z13);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return c().f110677c.size();
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        if (i13 >= 0 && i13 <= i14 && i14 <= size()) {
            return new d0(this, i13, i14);
        }
        m0.o0("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.J(this);
    }

    public final String toString() {
        r rVar = this.f110683a;
        Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((r) p.i(rVar)).f110677c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i13;
        l2.c cVar;
        boolean z13;
        i k13;
        do {
            Object obj = u.f110684a;
            synchronized (obj) {
                r rVar = this.f110683a;
                Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i13 = rVar2.f110678d;
                cVar = rVar2.f110677c;
                Unit unit = Unit.f80348a;
            }
            Intrinsics.f(cVar);
            l2.c addAll = cVar.addAll(collection);
            z13 = false;
            if (Intrinsics.d(addAll, cVar)) {
                return false;
            }
            r rVar3 = this.f110683a;
            Intrinsics.g(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f110667b) {
                k13 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k13);
                synchronized (obj) {
                    int i14 = rVar4.f110678d;
                    if (i14 == i13) {
                        rVar4.f110677c = addAll;
                        rVar4.f110679e++;
                        rVar4.f110678d = i14 + 1;
                        z13 = true;
                    }
                }
            }
            p.n(k13, this);
        } while (!z13);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        return new y(this, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.K(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        l2.c cVar;
        i k13;
        boolean z13;
        do {
            Object obj2 = u.f110684a;
            synchronized (obj2) {
                r rVar = this.f110683a;
                Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i14 = rVar2.f110678d;
                cVar = rVar2.f110677c;
                Unit unit = Unit.f80348a;
            }
            Intrinsics.f(cVar);
            l2.c add = cVar.add(i13, obj);
            if (Intrinsics.d(add, cVar)) {
                return;
            }
            r rVar3 = this.f110683a;
            Intrinsics.g(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f110667b) {
                k13 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k13);
                synchronized (obj2) {
                    int i15 = rVar4.f110678d;
                    if (i15 == i14) {
                        rVar4.f110677c = add;
                        z13 = true;
                        rVar4.f110679e++;
                        rVar4.f110678d = i15 + 1;
                    } else {
                        z13 = false;
                    }
                }
            }
            p.n(k13, this);
        } while (!z13);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i13;
        l2.c cVar;
        boolean z13;
        i k13;
        do {
            Object obj2 = u.f110684a;
            synchronized (obj2) {
                r rVar = this.f110683a;
                Intrinsics.g(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i13 = rVar2.f110678d;
                cVar = rVar2.f110677c;
                Unit unit = Unit.f80348a;
            }
            Intrinsics.f(cVar);
            m2.c cVar2 = (m2.c) cVar;
            int indexOf = cVar2.indexOf(obj);
            l2.c cVar3 = cVar2;
            if (indexOf != -1) {
                cVar3 = cVar2.W(indexOf);
            }
            z13 = false;
            if (Intrinsics.d(cVar3, cVar)) {
                return false;
            }
            r rVar3 = this.f110683a;
            Intrinsics.g(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f110667b) {
                k13 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k13);
                synchronized (obj2) {
                    int i14 = rVar4.f110678d;
                    if (i14 == i13) {
                        rVar4.f110677c = cVar3;
                        rVar4.f110679e++;
                        rVar4.f110678d = i14 + 1;
                        z13 = true;
                    }
                }
            }
            p.n(k13, this);
        } while (!z13);
        return true;
    }
}
