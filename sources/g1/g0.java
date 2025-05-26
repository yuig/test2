package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 extends m0 {

    /* renamed from: e, reason: collision with root package name */
    public int f63266e;

    public /* synthetic */ g0() {
        this(6);
    }

    public final boolean d(Object obj) {
        int i13 = this.f63288d;
        this.f63286b[g(obj)] = obj;
        return this.f63288d != i13;
    }

    public final boolean e(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i13 = this.f63288d;
        k(elements);
        return i13 != this.f63288d;
    }

    public final void f() {
        this.f63288d = 0;
        long[] jArr = this.f63285a;
        if (jArr != k0.f63281a) {
            kotlin.collections.z.q(jArr);
            long[] jArr2 = this.f63285a;
            int i13 = this.f63287c;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        kotlin.collections.z.o(0, this.f63287c, null, this.f63286b);
        this.f63266e = k0.c(this.f63287c) - this.f63288d;
    }

    public final int g(Object obj) {
        long j13;
        int i13;
        long j14;
        int i14;
        String str;
        int i15 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i16 = hashCode ^ (hashCode << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i19 = this.f63287c;
        int i23 = i17 & i19;
        int i24 = 0;
        while (true) {
            long[] jArr = this.f63285a;
            int i25 = i23 >> 3;
            int i26 = (i23 & 7) << 3;
            long j15 = ((jArr[i25 + 1] << (64 - i26)) & ((-i26) >> 63)) | (jArr[i25] >>> i26);
            long j16 = i18;
            int i27 = i18;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            for (long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L); j18 != 0; j18 &= j18 - 1) {
                int numberOfTrailingZeros = (i23 + (Long.numberOfTrailingZeros(j18) >> 3)) & i19;
                if (Intrinsics.d(this.f63286b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            int i28 = 8;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int h10 = h(i17);
                long j19 = 128;
                long j23 = 255;
                if (this.f63266e != 0 || ((this.f63285a[h10 >> 3] >> ((h10 & 7) << 3)) & 255) == 254) {
                    j13 = j16;
                    i13 = 0;
                } else {
                    int i29 = this.f63287c;
                    if (i29 > 8) {
                        long j24 = this.f63288d;
                        xk2.d0 d0Var = xk2.e0.f135207b;
                        if (Long.compareUnsigned(j24 * 32, i29 * 25) <= 0) {
                            long[] jArr2 = this.f63285a;
                            int i33 = this.f63287c;
                            Object[] objArr = this.f63286b;
                            k0.a(jArr2, i33);
                            int i34 = 0;
                            int i35 = -1;
                            while (i34 != i33) {
                                int i36 = i34 >> 3;
                                int i37 = (i34 & 7) << 3;
                                long j25 = (jArr2[i36] >> i37) & 255;
                                if (j25 == j19) {
                                    i35 = i34;
                                    i34++;
                                } else if (j25 != 254) {
                                    i34++;
                                } else {
                                    Object obj2 = objArr[i34];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i15;
                                    int i38 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int h13 = h(i38);
                                    int i39 = i38 & i33;
                                    if (((h13 - i39) & i33) / 8 == ((i34 - i39) & i33) / i28) {
                                        j14 = j16;
                                        jArr2[i36] = ((r21 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i37) | (jArr2[i36] & (~(255 << i37)));
                                        Intrinsics.checkNotNullParameter(jArr2, "<this>");
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i34++;
                                    } else {
                                        j14 = j16;
                                        int i43 = i35;
                                        int i44 = h13 >> 3;
                                        long j26 = jArr2[i44];
                                        int i45 = (h13 & 7) << 3;
                                        if (((j26 >> i45) & 255) == 128) {
                                            jArr2[i44] = ((~(255 << i45)) & j26) | ((r21 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i45);
                                            jArr2[i36] = (jArr2[i36] & (~(255 << i37))) | (128 << i37);
                                            objArr[h13] = objArr[i34];
                                            objArr[i34] = null;
                                            i35 = i34;
                                            i14 = i33;
                                            str = "<this>";
                                        } else {
                                            int i46 = i33;
                                            int i47 = i34;
                                            jArr2[i44] = ((r21 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i45) | (j26 & (~(255 << i45)));
                                            if (i43 == -1) {
                                                i14 = i46;
                                                i35 = k0.b(jArr2, i47 + 1, i14);
                                            } else {
                                                i14 = i46;
                                                i35 = i43;
                                            }
                                            objArr[i35] = objArr[h13];
                                            objArr[h13] = objArr[i47];
                                            objArr[i47] = objArr[i35];
                                            i34 = i47 - 1;
                                            str = "<this>";
                                        }
                                        Intrinsics.checkNotNullParameter(jArr2, str);
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i34++;
                                        i33 = i14;
                                    }
                                    j16 = j14;
                                    i28 = 8;
                                    i15 = -862048943;
                                    j19 = 128;
                                }
                            }
                            j13 = j16;
                            i13 = 0;
                            this.f63266e = k0.c(this.f63287c) - this.f63288d;
                            h10 = h(i17);
                        }
                    }
                    j13 = j16;
                    i13 = 0;
                    int e13 = k0.e(this.f63287c);
                    long[] jArr3 = this.f63285a;
                    Object[] objArr2 = this.f63286b;
                    int i48 = this.f63287c;
                    i(e13);
                    long[] jArr4 = this.f63285a;
                    Object[] objArr3 = this.f63286b;
                    int i49 = this.f63287c;
                    int i53 = 0;
                    while (i53 < i48) {
                        if (((jArr3[i53 >> 3] >> ((i53 & 7) << 3)) & j23) < 128) {
                            Object obj3 = objArr2[i53];
                            int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                            int i54 = hashCode3 ^ (hashCode3 << 16);
                            int h14 = h(i54 >>> 7);
                            long j27 = i54 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
                            int i55 = h14 >> 3;
                            int i56 = (h14 & 7) << 3;
                            long j28 = (j27 << i56) | (jArr4[i55] & (~(255 << i56)));
                            jArr4[i55] = j28;
                            jArr4[(((h14 - 7) & i49) + (i49 & 7)) >> 3] = j28;
                            objArr3[h14] = obj3;
                        }
                        i53++;
                        j23 = 255;
                    }
                    h10 = h(i17);
                }
                this.f63288d++;
                int i57 = this.f63266e;
                long[] jArr5 = this.f63285a;
                int i58 = h10 >> 3;
                long j29 = jArr5[i58];
                int i59 = (h10 & 7) << 3;
                this.f63266e = i57 - (((j29 >> i59) & 255) != 128 ? i13 : 1);
                int i63 = this.f63287c;
                long j33 = (j29 & (~(255 << i59))) | (j13 << i59);
                jArr5[i58] = j33;
                jArr5[(((h10 - 7) & i63) + (i63 & 7)) >> 3] = j33;
                return h10;
            }
            i24 += 8;
            i23 = (i23 + i24) & i19;
            i18 = i27;
            i15 = -862048943;
        }
    }

    public final int h(int i13) {
        int i14 = this.f63287c;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f63285a;
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

    public final void i(int i13) {
        long[] jArr;
        int max = i13 > 0 ? Math.max(7, k0.f(i13)) : 0;
        this.f63287c = max;
        if (max == 0) {
            jArr = k0.f63281a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        this.f63285a = jArr;
        int i14 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        this.f63266e = k0.c(this.f63287c) - this.f63288d;
        this.f63286b = new Object[max];
    }

    public final void j(g0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f63286b;
        long[] jArr = elements.f63285a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        Object obj = objArr[(i13 << 3) + i15];
                        this.f63286b[g(obj)] = obj;
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void k(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (Object obj : elements) {
            this.f63286b[g(obj)] = obj;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f63287c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f63285a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f63286b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.d(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.g0.l(java.lang.Object):boolean");
    }

    public final void m(int i13) {
        this.f63288d--;
        long[] jArr = this.f63285a;
        int i14 = this.f63287c;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
        this.f63286b[i13] = null;
    }

    public g0(int i13) {
        this.f63285a = k0.f63281a;
        this.f63286b = h1.a.f66447c;
        if (i13 >= 0) {
            i(k0.g(i13));
        } else {
            kh2.n.h0("Capacity must be a positive value.");
            throw null;
        }
    }
}
