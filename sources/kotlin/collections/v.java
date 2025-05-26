package kotlin.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class v extends o {

    /* renamed from: d */
    @NotNull
    public static final u f80398d = new u(null);

    /* renamed from: e */
    public static final Object[] f80399e = new Object[0];

    /* renamed from: a */
    public int f80400a;

    /* renamed from: b */
    public Object[] f80401b;

    /* renamed from: c */
    public int f80402c;

    public v() {
        this.f80401b = f80399e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        e(elements.size() + b());
        d(j(b() + this.f80400a), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        e(this.f80402c + 1);
        int i13 = this.f80400a;
        int F = i13 == 0 ? c0.F(this.f80401b) : i13 - 1;
        this.f80400a = F;
        this.f80401b[F] = obj;
        this.f80402c++;
    }

    public final void addLast(Object obj) {
        e(b() + 1);
        this.f80401b[j(b() + this.f80400a)] = obj;
        this.f80402c = b() + 1;
    }

    @Override // kotlin.collections.o
    public final int b() {
        return this.f80402c;
    }

    @Override // kotlin.collections.o
    public final Object c(int i13) {
        e eVar = h.f80373a;
        int i14 = this.f80402c;
        eVar.getClass();
        e.b(i13, i14);
        if (i13 == f0.i(this)) {
            return removeLast();
        }
        if (i13 == 0) {
            return removeFirst();
        }
        int j13 = j(this.f80400a + i13);
        Object[] objArr = this.f80401b;
        Object obj = objArr[j13];
        if (i13 < (this.f80402c >> 1)) {
            int i15 = this.f80400a;
            if (j13 >= i15) {
                z.h(i15 + 1, i15, j13, objArr, objArr);
            } else {
                z.h(1, 0, j13, objArr, objArr);
                Object[] objArr2 = this.f80401b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i16 = this.f80400a;
                z.h(i16 + 1, i16, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f80401b;
            int i17 = this.f80400a;
            objArr3[i17] = null;
            this.f80400a = f(i17);
        } else {
            int j14 = j(f0.i(this) + this.f80400a);
            if (j13 <= j14) {
                Object[] objArr4 = this.f80401b;
                z.h(j13, j13 + 1, j14 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f80401b;
                z.h(j13, j13 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f80401b;
                objArr6[objArr6.length - 1] = objArr6[0];
                z.h(0, 1, j14 + 1, objArr6, objArr6);
            }
            this.f80401b[j14] = null;
        }
        this.f80402c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int j13 = j(this.f80402c + this.f80400a);
        int i13 = this.f80400a;
        if (i13 < j13) {
            z.o(i13, j13, null, this.f80401b);
        } else if (!isEmpty()) {
            Object[] objArr = this.f80401b;
            int i14 = this.f80400a;
            int length = objArr.length;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            Arrays.fill(objArr, i14, length, (Object) null);
            z.o(0, j13, null, this.f80401b);
        }
        this.f80400a = 0;
        this.f80402c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i13, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f80401b.length;
        while (i13 < length && it.hasNext()) {
            this.f80401b[i13] = it.next();
            i13++;
        }
        int i14 = this.f80400a;
        for (int i15 = 0; i15 < i14 && it.hasNext(); i15++) {
            this.f80401b[i15] = it.next();
        }
        this.f80402c = collection.size() + b();
    }

    public final void e(int i13) {
        if (i13 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f80401b;
        if (i13 <= objArr.length) {
            return;
        }
        if (objArr == f80399e) {
            if (i13 < 10) {
                i13 = 10;
            }
            this.f80401b = new Object[i13];
            return;
        }
        e eVar = h.f80373a;
        int length = objArr.length;
        eVar.getClass();
        Object[] objArr2 = new Object[e.e(length, i13)];
        Object[] objArr3 = this.f80401b;
        z.h(0, this.f80400a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.f80401b;
        int length2 = objArr4.length;
        int i14 = this.f80400a;
        z.h(length2 - i14, 0, i14, objArr4, objArr2);
        this.f80400a = 0;
        this.f80401b = objArr2;
    }

    public final int f(int i13) {
        if (i13 == c0.F(this.f80401b)) {
            return 0;
        }
        return i13 + 1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f80401b[this.f80400a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        e eVar = h.f80373a;
        int i14 = this.f80402c;
        eVar.getClass();
        e.b(i13, i14);
        return this.f80401b[j(this.f80400a + i13)];
    }

    public final Object i() {
        if (isEmpty()) {
            return null;
        }
        return this.f80401b[j(f0.i(this) + this.f80400a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i13;
        int j13 = j(b() + this.f80400a);
        int i14 = this.f80400a;
        if (i14 < j13) {
            while (i14 < j13) {
                if (Intrinsics.d(obj, this.f80401b[i14])) {
                    i13 = this.f80400a;
                } else {
                    i14++;
                }
            }
            return -1;
        }
        if (i14 < j13) {
            return -1;
        }
        int length = this.f80401b.length;
        while (true) {
            if (i14 >= length) {
                for (int i15 = 0; i15 < j13; i15++) {
                    if (Intrinsics.d(obj, this.f80401b[i15])) {
                        i14 = i15 + this.f80401b.length;
                        i13 = this.f80400a;
                    }
                }
                return -1;
            }
            if (Intrinsics.d(obj, this.f80401b[i14])) {
                i13 = this.f80400a;
                break;
            }
            i14++;
        }
        return i14 - i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final int j(int i13) {
        Object[] objArr = this.f80401b;
        return i13 >= objArr.length ? i13 - objArr.length : i13;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f80401b[j(f0.i(this) + this.f80400a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int F;
        int i13;
        int j13 = j(b() + this.f80400a);
        int i14 = this.f80400a;
        if (i14 < j13) {
            F = j13 - 1;
            if (i14 <= F) {
                while (!Intrinsics.d(obj, this.f80401b[F])) {
                    if (F != i14) {
                        F--;
                    }
                }
                i13 = this.f80400a;
                return F - i13;
            }
            return -1;
        }
        if (i14 > j13) {
            int i15 = j13 - 1;
            while (true) {
                if (-1 >= i15) {
                    F = c0.F(this.f80401b);
                    int i16 = this.f80400a;
                    if (i16 <= F) {
                        while (!Intrinsics.d(obj, this.f80401b[F])) {
                            if (F != i16) {
                                F--;
                            }
                        }
                        i13 = this.f80400a;
                    }
                } else {
                    if (Intrinsics.d(obj, this.f80401b[i15])) {
                        F = i15 + this.f80401b.length;
                        i13 = this.f80400a;
                        break;
                    }
                    i15--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int j13;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z13 = false;
        z13 = false;
        z13 = false;
        if (!isEmpty() && this.f80401b.length != 0) {
            int j14 = j(this.f80402c + this.f80400a);
            int i13 = this.f80400a;
            if (i13 < j14) {
                j13 = i13;
                while (i13 < j14) {
                    Object obj = this.f80401b[i13];
                    if (!elements.contains(obj)) {
                        this.f80401b[j13] = obj;
                        j13++;
                    } else {
                        z13 = true;
                    }
                    i13++;
                }
                z.o(j13, j14, null, this.f80401b);
            } else {
                int length = this.f80401b.length;
                boolean z14 = false;
                int i14 = i13;
                while (i13 < length) {
                    Object[] objArr = this.f80401b;
                    Object obj2 = objArr[i13];
                    objArr[i13] = null;
                    if (!elements.contains(obj2)) {
                        this.f80401b[i14] = obj2;
                        i14++;
                    } else {
                        z14 = true;
                    }
                    i13++;
                }
                j13 = j(i14);
                for (int i15 = 0; i15 < j14; i15++) {
                    Object[] objArr2 = this.f80401b;
                    Object obj3 = objArr2[i15];
                    objArr2[i15] = null;
                    if (!elements.contains(obj3)) {
                        this.f80401b[j13] = obj3;
                        j13 = f(j13);
                    } else {
                        z14 = true;
                    }
                }
                z13 = z14;
            }
            if (z13) {
                int i16 = j13 - this.f80400a;
                if (i16 < 0) {
                    i16 += this.f80401b.length;
                }
                this.f80402c = i16;
            }
        }
        return z13;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f80401b;
        int i13 = this.f80400a;
        Object obj = objArr[i13];
        objArr[i13] = null;
        this.f80400a = f(i13);
        this.f80402c = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int j13 = j(f0.i(this) + this.f80400a);
        Object[] objArr = this.f80401b;
        Object obj = objArr[j13];
        objArr[j13] = null;
        this.f80402c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int j13;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z13 = false;
        z13 = false;
        z13 = false;
        if (!isEmpty() && this.f80401b.length != 0) {
            int j14 = j(this.f80402c + this.f80400a);
            int i13 = this.f80400a;
            if (i13 < j14) {
                j13 = i13;
                while (i13 < j14) {
                    Object obj = this.f80401b[i13];
                    if (elements.contains(obj)) {
                        this.f80401b[j13] = obj;
                        j13++;
                    } else {
                        z13 = true;
                    }
                    i13++;
                }
                z.o(j13, j14, null, this.f80401b);
            } else {
                int length = this.f80401b.length;
                boolean z14 = false;
                int i14 = i13;
                while (i13 < length) {
                    Object[] objArr = this.f80401b;
                    Object obj2 = objArr[i13];
                    objArr[i13] = null;
                    if (elements.contains(obj2)) {
                        this.f80401b[i14] = obj2;
                        i14++;
                    } else {
                        z14 = true;
                    }
                    i13++;
                }
                j13 = j(i14);
                for (int i15 = 0; i15 < j14; i15++) {
                    Object[] objArr2 = this.f80401b;
                    Object obj3 = objArr2[i15];
                    objArr2[i15] = null;
                    if (elements.contains(obj3)) {
                        this.f80401b[j13] = obj3;
                        j13 = f(j13);
                    } else {
                        z14 = true;
                    }
                }
                z13 = z14;
            }
            if (z13) {
                int i16 = j13 - this.f80400a;
                if (i16 < 0) {
                    i16 += this.f80401b.length;
                }
                this.f80402c = i16;
            }
        }
        return z13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        e eVar = h.f80373a;
        int i14 = this.f80402c;
        eVar.getClass();
        e.b(i13, i14);
        int j13 = j(this.f80400a + i13);
        Object[] objArr = this.f80401b;
        Object obj2 = objArr[j13];
        objArr[j13] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        e eVar = h.f80373a;
        int i14 = this.f80402c;
        eVar.getClass();
        e.c(i13, i14);
        int i15 = this.f80402c;
        if (i13 == i15) {
            addLast(obj);
            return;
        }
        if (i13 == 0) {
            addFirst(obj);
            return;
        }
        e(i15 + 1);
        int j13 = j(this.f80400a + i13);
        int i16 = this.f80402c;
        if (i13 < ((i16 + 1) >> 1)) {
            int F = j13 == 0 ? c0.F(this.f80401b) : j13 - 1;
            int i17 = this.f80400a;
            int F2 = i17 == 0 ? c0.F(this.f80401b) : i17 - 1;
            int i18 = this.f80400a;
            if (F >= i18) {
                Object[] objArr = this.f80401b;
                objArr[F2] = objArr[i18];
                z.h(i18, i18 + 1, F + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.f80401b;
                z.h(i18 - 1, i18, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.f80401b;
                objArr3[objArr3.length - 1] = objArr3[0];
                z.h(0, 1, F + 1, objArr3, objArr3);
            }
            this.f80401b[F] = obj;
            this.f80400a = F2;
        } else {
            int j14 = j(i16 + this.f80400a);
            if (j13 < j14) {
                Object[] objArr4 = this.f80401b;
                z.h(j13 + 1, j13, j14, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f80401b;
                z.h(1, 0, j14, objArr5, objArr5);
                Object[] objArr6 = this.f80401b;
                objArr6[0] = objArr6[objArr6.length - 1];
                z.h(j13 + 1, j13, objArr6.length - 1, objArr6, objArr6);
            }
            this.f80401b[j13] = obj;
        }
        this.f80402c++;
    }

    public v(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f80401b = array;
        this.f80402c = array.length;
        if (array.length == 0) {
            this.f80401b = f80399e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i13 = this.f80402c;
        if (length < i13) {
            Intrinsics.checkNotNullParameter(array, "reference");
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i13);
            Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int j13 = j(this.f80402c + this.f80400a);
        int i14 = this.f80400a;
        if (i14 < j13) {
            z.l(this.f80401b, array, i14, j13, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f80401b;
            z.h(0, this.f80400a, objArr.length, objArr, array);
            Object[] objArr2 = this.f80401b;
            z.h(objArr2.length - this.f80400a, 0, j13, objArr2, array);
        }
        int i15 = this.f80402c;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i15 < array.length) {
            array[i15] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        e eVar = h.f80373a;
        int i14 = this.f80402c;
        eVar.getClass();
        e.c(i13, i14);
        if (elements.isEmpty()) {
            return false;
        }
        int i15 = this.f80402c;
        if (i13 == i15) {
            return addAll(elements);
        }
        e(elements.size() + i15);
        int j13 = j(this.f80402c + this.f80400a);
        int j14 = j(this.f80400a + i13);
        int size = elements.size();
        if (i13 < ((this.f80402c + 1) >> 1)) {
            int i16 = this.f80400a;
            int i17 = i16 - size;
            if (j14 < i16) {
                Object[] objArr = this.f80401b;
                z.h(i17, i16, objArr.length, objArr, objArr);
                if (size >= j14) {
                    Object[] objArr2 = this.f80401b;
                    z.h(objArr2.length - size, 0, j14, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f80401b;
                    z.h(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f80401b;
                    z.h(0, size, j14, objArr4, objArr4);
                }
            } else if (i17 >= 0) {
                Object[] objArr5 = this.f80401b;
                z.h(i17, i16, j14, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f80401b;
                i17 += objArr6.length;
                int i18 = j14 - i16;
                int length = objArr6.length - i17;
                if (length >= i18) {
                    z.h(i17, i16, j14, objArr6, objArr6);
                } else {
                    z.h(i17, i16, i16 + length, objArr6, objArr6);
                    Object[] objArr7 = this.f80401b;
                    z.h(0, this.f80400a + length, j14, objArr7, objArr7);
                }
            }
            this.f80400a = i17;
            int i19 = j14 - size;
            if (i19 < 0) {
                i19 += this.f80401b.length;
            }
            d(i19, elements);
        } else {
            int i23 = j14 + size;
            if (j14 < j13) {
                int i24 = size + j13;
                Object[] objArr8 = this.f80401b;
                if (i24 <= objArr8.length) {
                    z.h(i23, j14, j13, objArr8, objArr8);
                } else if (i23 >= objArr8.length) {
                    z.h(i23 - objArr8.length, j14, j13, objArr8, objArr8);
                } else {
                    int length2 = j13 - (i24 - objArr8.length);
                    z.h(0, length2, j13, objArr8, objArr8);
                    Object[] objArr9 = this.f80401b;
                    z.h(i23, j14, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f80401b;
                z.h(size, 0, j13, objArr10, objArr10);
                Object[] objArr11 = this.f80401b;
                if (i23 >= objArr11.length) {
                    z.h(i23 - objArr11.length, j14, objArr11.length, objArr11, objArr11);
                } else {
                    z.h(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f80401b;
                    z.h(i23, j14, objArr12.length - size, objArr12, objArr12);
                }
            }
            d(j14, elements);
        }
        return true;
    }
}
