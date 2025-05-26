package pk;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class o1 extends v0 implements Set {

    /* renamed from: c */
    public static final /* synthetic */ int f100461c = 0;

    /* renamed from: b */
    public transient c1 f100462b;

    public static boolean l(int i13, int i14) {
        return i13 < (i14 >> 1) + (i14 >> 2);
    }

    public static int n(int i13) {
        int max = Math.max(i13, 2);
        if (max >= 751619276) {
            bf.b.j("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static o1 p(int i13, Object... objArr) {
        if (i13 == 0) {
            return b3.f100362j;
        }
        if (i13 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new j3(obj);
        }
        int n13 = n(i13);
        Object[] objArr2 = new Object[n13];
        int i14 = n13 - 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            Object obj2 = objArr[i17];
            if (obj2 == null) {
                throw new NullPointerException(a.a.d("at index ", i17));
            }
            int hashCode = obj2.hashCode();
            int X1 = bs1.c.X1(hashCode);
            while (true) {
                int i18 = X1 & i14;
                Object obj3 = objArr2[i18];
                if (obj3 == null) {
                    objArr[i16] = obj2;
                    objArr2[i18] = obj2;
                    i15 += hashCode;
                    i16++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                X1++;
            }
        }
        Arrays.fill(objArr, i16, i13, (Object) null);
        if (i16 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new j3(obj4);
        }
        if (n(i16) < n13 / 2) {
            return p(i16, objArr);
        }
        int length = objArr.length;
        if (i16 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i16);
        }
        return new b3(i15, i14, i16, objArr, objArr2);
    }

    public static o1 r(Collection collection) {
        if ((collection instanceof o1) && !(collection instanceof SortedSet)) {
            o1 o1Var = (o1) collection;
            if (!o1Var.i()) {
                return o1Var;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static o1 s(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? p(objArr.length, (Object[]) objArr.clone()) : new j3(objArr[0]) : b3.f100362j;
    }

    public static o1 u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        bf.b.j("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return p(length, objArr2);
    }

    @Override // pk.v0
    public c1 b() {
        c1 c1Var = this.f100462b;
        if (c1Var != null) {
            return c1Var;
        }
        c1 t13 = t();
        this.f100462b = t13;
        return t13;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof o1) && (this instanceof b3)) {
            o1 o1Var = (o1) obj;
            o1Var.getClass();
            if ((o1Var instanceof b3) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return dl2.b.j0(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return dl2.b.r1(this);
    }

    public c1 t() {
        Object[] array = toArray(v0.f100499a);
        y0 y0Var = c1.f100372b;
        return c1.l(array.length, array);
    }

    @Override // pk.v0
    public Object writeReplace() {
        return new n1(toArray(v0.f100499a));
    }
}
