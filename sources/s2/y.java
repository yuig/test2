package s2;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y implements ListIterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110710a;

    /* renamed from: b, reason: collision with root package name */
    public int f110711b;

    /* renamed from: c, reason: collision with root package name */
    public int f110712c;

    /* renamed from: d, reason: collision with root package name */
    public int f110713d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f110714e;

    public y(t tVar, int i13) {
        this.f110710a = 0;
        this.f110714e = tVar;
        this.f110711b = i13 - 1;
        this.f110712c = -1;
        this.f110713d = tVar.f();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i13;
        Object obj2 = this.f110714e;
        switch (this.f110710a) {
            case 0:
                c();
                t tVar = (t) obj2;
                tVar.add(this.f110711b + 1, obj);
                this.f110712c = -1;
                this.f110711b++;
                this.f110713d = tVar.f();
                break;
            default:
                b();
                yk2.b bVar = (yk2.b) obj2;
                int i14 = this.f110711b;
                this.f110711b = i14 + 1;
                bVar.add(i14, obj);
                this.f110712c = -1;
                i13 = ((AbstractList) bVar).modCount;
                this.f110713d = i13;
                break;
        }
    }

    public final void b() {
        int i13;
        i13 = ((AbstractList) ((yk2.b) this.f110714e)).modCount;
        if (i13 != this.f110713d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void c() {
        if (((t) this.f110714e).f() != this.f110713d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        Object obj = this.f110714e;
        switch (this.f110710a) {
            case 0:
                if (this.f110711b < ((t) obj).size() - 1) {
                    break;
                }
                break;
            default:
                if (this.f110711b < ((yk2.b) obj).f139239c) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f110710a) {
            case 0:
                if (this.f110711b >= 0) {
                    break;
                }
                break;
            default:
                if (this.f110711b > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Object obj = this.f110714e;
        switch (this.f110710a) {
            case 0:
                c();
                int i13 = this.f110711b + 1;
                this.f110712c = i13;
                t tVar = (t) obj;
                u.a(i13, tVar.size());
                Object obj2 = tVar.get(i13);
                this.f110711b = i13;
                return obj2;
            default:
                b();
                int i14 = this.f110711b;
                yk2.b bVar = (yk2.b) obj;
                if (i14 >= bVar.f139239c) {
                    throw new NoSuchElementException();
                }
                this.f110711b = i14 + 1;
                this.f110712c = i14;
                return bVar.f139237a[bVar.f139238b + i14];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f110710a) {
            case 0:
                return this.f110711b + 1;
            default:
                return this.f110711b;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Object obj = this.f110714e;
        switch (this.f110710a) {
            case 0:
                c();
                t tVar = (t) obj;
                u.a(this.f110711b, tVar.size());
                int i13 = this.f110711b;
                this.f110712c = i13;
                this.f110711b--;
                return tVar.get(i13);
            default:
                b();
                int i14 = this.f110711b;
                if (i14 <= 0) {
                    throw new NoSuchElementException();
                }
                int i15 = i14 - 1;
                this.f110711b = i15;
                this.f110712c = i15;
                yk2.b bVar = (yk2.b) obj;
                return bVar.f139237a[bVar.f139238b + i15];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f110710a) {
            case 0:
                return this.f110711b;
            default:
                return this.f110711b - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i13;
        Object obj = this.f110714e;
        switch (this.f110710a) {
            case 0:
                c();
                t tVar = (t) obj;
                tVar.remove(this.f110711b);
                this.f110711b--;
                this.f110712c = -1;
                this.f110713d = tVar.f();
                return;
            default:
                b();
                int i14 = this.f110712c;
                if (i14 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                yk2.b bVar = (yk2.b) obj;
                bVar.c(i14);
                this.f110711b = this.f110712c;
                this.f110712c = -1;
                i13 = ((AbstractList) bVar).modCount;
                this.f110713d = i13;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        Object obj2 = this.f110714e;
        switch (this.f110710a) {
            case 0:
                c();
                int i13 = this.f110712c;
                if (i13 < 0) {
                    Object obj3 = u.f110684a;
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
                }
                t tVar = (t) obj2;
                tVar.set(i13, obj);
                this.f110713d = tVar.f();
                return;
            default:
                b();
                int i14 = this.f110712c;
                if (i14 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                ((yk2.b) obj2).set(i14, obj);
                return;
        }
    }

    public y(yk2.b list, int i13) {
        int i14;
        this.f110710a = 1;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f110714e = list;
        this.f110711b = i13;
        this.f110712c = -1;
        i14 = ((AbstractList) list).modCount;
        this.f110713d = i14;
    }
}
