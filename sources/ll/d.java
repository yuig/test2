package ll;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kh2.k3;

/* loaded from: classes3.dex */
public final class d implements uk.d {

    /* renamed from: d, reason: collision with root package name */
    public static final yk.d f83697d = yk.d.ALGORITHM_NOT_FIPS;

    /* renamed from: e, reason: collision with root package name */
    public static final List f83698e = Arrays.asList(64);

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f83699f = new byte[16];

    /* renamed from: g, reason: collision with root package name */
    public static final a.g f83700g = new a.g(15);

    /* renamed from: a, reason: collision with root package name */
    public final w f83701a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f83702b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f83703c;

    public d(byte[] bArr, ml.a aVar) {
        if (!f83697d.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f83698e.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(a.a.n(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f83702b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f83701a = new w(copyOfRange);
        this.f83703c = aVar.b();
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] h13;
        int length = bArr.length;
        byte[] bArr3 = this.f83703c;
        if (length > 2147483631 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) f83700g.get();
        byte[][] bArr4 = {bArr2, bArr};
        w wVar = this.f83701a;
        byte[] a13 = wVar.a(16, f83699f);
        byte[] bArr5 = bArr4[0];
        if (bArr5 == null) {
            bArr5 = new byte[0];
        }
        byte[] h14 = kg.t.h1(k3.N(a13), wVar.a(16, bArr5));
        byte[] bArr6 = bArr4[1];
        if (bArr6.length >= 16) {
            if (bArr6.length < h14.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr6.length - h14.length;
            h13 = Arrays.copyOf(bArr6, bArr6.length);
            for (int i13 = 0; i13 < h14.length; i13++) {
                int i14 = length2 + i13;
                h13[i14] = (byte) (h13[i14] ^ h14[i13]);
            }
        } else {
            if (bArr6.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(bArr6, 16);
            copyOf[bArr6.length] = Byte.MIN_VALUE;
            h13 = kg.t.h1(copyOf, k3.N(h14));
        }
        byte[] a14 = wVar.a(16, h13);
        byte[] bArr7 = (byte[]) a14.clone();
        bArr7[8] = (byte) (bArr7[8] & Byte.MAX_VALUE);
        bArr7[12] = (byte) (bArr7[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f83702b, "AES"), new IvParameterSpec(bArr7));
        byte[] copyOf2 = Arrays.copyOf(bArr3, bArr3.length + a14.length + bArr.length);
        System.arraycopy(a14, 0, copyOf2, bArr3.length, a14.length);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf2, bArr3.length + a14.length) == bArr.length) {
            return copyOf2;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
