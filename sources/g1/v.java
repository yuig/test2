package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a */
    public long[] f63331a;

    /* renamed from: b */
    public int[] f63332b;

    /* renamed from: c */
    public int f63333c;

    /* renamed from: d */
    public int f63334d;

    /* renamed from: e */
    public int f63335e;

    public /* synthetic */ v() {
        this(6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r3 = e(r20);
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r37.f63335e != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (((r37.f63331a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        r3 = r37.f63333c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r3 <= 8) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        r5 = r37.f63334d;
        r14 = xk2.e0.f135207b;
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (java.lang.Long.compareUnsigned(r5 * 32, r3 * 25) > 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        r3 = r37.f63331a;
        r5 = r37.f63333c;
        r6 = r37.f63332b;
        g1.k0.a(r3, r5);
        r9 = 0;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (r9 == r5) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        r17 = r9 >> 3;
        r18 = (r9 & 7) << 3;
        r24 = (r3[r17] >> r18) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        if (r24 != r7) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
    
        if (r24 == 254) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        r24 = java.lang.Integer.hashCode(r6[r9]) * (-862048943);
        r11 = r14;
        r14 = (r24 ^ (r24 << 16)) >>> 7;
        r26 = e(r14);
        r14 = r14 & r5;
        r25 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        if ((((r26 - r14) & r5) / 8) != (((r9 - r14) & r5) / 8)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
    
        r3[r17] = (r3[r17] & (~(255 << r18))) | ((r21 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r18);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "<this>");
        r3[r3.length - r15] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r25 + 1;
        r2 = r2;
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013c, code lost:
    
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013f, code lost:
    
        r10 = r2;
        r1 = r26 >> 3;
        r7 = r3[r1];
        r2 = (r26 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (((r7 >> r2) & 255) != 128) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0152, code lost:
    
        r35 = r10;
        r3[r1] = (r7 & (~(255 << r2))) | ((r21 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r2);
        r3[r17] = (r3[r17] & (~(255 << r18))) | (128 << r18);
        r6[r26] = r6[r25];
        r6[r25] = 0;
        r2 = "<this>";
        r9 = r25;
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a5, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r15 = 1;
        r2 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017a, code lost:
    
        r35 = r10;
        r3[r1] = (r7 & (~(255 << r2))) | ((r21 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018b, code lost:
    
        if (r11 != (-1)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018d, code lost:
    
        r14 = g1.k0.b(r3, r25 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0195, code lost:
    
        r6[r14] = r6[r26];
        r6[r26] = r6[r25];
        r6[r25] = r6[r14];
        r9 = r25 - 1;
        r2 = "<this>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0194, code lost:
    
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d8, code lost:
    
        r14 = r9;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bb, code lost:
    
        r35 = r2;
        r37.f63335e = g1.k0.c(r37.f63333c) - r37.f63334d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x023c, code lost:
    
        r18 = e(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0245, code lost:
    
        r2 = true;
        r37.f63334d++;
        r1 = r37.f63335e;
        r3 = r37.f63331a;
        r4 = r18 >> 3;
        r5 = r3[r4];
        r7 = (r18 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x025e, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0260, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0263, code lost:
    
        r37.f63335e = r1 - r8;
        r1 = r37.f63333c;
        r5 = (r5 & (~(255 << r7))) | (r22 << r7);
        r3[r4] = r5;
        r3[(((r18 - 7) & r1) + (r1 & 7)) >> 3] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0262, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cb, code lost:
    
        r35 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d4, code lost:
    
        r1 = g1.k0.e(r37.f63333c);
        r2 = r37.f63331a;
        r3 = r37.f63332b;
        r5 = r37.f63333c;
        g(r1);
        r1 = r37.f63331a;
        r6 = r37.f63332b;
        r7 = r37.f63333c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ea, code lost:
    
        if (r9 >= r5) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fa, code lost:
    
        if (((r2[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fc, code lost:
    
        r10 = r3[r9];
        r11 = java.lang.Integer.hashCode(r10) * (-862048943);
        r11 = r11 ^ (r11 << 16);
        r15 = e(r11 >>> 7);
        r17 = r9;
        r8 = r11 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        r11 = r15 >> 3;
        r18 = (r15 & 7) << 3;
        r8 = (r8 << r18) | (r1[r11] & (~(255 << r18)));
        r1[r11] = r8;
        r1[(((r15 - 7) & r7) + (r7 & 7)) >> 3] = r8;
        r6[r15] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0238, code lost:
    
        r9 = r17 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0236, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cf, code lost:
    
        r35 = r2;
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x009b, code lost:
    
        r35 = r2;
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0243, code lost:
    
        r18 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r38) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.v.a(int):boolean");
    }

    public final void b() {
        this.f63334d = 0;
        long[] jArr = this.f63331a;
        if (jArr != k0.f63281a) {
            kotlin.collections.z.q(jArr);
            long[] jArr2 = this.f63331a;
            int i13 = this.f63333c;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        this.f63335e = k0.c(this.f63333c) - this.f63334d;
    }

    public final boolean c(int i13) {
        int hashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i16 = this.f63333c;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f63331a;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (i15 * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (this.f63332b[numberOfTrailingZeros] == i13) {
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

    /* renamed from: d */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (vVar.f63334d != this.f63334d) {
            return false;
        }
        int[] iArr = this.f63332b;
        long[] jArr = this.f63331a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128 && !vVar.c(iArr[(i13 << 3) + i15])) {
                            return false;
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

    public final int e(int i13) {
        int i14 = this.f63333c;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f63331a;
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

    /* renamed from: f */
    public final int hashCode() {
        int[] iArr = this.f63332b;
        long[] jArr = this.f63331a;
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
                            i15 = Integer.hashCode(iArr[(i14 << 3) + i17]) + i15;
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
        this.f63333c = max;
        if (max == 0) {
            jArr = k0.f63281a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        this.f63331a = jArr;
        int i14 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        this.f63335e = k0.c(this.f63333c) - this.f63334d;
        this.f63332b = new int[max];
    }

    public final void h(int i13) {
        this.f63334d--;
        long[] jArr = this.f63331a;
        int i14 = this.f63333c;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
    }

    /* renamed from: i */
    public final String toString() {
        int i13;
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "[");
        int[] iArr = this.f63332b;
        long[] jArr = this.f63331a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            loop0: while (true) {
                long j13 = jArr[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i14 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j13 & 255) < 128) {
                            int i19 = iArr[(i14 << 3) + i18];
                            if (i15 == -1) {
                                sb3.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i15 != 0) {
                                sb3.append((CharSequence) ", ");
                            }
                            sb3.append(i19);
                            i15++;
                            i13 = 8;
                        } else {
                            i13 = i16;
                        }
                        j13 >>= i13;
                        i18++;
                        i16 = i13;
                    }
                    if (i17 != i16) {
                        break;
                    }
                }
                if (i14 == length) {
                    break;
                }
                i14++;
            }
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            return sb4;
        }
        sb3.append((CharSequence) "]");
        String sb42 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb42, "StringBuilder().apply(builderAction).toString()");
        return sb42;
    }

    public v(int i13) {
        this.f63331a = k0.f63281a;
        this.f63332b = n.f63289a;
        if (i13 >= 0) {
            g(k0.g(i13));
        } else {
            kh2.n.h0("Capacity must be a positive value.");
            throw null;
        }
    }
}
