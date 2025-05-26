package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public long[] f63325a;

    /* renamed from: b */
    public int[] f63326b;

    /* renamed from: c */
    public Object[] f63327c;

    /* renamed from: d */
    public int f63328d;

    /* renamed from: e */
    public int f63329e;

    /* renamed from: f */
    public int f63330f;

    public /* synthetic */ u() {
        this(6);
    }

    public final void a() {
        this.f63329e = 0;
        long[] jArr = this.f63325a;
        if (jArr != k0.f63281a) {
            kotlin.collections.z.q(jArr);
            long[] jArr2 = this.f63325a;
            int i13 = this.f63328d;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        kotlin.collections.z.o(0, this.f63328d, null, this.f63327c);
        this.f63330f = k0.c(this.f63328d) - this.f63329e;
    }

    public final boolean b(int i13) {
        int hashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i16 = this.f63328d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f63325a;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (i15 * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (this.f63326b[numberOfTrailingZeros] == i13) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
    }

    public final boolean c(int i13) {
        int hashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i16 = this.f63328d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f63325a;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (i15 * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (this.f63326b[numberOfTrailingZeros] == i13) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
    }

    public final void d() {
        int[] iArr;
        int i13;
        int i14;
        long[] jArr = this.f63325a;
        int i15 = this.f63328d;
        int[] iArr2 = this.f63326b;
        Object[] objArr = this.f63327c;
        k0.a(jArr, i15);
        char c13 = 0;
        int i16 = 0;
        int i17 = -1;
        while (i16 != i15) {
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = (jArr[i18] >> i19) & 255;
            if (j13 == 128) {
                i17 = i16;
                i16++;
            } else {
                if (j13 == 254) {
                    int hashCode = Integer.hashCode(iArr2[i16]) * (-862048943);
                    int i23 = (hashCode ^ (hashCode << 16)) >>> 7;
                    int g13 = g(i23);
                    int i24 = i23 & i15;
                    if (((g13 - i24) & i15) / 8 == ((i16 - i24) & i15) / 8) {
                        jArr[i18] = ((r10 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i19) | (jArr[i18] & (~(255 << i19)));
                        Intrinsics.checkNotNullParameter(jArr, "<this>");
                        jArr[jArr.length - 1] = (jArr[c13] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i25 = g13 >> 3;
                        long j14 = jArr[i25];
                        int i26 = (g13 & 7) << 3;
                        if (((j14 >> i26) & 255) == 128) {
                            int i27 = i16;
                            iArr = iArr2;
                            jArr[i25] = (j14 & (~(255 << i26))) | ((r10 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i26);
                            jArr[i18] = (jArr[i18] & (~(255 << i19))) | (128 << i19);
                            iArr[g13] = iArr[i27];
                            iArr[i27] = 0;
                            objArr[g13] = objArr[i27];
                            objArr[i27] = null;
                            i14 = i27;
                            i17 = i14;
                            i13 = i15;
                        } else {
                            int i28 = i15;
                            iArr = iArr2;
                            int i29 = i16;
                            jArr[i25] = ((r10 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i26) | (j14 & (~(255 << i26)));
                            if (i17 == -1) {
                                i13 = i28;
                                i17 = k0.b(jArr, i29 + 1, i13);
                            } else {
                                i13 = i28;
                            }
                            iArr[i17] = iArr[g13];
                            iArr[g13] = iArr[i29];
                            iArr[i29] = iArr[i17];
                            objArr[i17] = objArr[g13];
                            objArr[g13] = objArr[i29];
                            objArr[i29] = objArr[i17];
                            i14 = i29 - 1;
                        }
                        Intrinsics.checkNotNullParameter(jArr, "<this>");
                        c13 = 0;
                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i16 = i14 + 1;
                        i15 = i13;
                        iArr2 = iArr;
                    }
                }
                i16++;
            }
        }
        this.f63330f = k0.c(this.f63328d) - this.f63329e;
    }

    /* renamed from: e */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.f63329e != this.f63329e) {
            return false;
        }
        int[] iArr = this.f63326b;
        Object[] objArr = this.f63327c;
        long[] jArr = this.f63325a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            loop0: while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            int i16 = (i13 << 3) + i15;
                            int i17 = iArr[i16];
                            Object obj2 = objArr[i16];
                            if (obj2 == null) {
                                if (uVar.h(i17) != null || !uVar.c(i17)) {
                                    break loop0;
                                }
                            } else if (!Intrinsics.d(obj2, uVar.h(i17))) {
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
            return false;
        }
        return true;
    }

    public final int f(int i13) {
        long j13;
        int i14;
        int i15;
        long[] jArr;
        long j14;
        char c13 = 11601;
        int hashCode = Integer.hashCode(i13) * (-862048943);
        int i16 = hashCode ^ (hashCode << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i19 = this.f63328d;
        int i23 = i17 & i19;
        int i24 = 0;
        while (true) {
            long[] jArr2 = this.f63325a;
            int i25 = i23 >> 3;
            int i26 = (i23 & 7) << 3;
            long j15 = ((jArr2[i25 + 1] << (64 - i26)) & ((-i26) >> 63)) | (jArr2[i25] >>> i26);
            long j16 = i18;
            int i27 = i24;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            for (long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L); j18 != 0; j18 &= j18 - 1) {
                int numberOfTrailingZeros = (i23 + (Long.numberOfTrailingZeros(j18) >> 3)) & i19;
                if (this.f63326b[numberOfTrailingZeros] == i13) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int g13 = g(i17);
                long j19 = 255;
                if (this.f63330f != 0 || ((this.f63325a[g13 >> 3] >> ((g13 & 7) << 3)) & 255) == 254) {
                    j13 = j16;
                } else {
                    int i28 = this.f63328d;
                    if (i28 > 8) {
                        long j23 = this.f63329e;
                        xk2.d0 d0Var = xk2.e0.f135207b;
                        if (Long.compareUnsigned(j23 * 32, i28 * 25) <= 0) {
                            d();
                            i14 = i17;
                            j13 = j16;
                            g13 = g(i14);
                        }
                    }
                    int e13 = k0.e(this.f63328d);
                    long[] jArr3 = this.f63325a;
                    int[] iArr = this.f63326b;
                    Object[] objArr = this.f63327c;
                    int i29 = this.f63328d;
                    j(e13);
                    long[] jArr4 = this.f63325a;
                    int[] iArr2 = this.f63326b;
                    Object[] objArr2 = this.f63327c;
                    int i33 = this.f63328d;
                    int i34 = 0;
                    while (i34 < i29) {
                        if (((jArr3[i34 >> 3] >> ((i34 & 7) << 3)) & j19) < 128) {
                            int i35 = iArr[i34];
                            int hashCode2 = Integer.hashCode(i35) * (-862048943);
                            int i36 = hashCode2 ^ (hashCode2 << 16);
                            int g14 = g(i36 >>> 7);
                            j14 = j16;
                            long j24 = i36 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
                            int i37 = g14 >> 3;
                            int i38 = (g14 & 7) << 3;
                            i15 = i17;
                            jArr = jArr3;
                            long j25 = (jArr4[i37] & (~(255 << i38))) | (j24 << i38);
                            jArr4[i37] = j25;
                            jArr4[(((g14 - 7) & i33) + (i33 & 7)) >> 3] = j25;
                            iArr2[g14] = i35;
                            objArr2[g14] = objArr[i34];
                        } else {
                            i15 = i17;
                            jArr = jArr3;
                            j14 = j16;
                        }
                        i34++;
                        jArr3 = jArr;
                        j16 = j14;
                        i17 = i15;
                        j19 = 255;
                    }
                    j13 = j16;
                    i14 = i17;
                    g13 = g(i14);
                }
                this.f63329e++;
                int i39 = this.f63330f;
                long[] jArr5 = this.f63325a;
                int i43 = g13 >> 3;
                long j26 = jArr5[i43];
                int i44 = (g13 & 7) << 3;
                this.f63330f = i39 - (((j26 >> i44) & 255) != 128 ? 0 : 1);
                int i45 = this.f63328d;
                long j27 = (j26 & (~(255 << i44))) | (j13 << i44);
                jArr5[i43] = j27;
                jArr5[(((g13 - 7) & i45) + (i45 & 7)) >> 3] = j27;
                return g13;
            }
            i24 = i27 + 8;
            i23 = (i23 + i24) & i19;
            c13 = c13;
        }
    }

    public final int g(int i13) {
        int i14 = this.f63328d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f63325a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f63328d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f63325a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f63326b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object[] r14 = r13.f63327c
            r14 = r14[r10]
            goto L6c
        L6b:
            r14 = 0
        L6c:
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.u.h(int):java.lang.Object");
    }

    /* renamed from: i */
    public final int hashCode() {
        int[] iArr = this.f63326b;
        Object[] objArr = this.f63327c;
        long[] jArr = this.f63325a;
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
                            Object obj = objArr[i18];
                            i15 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i19);
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

    public final void j(int i13) {
        long[] jArr;
        int max = i13 > 0 ? Math.max(7, k0.f(i13)) : 0;
        this.f63328d = max;
        if (max == 0) {
            jArr = k0.f63281a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        this.f63325a = jArr;
        int i14 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        this.f63330f = k0.c(this.f63328d) - this.f63329e;
        this.f63326b = new int[max];
        this.f63327c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f63328d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f63325a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f63326b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L97
            r10 = -1
        L64:
            r14 = 0
            if (r10 < 0) goto L96
            int r0 = r13.f63329e
            int r0 = r0 + (-1)
            r13.f63329e = r0
            long[] r0 = r13.f63325a
            int r1 = r13.f63328d
            int r2 = r10 >> 3
            r3 = r10 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r3 = r4 | r6
            r0[r2] = r3
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r13.f63327c
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        L96:
            return r14
        L97:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.u.k(int):java.lang.Object");
    }

    public final void l(int i13, Object obj) {
        int f13 = f(i13);
        this.f63326b[f13] = i13;
        this.f63327c[f13] = obj;
    }

    /* renamed from: m */
    public final String toString() {
        if (this.f63329e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        int[] iArr = this.f63326b;
        Object[] objArr = this.f63327c;
        long[] jArr = this.f63325a;
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
                            Object obj = objArr[i17];
                            sb3.append(i18);
                            sb3.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            i14++;
                            if (i14 < this.f63329e) {
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

    public u(int i13) {
        this.f63325a = k0.f63281a;
        this.f63326b = n.f63289a;
        this.f63327c = h1.a.f66447c;
        if (i13 >= 0) {
            j(k0.g(i13));
        } else {
            kh2.n.h0("Capacity must be a positive value.");
            throw null;
        }
    }
}
