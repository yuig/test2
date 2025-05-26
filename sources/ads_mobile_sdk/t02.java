package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class t02 implements a.wa {

    /* renamed from: d, reason: collision with root package name */
    public static final a.ib f11305d = new a.ib();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f11306a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f11307b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f11308c;

    public t02(byte[] bArr) {
        kh2.b0.B(bArr.length);
        this.f11306a = new SecretKeySpec(bArr, "AES");
        a();
    }

    @Override // a.wa
    public final byte[] a(int i13, byte[] bArr) {
        byte[] c13;
        if (i13 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!l3.c.k()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f11305d.get();
        cipher.init(1, this.f11306a);
        int length = bArr.length;
        int b13 = length == 0 ? 1 : a.a.b(length, 1, 16, 1);
        if (b13 * 16 == bArr.length) {
            c13 = jk.r.c((b13 - 1) * 16, 16, bArr, this.f11307b);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (b13 - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            byte[] bArr2 = this.f11308c;
            if (copyOf.length != bArr2.length) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            c13 = jk.r.c(0, copyOf.length, copyOf, bArr2);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i14 = 0; i14 < b13 - 1; i14++) {
            int i15 = i14 * 16;
            for (int i16 = 0; i16 < 16; i16++) {
                bArr4[i16] = (byte) (bArr3[i16] ^ bArr[i16 + i15]);
            }
            if (cipher.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i17 = 0; i17 < 16; i17++) {
            bArr4[i17] = (byte) (bArr3[i17] ^ c13[i17]);
        }
        if (cipher.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return 16 == i13 ? bArr3 : Arrays.copyOf(bArr3, i13);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }

    public final void a() {
        if (l3.c.k()) {
            Cipher cipher = (Cipher) f11305d.get();
            cipher.init(1, this.f11306a);
            byte[] g13 = c0.d.g(cipher.doFinal(new byte[16]));
            this.f11307b = g13;
            this.f11308c = c0.d.g(g13);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
