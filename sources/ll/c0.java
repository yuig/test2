package ll;

import el.c1;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c0 implements uk.s {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f83693a;

    /* renamed from: b, reason: collision with root package name */
    public final u f83694b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f83695c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f83696d;

    public c0(RSAPublicKey rSAPublicKey, u uVar, byte[] bArr, byte[] bArr2) {
        if (yk.e.f139223b.get()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        j0.d(uVar);
        j0.b(rSAPublicKey.getModulus().bitLength());
        j0.c(rSAPublicKey.getPublicExponent());
        this.f83693a = rSAPublicKey;
        this.f83694b = uVar;
        this.f83695c = bArr;
        this.f83696d = bArr2;
    }

    @Override // uk.s
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f83695c;
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
        byte[] r13;
        RSAPublicKey rSAPublicKey = this.f83693a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger Q = c0.d.Q(bArr);
        if (Q.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] Q2 = c0.d.Q2(bitLength, Q.modPow(publicExponent, modulus));
        u uVar = this.f83694b;
        j0.d(uVar);
        MessageDigest messageDigest = (MessageDigest) s.f83771e.a(kh2.n.j0(uVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f83696d;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int i13 = b0.f83689a[uVar.ordinal()];
        int i14 = 2;
        if (i13 == 1) {
            r13 = l3.c.r("3031300d060960864801650304020105000420");
        } else if (i13 == 2) {
            r13 = l3.c.r("3041300d060960864801650304020205000430");
        } else {
            if (i13 != 3) {
                throw new GeneralSecurityException("Unsupported hash " + uVar);
            }
            r13 = l3.c.r("3051300d060960864801650304020305000440");
        }
        int length = r13.length + digest.length;
        if (bitLength < length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[bitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i15 = 0;
        while (i15 < (bitLength - length) - 3) {
            bArr4[i14] = -1;
            i15++;
            i14++;
        }
        int i16 = i14 + 1;
        bArr4[i14] = 0;
        System.arraycopy(r13, 0, bArr4, i16, r13.length);
        System.arraycopy(digest, 0, bArr4, i16 + r13.length, digest.length);
        if (!MessageDigest.isEqual(Q2, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }
}
