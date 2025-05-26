package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f63353a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f63354b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f63355c;

    /* renamed from: d, reason: collision with root package name */
    public int f63356d;

    /* renamed from: e, reason: collision with root package name */
    public int f63357e;

    /* renamed from: f, reason: collision with root package name */
    public int f63358f;

    public /* synthetic */ z() {
        this(6);
    }

    public final void a() {
        Object[] objArr;
        int i13;
        int i14;
        long[] jArr = this.f63353a;
        int i15 = this.f63356d;
        Object[] objArr2 = this.f63354b;
        int[] iArr = this.f63355c;
        k0.a(jArr, i15);
        int i16 = 0;
        int i17 = 0;
        int i18 = -1;
        while (i17 != i15) {
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = (jArr[i19] >> i23) & 255;
            if (j13 == 128) {
                i18 = i17;
                i17++;
            } else {
                if (j13 == 254) {
                    Object obj = objArr2[i17];
                    int hashCode = (obj != null ? obj.hashCode() : i16) * (-862048943);
                    int i24 = (hashCode ^ (hashCode << 16)) >>> 7;
                    int c13 = c(i24);
                    int i25 = i24 & i15;
                    if (((c13 - i25) & i15) / 8 == ((i17 - i25) & i15) / 8) {
                        jArr[i19] = ((r10 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i23) | (jArr[i19] & (~(255 << i23)));
                        Intrinsics.checkNotNullParameter(jArr, "<this>");
                        jArr[jArr.length - 1] = (jArr[i16] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i26 = c13 >> 3;
                        long j14 = jArr[i26];
                        int i27 = (c13 & 7) << 3;
                        if (((j14 >> i27) & 255) == 128) {
                            int i28 = i17;
                            objArr = objArr2;
                            jArr[i26] = (j14 & (~(255 << i27))) | ((r10 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i27);
                            jArr[i19] = (jArr[i19] & (~(255 << i23))) | (128 << i23);
                            objArr[c13] = objArr[i28];
                            objArr[i28] = null;
                            iArr[c13] = iArr[i28];
                            iArr[i28] = 0;
                            i14 = i28;
                            i18 = i14;
                            i13 = i15;
                        } else {
                            int i29 = i15;
                            objArr = objArr2;
                            int i33 = i17;
                            jArr[i26] = ((r10 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i27) | (j14 & (~(255 << i27)));
                            if (i18 == -1) {
                                i13 = i29;
                                i18 = k0.b(jArr, i33 + 1, i13);
                            } else {
                                i13 = i29;
                            }
                            objArr[i18] = objArr[c13];
                            objArr[c13] = objArr[i33];
                            objArr[i33] = objArr[i18];
                            iArr[i18] = iArr[c13];
                            iArr[c13] = iArr[i33];
                            iArr[i33] = iArr[i18];
                            i14 = i33 - 1;
                        }
                        Intrinsics.checkNotNullParameter(jArr, "<this>");
                        i16 = 0;
                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i17 = i14 + 1;
                        i15 = i13;
                        objArr2 = objArr;
                    }
                }
                i17++;
            }
        }
        this.f63358f = k0.c(this.f63356d) - this.f63357e;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (zVar.f63357e != this.f63357e) {
            return false;
        }
        Object[] objArr = this.f63354b;
        int[] iArr = this.f63355c;
        long[] jArr = this.f63353a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj2 = objArr[i16];
                            int i17 = iArr[i16];
                            int e13 = zVar.e(obj2);
                            if (e13 < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (i17 != zVar.f63355c[e13]) {
                                return false;
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length) {
                    break;
                }
                i13++;
            }
        }
        return true;
    }

    public final int c(int i13) {
        int i14 = this.f63356d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f63353a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j13 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j14 = j13 & ((~j13) << 7) & (-9187201950435737472L);
            if (j14 != 0) {
                return (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final int d(Object obj) {
        long j13;
        long[] jArr;
        Object[] objArr;
        long j14;
        int i13;
        int i14;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i15 = hashCode ^ (hashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i18 = this.f63356d;
        int i19 = i16 & i18;
        int i23 = 0;
        while (true) {
            long[] jArr2 = this.f63353a;
            int i24 = i19 >> 3;
            int i25 = (i19 & 7) << 3;
            long j15 = ((jArr2[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr2[i24] >>> i25);
            long j16 = i17;
            int i26 = i17;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            for (long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L); j18 != 0; j18 &= j18 - 1) {
                int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j18) >> 3)) & i18;
                if (Intrinsics.d(this.f63354b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int c13 = c(i16);
                long j19 = 255;
                if (this.f63358f != 0 || ((this.f63353a[c13 >> 3] >> ((c13 & 7) << 3)) & 255) == 254) {
                    j13 = j16;
                } else {
                    int i27 = this.f63356d;
                    if (i27 > 8) {
                        long j23 = this.f63357e;
                        xk2.d0 d0Var = xk2.e0.f135207b;
                        if (Long.compareUnsigned(j23 * 32, i27 * 25) <= 0) {
                            a();
                            j13 = j16;
                            c13 = c(i16);
                        }
                    }
                    int e13 = k0.e(this.f63356d);
                    long[] jArr3 = this.f63353a;
                    Object[] objArr2 = this.f63354b;
                    int[] iArr = this.f63355c;
                    int i28 = this.f63356d;
                    g(e13);
                    long[] jArr4 = this.f63353a;
                    Object[] objArr3 = this.f63354b;
                    int[] iArr2 = this.f63355c;
                    int i29 = this.f63356d;
                    int i33 = 0;
                    while (i33 < i28) {
                        if (((jArr3[i33 >> 3] >> ((i33 & 7) << 3)) & j19) < 128) {
                            Object obj2 = objArr2[i33];
                            if (obj2 != null) {
                                i14 = obj2.hashCode();
                                i13 = -862048943;
                            } else {
                                i13 = -862048943;
                                i14 = 0;
                            }
                            int i34 = i14 * i13;
                            int i35 = i34 ^ (i34 << 16);
                            int c14 = c(i35 >>> 7);
                            int i36 = i35 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
                            jArr = jArr3;
                            objArr = objArr2;
                            long j24 = i36;
                            int i37 = c14 >> 3;
                            int i38 = (c14 & 7) << 3;
                            j14 = j16;
                            long j25 = (j24 << i38) | (jArr4[i37] & (~(255 << i38)));
                            jArr4[i37] = j25;
                            jArr4[(((c14 - 7) & i29) + (i29 & 7)) >> 3] = j25;
                            objArr3[c14] = obj2;
                            iArr2[c14] = iArr[i33];
                        } else {
                            jArr = jArr3;
                            objArr = objArr2;
                            j14 = j16;
                        }
                        i33++;
                        objArr2 = objArr;
                        jArr3 = jArr;
                        j16 = j14;
                        j19 = 255;
                    }
                    j13 = j16;
                    c13 = c(i16);
                }
                this.f63357e++;
                int i39 = this.f63358f;
                long[] jArr5 = this.f63353a;
                int i43 = c13 >> 3;
                long j26 = jArr5[i43];
                int i44 = (c13 & 7) << 3;
                this.f63358f = i39 - (((j26 >> i44) & 255) != 128 ? 0 : 1);
                int i45 = this.f63356d;
                long j27 = (j26 & (~(255 << i44))) | (j13 << i44);
                jArr5[i43] = j27;
                jArr5[(((c13 - 7) & i45) + (i45 & 7)) >> 3] = j27;
                return ~c13;
            }
            i23 += 8;
            i19 = (i19 + i23) & i18;
            i17 = i26;
        }
    }

    public final int e(Object obj) {
        int i13 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i16 = this.f63356d;
        int i17 = i14 >>> 7;
        while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f63353a;
            int i19 = i18 >> 3;
            int i23 = (i18 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (i15 * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i16;
                if (Intrinsics.d(this.f63354b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i13 += 8;
            i17 = i18 + i13;
        }
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        Object[] objArr = this.f63354b;
        int[] iArr = this.f63355c;
        long[] jArr = this.f63353a;
        int length = jArr.length - 2;
        int i13 = 0;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                long j13 = jArr[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j13) < 128) {
                            int i18 = (i14 << 3) + i17;
                            Object obj = objArr[i18];
                            i15 += Integer.hashCode(iArr[i18]) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j13 >>= 8;
                    }
                    if (i16 != 8) {
                        return i15;
                    }
                }
                if (i14 == length) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
        }
        return i13;
    }

    public final void g(int i13) {
        long[] jArr;
        int max = i13 > 0 ? Math.max(7, k0.f(i13)) : 0;
        this.f63356d = max;
        if (max == 0) {
            jArr = k0.f63281a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        this.f63353a = jArr;
        int i14 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        this.f63358f = k0.c(this.f63356d) - this.f63357e;
        this.f63354b = new Object[max];
        this.f63355c = new int[max];
    }

    public final void h(int i13) {
        this.f63357e--;
        long[] jArr = this.f63353a;
        int i14 = this.f63356d;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
        this.f63354b[i13] = null;
    }

    public final void i(int i13, Object obj) {
        int d2 = d(obj);
        if (d2 < 0) {
            d2 = ~d2;
        }
        this.f63354b[d2] = obj;
        this.f63355c[d2] = i13;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (this.f63357e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        Object[] objArr = this.f63354b;
        int[] iArr = this.f63355c;
        long[] jArr = this.f63353a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j13) < 128) {
                            int i17 = (i13 << 3) + i16;
                            Object obj = objArr[i17];
                            int i18 = iArr[i17];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            sb3.append("=");
                            sb3.append(i18);
                            i14++;
                            if (i14 < this.f63357e) {
                                sb3.append(", ");
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i13 == length) {
                    break;
                }
                i13++;
            }
        }
        sb3.append('}');
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "s.append('}').toString()");
        return sb4;
    }

    public z(int i13) {
        this.f63353a = k0.f63281a;
        this.f63354b = h1.a.f66447c;
        this.f63355c = n.f63289a;
        if (i13 >= 0) {
            g(k0.g(i13));
        } else {
            kh2.n.h0("Capacity must be a positive value.");
            throw null;
        }
    }
}
