package ll;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kh2.k3;

/* loaded from: classes3.dex */
public final class w implements hl.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yk.d f83776d = yk.d.ALGORITHM_NOT_FIPS;

    /* renamed from: e, reason: collision with root package name */
    public static final a.g f83777e = new a.g(16);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f83778a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f83779b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f83780c;

    public w(byte[] bArr) {
        j0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f83778a = secretKeySpec;
        if (!f83776d.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f83777e.get();
        cipher.init(1, secretKeySpec);
        byte[] N = k3.N(cipher.doFinal(new byte[16]));
        this.f83779b = N;
        this.f83780c = k3.N(N);
    }

    @Override // hl.a
    public final byte[] a(int i13, byte[] bArr) {
        byte[] h13;
        if (i13 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!f83776d.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f83777e.get();
        cipher.init(1, this.f83778a);
        int length = bArr.length;
        int b13 = length == 0 ? 1 : a.a.b(length, 1, 16, 1);
        if (b13 * 16 == bArr.length) {
            h13 = kg.t.g1((b13 - 1) * 16, 16, bArr, this.f83779b);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (b13 - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            h13 = kg.t.h1(copyOf, this.f83780c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i14 = 0; i14 < b13 - 1; i14++) {
            int i15 = i14 * 16;
            for (int i16 = 0; i16 < 16; i16++) {
                bArr3[i16] = (byte) (bArr2[i16] ^ bArr[i16 + i15]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i17 = 0; i17 < 16; i17++) {
            bArr3[i17] = (byte) (bArr2[i17] ^ h13[i17]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i13 ? bArr2 : Arrays.copyOf(bArr2, i13);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
