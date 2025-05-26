package q2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f102117a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f102118b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f102119c;

    public m(int i13, long[] jArr, Object[] objArr) {
        this.f102117a = i13;
        this.f102118b = jArr;
        this.f102119c = objArr;
    }

    public final int a(long j13) {
        int i13 = this.f102117a - 1;
        if (i13 == -1) {
            return -1;
        }
        long[] jArr = this.f102118b;
        int i14 = 0;
        if (i13 == 0) {
            long j14 = jArr[0];
            if (j14 == j13) {
                return 0;
            }
            return j14 > j13 ? -2 : -1;
        }
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            long j15 = jArr[i15] - j13;
            if (j15 < 0) {
                i14 = i15 + 1;
            } else {
                if (j15 <= 0) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public final Object b(long j13) {
        int a13 = a(j13);
        if (a13 >= 0) {
            return this.f102119c[a13];
        }
        return null;
    }

    public final m c(long j13, Object obj) {
        long[] jArr;
        int i13;
        Object[] objArr = this.f102119c;
        int i14 = 0;
        int i15 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i15++;
            }
        }
        int i16 = i15 + 1;
        long[] jArr2 = new long[i16];
        Object[] objArr2 = new Object[i16];
        if (i16 > 1) {
            int i17 = 0;
            while (true) {
                jArr = this.f102118b;
                i13 = this.f102117a;
                if (i14 >= i16 || i17 >= i13) {
                    break;
                }
                long j14 = jArr[i17];
                Object obj3 = objArr[i17];
                if (j14 > j13) {
                    jArr2[i14] = j13;
                    objArr2[i14] = obj;
                    i14++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i14] = j14;
                    objArr2[i14] = obj3;
                    i14++;
                }
                i17++;
            }
            if (i17 == i13) {
                jArr2[i15] = j13;
                objArr2[i15] = obj;
            } else {
                while (i14 < i16) {
                    long j15 = jArr[i17];
                    Object obj4 = objArr[i17];
                    if (obj4 != null) {
                        jArr2[i14] = j15;
                        objArr2[i14] = obj4;
                        i14++;
                    }
                    i17++;
                }
            }
        } else {
            jArr2[0] = j13;
            objArr2[0] = obj;
        }
        return new m(i16, jArr2, objArr2);
    }

    public final boolean d(long j13, Object obj) {
        int a13 = a(j13);
        if (a13 < 0) {
            return false;
        }
        this.f102119c[a13] = obj;
        return true;
    }
}
