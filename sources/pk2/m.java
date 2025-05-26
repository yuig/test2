package pk2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f100551a;

    /* renamed from: b, reason: collision with root package name */
    public int f100552b;

    /* renamed from: c, reason: collision with root package name */
    public int f100553c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f100554d;

    public m(int i13) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i13 - 1));
        this.f100551a = numberOfLeadingZeros - 1;
        this.f100553c = (int) (0.75f * numberOfLeadingZeros);
        this.f100554d = new Object[numberOfLeadingZeros];
    }

    public final void a(Object obj) {
        Object obj2;
        Object obj3;
        Object[] objArr = this.f100554d;
        int i13 = this.f100551a;
        int hashCode = obj.hashCode() * (-1640531527);
        int i14 = (hashCode ^ (hashCode >>> 16)) & i13;
        Object obj4 = objArr[i14];
        if (obj4 != null) {
            if (obj4.equals(obj)) {
                return;
            }
            do {
                i14 = (i14 + 1) & i13;
                obj3 = objArr[i14];
                if (obj3 == null) {
                }
            } while (!obj3.equals(obj));
            return;
        }
        objArr[i14] = obj;
        int i15 = this.f100552b + 1;
        this.f100552b = i15;
        if (i15 < this.f100553c) {
            return;
        }
        Object[] objArr2 = this.f100554d;
        int length = objArr2.length;
        int i16 = length << 1;
        int i17 = i16 - 1;
        Object[] objArr3 = new Object[i16];
        while (true) {
            int i18 = i15 - 1;
            if (i15 == 0) {
                this.f100551a = i17;
                this.f100553c = (int) (i16 * 0.75f);
                this.f100554d = objArr3;
                return;
            }
            do {
                length--;
                obj2 = objArr2[length];
            } while (obj2 == null);
            int hashCode2 = obj2.hashCode() * (-1640531527);
            int i19 = (hashCode2 ^ (hashCode2 >>> 16)) & i17;
            if (objArr3[i19] != null) {
                do {
                    i19 = (i19 + 1) & i17;
                } while (objArr3[i19] != null);
            }
            objArr3[i19] = objArr2[length];
            i15 = i18;
        }
    }

    public final void b(int i13, int i14, Object[] objArr) {
        int i15;
        Object obj;
        this.f100552b--;
        while (true) {
            int i16 = i13 + 1;
            while (true) {
                i15 = i16 & i14;
                obj = objArr[i15];
                if (obj == null) {
                    objArr[i13] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i17 = (hashCode ^ (hashCode >>> 16)) & i14;
                if (i13 > i15) {
                    if (i13 >= i17 && i17 > i15) {
                        break;
                    }
                    i16 = i15 + 1;
                } else if (i13 < i17 && i17 <= i15) {
                    i16 = i15 + 1;
                }
            }
            objArr[i13] = obj;
            i13 = i15;
        }
    }
}
