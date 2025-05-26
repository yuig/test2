package ll;

import el.c1;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f0 implements uk.s {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f83712a;

    /* renamed from: b, reason: collision with root package name */
    public final u f83713b;

    /* renamed from: c, reason: collision with root package name */
    public final u f83714c;

    /* renamed from: d, reason: collision with root package name */
    public final int f83715d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f83716e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f83717f;

    public f0(RSAPublicKey rSAPublicKey, u uVar, u uVar2, int i13, byte[] bArr, byte[] bArr2) {
        if (yk.e.f139223b.get()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        j0.d(uVar);
        if (!uVar.equals(uVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        j0.b(rSAPublicKey.getModulus().bitLength());
        j0.c(rSAPublicKey.getPublicExponent());
        this.f83712a = rSAPublicKey;
        this.f83713b = uVar;
        this.f83714c = uVar2;
        this.f83715d = i13;
        this.f83716e = bArr;
        this.f83717f = bArr2;
    }

    @Override // uk.s
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f83716e;
        if (bArr3.length == 0) {
            b(bArr, bArr2);
        } else {
            if (!c1.b(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.f83712a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        int bitLength2 = (modulus.bitLength() + 6) / 8;
        if (bitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger Q = c0.d.Q(bArr);
        if (Q.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] Q2 = c0.d.Q2(bitLength2, Q.modPow(publicExponent, modulus));
        int bitLength3 = modulus.bitLength() - 1;
        u uVar = this.f83713b;
        j0.d(uVar);
        MessageDigest messageDigest = (MessageDigest) s.f83771e.a(kh2.n.j0(uVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f83717f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = Q2.length;
        int i13 = this.f83715d;
        if (length < digestLength + i13 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (Q2[Q2.length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i14 = length - digestLength;
        int i15 = i14 - 1;
        byte[] copyOf = Arrays.copyOf(Q2, i15);
        byte[] copyOfRange = Arrays.copyOfRange(Q2, copyOf.length, copyOf.length + digestLength);
        int i16 = 0;
        while (true) {
            int i17 = i16;
            byte[] bArr4 = digest;
            int i18 = digestLength;
            long j13 = (length * 8) - bitLength3;
            if (i16 < j13) {
                if (((copyOf[i17 / 8] >> (7 - (i17 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i16 = i17 + 1;
                digest = bArr4;
                digestLength = i18;
            } else {
                byte[] U = kh2.n.U(copyOfRange, i15, this.f83714c);
                int length2 = U.length;
                byte[] bArr5 = new byte[length2];
                for (int i19 = 0; i19 < length2; i19++) {
                    bArr5[i19] = (byte) (U[i19] ^ copyOf[i19]);
                }
                for (int i23 = 0; i23 <= j13; i23++) {
                    int i24 = i23 / 8;
                    bArr5[i24] = (byte) ((~(1 << (7 - (i23 % 8)))) & bArr5[i24]);
                }
                int i25 = 0;
                while (true) {
                    int i26 = (i14 - i13) - 2;
                    if (i25 >= i26) {
                        if (bArr5[i26] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, length2 - i13, length2);
                        int i27 = i18 + 8;
                        byte[] bArr6 = new byte[i13 + i27];
                        System.arraycopy(bArr4, 0, bArr6, 8, bArr4.length);
                        System.arraycopy(copyOfRange2, 0, bArr6, i27, copyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i25] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i25++;
                }
            }
        }
    }
}
