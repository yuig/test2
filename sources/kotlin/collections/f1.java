package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 extends h implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f80365b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80366c;

    /* renamed from: d, reason: collision with root package name */
    public int f80367d;

    /* renamed from: e, reason: collision with root package name */
    public int f80368e;

    public f1(int i13, Object[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f80365b = buffer;
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("ring buffer filled size should not be negative but it is ", i13).toString());
        }
        if (i13 <= buffer.length) {
            this.f80366c = buffer.length;
            this.f80368e = i13;
        } else {
            StringBuilder s13 = a.a.s("ring buffer filled size: ", i13, " cannot be larger than the buffer size: ");
            s13.append(buffer.length);
            throw new IllegalArgumentException(s13.toString().toString());
        }
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f80368e;
    }

    public final void c(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("n shouldn't be negative but it is ", i13).toString());
        }
        if (i13 > this.f80368e) {
            StringBuilder s13 = a.a.s("n shouldn't be greater than the buffer size: n = ", i13, ", size = ");
            s13.append(this.f80368e);
            throw new IllegalArgumentException(s13.toString().toString());
        }
        if (i13 > 0) {
            int i14 = this.f80367d;
            int i15 = this.f80366c;
            int i16 = (i14 + i13) % i15;
            Object[] objArr = this.f80365b;
            if (i14 > i16) {
                z.o(i14, i15, null, objArr);
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                Arrays.fill(objArr, 0, i16, (Object) null);
            } else {
                z.o(i14, i16, null, objArr);
            }
            this.f80367d = i16;
            this.f80368e -= i13;
        }
    }

    @Override // java.util.List
    public final Object get(int i13) {
        e eVar = h.f80373a;
        int i14 = this.f80368e;
        eVar.getClass();
        e.b(i13, i14);
        return this.f80365b[(this.f80367d + i13) % this.f80366c];
    }

    @Override // kotlin.collections.h, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new e1(this);
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i13 = this.f80368e;
        if (length < i13) {
            array = Arrays.copyOf(array, i13);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        }
        int i14 = this.f80368e;
        int i15 = this.f80367d;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            objArr = this.f80365b;
            if (i17 >= i14 || i15 >= this.f80366c) {
                break;
            }
            array[i17] = objArr[i15];
            i17++;
            i15++;
        }
        while (i17 < i14) {
            array[i17] = objArr[i16];
            i17++;
            i16++;
        }
        Intrinsics.checkNotNullParameter(array, "array");
        if (i14 < array.length) {
            array[i14] = null;
        }
        return array;
    }
}
