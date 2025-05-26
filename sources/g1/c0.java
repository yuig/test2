package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f63238a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f63239b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f63240c;

    /* renamed from: d, reason: collision with root package name */
    public int f63241d;

    /* renamed from: e, reason: collision with root package name */
    public int f63242e;

    /* renamed from: f, reason: collision with root package name */
    public int f63243f;

    public /* synthetic */ c0() {
        this(6);
    }

    public final void a() {
        this.f63242e = 0;
        long[] jArr = this.f63238a;
        if (jArr != k0.f63281a) {
            kotlin.collections.z.q(jArr);
            long[] jArr2 = this.f63238a;
            int i13 = this.f63241d;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        kotlin.collections.z.o(0, this.f63241d, null, this.f63240c);
        kotlin.collections.z.o(0, this.f63241d, null, this.f63239b);
        this.f63243f = k0.c(this.f63241d) - this.f63242e;
    }

    public final boolean b(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i15 = this.f63241d;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f63238a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (i14 * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (Intrinsics.d(this.f63239b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
    }

    public final void c() {
        Object[] objArr;
        int i13;
        int i14;
        long[] jArr = this.f63238a;
        int i15 = this.f63241d;
        Object[] objArr2 = this.f63239b;
        Object[] objArr3 = this.f63240c;
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
                    int e13 = e(i24);
                    int i25 = i24 & i15;
                    if (((e13 - i25) & i15) / 8 == ((i17 - i25) & i15) / 8) {
                        jArr[i19] = ((r10 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i23) | (jArr[i19] & (~(255 << i23)));
                        Intrinsics.checkNotNullParameter(jArr, "<this>");
                        jArr[jArr.length - 1] = jArr[i16];
                    } else {
                        int i26 = e13 >> 3;
                        long j14 = jArr[i26];
                        int i27 = (e13 & 7) << 3;
                        if (((j14 >> i27) & 255) == 128) {
                            int i28 = i17;
                            objArr = objArr2;
                            jArr[i26] = (j14 & (~(255 << i27))) | ((r10 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i27);
                            jArr[i19] = (jArr[i19] & (~(255 << i23))) | (128 << i23);
                            objArr[e13] = objArr[i28];
                            objArr[i28] = null;
                            objArr3[e13] = objArr3[i28];
                            objArr3[i28] = null;
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
                            objArr[i18] = objArr[e13];
                            objArr[e13] = objArr[i33];
                            objArr[i33] = objArr[i18];
                            objArr3[i18] = objArr3[e13];
                            objArr3[e13] = objArr3[i33];
                            objArr3[i33] = objArr3[i18];
                            i14 = i33 - 1;
                        }
                        Intrinsics.checkNotNullParameter(jArr, "<this>");
                        i16 = 0;
                        jArr[jArr.length - 1] = jArr[0];
                        i17 = i14 + 1;
                        i15 = i13;
                        objArr2 = objArr;
                    }
                }
                i17++;
            }
        }
        this.f63243f = k0.c(this.f63241d) - this.f63242e;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.f63242e != this.f63242e) {
            return false;
        }
        Object[] objArr = this.f63239b;
        Object[] objArr2 = this.f63240c;
        long[] jArr = this.f63238a;
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
                            Object obj2 = objArr[i16];
                            Object obj3 = objArr2[i16];
                            if (obj3 == null) {
                                if (c0Var.g(obj2) != null || !c0Var.b(obj2)) {
                                    break loop0;
                                }
                            } else if (!Intrinsics.d(obj3, c0Var.g(obj2))) {
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

    public final int e(int i13) {
        int i14 = this.f63241d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f63238a;
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

    public final int f(Object obj) {
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
        int i18 = this.f63241d;
        int i19 = i16 & i18;
        int i23 = 0;
        while (true) {
            long[] jArr2 = this.f63238a;
            int i24 = i19 >> 3;
            int i25 = (i19 & 7) << 3;
            long j15 = ((jArr2[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr2[i24] >>> i25);
            long j16 = i17;
            int i26 = i17;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            for (long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L); j18 != 0; j18 &= j18 - 1) {
                int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j18) >> 3)) & i18;
                if (Intrinsics.d(this.f63239b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int e13 = e(i16);
                long j19 = 255;
                if (this.f63243f != 0 || ((this.f63238a[e13 >> 3] >> ((e13 & 7) << 3)) & 255) == 254) {
                    j13 = j16;
                } else {
                    int i27 = this.f63241d;
                    if (i27 > 8) {
                        long j23 = this.f63242e;
                        xk2.d0 d0Var = xk2.e0.f135207b;
                        if (Long.compareUnsigned(j23 * 32, i27 * 25) <= 0) {
                            c();
                            j13 = j16;
                            e13 = e(i16);
                        }
                    }
                    int e14 = k0.e(this.f63241d);
                    long[] jArr3 = this.f63238a;
                    Object[] objArr2 = this.f63239b;
                    Object[] objArr3 = this.f63240c;
                    int i28 = this.f63241d;
                    i(e14);
                    long[] jArr4 = this.f63238a;
                    Object[] objArr4 = this.f63239b;
                    Object[] objArr5 = this.f63240c;
                    int i29 = this.f63241d;
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
                            int e15 = e(i35 >>> 7);
                            int i36 = i35 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
                            jArr = jArr3;
                            objArr = objArr2;
                            long j24 = i36;
                            int i37 = e15 >> 3;
                            int i38 = (e15 & 7) << 3;
                            j14 = j16;
                            long j25 = (j24 << i38) | (jArr4[i37] & (~(255 << i38)));
                            jArr4[i37] = j25;
                            jArr4[(((e15 - 7) & i29) + (i29 & 7)) >> 3] = j25;
                            objArr4[e15] = obj2;
                            objArr5[e15] = objArr3[i33];
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
                    e13 = e(i16);
                }
                this.f63242e++;
                int i39 = this.f63243f;
                long[] jArr5 = this.f63238a;
                int i43 = e13 >> 3;
                long j26 = jArr5[i43];
                int i44 = (e13 & 7) << 3;
                this.f63243f = i39 - (((j26 >> i44) & 255) != 128 ? 0 : 1);
                int i45 = this.f63241d;
                long j27 = (j26 & (~(255 << i44))) | (j13 << i44);
                jArr5[i43] = j27;
                jArr5[(((e13 - 7) & i45) + (i45 & 7)) >> 3] = j27;
                return ~e13;
            }
            i23 += 8;
            i19 = (i19 + i23) & i18;
            i17 = i26;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f63241d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f63238a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f63239b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.f63240c
            r14 = r14[r10]
            goto L74
        L73:
            r14 = 0
        L74:
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.c0.g(java.lang.Object):java.lang.Object");
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        Object[] objArr = this.f63239b;
        Object[] objArr2 = this.f63240c;
        long[] jArr = this.f63238a;
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
                            Object obj2 = objArr2[i18];
                            i15 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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
        this.f63241d = max;
        if (max == 0) {
            jArr = k0.f63281a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        this.f63238a = jArr;
        int i14 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        this.f63243f = k0.c(this.f63241d) - this.f63242e;
        this.f63239b = new Object[max];
        this.f63240c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f63241d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f63238a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f63239b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.k(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.c0.j(java.lang.Object):java.lang.Object");
    }

    public final Object k(int i13) {
        this.f63242e--;
        long[] jArr = this.f63238a;
        int i14 = this.f63241d;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
        this.f63239b[i13] = null;
        Object[] objArr = this.f63240c;
        Object obj = objArr[i13];
        objArr[i13] = null;
        return obj;
    }

    public final void l(Object obj, Object obj2) {
        int f13 = f(obj);
        if (f13 < 0) {
            f13 = ~f13;
        }
        this.f63239b[f13] = obj;
        this.f63240c[f13] = obj2;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (this.f63242e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        Object[] objArr = this.f63239b;
        Object[] objArr2 = this.f63240c;
        long[] jArr = this.f63238a;
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
                            Object obj2 = objArr2[i17];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            sb3.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb3.append(obj2);
                            i14++;
                            if (i14 < this.f63242e) {
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

    public c0(int i13) {
        this.f63238a = k0.f63281a;
        Object[] objArr = h1.a.f66447c;
        this.f63239b = objArr;
        this.f63240c = objArr;
        if (i13 >= 0) {
            i(k0.g(i13));
        } else {
            kh2.n.h0("Capacity must be a positive value.");
            throw null;
        }
    }
}
