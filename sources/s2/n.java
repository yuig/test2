package s2;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;

/* loaded from: classes.dex */
public final class n implements Iterable, ll2.a {

    /* renamed from: e, reason: collision with root package name */
    public static final n f110658e = new n(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f110659a;

    /* renamed from: b, reason: collision with root package name */
    public final long f110660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f110661c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f110662d;

    public n(long j13, long j14, int i13, int[] iArr) {
        this.f110659a = j13;
        this.f110660b = j14;
        this.f110661c = i13;
        this.f110662d = iArr;
    }

    public final n f(n nVar) {
        n nVar2;
        n nVar3 = f110658e;
        if (nVar == nVar3) {
            return this;
        }
        if (this == nVar3) {
            return nVar3;
        }
        int i13 = nVar.f110661c;
        int i14 = this.f110661c;
        if (i13 == i14) {
            int[] iArr = nVar.f110662d;
            int[] iArr2 = this.f110662d;
            if (iArr == iArr2) {
                return new n(this.f110659a & (~nVar.f110659a), (~nVar.f110660b) & this.f110660b, i14, iArr2);
            }
        }
        int[] iArr3 = nVar.f110662d;
        if (iArr3 != null) {
            nVar2 = this;
            for (int i15 : iArr3) {
                nVar2 = nVar2.i(i15);
            }
        } else {
            nVar2 = this;
        }
        if (nVar.f110660b != 0) {
            for (int i16 = 0; i16 < 64; i16++) {
                if ((nVar.f110660b & (1 << i16)) != 0) {
                    nVar2 = nVar2.i(nVar.f110661c + i16);
                }
            }
        }
        if (nVar.f110659a != 0) {
            for (int i17 = 0; i17 < 64; i17++) {
                if ((nVar.f110659a & (1 << i17)) != 0) {
                    nVar2 = nVar2.i(nVar.f110661c + i17 + 64);
                }
            }
        }
        return nVar2;
    }

    public final n i(int i13) {
        int[] iArr;
        int d2;
        int i14 = this.f110661c;
        int i15 = i13 - i14;
        if (i15 >= 0 && i15 < 64) {
            long j13 = 1 << i15;
            long j14 = this.f110660b;
            if ((j14 & j13) != 0) {
                return new n(this.f110659a, j14 & (~j13), i14, this.f110662d);
            }
        } else if (i15 >= 64 && i15 < 128) {
            long j15 = 1 << (i15 - 64);
            long j16 = this.f110659a;
            if ((j16 & j15) != 0) {
                return new n(j16 & (~j15), this.f110660b, i14, this.f110662d);
            }
        } else if (i15 < 0 && (iArr = this.f110662d) != null && (d2 = bf.b.d(iArr, i13)) >= 0) {
            int length = iArr.length;
            int i16 = length - 1;
            if (i16 == 0) {
                return new n(this.f110659a, this.f110660b, this.f110661c, null);
            }
            int[] iArr2 = new int[i16];
            if (d2 > 0) {
                kotlin.collections.z.g(0, 0, d2, iArr, iArr2);
            }
            if (d2 < i16) {
                kotlin.collections.z.g(d2, d2 + 1, length, iArr, iArr2);
            }
            return new n(this.f110659a, this.f110660b, this.f110661c, iArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return yn2.q.b(new m(this, null)).iterator();
    }

    public final boolean j(int i13) {
        int[] iArr;
        int i14 = i13 - this.f110661c;
        if (i14 >= 0 && i14 < 64) {
            return ((1 << i14) & this.f110660b) != 0;
        }
        if (i14 >= 64 && i14 < 128) {
            return ((1 << (i14 - 64)) & this.f110659a) != 0;
        }
        if (i14 <= 0 && (iArr = this.f110662d) != null) {
            return bf.b.d(iArr, i13) >= 0;
        }
        return false;
    }

    public final n n(n nVar) {
        n nVar2;
        n nVar3 = f110658e;
        if (nVar == nVar3) {
            return this;
        }
        if (this == nVar3) {
            return nVar;
        }
        int i13 = nVar.f110661c;
        int i14 = this.f110661c;
        if (i13 == i14) {
            int[] iArr = nVar.f110662d;
            int[] iArr2 = this.f110662d;
            if (iArr == iArr2) {
                return new n(this.f110659a | nVar.f110659a, this.f110660b | nVar.f110660b, i14, iArr2);
            }
        }
        int i15 = 0;
        if (this.f110662d == null) {
            int[] iArr3 = this.f110662d;
            if (iArr3 != null) {
                for (int i16 : iArr3) {
                    nVar = nVar.p(i16);
                }
            }
            if (this.f110660b != 0) {
                for (int i17 = 0; i17 < 64; i17++) {
                    if ((this.f110660b & (1 << i17)) != 0) {
                        nVar = nVar.p(this.f110661c + i17);
                    }
                }
            }
            if (this.f110659a != 0) {
                while (i15 < 64) {
                    if ((this.f110659a & (1 << i15)) != 0) {
                        nVar = nVar.p(this.f110661c + i15 + 64);
                    }
                    i15++;
                }
            }
            return nVar;
        }
        int[] iArr4 = nVar.f110662d;
        if (iArr4 != null) {
            nVar2 = this;
            for (int i18 : iArr4) {
                nVar2 = nVar2.p(i18);
            }
        } else {
            nVar2 = this;
        }
        if (nVar.f110660b != 0) {
            for (int i19 = 0; i19 < 64; i19++) {
                if ((nVar.f110660b & (1 << i19)) != 0) {
                    nVar2 = nVar2.p(nVar.f110661c + i19);
                }
            }
        }
        if (nVar.f110659a != 0) {
            while (i15 < 64) {
                if ((nVar.f110659a & (1 << i15)) != 0) {
                    nVar2 = nVar2.p(nVar.f110661c + i15 + 64);
                }
                i15++;
            }
        }
        return nVar2;
    }

    public final n p(int i13) {
        long j13;
        int i14;
        int i15 = this.f110661c;
        int i16 = i13 - i15;
        long j14 = this.f110660b;
        if (i16 < 0 || i16 >= 64) {
            long j15 = this.f110659a;
            if (i16 < 64 || i16 >= 128) {
                int[] iArr = this.f110662d;
                if (i16 < 128) {
                    if (iArr == null) {
                        return new n(j15, j14, i15, new int[]{i13});
                    }
                    int d2 = bf.b.d(iArr, i13);
                    if (d2 < 0) {
                        int i17 = -(d2 + 1);
                        int length = iArr.length;
                        int[] iArr2 = new int[length + 1];
                        kotlin.collections.z.g(0, 0, i17, iArr, iArr2);
                        kotlin.collections.z.g(i17 + 1, i17, length, iArr, iArr2);
                        iArr2[i17] = i13;
                        return new n(this.f110659a, this.f110660b, this.f110661c, iArr2);
                    }
                } else if (!j(i13)) {
                    int i18 = ((i13 + 1) / 64) * 64;
                    int i19 = this.f110661c;
                    ArrayList arrayList = null;
                    long j16 = j15;
                    while (true) {
                        if (i19 >= i18) {
                            j13 = j14;
                            i14 = i19;
                            break;
                        }
                        if (j14 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArr != null) {
                                    for (int i23 : iArr) {
                                        arrayList.add(Integer.valueOf(i23));
                                    }
                                }
                            }
                            for (int i24 = 0; i24 < 64; i24++) {
                                if (((1 << i24) & j14) != 0) {
                                    arrayList.add(Integer.valueOf(i24 + i19));
                                }
                            }
                        }
                        if (j16 == 0) {
                            i14 = i18;
                            j13 = 0;
                            break;
                        }
                        i19 += 64;
                        j14 = j16;
                        j16 = 0;
                    }
                    if (arrayList != null) {
                        iArr = CollectionsKt.E0(arrayList);
                    }
                    return new n(j16, j13, i14, iArr).p(i13);
                }
            } else {
                long j17 = 1 << (i16 - 64);
                if ((j15 & j17) == 0) {
                    return new n(j15 | j17, j14, i15, this.f110662d);
                }
            }
        } else {
            long j18 = 1 << i16;
            if ((j14 & j18) == 0) {
                return new n(this.f110659a, j14 | j18, i15, this.f110662d);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append(" [");
        ArrayList arrayList = new ArrayList(g0.q(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) "");
        int size = arrayList.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = arrayList.get(i14);
            i13++;
            if (i13 > 1) {
                sb4.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb4.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb4.append(((Character) obj).charValue());
            } else {
                sb4.append((CharSequence) String.valueOf(obj));
            }
        }
        sb4.append((CharSequence) "");
        sb3.append(sb4.toString());
        sb3.append(']');
        return sb3.toString();
    }
}
