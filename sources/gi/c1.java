package gi;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import kh2.k3;

/* loaded from: classes3.dex */
public class c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final a1 f65051d;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f65052a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f65053b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c1 f65054c;

    static {
        new b1("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new b1("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new c1("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new c1("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f65051d = new a1(new z0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public c1(String str, String str2) {
        this(new z0(str, str2.toCharArray()), (Character) '=');
    }

    public void a(StringBuilder sb3, byte[] bArr, int i13) {
        int i14 = 0;
        kh2.b0.g2(0, i13, bArr.length);
        while (i14 < i13) {
            z0 z0Var = this.f65052a;
            b(sb3, bArr, i14, Math.min(z0Var.f65148f, i13 - i14));
            i14 += z0Var.f65148f;
        }
    }

    public final void b(StringBuilder sb3, byte[] bArr, int i13, int i14) {
        int i15;
        kh2.b0.g2(i13, i13 + i14, bArr.length);
        z0 z0Var = this.f65052a;
        if (i14 > z0Var.f65148f) {
            throw new IllegalArgumentException();
        }
        int i16 = 0;
        long j13 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            j13 = (j13 | (bArr[i13 + i17] & 255)) << 8;
        }
        int i18 = (i14 + 1) * 8;
        while (true) {
            int i19 = i14 * 8;
            i15 = z0Var.f65146d;
            if (i16 >= i19) {
                break;
            }
            sb3.append(z0Var.f65144b[((int) (j13 >>> ((i18 - i15) - i16))) & z0Var.f65145c]);
            i16 += i15;
        }
        if (this.f65053b != null) {
            while (i16 < z0Var.f65148f * 8) {
                sb3.append('=');
                i16 += i15;
            }
        }
    }

    public final String c(byte[] bArr, int i13) {
        kh2.b0.g2(0, i13, bArr.length);
        z0 z0Var = this.f65052a;
        StringBuilder sb3 = new StringBuilder(z0Var.f65147e * k3.d2(i13, z0Var.f65148f, RoundingMode.CEILING));
        try {
            a(sb3, bArr, i13);
            return sb3.toString();
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c1) {
            c1 c1Var = (c1) obj;
            if (this.f65052a.equals(c1Var.f65052a) && Objects.equals(this.f65053b, c1Var.f65053b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f65052a.hashCode() ^ Objects.hashCode(this.f65053b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BaseEncoding.");
        z0 z0Var = this.f65052a;
        sb3.append(z0Var);
        if (8 % z0Var.f65146d != 0) {
            Character ch3 = this.f65053b;
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

    public c1(z0 z0Var, Character ch3) {
        this.f65052a = z0Var;
        if (ch3 != null) {
            byte[] bArr = z0Var.f65149g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(kh2.g0.t0("Padding character %s was already in alphabet", ch3));
            }
        }
        this.f65053b = ch3;
    }
}
