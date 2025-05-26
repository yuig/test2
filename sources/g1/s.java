package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public long[] f63314a = k0.f63281a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f63315b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f63316c;

    /* renamed from: d, reason: collision with root package name */
    public int f63317d;

    /* renamed from: e, reason: collision with root package name */
    public int f63318e;

    /* renamed from: f, reason: collision with root package name */
    public int f63319f;

    public s() {
        int[] iArr = n.f63289a;
        this.f63315b = iArr;
        this.f63316c = iArr;
        i(k0.g(6));
    }

    public final void a() {
        long[] jArr;
        int[] iArr;
        long j13;
        int[] iArr2;
        String str;
        int i13 = this.f63317d;
        int i14 = -862048943;
        long j14 = 128;
        long j15 = 255;
        int i15 = 8;
        if (i13 > 8) {
            long j16 = this.f63318e;
            xk2.d0 d0Var = xk2.e0.f135207b;
            if (Long.compareUnsigned(j16 * 32, i13 * 25) <= 0) {
                long[] jArr2 = this.f63314a;
                int i16 = this.f63317d;
                int[] iArr3 = this.f63315b;
                int[] iArr4 = this.f63316c;
                k0.a(jArr2, i16);
                int i17 = 0;
                int i18 = -1;
                while (i17 != i16) {
                    int i19 = i17 >> 3;
                    int i23 = (i17 & 7) << 3;
                    long j17 = (jArr2[i19] >> i23) & 255;
                    if (j17 == j14) {
                        i18 = i17;
                        i17++;
                    } else if (j17 != 254) {
                        i17++;
                    } else {
                        int hashCode = Integer.hashCode(iArr3[i17]) * i14;
                        int i24 = (hashCode ^ (hashCode << 16)) >>> 7;
                        int d2 = d(i24);
                        int i25 = i24 & i16;
                        if (((d2 - i25) & i16) / 8 == ((i17 - i25) & i16) / i15) {
                            jArr2[i19] = ((r16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i23) | (jArr2[i19] & (~(255 << i23)));
                            Intrinsics.checkNotNullParameter(jArr2, "<this>");
                            jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                            i17++;
                        } else {
                            int i26 = d2 >> 3;
                            long j18 = jArr2[i26];
                            int i27 = (d2 & 7) << 3;
                            if (((j18 >> i27) & 255) == 128) {
                                iArr2 = iArr4;
                                jArr2[i26] = ((r16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i27) | (j18 & (~(255 << i27)));
                                jArr2[i19] = (jArr2[i19] & (~(255 << i23))) | (128 << i23);
                                iArr3[d2] = iArr3[i17];
                                iArr3[i17] = 0;
                                iArr2[d2] = iArr2[i17];
                                iArr2[i17] = 0;
                                i18 = i17;
                                str = "<this>";
                            } else {
                                iArr2 = iArr4;
                                jArr2[i26] = ((~(255 << i27)) & j18) | ((r16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i27);
                                if (i18 == -1) {
                                    i18 = k0.b(jArr2, i17 + 1, i16);
                                }
                                iArr3[i18] = iArr3[d2];
                                iArr3[d2] = iArr3[i17];
                                iArr3[i17] = iArr3[i18];
                                iArr2[i18] = iArr2[d2];
                                iArr2[d2] = iArr2[i17];
                                iArr2[i17] = iArr2[i18];
                                i17--;
                                str = "<this>";
                            }
                            Intrinsics.checkNotNullParameter(jArr2, str);
                            jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                            i17++;
                            iArr4 = iArr2;
                        }
                        i14 = -862048943;
                        j14 = 128;
                        i15 = 8;
                    }
                }
                this.f63319f = k0.c(this.f63317d) - this.f63318e;
                return;
            }
        }
        int i28 = 0;
        int e13 = k0.e(this.f63317d);
        long[] jArr3 = this.f63314a;
        int[] iArr5 = this.f63315b;
        int[] iArr6 = this.f63316c;
        int i29 = this.f63317d;
        i(e13);
        long[] jArr4 = this.f63314a;
        int[] iArr7 = this.f63315b;
        int[] iArr8 = this.f63316c;
        int i33 = this.f63317d;
        while (i28 < i29) {
            if (((jArr3[i28 >> 3] >> ((i28 & 7) << 3)) & j15) < 128) {
                int i34 = iArr5[i28];
                int hashCode2 = Integer.hashCode(i34) * (-862048943);
                int i35 = hashCode2 ^ (hashCode2 << 16);
                int d13 = d(i35 >>> 7);
                long j19 = i35 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
                int i36 = d13 >> 3;
                int i37 = (d13 & 7) << 3;
                jArr = jArr3;
                iArr = iArr5;
                j13 = 255;
                long j23 = (jArr4[i36] & (~(255 << i37))) | (j19 << i37);
                jArr4[i36] = j23;
                jArr4[(((d13 - 7) & i33) + (i33 & 7)) >> 3] = j23;
                iArr7[d13] = i34;
                iArr8[d13] = iArr6[i28];
            } else {
                jArr = jArr3;
                iArr = iArr5;
                j13 = j15;
            }
            i28++;
            j15 = j13;
            jArr3 = jArr;
            iArr5 = iArr;
        }
    }

    public final void b() {
        this.f63318e = 0;
        long[] jArr = this.f63314a;
        if (jArr != k0.f63281a) {
            kotlin.collections.z.q(jArr);
            long[] jArr2 = this.f63314a;
            int i13 = this.f63317d;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        this.f63319f = k0.c(this.f63317d) - this.f63318e;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (sVar.f63318e != this.f63318e) {
            return false;
        }
        int[] iArr = this.f63315b;
        int[] iArr2 = this.f63316c;
        long[] jArr = this.f63314a;
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
                            if (iArr2[i16] != sVar.f(iArr[i16])) {
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

    public final int d(int i13) {
        int i14 = this.f63317d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f63314a;
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

    public final int e(int i13) {
        int hashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i16 = this.f63317d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f63314a;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (i15 * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (this.f63315b[numberOfTrailingZeros] == i13) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
    }

    public final int f(int i13) {
        int e13 = e(i13);
        if (e13 >= 0) {
            return this.f63316c[e13];
        }
        throw new NoSuchElementException(a.a.d("Cannot find value for key ", i13));
    }

    public final int g(int i13) {
        int e13 = e(i13);
        if (e13 >= 0) {
            return this.f63316c[e13];
        }
        return -1;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int[] iArr = this.f63315b;
        int[] iArr2 = this.f63316c;
        long[] jArr = this.f63314a;
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
                            int i19 = iArr[i18];
                            i15 += Integer.hashCode(iArr2[i18]) ^ Integer.hashCode(i19);
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

    public final void i(int i13) {
        long[] jArr;
        int max = i13 > 0 ? Math.max(7, k0.f(i13)) : 0;
        this.f63317d = max;
        if (max == 0) {
            jArr = k0.f63281a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        this.f63314a = jArr;
        int i14 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        this.f63319f = k0.c(this.f63317d) - this.f63318e;
        this.f63315b = new int[max];
        this.f63316c = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        r2 = d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r20.f63319f != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (((r20.f63314a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        a();
        r2 = d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        r20.f63318e++;
        r3 = r20.f63319f;
        r4 = r20.f63314a;
        r7 = r2 >> 3;
        r8 = r4[r7];
        r12 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (((r8 >> r12) & 255) != 128) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        r20.f63319f = r3 - r13;
        r3 = r20.f63317d;
        r5 = ((~(255 << r12)) & r8) | (r10 << r12);
        r4[r7] = r5;
        r4[(((r2 - 7) & r3) + (r3 & 7)) >> 3] = r5;
        r2 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.s.j(int, int):void");
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (this.f63318e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        int[] iArr = this.f63315b;
        int[] iArr2 = this.f63316c;
        long[] jArr = this.f63314a;
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
                            int i18 = iArr[i17];
                            int i19 = iArr2[i17];
                            sb3.append(i18);
                            sb3.append("=");
                            sb3.append(i19);
                            i14++;
                            if (i14 < this.f63318e) {
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
}
