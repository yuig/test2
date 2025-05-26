package hq2;

/* loaded from: classes4.dex */
public final class m implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public static final short[] f69967b = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f69968c = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* renamed from: a, reason: collision with root package name */
    public long[] f69969a;

    public m(int i13) {
        this.f69969a = new long[i13];
    }

    public static void a(int i13, int i14, int i15, long[] jArr, long[] jArr2) {
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i13 + i16;
            jArr[i17] = jArr[i17] ^ jArr2[i14 + i16];
        }
    }

    public static long g(long[] jArr, int i13, long[] jArr2, int i14, int i15, int i16) {
        int i17 = 64 - i16;
        long j13 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            long j14 = jArr2[i14 + i18];
            int i19 = i13 + i18;
            jArr[i19] = (j13 | (j14 << i16)) ^ jArr[i19];
            j13 = j14 >>> i17;
        }
        return j13;
    }

    public static int h(long j13) {
        int i13;
        int i14 = 32;
        int i15 = (int) (j13 >>> 32);
        if (i15 == 0) {
            i15 = (int) j13;
            i14 = 0;
        }
        int i16 = i15 >>> 16;
        byte[] bArr = f69968c;
        if (i16 == 0) {
            int i17 = i15 >>> 8;
            i13 = i17 == 0 ? bArr[i15] : bArr[i17] + 8;
        } else {
            int i18 = i15 >>> 24;
            i13 = i18 == 0 ? bArr[i16] + 16 : bArr[i18] + 24;
        }
        return i14 + i13;
    }

    public static void k(long[] jArr, int i13) {
        int i14 = i13 >>> 6;
        jArr[i14] = (1 << (i13 & 63)) ^ jArr[i14];
    }

    public static void l(long[] jArr, long[] jArr2, int i13, int i14, int i15) {
        int i16 = i15 >>> 6;
        int i17 = i15 & 63;
        if (i17 == 0) {
            a(i16, i13, i14, jArr, jArr2);
            return;
        }
        int i18 = i14;
        int i19 = i16 + 1;
        int i23 = 64 - i17;
        int i24 = 64 - i23;
        long j13 = 0;
        while (true) {
            i18--;
            if (i18 < 0) {
                jArr[i16] = jArr[i16] ^ j13;
                return;
            }
            long j14 = jArr2[i13 + i18];
            int i25 = i19 + i18;
            jArr[i25] = (j13 | (j14 >>> i23)) ^ jArr[i25];
            j13 = j14 << i24;
        }
    }

    public static void m(int i13, long j13, long[] jArr) {
        int i14 = i13 >>> 6;
        int i15 = i13 & 63;
        if (i15 == 0) {
            jArr[i14] = jArr[i14] ^ j13;
            return;
        }
        jArr[i14] = jArr[i14] ^ (j13 << i15);
        long j14 = j13 >>> (64 - i15);
        if (j14 != 0) {
            int i16 = i14 + 1;
            jArr[i16] = j14 ^ jArr[i16];
        }
    }

    public static long o(int i13) {
        short[] sArr = f69967b;
        return ((sArr[i13 & 255] | (sArr[(i13 >>> 8) & 255] << 16)) & 4294967295L) | ((((sArr[i13 >>> 24] << 16) | sArr[(i13 >>> 16) & 255]) & 4294967295L) << 32);
    }

    public static void r(long j13, long[] jArr, int i13, long[] jArr2) {
        if ((j13 & 1) != 0) {
            a(0, 0, i13, jArr2, jArr);
        }
        long j14 = j13;
        int i14 = 1;
        while (true) {
            long j15 = j14 >>> 1;
            if (j15 == 0) {
                return;
            }
            if ((j15 & 1) != 0) {
                long g13 = g(jArr2, 0, jArr, 0, i13, i14);
                if (g13 != 0) {
                    jArr2[i13] = g13 ^ jArr2[i13];
                }
            }
            i14++;
            j14 = j15;
        }
    }

    public static int s(long[] jArr, int i13, int i14, int[] iArr) {
        int i15 = (i14 + 63) >>> 6;
        if (i13 < i15) {
            return i13;
        }
        int i16 = i13 << 6;
        int min = Math.min(i16, (i14 << 1) - 1);
        int i17 = i16 - min;
        while (i17 >= 64) {
            i13--;
            i17 -= 64;
        }
        int length = iArr.length;
        int i18 = iArr[length - 1];
        int i19 = length > 1 ? iArr[length - 2] : 0;
        int max = Math.max(i14, i18 + 64);
        int min2 = (Math.min(min - max, i14 - i19) + i17) >> 6;
        if (min2 > 1) {
            int i23 = i13 - min2;
            min = i23 << 6;
            int i24 = min - i14;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                l(jArr, jArr, i23, i13 - i23, iArr[length2] + i24);
            }
            l(jArr, jArr, i23, i13 - i23, i24);
            while (i13 > i23) {
                i13--;
                jArr[i13] = 0;
            }
        }
        if (min > max) {
            int i25 = max >>> 6;
            while (true) {
                i13--;
                if (i13 <= i25) {
                    break;
                }
                long j13 = jArr[i13];
                if (j13 != 0) {
                    jArr[i13] = 0;
                    int i26 = (i13 << 6) - i14;
                    int length3 = iArr.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        m(iArr[length3] + i26, j13, jArr);
                    }
                    m(i26, j13, jArr);
                }
            }
            int i27 = max & 63;
            long j14 = jArr[i25];
            long j15 = j14 >>> i27;
            if (j15 != 0) {
                jArr[i25] = j14 ^ (j15 << i27);
                int i28 = max - i14;
                int length4 = iArr.length;
                while (true) {
                    length4--;
                    if (length4 < 0) {
                        break;
                    }
                    m(iArr[length4] + i28, j15, jArr);
                }
                m(i28, j15, jArr);
            }
        } else {
            max = min;
        }
        if (max > i14) {
            while (true) {
                max--;
                if (max < i14) {
                    break;
                }
                if (((1 << (max & 63)) & jArr[max >>> 6]) != 0) {
                    k(jArr, max);
                    int i29 = max - i14;
                    int length5 = iArr.length;
                    while (true) {
                        length5--;
                        if (length5 < 0) {
                            break;
                        }
                        k(jArr, iArr[length5] + i29);
                    }
                    k(jArr, i29);
                }
            }
        }
        return i15;
    }

    public static void t(long[] jArr, int i13, long[] jArr2, int i14, int i15, int i16) {
        int i17 = 64 - i16;
        long j13 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            long j14 = jArr[i13 + i18];
            jArr2[i14 + i18] = j13 | (j14 << i16);
            j13 = j14 >>> i17;
        }
    }

    public final void b(m mVar, int i13, int i14) {
        int i15 = (i13 + 63) >>> 6;
        int i16 = i14 >>> 6;
        int i17 = i14 & 63;
        if (i17 == 0) {
            a(i16, 0, i15, this.f69969a, mVar.f69969a);
            return;
        }
        long g13 = g(this.f69969a, i16, mVar.f69969a, 0, i15, i17);
        if (g13 != 0) {
            long[] jArr = this.f69969a;
            int i18 = i15 + i16;
            jArr[i18] = g13 ^ jArr[i18];
        }
    }

    public final void c(m mVar) {
        int n13 = mVar.n();
        if (n13 == 0) {
            return;
        }
        long[] jArr = this.f69969a;
        if (n13 > jArr.length) {
            long[] jArr2 = new long[n13];
            System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, n13));
            this.f69969a = jArr2;
        }
        a(0, 0, n13, this.f69969a, mVar.f69969a);
    }

    public final Object clone() {
        long[] jArr;
        long[] jArr2 = this.f69969a;
        if (jArr2 == null) {
            jArr = null;
        } else {
            long[] jArr3 = new long[jArr2.length];
            System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
            jArr = jArr3;
        }
        return new m(jArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        int n13 = n();
        if (mVar.n() != n13) {
            return false;
        }
        for (int i13 = 0; i13 < n13; i13++) {
            if (this.f69969a[i13] != mVar.f69969a[i13]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int n13 = n();
        int i13 = 1;
        for (int i14 = 0; i14 < n13; i14++) {
            long j13 = this.f69969a[i14];
            i13 = (((i13 * 31) ^ ((int) j13)) * 31) ^ ((int) (j13 >>> 32));
        }
        return i13;
    }

    public final int i() {
        int length = this.f69969a.length;
        while (length != 0) {
            length--;
            long j13 = this.f69969a[length];
            if (j13 != 0) {
                return h(j13) + (length << 6);
            }
        }
        return 0;
    }

    public final int j(int i13) {
        int i14 = (i13 + 62) >>> 6;
        while (i14 != 0) {
            i14--;
            long j13 = this.f69969a[i14];
            if (j13 != 0) {
                return h(j13) + (i14 << 6);
            }
        }
        return 0;
    }

    public final int n() {
        long[] jArr = this.f69969a;
        int min = Math.min(jArr.length, jArr.length);
        if (min < 1) {
            return 0;
        }
        if (jArr[0] != 0) {
            while (true) {
                int i13 = min - 1;
                if (jArr[i13] != 0) {
                    break;
                }
                min = i13;
            }
        } else {
            while (true) {
                int i14 = min - 1;
                if (jArr[i14] != 0) {
                    break;
                }
                if (i14 <= 0) {
                    return 0;
                }
                min = i14;
            }
        }
        return min;
    }

    public final boolean p() {
        long[] jArr = this.f69969a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < jArr.length; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public final m q(m mVar) {
        int i13;
        int i14;
        m mVar2;
        m mVar3;
        long[] jArr;
        int i15;
        int i16 = i();
        if (i16 == 0) {
            return this;
        }
        int i17 = mVar.i();
        if (i17 == 0) {
            return mVar;
        }
        if (i16 > i17) {
            i14 = i16;
            i13 = i17;
            mVar3 = this;
            mVar2 = mVar;
        } else {
            i13 = i16;
            i14 = i17;
            mVar2 = this;
            mVar3 = mVar;
        }
        int i18 = (i13 + 63) >>> 6;
        int i19 = (i14 + 63) >>> 6;
        int i23 = ((i13 + i14) + 62) >>> 6;
        if (i18 == 1) {
            long j13 = mVar2.f69969a[0];
            if (j13 == 1) {
                return mVar3;
            }
            long[] jArr2 = new long[i23];
            r(j13, mVar3.f69969a, i19, jArr2);
            return new m(jArr2, i23);
        }
        int i24 = (i14 + 70) >>> 6;
        int[] iArr = new int[16];
        int i25 = i24 << 4;
        long[] jArr3 = new long[i25];
        iArr[1] = i24;
        System.arraycopy(mVar3.f69969a, 0, jArr3, i24, i19);
        int i26 = 2;
        int i27 = i24;
        while (i26 < 16) {
            i27 += i24;
            iArr[i26] = i27;
            if ((i26 & 1) == 0) {
                jArr = jArr3;
                i15 = i25;
                t(jArr3, i27 >>> 1, jArr3, i27, i24, 1);
            } else {
                jArr = jArr3;
                i15 = i25;
                int i28 = i27 - i24;
                for (int i29 = 0; i29 < i24; i29++) {
                    jArr[i27 + i29] = jArr[i24 + i29] ^ jArr[i28 + i29];
                }
            }
            i26++;
            i25 = i15;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        int i33 = i25;
        long[] jArr5 = new long[i33];
        t(jArr4, 0, jArr5, 0, i33, 4);
        long[] jArr6 = mVar2.f69969a;
        int i34 = i23 << 3;
        long[] jArr7 = new long[i34];
        for (int i35 = 0; i35 < i18; i35++) {
            long j14 = jArr6[i35];
            int i36 = i35;
            while (true) {
                int i37 = iArr[((int) j14) & 15];
                int i38 = iArr[((int) (j14 >>> 4)) & 15];
                for (int i39 = 0; i39 < i24; i39++) {
                    int i43 = i36 + i39;
                    jArr7[i43] = jArr7[i43] ^ (jArr4[i37 + i39] ^ jArr5[i38 + i39]);
                }
                j14 >>>= 8;
                if (j14 == 0) {
                    break;
                }
                i36 += i23;
            }
        }
        while (true) {
            i34 -= i23;
            if (i34 == 0) {
                return new m(jArr7, i23);
            }
            g(jArr7, i34 - i23, jArr7, i34, i23, 8);
        }
    }

    public final String toString() {
        int n13 = n();
        if (n13 == 0) {
            return "0";
        }
        int i13 = n13 - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.f69969a[i13]));
        while (true) {
            i13--;
            if (i13 < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.f69969a[i13]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public m(long[] jArr) {
        this.f69969a = jArr;
    }

    public m(long[] jArr, int i13) {
        if (i13 == jArr.length) {
            this.f69969a = jArr;
            return;
        }
        long[] jArr2 = new long[i13];
        this.f69969a = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i13);
    }
}
