package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long[] f63336a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f63337b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f63338c;

    /* renamed from: d, reason: collision with root package name */
    public int f63339d;

    /* renamed from: e, reason: collision with root package name */
    public int f63340e;

    /* renamed from: f, reason: collision with root package name */
    public int f63341f;

    public final boolean a(long j13) {
        int hashCode = Long.hashCode(j13) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i15 = this.f63339d;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f63336a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j14 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j15 = (i14 * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i16) & i15;
                if (this.f63337b[numberOfTrailingZeros] == j13) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        int i13;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (wVar.f63340e != this.f63340e) {
            return false;
        }
        long[] jArr = this.f63337b;
        Object[] objArr = this.f63338c;
        long[] jArr2 = this.f63336a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i14 = 0;
            loop0: while (true) {
                long j13 = jArr2[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((255 & j13) < 128) {
                            int i18 = (i14 << 3) + i17;
                            i13 = i17;
                            long j14 = jArr[i18];
                            Object obj2 = objArr[i18];
                            if (obj2 == null) {
                                if (wVar.d(j14) != null || !wVar.a(j14)) {
                                    break loop0;
                                }
                            } else if (!Intrinsics.d(obj2, wVar.d(j14))) {
                                return false;
                            }
                            i15 = 8;
                        } else {
                            i13 = i17;
                        }
                        j13 >>= i15;
                        i17 = i13 + 1;
                    }
                    if (i16 != i15) {
                        break;
                    }
                }
                if (i14 == length) {
                    break;
                }
                i14++;
            }
            return false;
        }
        return true;
    }

    public final int c(int i13) {
        int i14 = this.f63339d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f63336a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r16) {
        /*
            r15 = this;
            r0 = r15
            int r1 = java.lang.Long.hashCode(r16)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f63339d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
        L14:
            long[] r5 = r0.f63336a
            int r6 = r1 >> 3
            r7 = r1 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            long r8 = r8 >>> r7
            int r6 = r6 + 1
            r10 = r5[r6]
            int r5 = 64 - r7
            long r5 = r10 << r5
            long r10 = (long) r7
            long r10 = -r10
            r7 = 63
            long r10 = r10 >> r7
            long r5 = r5 & r10
            long r5 = r5 | r8
            long r7 = (long) r2
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r9 = r7 - r9
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L40:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L5d
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r1
            r11 = r11 & r3
            long[] r12 = r0.f63337b
            r13 = r12[r11]
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 != 0) goto L57
            goto L67
        L57:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L40
        L5d:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L70
            r11 = -1
        L67:
            if (r11 < 0) goto L6e
            java.lang.Object[] r1 = r0.f63338c
            r1 = r1[r11]
            goto L6f
        L6e:
            r1 = 0
        L6f:
            return r1
        L70:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.w.d(long):java.lang.Object");
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        long[] jArr = this.f63337b;
        Object[] objArr = this.f63338c;
        long[] jArr2 = this.f63336a;
        int length = jArr2.length - 2;
        int i13 = 0;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                long j13 = jArr2[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j13) < 128) {
                            int i18 = (i14 << 3) + i17;
                            long j14 = jArr[i18];
                            Object obj = objArr[i18];
                            i15 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j14);
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

    public final void f(int i13) {
        long[] jArr;
        int max = i13 > 0 ? Math.max(7, k0.f(i13)) : 0;
        this.f63339d = max;
        if (max == 0) {
            jArr = k0.f63281a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        this.f63336a = jArr;
        int i14 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        this.f63341f = k0.c(this.f63339d) - this.f63340e;
        this.f63337b = new long[max];
        this.f63338c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r1 = c(r3);
        r5 = 128;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r40.f63341f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (((r40.f63336a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        r1 = r40.f63339d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (r1 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        r14 = r40.f63340e;
        r4 = xk2.e0.f135207b;
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (java.lang.Long.compareUnsigned(r14 * 32, r1 * 25) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        r1 = r40.f63336a;
        r2 = r40.f63339d;
        r3 = r40.f63337b;
        r4 = r40.f63338c;
        g1.k0.a(r1, r2);
        r12 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        if (r15 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        r18 = r15 >> 3;
        r26 = (r15 & 7) << 3;
        r24 = (r1[r18] >> r26) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cd, code lost:
    
        if (r24 != r5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r24 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        r24 = java.lang.Long.hashCode(r3[r15]) * (-862048943);
        r14 = (r24 ^ (r24 << 16)) >>> 7;
        r27 = c(r14);
        r14 = r14 & r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0107, code lost:
    
        if ((((r27 - r14) & r2) / 8) != (((r15 - r14) & r2) / r7)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0132, code lost:
    
        r6 = r12;
        r13 = r27 >> 3;
        r34 = r1[r13];
        r14 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0144, code lost:
    
        if (((r34 >> r14) & 255) != 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0146, code lost:
    
        r1[r13] = (r34 & (~(255 << r14))) | ((r24 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r14);
        r1[r18] = (r1[r18] & (~(255 << r26))) | (128 << r26);
        r3[r27] = r3[r15];
        r3[r15] = 0;
        r4[r27] = r4[r15];
        r4[r15] = null;
        r37 = r10;
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a9, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "<this>");
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r10 = r37;
        r5 = 128;
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0174, code lost:
    
        r37 = r10;
        r1[r13] = (r34 & (~(255 << r14))) | ((r24 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0185, code lost:
    
        if (r6 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0187, code lost:
    
        r12 = g1.k0.b(r1, r15 + 1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018f, code lost:
    
        r3[r12] = r3[r27];
        r3[r27] = r3[r15];
        r3[r15] = r3[r12];
        r4[r12] = r4[r27];
        r4[r27] = r4[r15];
        r4[r15] = r4[r12];
        r15 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018e, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
    
        r1[r18] = ((r24 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r26) | (r1[r18] & (~(255 << r26)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "<this>");
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r5 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cf, code lost:
    
        r39 = r15;
        r15 = r15 + 1;
        r12 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c3, code lost:
    
        r37 = r10;
        r19 = 0;
        r40.f63341f = g1.k0.c(r40.f63339d) - r40.f63340e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0258, code lost:
    
        r1 = c(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x025c, code lost:
    
        r3 = 1;
        r40.f63340e++;
        r2 = r40.f63341f;
        r4 = r40.f63336a;
        r5 = r1 >> 3;
        r6 = r4[r5];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0277, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027a, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x027c, code lost:
    
        r40.f63341f = r2 - r3;
        r2 = r40.f63339d;
        r6 = (r6 & (~(255 << r8))) | (r37 << r8);
        r4[r5] = r6;
        r4[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r6;
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d6, code lost:
    
        r37 = r10;
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01de, code lost:
    
        r1 = g1.k0.e(r40.f63339d);
        r2 = r40.f63336a;
        r3 = r40.f63337b;
        r4 = r40.f63338c;
        r5 = r40.f63339d;
        f(r1);
        r1 = r40.f63336a;
        r6 = r40.f63337b;
        r7 = r40.f63338c;
        r10 = r40.f63339d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f9, code lost:
    
        if (r11 >= r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0209, code lost:
    
        if (((r2[r11 >> 3] >> ((r11 & 7) << 3)) & r8) >= 128) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020b, code lost:
    
        r12 = r3[r11];
        r14 = java.lang.Long.hashCode(r12) * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r15 = c(r14 >>> 7);
        r8 = r14 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        r14 = r15 >> 3;
        r18 = (r15 & 7) << 3;
        r24 = r2;
        r25 = r3;
        r2 = (r1[r14] & (~(255 << r18))) | (r8 << r18);
        r1[r14] = r2;
        r1[(((r15 - 7) & r10) + (r10 & 7)) >> 3] = r2;
        r6[r15] = r12;
        r7[r15] = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x024f, code lost:
    
        r11 = r11 + 1;
        r2 = r24;
        r3 = r25;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x024b, code lost:
    
        r24 = r2;
        r25 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01db, code lost:
    
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0090, code lost:
    
        r37 = r10;
        r19 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(long r41, g1.a0 r43) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.w.g(long, g1.a0):void");
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        int i13;
        int i14;
        if (this.f63340e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        long[] jArr = this.f63337b;
        Object[] objArr = this.f63338c;
        long[] jArr2 = this.f63336a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i15 = 0;
            int i16 = 0;
            while (true) {
                long j13 = jArr2[i15];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((255 & j13) < 128) {
                            int i19 = (i15 << 3) + i18;
                            i14 = i15;
                            long j14 = jArr[i19];
                            Object obj = objArr[i19];
                            sb3.append(j14);
                            sb3.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            i16++;
                            if (i16 < this.f63340e) {
                                sb3.append(", ");
                            }
                        } else {
                            i14 = i15;
                        }
                        j13 >>= 8;
                        i18++;
                        i15 = i14;
                    }
                    int i23 = i15;
                    if (i17 != 8) {
                        break;
                    }
                    i13 = i23;
                } else {
                    i13 = i15;
                }
                if (i13 == length) {
                    break;
                }
                i15 = i13 + 1;
            }
        }
        sb3.append('}');
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "s.append('}').toString()");
        return sb4;
    }
}
