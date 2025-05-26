package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f63231a = k0.f63281a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f63232b = h1.a.f66447c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f63233c = o.f63291a;

    /* renamed from: d, reason: collision with root package name */
    public int f63234d;

    /* renamed from: e, reason: collision with root package name */
    public int f63235e;

    /* renamed from: f, reason: collision with root package name */
    public int f63236f;

    public b0(int i13) {
        if (i13 >= 0) {
            f(k0.g(i13));
        } else {
            kh2.n.h0("Capacity must be a positive value.");
            throw null;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (b0Var.f63235e != this.f63235e) {
            return false;
        }
        Object[] objArr = this.f63232b;
        long[] jArr = this.f63233c;
        long[] jArr2 = this.f63231a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr2[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            int i16 = (i13 << 3) + i15;
                            if (jArr[i16] != b0Var.d(objArr[i16])) {
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

    public final int b(int i13) {
        int i14 = this.f63234d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f63231a;
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

    public final int c(Object obj) {
        int i13 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i16 = this.f63234d;
        int i17 = i14 >>> 7;
        while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f63231a;
            int i19 = i18 >> 3;
            int i23 = (i18 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (i15 * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i16;
                if (Intrinsics.d(this.f63232b[numberOfTrailingZeros], obj)) {
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

    public final long d(Object obj) {
        int c13 = c(obj);
        if (c13 >= 0) {
            return this.f63233c[c13];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        Object[] objArr = this.f63232b;
        long[] jArr = this.f63233c;
        long[] jArr2 = this.f63231a;
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
                            Object obj = objArr[i18];
                            i15 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i18]);
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
        this.f63234d = max;
        if (max == 0) {
            jArr = k0.f63281a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        this.f63231a = jArr;
        int i14 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        this.f63236f = k0.c(this.f63234d) - this.f63235e;
        this.f63232b = new Object[max];
        this.f63233c = new long[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        r2 = r0.b(r4);
        r6 = 128;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r0.f63236f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (((r0.f63231a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        r2 = r0.f63234d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r2 <= 8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        r13 = r0.f63235e;
        r5 = xk2.e0.f135207b;
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        if (java.lang.Long.compareUnsigned(r13 * 32, r2 * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
    
        r2 = r0.f63231a;
        r5 = r0.f63234d;
        r8 = r0.f63232b;
        r9 = r0.f63233c;
        g1.k0.a(r2, r5);
        r13 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        if (r15 == r5) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        r16 = r15 >> 3;
        r27 = (r15 & 7) << 3;
        r25 = (r2[r16] >> r27) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (r25 != r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        if (r25 == 254) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        r25 = r8[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        if (r25 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        r25 = r25.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        r25 = r25 * r3;
        r10 = (r25 ^ (r25 << 16)) >>> 7;
        r28 = r0.b(r10);
        r10 = r10 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0112, code lost:
    
        if ((((r28 - r10) & r5) / 8) != (((r15 - r10) & r5) / 8)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0114, code lost:
    
        r2[r16] = (r2[r16] & (~(255 << r27))) | ((r25 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r27);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r13 = r13;
        r4 = r4;
        r3 = -862048943;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013d, code lost:
    
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0140, code lost:
    
        r10 = r4;
        r4 = r13;
        r6 = r15;
        r3 = r28 >> 3;
        r19 = r2[r3];
        r7 = (r28 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0153, code lost:
    
        if (((r19 >> r7) & 255) != 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0155, code lost:
    
        r2[r3] = (r19 & (~(255 << r7))) | ((r25 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r7);
        r2[r16] = (r2[r16] & (~(255 << r27))) | (128 << r27);
        r8[r28] = r8[r6];
        r8[r6] = null;
        r9[r28] = r9[r6];
        r9[r6] = 0;
        r1 = r6;
        r3 = "<this>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b8, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r1 + 1;
        r3 = -862048943;
        r0 = r39;
        r13 = r6;
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0182, code lost:
    
        r2[r3] = ((r25 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << r7) | (r19 & (~(255 << r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0191, code lost:
    
        if (r4 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0193, code lost:
    
        r13 = g1.k0.b(r2, r6 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019b, code lost:
    
        r8[r13] = r8[r28];
        r8[r28] = r8[r6];
        r8[r6] = r8[r13];
        r9[r13] = r9[r28];
        r9[r28] = r9[r6];
        r9[r6] = r9[r13];
        r1 = r6 - 1;
        r6 = r13;
        r3 = "<this>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x019a, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ed, code lost:
    
        r25 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
    
        r38 = r15;
        r15 = r15 + 1;
        r13 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d5, code lost:
    
        r1 = r0;
        r10 = r4;
        r19 = 0;
        r1.f63236f = g1.k0.c(r1.f63234d) - r1.f63235e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0276, code lost:
    
        r2 = r1.b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x027a, code lost:
    
        r3 = 1;
        r1.f63235e++;
        r0 = r1.f63236f;
        r4 = r1.f63231a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0295, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0298, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x029a, code lost:
    
        r1.f63236f = r0 - r3;
        r0 = r1.f63234d;
        r6 = (r6 & (~(255 << r8))) | (r23 << r8);
        r4[r5] = r6;
        r4[(((r2 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r0 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e6, code lost:
    
        r1 = r0;
        r10 = r4;
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f1, code lost:
    
        r0 = g1.k0.e(r1.f63234d);
        r2 = r1.f63231a;
        r3 = r1.f63232b;
        r4 = r1.f63233c;
        r5 = r1.f63234d;
        r1.f(r0);
        r0 = r1.f63231a;
        r6 = r1.f63232b;
        r7 = r1.f63233c;
        r8 = r1.f63234d;
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020c, code lost:
    
        if (r9 >= r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021d, code lost:
    
        if (((r2[r9 >> 3] >> ((r9 & 7) << 3)) & r11) >= 128) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021f, code lost:
    
        r14 = r3[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0221, code lost:
    
        if (r14 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0223, code lost:
    
        r15 = r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x022e, code lost:
    
        r15 = r15 * (-862048943);
        r15 = r15 ^ (r15 << 16);
        r13 = r1.b(r15 >>> 7);
        r11 = r15 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        r15 = r13 >> 3;
        r16 = (r13 & 7) << 3;
        r18 = r2;
        r27 = r3;
        r2 = (r0[r15] & (~(255 << r16))) | (r11 << r16);
        r0[r15] = r2;
        r0[(((r13 - 7) & r8) + (r8 & 7)) >> 3] = r2;
        r6[r13] = r14;
        r7[r13] = r4[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x026d, code lost:
    
        r9 = r9 + 1;
        r2 = r18;
        r3 = r27;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x022b, code lost:
    
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0266, code lost:
    
        r18 = r2;
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01eb, code lost:
    
        r1 = r0;
        r23 = r9;
        r19 = 0;
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0097, code lost:
    
        r1 = r0;
        r23 = r9;
        r19 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(long r40, java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.b0.g(long, java.lang.Object):void");
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        int i13;
        int i14;
        if (this.f63235e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        Object[] objArr = this.f63232b;
        long[] jArr = this.f63233c;
        long[] jArr2 = this.f63231a;
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
                            Object obj = objArr[i19];
                            i14 = i15;
                            long j14 = jArr[i19];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            sb3.append("=");
                            sb3.append(j14);
                            i16++;
                            if (i16 < this.f63235e) {
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
