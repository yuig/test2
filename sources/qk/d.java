package qk;

import com.google.common.io.BaseEncoding$DecodingException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final c f104037d = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: e, reason: collision with root package name */
    public static final c f104038e = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* renamed from: f, reason: collision with root package name */
    public static final b f104039f;

    /* renamed from: a, reason: collision with root package name */
    public final a f104040a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f104041b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f104042c;

    static {
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f104039f = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public d(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }

    public final byte[] a(CharSequence charSequence) {
        try {
            int length = (int) (((this.f104040a.f104030d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b13 = b(bArr, h(charSequence));
            if (b13 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b13];
            System.arraycopy(bArr, 0, bArr2, 0, b13);
            return bArr2;
        } catch (BaseEncoding$DecodingException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        int i13;
        int i14;
        CharSequence h10 = h(charSequence);
        int length = h10.length();
        a aVar = this.f104040a;
        if (!aVar.f104034h[length % aVar.f104031e]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + h10.length());
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < h10.length()) {
            long j13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                i13 = aVar.f104030d;
                i14 = aVar.f104031e;
                if (i17 >= i14) {
                    break;
                }
                j13 <<= i13;
                if (i15 + i17 < h10.length()) {
                    j13 |= aVar.a(h10.charAt(i18 + i15));
                    i18++;
                }
                i17++;
            }
            int i19 = aVar.f104032f;
            int i23 = (i19 * 8) - (i18 * i13);
            int i24 = (i19 - 1) * 8;
            while (i24 >= i23) {
                bArr[i16] = (byte) ((j13 >>> i24) & 255);
                i24 -= 8;
                i16++;
            }
            i15 += i14;
        }
        return i16;
    }

    public final String c(byte[] bArr) {
        int length = bArr.length;
        bf.b.r(0, length, bArr.length);
        a aVar = this.f104040a;
        StringBuilder sb3 = new StringBuilder(kg.a.q(length, aVar.f104032f, RoundingMode.CEILING) * aVar.f104031e);
        try {
            e(sb3, bArr, length);
            return sb3.toString();
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public final void d(StringBuilder sb3, byte[] bArr, int i13, int i14) {
        bf.b.r(i13, i13 + i14, bArr.length);
        a aVar = this.f104040a;
        int i15 = 0;
        bf.b.k(i14 <= aVar.f104032f);
        long j13 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            j13 = (j13 | (bArr[i13 + i16] & 255)) << 8;
        }
        int i17 = aVar.f104030d;
        int i18 = ((i14 + 1) * 8) - i17;
        while (i15 < i14 * 8) {
            sb3.append(aVar.f104028b[((int) (j13 >>> (i18 - i15))) & aVar.f104029c]);
            i15 += i17;
        }
        Character ch3 = this.f104041b;
        if (ch3 != null) {
            while (i15 < aVar.f104032f * 8) {
                sb3.append(ch3.charValue());
                i15 += i17;
            }
        }
    }

    public void e(StringBuilder sb3, byte[] bArr, int i13) {
        int i14 = 0;
        bf.b.r(0, i13, bArr.length);
        while (i14 < i13) {
            a aVar = this.f104040a;
            d(sb3, bArr, i14, Math.min(aVar.f104032f, i13 - i14));
            i14 += aVar.f104032f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f104040a.equals(dVar.f104040a) && Objects.equals(this.f104041b, dVar.f104041b);
    }

    public final d f() {
        boolean z13;
        d dVar = this.f104042c;
        if (dVar == null) {
            a aVar = this.f104040a;
            char[] cArr = aVar.f104028b;
            int length = cArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (com.bumptech.glide.c.A0(cArr[i13])) {
                    int length2 = cArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length2) {
                            z13 = false;
                            break;
                        }
                        if (com.bumptech.glide.c.s0(cArr[i14])) {
                            z13 = true;
                            break;
                        }
                        i14++;
                    }
                    bf.b.u("Cannot call lowerCase() on a mixed-case alphabet", !z13);
                    char[] cArr2 = new char[cArr.length];
                    for (int i15 = 0; i15 < cArr.length; i15++) {
                        char c13 = cArr[i15];
                        if (com.bumptech.glide.c.A0(c13)) {
                            c13 = (char) (c13 ^ ' ');
                        }
                        cArr2[i15] = c13;
                    }
                    a aVar2 = new a(a.a.p(new StringBuilder(), aVar.f104027a, ".lowerCase()"), cArr2);
                    if (aVar.f104035i && !aVar2.f104035i) {
                        byte[] bArr = aVar2.f104033g;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i16 = 65; i16 <= 90; i16++) {
                            int i17 = i16 | 32;
                            byte b13 = bArr[i16];
                            byte b14 = bArr[i17];
                            if (b13 == -1) {
                                copyOf[i16] = b14;
                            } else {
                                char c14 = (char) i16;
                                char c15 = (char) i17;
                                if (!(b14 == -1)) {
                                    throw new IllegalStateException(bs1.c.q1("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c14), Character.valueOf(c15)));
                                }
                                copyOf[i17] = b13;
                            }
                        }
                        aVar2 = new a(a.a.p(new StringBuilder(), aVar2.f104027a, ".ignoreCase()"), aVar2.f104028b, copyOf, true);
                    }
                    aVar = aVar2;
                } else {
                    i13++;
                }
            }
            dVar = aVar == this.f104040a ? this : g(aVar, this.f104041b);
            this.f104042c = dVar;
        }
        return dVar;
    }

    public d g(a aVar, Character ch3) {
        return new d(aVar, ch3);
    }

    public final CharSequence h(CharSequence charSequence) {
        charSequence.getClass();
        Character ch3 = this.f104041b;
        if (ch3 == null) {
            return charSequence;
        }
        char charValue = ch3.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return this.f104040a.hashCode() ^ Objects.hashCode(this.f104041b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BaseEncoding.");
        a aVar = this.f104040a;
        sb3.append(aVar);
        if (8 % aVar.f104030d != 0) {
            Character ch3 = this.f104041b;
            if (ch3 == null) {
                sb3.append(".omitPadding()");
            } else {
                sb3.append(".withPadChar('");
                sb3.append(ch3);
                sb3.append("')");
            }
        }
        return sb3.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(qk.a r3, java.lang.Character r4) {
        /*
            r2 = this;
            r2.<init>()
            r3.getClass()
            r2.f104040a = r3
            if (r4 == 0) goto L1a
            char r0 = r4.charValue()
            byte[] r3 = r3.f104033g
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            r3 = r3[r0]
            r0 = -1
            if (r3 == r0) goto L1a
            r3 = 0
            goto L1b
        L1a:
            r3 = 1
        L1b:
            if (r3 == 0) goto L20
            r2.f104041b = r4
            return
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r0 = "Padding character %s was already in alphabet"
            java.lang.String r4 = bs1.c.q1(r0, r4)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.d.<init>(qk.a, java.lang.Character):void");
    }
}
