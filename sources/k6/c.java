package k6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f78349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78350b;

    /* renamed from: c, reason: collision with root package name */
    public final long f78351c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f78352d;

    public c(byte[] bArr, int i13, int i14) {
        this(i13, i14, -1L, bArr);
    }

    public static c a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(g.f78362c0);
        return new c(bytes, 2, bytes.length);
    }

    public static c b(long j13, ByteOrder byteOrder) {
        return c(new long[]{j13}, byteOrder);
    }

    public static c c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.T[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j13 : jArr) {
            wrap.putInt((int) j13);
        }
        return new c(wrap.array(), 4, jArr.length);
    }

    public static c d(e[] eVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.T[5] * eVarArr.length]);
        wrap.order(byteOrder);
        for (e eVar : eVarArr) {
            wrap.putInt((int) eVar.f78357a);
            wrap.putInt((int) eVar.f78358b);
        }
        return new c(wrap.array(), 5, eVarArr.length);
    }

    public static c e(int i13, ByteOrder byteOrder) {
        return f(new int[]{i13}, byteOrder);
    }

    public static c f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.T[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i13 : iArr) {
            wrap.putShort((short) i13);
        }
        return new c(wrap.array(), 3, iArr.length);
    }

    public final double g(ByteOrder byteOrder) {
        Object j13 = j(byteOrder);
        if (j13 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (j13 instanceof String) {
            return Double.parseDouble((String) j13);
        }
        if (j13 instanceof long[]) {
            if (((long[]) j13).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (j13 instanceof int[]) {
            if (((int[]) j13).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (j13 instanceof double[]) {
            double[] dArr = (double[]) j13;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(j13 instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) j13;
        if (eVarArr.length == 1) {
            return eVarArr[0].a();
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final int h(ByteOrder byteOrder) {
        Object j13 = j(byteOrder);
        if (j13 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (j13 instanceof String) {
            return Integer.parseInt((String) j13);
        }
        if (j13 instanceof long[]) {
            long[] jArr = (long[]) j13;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(j13 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) j13;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String i(ByteOrder byteOrder) {
        Object j13 = j(byteOrder);
        if (j13 == null) {
            return null;
        }
        if (j13 instanceof String) {
            return (String) j13;
        }
        StringBuilder sb3 = new StringBuilder();
        int i13 = 0;
        if (j13 instanceof long[]) {
            long[] jArr = (long[]) j13;
            while (i13 < jArr.length) {
                sb3.append(jArr[i13]);
                i13++;
                if (i13 != jArr.length) {
                    sb3.append(",");
                }
            }
            return sb3.toString();
        }
        if (j13 instanceof int[]) {
            int[] iArr = (int[]) j13;
            while (i13 < iArr.length) {
                sb3.append(iArr[i13]);
                i13++;
                if (i13 != iArr.length) {
                    sb3.append(",");
                }
            }
            return sb3.toString();
        }
        if (j13 instanceof double[]) {
            double[] dArr = (double[]) j13;
            while (i13 < dArr.length) {
                sb3.append(dArr[i13]);
                i13++;
                if (i13 != dArr.length) {
                    sb3.append(",");
                }
            }
            return sb3.toString();
        }
        if (!(j13 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) j13;
        while (i13 < eVarArr.length) {
            sb3.append(eVarArr[i13].f78357a);
            sb3.append('/');
            sb3.append(eVarArr[i13].f78358b);
            i13++;
            if (i13 != eVarArr.length) {
                sb3.append(",");
            }
        }
        return sb3.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0129, code lost:
    
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:158:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.io.Serializable, k6.e[]] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.io.Serializable, k6.e[]] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable j(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.c.j(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(g.S[this.f78349a]);
        sb3.append(", data length:");
        return a.a.n(sb3, this.f78352d.length, ")");
    }

    public c(int i13, int i14, long j13, byte[] bArr) {
        this.f78349a = i13;
        this.f78350b = i14;
        this.f78351c = j13;
        this.f78352d = bArr;
    }
}
