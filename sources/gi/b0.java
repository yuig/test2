package gi;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import kh2.p2;

/* loaded from: classes3.dex */
public abstract class b0 extends u implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f65048c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient z f65049b;

    public static b0 i(int i13, Object... objArr) {
        if (i13 == 0) {
            return l0.f65084j;
        }
        if (i13 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new p0(obj);
        }
        int l13 = l(i13);
        Object[] objArr2 = new Object[l13];
        int i14 = l13 - 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            Object obj2 = objArr[i17];
            if (obj2 == null) {
                throw new NullPointerException(a.a.d("at index ", i17));
            }
            int hashCode = obj2.hashCode();
            int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i18 = rotateLeft & i14;
                Object obj3 = objArr2[i18];
                if (obj3 == null) {
                    objArr[i16] = obj2;
                    objArr2[i18] = obj2;
                    i15 += hashCode;
                    i16++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    rotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i16, i13, (Object) null);
        if (i16 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new p0(obj4);
        }
        if (l(i16) < l13 / 2) {
            return i(i16, objArr);
        }
        if (i16 <= 0) {
            objArr = Arrays.copyOf(objArr, i16);
        }
        return new l0(i15, i14, i16, objArr, objArr2);
    }

    public static int l(int i13) {
        int max = Math.max(i13, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof b0) && j() && ((b0) obj).j() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return p2.j1(this);
    }

    public boolean j() {
        return this instanceof l0;
    }

    public z n() {
        z zVar = this.f65049b;
        if (zVar != null) {
            return zVar;
        }
        z p13 = p();
        this.f65049b = p13;
        return p13;
    }

    public z p() {
        Object[] array = toArray(u.f65118a);
        v vVar = z.f65142b;
        return z.l(array.length, array);
    }
}
