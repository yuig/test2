package s3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements List, ll2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f110965d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f110962a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public long[] f110963b = new long[16];

    /* renamed from: c, reason: collision with root package name */
    public int f110964c = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f110966e = true;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long g13 = kh2.j.g(Float.POSITIVE_INFINITY, false);
        int i13 = this.f110964c + 1;
        int i14 = kotlin.collections.f0.i(this);
        if (i13 <= i14) {
            while (true) {
                long j13 = this.f110963b[i13];
                if (kh2.d.n(j13, g13) < 0) {
                    g13 = j13;
                }
                if (kh2.d.w(g13) < 0.0f && kh2.d.H0(g13)) {
                    return g13;
                }
                if (i13 == i14) {
                    break;
                }
                i13++;
            }
        }
        return g13;
    }

    public final void c(u2.p pVar, float f13, boolean z13, Function0 function0) {
        int i13 = this.f110964c;
        int i14 = i13 + 1;
        this.f110964c = i14;
        Object[] objArr = this.f110962a;
        if (i14 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f110962a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f110963b, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f110963b = copyOf2;
        }
        Object[] objArr2 = this.f110962a;
        int i15 = this.f110964c;
        objArr2[i15] = pVar;
        this.f110963b[i15] = kh2.j.g(f13, z13);
        d();
        function0.invoke();
        this.f110964c = i13;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f110964c = -1;
        d();
        this.f110966e = true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof u2.p) && indexOf((u2.p) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((u2.p) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        int i13 = this.f110964c + 1;
        int i14 = kotlin.collections.f0.i(this);
        if (i13 <= i14) {
            while (true) {
                this.f110962a[i13] = null;
                if (i13 == i14) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f110965d = this.f110964c + 1;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        Object obj = this.f110962a[i13];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (u2.p) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof u2.p)) {
            return -1;
        }
        u2.p pVar = (u2.p) obj;
        int i13 = kotlin.collections.f0.i(this);
        if (i13 < 0) {
            return -1;
        }
        int i14 = 0;
        while (!Intrinsics.d(this.f110962a[i14], pVar)) {
            if (i14 == i13) {
                return -1;
            }
            i14++;
        }
        return i14;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f110965d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof u2.p)) {
            return -1;
        }
        u2.p pVar = (u2.p) obj;
        for (int i13 = kotlin.collections.f0.i(this); -1 < i13; i13--) {
            if (Intrinsics.d(this.f110962a[i13], pVar)) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new t(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f110965d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        return new u(this, i13, i14);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        return new t(this, i13, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.K(this, objArr);
    }
}
