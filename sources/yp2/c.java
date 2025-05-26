package yp2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import l0.k;

/* loaded from: classes4.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f139618a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f139619b;

    static {
        new ConcurrentHashMap();
    }

    public c(String str) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        }
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2' || !l(2, str)) {
            throw new IllegalArgumentException(a.a.k("string ", str, " not an OID"));
        }
        this.f139618a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r3 != '.') goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean l(int r5, java.lang.String r6) {
        /*
            int r0 = r6.length()
            r1 = 0
        L5:
            r2 = r1
        L6:
            int r0 = r0 + (-1)
            if (r0 < r5) goto L1f
            char r3 = r6.charAt(r0)
            r4 = 48
            if (r4 > r3) goto L18
            r4 = 57
            if (r3 > r4) goto L18
            r2 = 1
            goto L6
        L18:
            r4 = 46
            if (r3 != r4) goto L1e
            if (r2 != 0) goto L5
        L1e:
            return r1
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yp2.c.l(int, java.lang.String):boolean");
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, long j13) {
        byte[] bArr = new byte[9];
        int i13 = 8;
        bArr[8] = (byte) (((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        while (j13 >= 128) {
            j13 >>= 7;
            i13--;
            bArr[i13] = (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        byteArrayOutputStream.write(bArr, i13, 9 - i13);
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i13 = bitLength - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            bArr[i14] = (byte) ((bigInteger.intValue() & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i13] = (byte) (bArr[i13] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // yp2.e
    public final boolean c(e eVar) {
        if (eVar == this) {
            return true;
        }
        if (!(eVar instanceof c)) {
            return false;
        }
        return this.f139618a.equals(((c) eVar).f139618a);
    }

    @Override // yp2.e
    public final void d(d dVar) {
        byte[] j13 = j();
        dVar.c(6);
        dVar.d(j13.length);
        ((OutputStream) dVar.f139620a).write(j13);
    }

    @Override // yp2.e
    public final int e() {
        int length = j().length;
        return j.a(length) + 1 + length;
    }

    @Override // yp2.e, yp2.b
    public final int hashCode() {
        return this.f139618a.hashCode();
    }

    public final void i(ByteArrayOutputStream byteArrayOutputStream) {
        k kVar = new k(this.f139618a);
        int parseInt = Integer.parseInt(kVar.o()) * 40;
        String o13 = kVar.o();
        if (o13.length() <= 18) {
            n(byteArrayOutputStream, Long.parseLong(o13) + parseInt);
        } else {
            p(byteArrayOutputStream, new BigInteger(o13).add(BigInteger.valueOf(parseInt)));
        }
        while (kVar.f81235b != -1) {
            String o14 = kVar.o();
            if (o14.length() <= 18) {
                n(byteArrayOutputStream, Long.parseLong(o14));
            } else {
                p(byteArrayOutputStream, new BigInteger(o14));
            }
        }
    }

    public final synchronized byte[] j() {
        try {
            if (this.f139619b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                i(byteArrayOutputStream);
                this.f139619b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f139619b;
    }

    public final String toString() {
        return this.f139618a;
    }

    public c(String str, c cVar) {
        if (l(0, str)) {
            this.f139618a = cVar.f139618a + "." + str;
            return;
        }
        throw new IllegalArgumentException(a.a.k("string ", str, " not a valid OID branch"));
    }
}
